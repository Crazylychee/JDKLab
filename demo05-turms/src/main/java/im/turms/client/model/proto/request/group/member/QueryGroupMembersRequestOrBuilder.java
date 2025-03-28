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

package im.turms.client.model.proto.request.group.member;

public interface QueryGroupMembersRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:im.turms.proto.QueryGroupMembersRequest)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>int64 group_id = 1;</code>
     *
     * @return The groupId.
     */
    long getGroupId();

    /**
     * <code>optional int64 last_updated_date = 2;</code>
     *
     * @return Whether the lastUpdatedDate field is set.
     */
    boolean hasLastUpdatedDate();

    /**
     * <code>optional int64 last_updated_date = 2;</code>
     *
     * @return The lastUpdatedDate.
     */
    long getLastUpdatedDate();

    /**
     * <code>repeated int64 member_ids = 3;</code>
     *
     * @return A list containing the memberIds.
     */
    java.util.List<Long> getMemberIdsList();

    /**
     * <code>repeated int64 member_ids = 3;</code>
     *
     * @return The count of memberIds.
     */
    int getMemberIdsCount();

    /**
     * <code>repeated int64 member_ids = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The memberIds at the given index.
     */
    long getMemberIds(int index);

    /**
     * <code>optional bool with_status = 4;</code>
     *
     * @return Whether the withStatus field is set.
     */
    boolean hasWithStatus();

    /**
     * <code>optional bool with_status = 4;</code>
     *
     * @return The withStatus.
     */
    boolean getWithStatus();

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
