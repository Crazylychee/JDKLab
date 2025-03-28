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

public interface CreateFriendRequestRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:im.turms.proto.CreateFriendRequestRequest)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>int64 recipient_id = 1;</code>
     *
     * @return The recipientId.
     */
    long getRecipientId();

    /**
     * <code>string content = 2;</code>
     *
     * @return The content.
     */
    String getContent();

    /**
     * <code>string content = 2;</code>
     *
     * @return The bytes for content.
     */
    com.google.protobuf.ByteString getContentBytes();

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
