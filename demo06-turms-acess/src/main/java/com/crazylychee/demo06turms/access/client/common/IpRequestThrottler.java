/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.crazylychee.demo06turms.access.client.common;


import com.crazylychee.demo06turms.thread.ThreadNameConst;
import im.turms.server.common.infra.lang.ByteArrayWrapper;
import im.turms.server.common.infra.logging.core.logger.Logger;
import im.turms.server.common.infra.logging.core.logger.LoggerFactory;
import im.turms.server.common.infra.thread.NamedThreadFactory;
import im.turms.server.common.infra.throttle.TokenBucket;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author James Chen
 */
@Component
public class IpRequestThrottler {

    private static final Logger LOGGER = LoggerFactory.getLogger(IpRequestThrottler.class);

    private static final long IDLE_ENTRY_TTL = 30 * 60 * 1000L;
    private static final long INTERVAL_TO_CHECK = 30 * 60 * 1000L;
    private static final int BATCH_SIZE = 10_000;
    private static final long SLEEP_THRESHOLD_MILLIS = 1000;
    private static final long SLEEP_MILLIS = 1000;

    /**
     * Share the context with all instances of token buckets so that we can apply new properties
     * easily
     */

    /**
     * We don't add a skip list of access time for a fast iterate because it requires inserting a
     * new item to update the access time for each client request and needs to store a lot of items.
     * So just using and iterating ConcurrentHashMap is enough
     */
    private final ConcurrentHashMap<ByteArrayWrapper, TokenBucket> ipToRequestTokenBucket =
            new ConcurrentHashMap<>(256);

    public IpRequestThrottler(

            ) {




        NamedThreadFactory.newThread(ThreadNameConst.IP_REQUEST_TOKEN_BUCKET_CLEANER, true, () -> {
            Thread thread = Thread.currentThread();
            while (!thread.isInterrupted()) {
                try {
                    removeExpiredRequestTokenBuckets();
                } catch (InterruptedException e) {
                    return;
                } catch (Exception e) {
                    LOGGER.error("Failed to remove expired request token buckets", e);
                }
                try {
                    Thread.sleep(INTERVAL_TO_CHECK);
                } catch (InterruptedException e) {
                    break;
                }
            }
        })
                .start();
    }

    private void removeExpiredRequestTokenBuckets() throws InterruptedException {
        Iterator<TokenBucket> iterator = ipToRequestTokenBucket.values()
                .iterator();
        int processed = 0;
        long startTime = System.currentTimeMillis();
        while (iterator.hasNext()) {
            TokenBucket bucket = iterator.next();
            long lastAccessTime = bucket.getLastRefillTime();
            if ((startTime - lastAccessTime) > IDLE_ENTRY_TTL
                    && bucket.isTokensMoreThanOrEqualsToInitialTokens()) {
                iterator.remove();
            }
            processed++;
            // To avoid hogging the CPU for a long time
            // and cause the server cannot serve for users
            if (processed >= BATCH_SIZE) {
                processed = 0;
                if (System.currentTimeMillis() - startTime > SLEEP_THRESHOLD_MILLIS) {
                    Thread.sleep(SLEEP_MILLIS);
                    startTime = System.currentTimeMillis();
                }
            }
        }
    }



}
