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

package im.turms.client.model.proto.request.message;

public interface CreateMessageReactionsRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:im.turms.proto.CreateMessageReactionsRequest)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>int64 message_id = 1;</code>
     *
     * @return The messageId.
     */
    long getMessageId();

    /**
     * <code>repeated int32 reaction_types = 2;</code>
     *
     * @return A list containing the reactionTypes.
     */
    java.util.List<Integer> getReactionTypesList();

    /**
     * <code>repeated int32 reaction_types = 2;</code>
     *
     * @return The count of reactionTypes.
     */
    int getReactionTypesCount();

    /**
     * <code>repeated int32 reaction_types = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The reactionTypes at the given index.
     */
    int getReactionTypes(int index);

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
