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

package im.turms.client.model.proto.request.group;

public interface CreateGroupRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:im.turms.proto.CreateGroupRequest)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    String getName();

    /**
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     * <code>optional string intro = 2;</code>
     *
     * @return Whether the intro field is set.
     */
    boolean hasIntro();

    /**
     * <code>optional string intro = 2;</code>
     *
     * @return The intro.
     */
    String getIntro();

    /**
     * <code>optional string intro = 2;</code>
     *
     * @return The bytes for intro.
     */
    com.google.protobuf.ByteString getIntroBytes();

    /**
     * <code>optional string announcement = 3;</code>
     *
     * @return Whether the announcement field is set.
     */
    boolean hasAnnouncement();

    /**
     * <code>optional string announcement = 3;</code>
     *
     * @return The announcement.
     */
    String getAnnouncement();

    /**
     * <code>optional string announcement = 3;</code>
     *
     * @return The bytes for announcement.
     */
    com.google.protobuf.ByteString getAnnouncementBytes();

    /**
     * <code>optional int32 min_score = 4;</code>
     *
     * @return Whether the minScore field is set.
     */
    boolean hasMinScore();

    /**
     * <code>optional int32 min_score = 4;</code>
     *
     * @return The minScore.
     */
    int getMinScore();

    /**
     * <code>optional int64 type_id = 5;</code>
     *
     * @return Whether the typeId field is set.
     */
    boolean hasTypeId();

    /**
     * <code>optional int64 type_id = 5;</code>
     *
     * @return The typeId.
     */
    long getTypeId();

    /**
     * <code>optional int64 mute_end_date = 6;</code>
     *
     * @return Whether the muteEndDate field is set.
     */
    boolean hasMuteEndDate();

    /**
     * <code>optional int64 mute_end_date = 6;</code>
     *
     * @return The muteEndDate.
     */
    long getMuteEndDate();

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 7;</code>
     */
    int getUserDefinedAttributesCount();

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 7;</code>
     */
    boolean containsUserDefinedAttributes(String key);

    /**
     * Use {@link #getUserDefinedAttributesMap()} instead.
     */
    @Deprecated
    java.util.Map<String, im.turms.client.model.proto.model.common.Value> getUserDefinedAttributes();

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 7;</code>
     */
    java.util.Map<String, im.turms.client.model.proto.model.common.Value> getUserDefinedAttributesMap();

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 7;</code>
     */

    /* nullable */
    im.turms.client.model.proto.model.common.Value getUserDefinedAttributesOrDefault(
            String key,
            /* nullable */
            im.turms.client.model.proto.model.common.Value defaultValue);

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 7;</code>
     */

    im.turms.client.model.proto.model.common.Value getUserDefinedAttributesOrThrow(
            String key);

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
