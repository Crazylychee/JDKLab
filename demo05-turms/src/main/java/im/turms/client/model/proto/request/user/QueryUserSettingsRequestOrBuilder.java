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

package im.turms.client.model.proto.request.user;

public interface QueryUserSettingsRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:im.turms.proto.QueryUserSettingsRequest)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>repeated string names = 1;</code>
     *
     * @return A list containing the names.
     */
    java.util.List<String> getNamesList();

    /**
     * <code>repeated string names = 1;</code>
     *
     * @return The count of names.
     */
    int getNamesCount();

    /**
     * <code>repeated string names = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The names at the given index.
     */
    String getNames(int index);

    /**
     * <code>repeated string names = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The names at the given index.
     */
    com.google.protobuf.ByteString getNamesBytes(int index);

    /**
     * <code>optional int64 last_updated_date_start = 2;</code>
     *
     * @return Whether the lastUpdatedDateStart field is set.
     */
    boolean hasLastUpdatedDateStart();

    /**
     * <code>optional int64 last_updated_date_start = 2;</code>
     *
     * @return The lastUpdatedDateStart.
     */
    long getLastUpdatedDateStart();

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
