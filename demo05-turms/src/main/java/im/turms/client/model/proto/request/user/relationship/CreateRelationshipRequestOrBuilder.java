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

package im.turms.client.model.proto.request.user.relationship;

public interface CreateRelationshipRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:im.turms.proto.CreateRelationshipRequest)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>int64 user_id = 1;</code>
     *
     * @return The userId.
     */
    long getUserId();

    /**
     * <code>bool blocked = 2;</code>
     *
     * @return The blocked.
     */
    boolean getBlocked();

    /**
     * <code>optional int32 group_index = 3;</code>
     *
     * @return Whether the groupIndex field is set.
     */
    boolean hasGroupIndex();

    /**
     * <code>optional int32 group_index = 3;</code>
     *
     * @return The groupIndex.
     */
    int getGroupIndex();

    /**
     * <code>optional string name = 4;</code>
     *
     * @return Whether the name field is set.
     */
    boolean hasName();

    /**
     * <code>optional string name = 4;</code>
     *
     * @return The name.
     */
    String getName();

    /**
     * <code>optional string name = 4;</code>
     *
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString getNameBytes();

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
