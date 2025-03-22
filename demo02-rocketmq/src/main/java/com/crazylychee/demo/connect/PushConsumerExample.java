package com.crazylychee.demo.connect;

import org.apache.rocketmq.client.apis.ClientConfiguration;
import org.apache.rocketmq.client.apis.ClientException;
import org.apache.rocketmq.client.apis.ClientServiceProvider;
import org.apache.rocketmq.client.apis.consumer.ConsumeResult;
import org.apache.rocketmq.client.apis.consumer.FilterExpression;
import org.apache.rocketmq.client.apis.consumer.FilterExpressionType;
import org.apache.rocketmq.client.apis.consumer.PushConsumer;
import org.apache.rocketmq.shaded.org.slf4j.Logger;
import org.apache.rocketmq.shaded.org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Collections;


public class PushConsumerExample {
    private static final Logger logger = LoggerFactory.getLogger(PushConsumerExample.class);

    private PushConsumerExample() {
    }

    public static void main(String[] args) throws ClientException, IOException, InterruptedException {
        final ClientServiceProvider provider = ClientServiceProvider.loadService();
        // Endpoint address, set to the Proxy address and port list, usually xxx:8080;xxx:8081
        String endpoints = "192.168.73.123:8081";
        ClientConfiguration clientConfiguration = ClientConfiguration.newBuilder()
                .setEndpoints(endpoints)
                .build();
        // Subscription message filtering rule, indicating subscription to all Tag messages.
        String tag = "*";
        FilterExpression filterExpression = new FilterExpression(tag, FilterExpressionType.TAG);
        // Specify the consumer group the consumer belongs to, Group needs to be created in advance.
        String consumerGroup = "YourConsumerGroup";
        // Specify which target Topic to subscribe to, Topic needs to be created in advance.
        String topic = "TestTopic";
        // Initialize PushConsumer
        PushConsumer pushConsumer = provider.newPushConsumerBuilder()
                .setClientConfiguration(clientConfiguration)
                // Set the consumer group.
                .setConsumerGroup(consumerGroup)
                // Set pre-bound subscription relationship.
                .setSubscriptionExpressions(Collections.singletonMap(topic, filterExpression))
                // Set the message listener.
                .setMessageListener(messageView -> {
                    // Handle messages and return the consumption result.
                    logger.info("Consume message successfully, messageId={}", messageView.getMessageId());
                    return ConsumeResult.SUCCESS;
                })
                .build();

        Thread.sleep(Long.MAX_VALUE);
        // If PushConsumer is no longer needed, this instance can be closed.
        // pushConsumer.close();
    }
}
