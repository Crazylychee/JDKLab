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

package im.turms.client.model.proto.model.storage;

public interface StorageResourceInfoOrBuilder extends
        // @@protoc_insertion_point(interface_extends:im.turms.proto.StorageResourceInfo)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional int64 id_num = 1;</code>
     *
     * @return Whether the idNum field is set.
     */
    boolean hasIdNum();

    /**
     * <code>optional int64 id_num = 1;</code>
     *
     * @return The idNum.
     */
    long getIdNum();

    /**
     * <code>optional string id_str = 2;</code>
     *
     * @return Whether the idStr field is set.
     */
    boolean hasIdStr();

    /**
     * <code>optional string id_str = 2;</code>
     *
     * @return The idStr.
     */
    String getIdStr();

    /**
     * <code>optional string id_str = 2;</code>
     *
     * @return The bytes for idStr.
     */
    com.google.protobuf.ByteString getIdStrBytes();

    /**
     * <code>optional string name = 3;</code>
     *
     * @return Whether the name field is set.
     */
    boolean hasName();

    /**
     * <code>optional string name = 3;</code>
     *
     * @return The name.
     */
    String getName();

    /**
     * <code>optional string name = 3;</code>
     *
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     * <code>optional string media_type = 4;</code>
     *
     * @return Whether the mediaType field is set.
     */
    boolean hasMediaType();

    /**
     * <code>optional string media_type = 4;</code>
     *
     * @return The mediaType.
     */
    String getMediaType();

    /**
     * <code>optional string media_type = 4;</code>
     *
     * @return The bytes for mediaType.
     */
    com.google.protobuf.ByteString getMediaTypeBytes();

    /**
     * <code>int64 uploader_id = 5;</code>
     *
     * @return The uploaderId.
     */
    long getUploaderId();

    /**
     * <code>int64 creation_date = 6;</code>
     *
     * @return The creationDate.
     */
    long getCreationDate();

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
