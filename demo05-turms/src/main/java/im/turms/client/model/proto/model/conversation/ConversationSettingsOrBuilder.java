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

package im.turms.client.model.proto.model.conversation;

public interface ConversationSettingsOrBuilder extends
        // @@protoc_insertion_point(interface_extends:im.turms.proto.ConversationSettings)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional int64 user_id = 1;</code>
     *
     * @return Whether the userId field is set.
     */
    boolean hasUserId();

    /**
     * <code>optional int64 user_id = 1;</code>
     *
     * @return The userId.
     */
    long getUserId();

    /**
     * <code>optional int64 group_id = 2;</code>
     *
     * @return Whether the groupId field is set.
     */
    boolean hasGroupId();

    /**
     * <code>optional int64 group_id = 2;</code>
     *
     * @return The groupId.
     */
    long getGroupId();

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
     */
    int getSettingsCount();

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
     */
    boolean containsSettings(String key);

    /**
     * Use {@link #getSettingsMap()} instead.
     */
    @Deprecated
    java.util.Map<String, im.turms.client.model.proto.model.common.Value> getSettings();

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
     */
    java.util.Map<String, im.turms.client.model.proto.model.common.Value> getSettingsMap();

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
     */

    /* nullable */
    im.turms.client.model.proto.model.common.Value getSettingsOrDefault(
            String key,
            /* nullable */
            im.turms.client.model.proto.model.common.Value defaultValue);

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
     */

    im.turms.client.model.proto.model.common.Value getSettingsOrThrow(String key);

    /**
     * <code>optional int64 last_updated_date = 4;</code>
     *
     * @return Whether the lastUpdatedDate field is set.
     */
    boolean hasLastUpdatedDate();

    /**
     * <code>optional int64 last_updated_date = 4;</code>
     *
     * @return The lastUpdatedDate.
     */
    long getLastUpdatedDate();

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    java.util.List<im.turms.client.model.proto.model.common.Value> getCustomAttributesList();

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    im.turms.client.model.proto.model.common.Value getCustomAttributes(int index);

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    int getCustomAttributesCount();
}
