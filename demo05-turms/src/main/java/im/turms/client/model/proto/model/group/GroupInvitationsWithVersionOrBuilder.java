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

package im.turms.client.model.proto.model.group;

public interface GroupInvitationsWithVersionOrBuilder extends
        // @@protoc_insertion_point(interface_extends:im.turms.proto.GroupInvitationsWithVersion)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    java.util.List<GroupInvitation> getGroupInvitationsList();

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    GroupInvitation getGroupInvitations(int index);

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    int getGroupInvitationsCount();

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
}
