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

/**
 * Protobuf type {@code im.turms.proto.StorageResourceInfo}
 */
public final class StorageResourceInfo extends
        com.google.protobuf.GeneratedMessageLite<StorageResourceInfo, StorageResourceInfo.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.StorageResourceInfo)
        StorageResourceInfoOrBuilder {
    private StorageResourceInfo() {
        idStr_ = "";
        name_ = "";
        mediaType_ = "";
        customAttributes_ = emptyProtobufList();
    }

    private int bitField0_;
    public static final int ID_NUM_FIELD_NUMBER = 1;
    private long idNum_;

    /**
     * <code>optional int64 id_num = 1;</code>
     *
     * @return Whether the idNum field is set.
     */
    @Override
    public boolean hasIdNum() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional int64 id_num = 1;</code>
     *
     * @return The idNum.
     */
    @Override
    public long getIdNum() {
        return idNum_;
    }

    /**
     * <code>optional int64 id_num = 1;</code>
     *
     * @param value The idNum to set.
     */
    private void setIdNum(long value) {
        bitField0_ |= 0x00000001;
        idNum_ = value;
    }

    /**
     * <code>optional int64 id_num = 1;</code>
     */
    private void clearIdNum() {
        bitField0_ &= ~0x00000001;
        idNum_ = 0L;
    }

    public static final int ID_STR_FIELD_NUMBER = 2;
    private String idStr_;

    /**
     * <code>optional string id_str = 2;</code>
     *
     * @return Whether the idStr field is set.
     */
    @Override
    public boolean hasIdStr() {
        return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional string id_str = 2;</code>
     *
     * @return The idStr.
     */
    @Override
    public String getIdStr() {
        return idStr_;
    }

    /**
     * <code>optional string id_str = 2;</code>
     *
     * @return The bytes for idStr.
     */
    @Override
    public com.google.protobuf.ByteString getIdStrBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(idStr_);
    }

    /**
     * <code>optional string id_str = 2;</code>
     *
     * @param value The idStr to set.
     */
    private void setIdStr(String value) {
        Class<?> valueClass = value.getClass();
        bitField0_ |= 0x00000002;
        idStr_ = value;
    }

    /**
     * <code>optional string id_str = 2;</code>
     */
    private void clearIdStr() {
        bitField0_ &= ~0x00000002;
        idStr_ = getDefaultInstance().getIdStr();
    }

    /**
     * <code>optional string id_str = 2;</code>
     *
     * @param value The bytes for idStr to set.
     */
    private void setIdStrBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        idStr_ = value.toStringUtf8();
        bitField0_ |= 0x00000002;
    }

    public static final int NAME_FIELD_NUMBER = 3;
    private String name_;

    /**
     * <code>optional string name = 3;</code>
     *
     * @return Whether the name field is set.
     */
    @Override
    public boolean hasName() {
        return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     * <code>optional string name = 3;</code>
     *
     * @return The name.
     */
    @Override
    public String getName() {
        return name_;
    }

    /**
     * <code>optional string name = 3;</code>
     *
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString getNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }

    /**
     * <code>optional string name = 3;</code>
     *
     * @param value The name to set.
     */
    private void setName(String value) {
        Class<?> valueClass = value.getClass();
        bitField0_ |= 0x00000004;
        name_ = value;
    }

    /**
     * <code>optional string name = 3;</code>
     */
    private void clearName() {
        bitField0_ &= ~0x00000004;
        name_ = getDefaultInstance().getName();
    }

    /**
     * <code>optional string name = 3;</code>
     *
     * @param value The bytes for name to set.
     */
    private void setNameBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        name_ = value.toStringUtf8();
        bitField0_ |= 0x00000004;
    }

    public static final int MEDIA_TYPE_FIELD_NUMBER = 4;
    private String mediaType_;

    /**
     * <code>optional string media_type = 4;</code>
     *
     * @return Whether the mediaType field is set.
     */
    @Override
    public boolean hasMediaType() {
        return ((bitField0_ & 0x00000008) != 0);
    }

    /**
     * <code>optional string media_type = 4;</code>
     *
     * @return The mediaType.
     */
    @Override
    public String getMediaType() {
        return mediaType_;
    }

    /**
     * <code>optional string media_type = 4;</code>
     *
     * @return The bytes for mediaType.
     */
    @Override
    public com.google.protobuf.ByteString getMediaTypeBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(mediaType_);
    }

    /**
     * <code>optional string media_type = 4;</code>
     *
     * @param value The mediaType to set.
     */
    private void setMediaType(String value) {
        Class<?> valueClass = value.getClass();
        bitField0_ |= 0x00000008;
        mediaType_ = value;
    }

    /**
     * <code>optional string media_type = 4;</code>
     */
    private void clearMediaType() {
        bitField0_ &= ~0x00000008;
        mediaType_ = getDefaultInstance().getMediaType();
    }

    /**
     * <code>optional string media_type = 4;</code>
     *
     * @param value The bytes for mediaType to set.
     */
    private void setMediaTypeBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        mediaType_ = value.toStringUtf8();
        bitField0_ |= 0x00000008;
    }

    public static final int UPLOADER_ID_FIELD_NUMBER = 5;
    private long uploaderId_;

    /**
     * <code>int64 uploader_id = 5;</code>
     *
     * @return The uploaderId.
     */
    @Override
    public long getUploaderId() {
        return uploaderId_;
    }

    /**
     * <code>int64 uploader_id = 5;</code>
     *
     * @param value The uploaderId to set.
     */
    private void setUploaderId(long value) {

        uploaderId_ = value;
    }

    /**
     * <code>int64 uploader_id = 5;</code>
     */
    private void clearUploaderId() {

        uploaderId_ = 0L;
    }

    public static final int CREATION_DATE_FIELD_NUMBER = 6;
    private long creationDate_;

    /**
     * <code>int64 creation_date = 6;</code>
     *
     * @return The creationDate.
     */
    @Override
    public long getCreationDate() {
        return creationDate_;
    }

    /**
     * <code>int64 creation_date = 6;</code>
     *
     * @param value The creationDate to set.
     */
    private void setCreationDate(long value) {

        creationDate_ = value;
    }

    /**
     * <code>int64 creation_date = 6;</code>
     */
    private void clearCreationDate() {

        creationDate_ = 0L;
    }

    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.ProtobufList<im.turms.client.model.proto.model.common.Value> customAttributes_;

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    @Override
    public java.util.List<im.turms.client.model.proto.model.common.Value> getCustomAttributesList() {
        return customAttributes_;
    }

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    public java.util.List<? extends im.turms.client.model.proto.model.common.ValueOrBuilder> getCustomAttributesOrBuilderList() {
        return customAttributes_;
    }

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    @Override
    public int getCustomAttributesCount() {
        return customAttributes_.size();
    }

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    @Override
    public im.turms.client.model.proto.model.common.Value getCustomAttributes(int index) {
        return customAttributes_.get(index);
    }

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    public im.turms.client.model.proto.model.common.ValueOrBuilder getCustomAttributesOrBuilder(
            int index) {
        return customAttributes_.get(index);
    }

    private void ensureCustomAttributesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<im.turms.client.model.proto.model.common.Value> tmp =
                customAttributes_;
        if (!tmp.isModifiable()) {
            customAttributes_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    private void setCustomAttributes(
            int index,
            im.turms.client.model.proto.model.common.Value value) {
        value.getClass();
        ensureCustomAttributesIsMutable();
        customAttributes_.set(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    private void addCustomAttributes(im.turms.client.model.proto.model.common.Value value) {
        value.getClass();
        ensureCustomAttributesIsMutable();
        customAttributes_.add(value);
    }

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    private void addCustomAttributes(
            int index,
            im.turms.client.model.proto.model.common.Value value) {
        value.getClass();
        ensureCustomAttributesIsMutable();
        customAttributes_.add(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    private void addAllCustomAttributes(
            Iterable<? extends im.turms.client.model.proto.model.common.Value> values) {
        ensureCustomAttributesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(values, customAttributes_);
    }

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    private void clearCustomAttributes() {
        customAttributes_ = emptyProtobufList();
    }

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    private void removeCustomAttributes(int index) {
        ensureCustomAttributesIsMutable();
        customAttributes_.remove(index);
    }

    public static StorageResourceInfo parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static StorageResourceInfo parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static StorageResourceInfo parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static StorageResourceInfo parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static StorageResourceInfo parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static StorageResourceInfo parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static StorageResourceInfo parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static StorageResourceInfo parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static StorageResourceInfo parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static StorageResourceInfo parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static StorageResourceInfo parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static StorageResourceInfo parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(
            StorageResourceInfo prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.StorageResourceInfo}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<StorageResourceInfo, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.StorageResourceInfo)
            StorageResourceInfoOrBuilder {
        // Construct using
        // im.turms.client.model.proto.model.storage.StorageResourceInfo.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>optional int64 id_num = 1;</code>
         *
         * @return Whether the idNum field is set.
         */
        @Override
        public boolean hasIdNum() {
            return instance.hasIdNum();
        }

        /**
         * <code>optional int64 id_num = 1;</code>
         *
         * @return The idNum.
         */
        @Override
        public long getIdNum() {
            return instance.getIdNum();
        }

        /**
         * <code>optional int64 id_num = 1;</code>
         *
         * @param value The idNum to set.
         * @return This builder for chaining.
         */
        public Builder setIdNum(long value) {
            copyOnWrite();
            instance.setIdNum(value);
            return this;
        }

        /**
         * <code>optional int64 id_num = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearIdNum() {
            copyOnWrite();
            instance.clearIdNum();
            return this;
        }

        /**
         * <code>optional string id_str = 2;</code>
         *
         * @return Whether the idStr field is set.
         */
        @Override
        public boolean hasIdStr() {
            return instance.hasIdStr();
        }

        /**
         * <code>optional string id_str = 2;</code>
         *
         * @return The idStr.
         */
        @Override
        public String getIdStr() {
            return instance.getIdStr();
        }

        /**
         * <code>optional string id_str = 2;</code>
         *
         * @return The bytes for idStr.
         */
        @Override
        public com.google.protobuf.ByteString getIdStrBytes() {
            return instance.getIdStrBytes();
        }

        /**
         * <code>optional string id_str = 2;</code>
         *
         * @param value The idStr to set.
         * @return This builder for chaining.
         */
        public Builder setIdStr(String value) {
            copyOnWrite();
            instance.setIdStr(value);
            return this;
        }

        /**
         * <code>optional string id_str = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearIdStr() {
            copyOnWrite();
            instance.clearIdStr();
            return this;
        }

        /**
         * <code>optional string id_str = 2;</code>
         *
         * @param value The bytes for idStr to set.
         * @return This builder for chaining.
         */
        public Builder setIdStrBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setIdStrBytes(value);
            return this;
        }

        /**
         * <code>optional string name = 3;</code>
         *
         * @return Whether the name field is set.
         */
        @Override
        public boolean hasName() {
            return instance.hasName();
        }

        /**
         * <code>optional string name = 3;</code>
         *
         * @return The name.
         */
        @Override
        public String getName() {
            return instance.getName();
        }

        /**
         * <code>optional string name = 3;</code>
         *
         * @return The bytes for name.
         */
        @Override
        public com.google.protobuf.ByteString getNameBytes() {
            return instance.getNameBytes();
        }

        /**
         * <code>optional string name = 3;</code>
         *
         * @param value The name to set.
         * @return This builder for chaining.
         */
        public Builder setName(String value) {
            copyOnWrite();
            instance.setName(value);
            return this;
        }

        /**
         * <code>optional string name = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearName() {
            copyOnWrite();
            instance.clearName();
            return this;
        }

        /**
         * <code>optional string name = 3;</code>
         *
         * @param value The bytes for name to set.
         * @return This builder for chaining.
         */
        public Builder setNameBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setNameBytes(value);
            return this;
        }

        /**
         * <code>optional string media_type = 4;</code>
         *
         * @return Whether the mediaType field is set.
         */
        @Override
        public boolean hasMediaType() {
            return instance.hasMediaType();
        }

        /**
         * <code>optional string media_type = 4;</code>
         *
         * @return The mediaType.
         */
        @Override
        public String getMediaType() {
            return instance.getMediaType();
        }

        /**
         * <code>optional string media_type = 4;</code>
         *
         * @return The bytes for mediaType.
         */
        @Override
        public com.google.protobuf.ByteString getMediaTypeBytes() {
            return instance.getMediaTypeBytes();
        }

        /**
         * <code>optional string media_type = 4;</code>
         *
         * @param value The mediaType to set.
         * @return This builder for chaining.
         */
        public Builder setMediaType(String value) {
            copyOnWrite();
            instance.setMediaType(value);
            return this;
        }

        /**
         * <code>optional string media_type = 4;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearMediaType() {
            copyOnWrite();
            instance.clearMediaType();
            return this;
        }

        /**
         * <code>optional string media_type = 4;</code>
         *
         * @param value The bytes for mediaType to set.
         * @return This builder for chaining.
         */
        public Builder setMediaTypeBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setMediaTypeBytes(value);
            return this;
        }

        /**
         * <code>int64 uploader_id = 5;</code>
         *
         * @return The uploaderId.
         */
        @Override
        public long getUploaderId() {
            return instance.getUploaderId();
        }

        /**
         * <code>int64 uploader_id = 5;</code>
         *
         * @param value The uploaderId to set.
         * @return This builder for chaining.
         */
        public Builder setUploaderId(long value) {
            copyOnWrite();
            instance.setUploaderId(value);
            return this;
        }

        /**
         * <code>int64 uploader_id = 5;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearUploaderId() {
            copyOnWrite();
            instance.clearUploaderId();
            return this;
        }

        /**
         * <code>int64 creation_date = 6;</code>
         *
         * @return The creationDate.
         */
        @Override
        public long getCreationDate() {
            return instance.getCreationDate();
        }

        /**
         * <code>int64 creation_date = 6;</code>
         *
         * @param value The creationDate to set.
         * @return This builder for chaining.
         */
        public Builder setCreationDate(long value) {
            copyOnWrite();
            instance.setCreationDate(value);
            return this;
        }

        /**
         * <code>int64 creation_date = 6;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearCreationDate() {
            copyOnWrite();
            instance.clearCreationDate();
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
         */
        @Override
        public java.util.List<im.turms.client.model.proto.model.common.Value> getCustomAttributesList() {
            return java.util.Collections.unmodifiableList(instance.getCustomAttributesList());
        }

        /**
         * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
         */
        @Override
        public int getCustomAttributesCount() {
            return instance.getCustomAttributesCount();
        }

        /**
         * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
         */
        @Override
        public im.turms.client.model.proto.model.common.Value getCustomAttributes(int index) {
            return instance.getCustomAttributes(index);
        }

        /**
         * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
         */
        public Builder setCustomAttributes(
                int index,
                im.turms.client.model.proto.model.common.Value value) {
            copyOnWrite();
            instance.setCustomAttributes(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
         */
        public Builder setCustomAttributes(
                int index,
                im.turms.client.model.proto.model.common.Value.Builder builderForValue) {
            copyOnWrite();
            instance.setCustomAttributes(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
         */
        public Builder addCustomAttributes(im.turms.client.model.proto.model.common.Value value) {
            copyOnWrite();
            instance.addCustomAttributes(value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
         */
        public Builder addCustomAttributes(
                int index,
                im.turms.client.model.proto.model.common.Value value) {
            copyOnWrite();
            instance.addCustomAttributes(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
         */
        public Builder addCustomAttributes(
                im.turms.client.model.proto.model.common.Value.Builder builderForValue) {
            copyOnWrite();
            instance.addCustomAttributes(builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
         */
        public Builder addCustomAttributes(
                int index,
                im.turms.client.model.proto.model.common.Value.Builder builderForValue) {
            copyOnWrite();
            instance.addCustomAttributes(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
         */
        public Builder addAllCustomAttributes(
                Iterable<? extends im.turms.client.model.proto.model.common.Value> values) {
            copyOnWrite();
            instance.addAllCustomAttributes(values);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
         */
        public Builder clearCustomAttributes() {
            copyOnWrite();
            instance.clearCustomAttributes();
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
         */
        public Builder removeCustomAttributes(int index) {
            copyOnWrite();
            instance.removeCustomAttributes(index);
            return this;
        }

        // @@protoc_insertion_point(builder_scope:im.turms.proto.StorageResourceInfo)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new StorageResourceInfo();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_",
                        "idNum_",
                        "idStr_",
                        "name_",
                        "mediaType_",
                        "uploaderId_",
                        "creationDate_",
                        "customAttributes_",
                        im.turms.client.model.proto.model.common.Value.class,};
                String info =
                        "\u0000\u0007\u0000\u0001\u0001\u000f\u0007\u0000\u0001\u0000\u0001\u1002\u0000\u0002"
                                + "\u1208\u0001\u0003\u1208\u0002\u0004\u1208\u0003\u0005\u0002\u0006\u0002\u000f\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<StorageResourceInfo> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (StorageResourceInfo.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            }
            case GET_MEMOIZED_IS_INITIALIZED: {
                return (byte) 1;
            }
            case SET_MEMOIZED_IS_INITIALIZED: {
                return null;
            }
        }
        throw new UnsupportedOperationException();
    }

    // @@protoc_insertion_point(class_scope:im.turms.proto.StorageResourceInfo)
    private static final StorageResourceInfo DEFAULT_INSTANCE;
    static {
        StorageResourceInfo defaultInstance = new StorageResourceInfo();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(StorageResourceInfo.class,
                defaultInstance);
    }

    public static StorageResourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<StorageResourceInfo> PARSER;

    public static com.google.protobuf.Parser<StorageResourceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
