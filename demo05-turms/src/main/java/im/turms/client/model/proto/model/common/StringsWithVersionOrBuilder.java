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

package im.turms.client.model.proto.model.common;

public interface StringsWithVersionOrBuilder extends
        // @@protoc_insertion_point(interface_extends:im.turms.proto.StringsWithVersion)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>repeated string strings = 1;</code>
     *
     * @return A list containing the strings.
     */
    java.util.List<String> getStringsList();

    /**
     * <code>repeated string strings = 1;</code>
     *
     * @return The count of strings.
     */
    int getStringsCount();

    /**
     * <code>repeated string strings = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The strings at the given index.
     */
    String getStrings(int index);

    /**
     * <code>repeated string strings = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The strings at the given index.
     */
    com.google.protobuf.ByteString getStringsBytes(int index);

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
