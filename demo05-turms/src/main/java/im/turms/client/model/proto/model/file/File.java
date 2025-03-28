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

package im.turms.client.model.proto.model.file;

/**
 * Protobuf type {@code im.turms.proto.File}
 */
public final class File extends com.google.protobuf.GeneratedMessageLite<File, File.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.File)
        FileOrBuilder {
    private File() {
        data_ = com.google.protobuf.ByteString.EMPTY;
        customAttributes_ = emptyProtobufList();
    }

    public interface DescriptionOrBuilder extends
            // @@protoc_insertion_point(interface_extends:im.turms.proto.File.Description)
            com.google.protobuf.MessageLiteOrBuilder {

        /**
         * <code>string url = 1;</code>
         *
         * @return The url.
         */
        String getUrl();

        /**
         * <code>string url = 1;</code>
         *
         * @return The bytes for url.
         */
        com.google.protobuf.ByteString getUrlBytes();

        /**
         * <code>optional int32 size = 2;</code>
         *
         * @return Whether the size field is set.
         */
        boolean hasSize();

        /**
         * <code>optional int32 size = 2;</code>
         *
         * @return The size.
         */
        int getSize();

        /**
         * <code>optional string format = 3;</code>
         *
         * @return Whether the format field is set.
         */
        boolean hasFormat();

        /**
         * <code>optional string format = 3;</code>
         *
         * @return The format.
         */
        String getFormat();

        /**
         * <code>optional string format = 3;</code>
         *
         * @return The bytes for format.
         */
        com.google.protobuf.ByteString getFormatBytes();
    }

    /**
     * Protobuf type {@code im.turms.proto.File.Description}
     */
    public static final class Description extends
            com.google.protobuf.GeneratedMessageLite<Description, Description.Builder> implements
            // @@protoc_insertion_point(message_implements:im.turms.proto.File.Description)
            DescriptionOrBuilder {
        private Description() {
            url_ = "";
            format_ = "";
        }

        private int bitField0_;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_;

        /**
         * <code>string url = 1;</code>
         *
         * @return The url.
         */
        @Override
        public String getUrl() {
            return url_;
        }

        /**
         * <code>string url = 1;</code>
         *
         * @return The bytes for url.
         */
        @Override
        public com.google.protobuf.ByteString getUrlBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(url_);
        }

        /**
         * <code>string url = 1;</code>
         *
         * @param value The url to set.
         */
        private void setUrl(String value) {
            Class<?> valueClass = value.getClass();

            url_ = value;
        }

        /**
         * <code>string url = 1;</code>
         */
        private void clearUrl() {

            url_ = getDefaultInstance().getUrl();
        }

        /**
         * <code>string url = 1;</code>
         *
         * @param value The bytes for url to set.
         */
        private void setUrlBytes(com.google.protobuf.ByteString value) {
            checkByteStringIsUtf8(value);
            url_ = value.toStringUtf8();

        }

        public static final int SIZE_FIELD_NUMBER = 2;
        private int size_;

        /**
         * <code>optional int32 size = 2;</code>
         *
         * @return Whether the size field is set.
         */
        @Override
        public boolean hasSize() {
            return ((bitField0_ & 0x00000001) != 0);
        }

        /**
         * <code>optional int32 size = 2;</code>
         *
         * @return The size.
         */
        @Override
        public int getSize() {
            return size_;
        }

        /**
         * <code>optional int32 size = 2;</code>
         *
         * @param value The size to set.
         */
        private void setSize(int value) {
            bitField0_ |= 0x00000001;
            size_ = value;
        }

        /**
         * <code>optional int32 size = 2;</code>
         */
        private void clearSize() {
            bitField0_ &= ~0x00000001;
            size_ = 0;
        }

        public static final int FORMAT_FIELD_NUMBER = 3;
        private String format_;

        /**
         * <code>optional string format = 3;</code>
         *
         * @return Whether the format field is set.
         */
        @Override
        public boolean hasFormat() {
            return ((bitField0_ & 0x00000002) != 0);
        }

        /**
         * <code>optional string format = 3;</code>
         *
         * @return The format.
         */
        @Override
        public String getFormat() {
            return format_;
        }

        /**
         * <code>optional string format = 3;</code>
         *
         * @return The bytes for format.
         */
        @Override
        public com.google.protobuf.ByteString getFormatBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(format_);
        }

        /**
         * <code>optional string format = 3;</code>
         *
         * @param value The format to set.
         */
        private void setFormat(String value) {
            Class<?> valueClass = value.getClass();
            bitField0_ |= 0x00000002;
            format_ = value;
        }

        /**
         * <code>optional string format = 3;</code>
         */
        private void clearFormat() {
            bitField0_ &= ~0x00000002;
            format_ = getDefaultInstance().getFormat();
        }

        /**
         * <code>optional string format = 3;</code>
         *
         * @param value The bytes for format to set.
         */
        private void setFormatBytes(com.google.protobuf.ByteString value) {
            checkByteStringIsUtf8(value);
            format_ = value.toStringUtf8();
            bitField0_ |= 0x00000002;
        }

        public static Description parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Description parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite
                    .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Description parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Description parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite
                    .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Description parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Description parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite
                    .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Description parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Description parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite
                    .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Description parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Description parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Description parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Description parseFrom(
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
                Description prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        /**
         * Protobuf type {@code im.turms.proto.File.Description}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<Description, Builder>
                implements
                // @@protoc_insertion_point(builder_implements:im.turms.proto.File.Description)
                DescriptionOrBuilder {
            // Construct using im.turms.client.model.proto.model.file.File.Description.newBuilder()
            private Builder() {
                super(DEFAULT_INSTANCE);
            }

            /**
             * <code>string url = 1;</code>
             *
             * @return The url.
             */
            @Override
            public String getUrl() {
                return instance.getUrl();
            }

            /**
             * <code>string url = 1;</code>
             *
             * @return The bytes for url.
             */
            @Override
            public com.google.protobuf.ByteString getUrlBytes() {
                return instance.getUrlBytes();
            }

            /**
             * <code>string url = 1;</code>
             *
             * @param value The url to set.
             * @return This builder for chaining.
             */
            public Builder setUrl(String value) {
                copyOnWrite();
                instance.setUrl(value);
                return this;
            }

            /**
             * <code>string url = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUrl() {
                copyOnWrite();
                instance.clearUrl();
                return this;
            }

            /**
             * <code>string url = 1;</code>
             *
             * @param value The bytes for url to set.
             * @return This builder for chaining.
             */
            public Builder setUrlBytes(com.google.protobuf.ByteString value) {
                copyOnWrite();
                instance.setUrlBytes(value);
                return this;
            }

            /**
             * <code>optional int32 size = 2;</code>
             *
             * @return Whether the size field is set.
             */
            @Override
            public boolean hasSize() {
                return instance.hasSize();
            }

            /**
             * <code>optional int32 size = 2;</code>
             *
             * @return The size.
             */
            @Override
            public int getSize() {
                return instance.getSize();
            }

            /**
             * <code>optional int32 size = 2;</code>
             *
             * @param value The size to set.
             * @return This builder for chaining.
             */
            public Builder setSize(int value) {
                copyOnWrite();
                instance.setSize(value);
                return this;
            }

            /**
             * <code>optional int32 size = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSize() {
                copyOnWrite();
                instance.clearSize();
                return this;
            }

            /**
             * <code>optional string format = 3;</code>
             *
             * @return Whether the format field is set.
             */
            @Override
            public boolean hasFormat() {
                return instance.hasFormat();
            }

            /**
             * <code>optional string format = 3;</code>
             *
             * @return The format.
             */
            @Override
            public String getFormat() {
                return instance.getFormat();
            }

            /**
             * <code>optional string format = 3;</code>
             *
             * @return The bytes for format.
             */
            @Override
            public com.google.protobuf.ByteString getFormatBytes() {
                return instance.getFormatBytes();
            }

            /**
             * <code>optional string format = 3;</code>
             *
             * @param value The format to set.
             * @return This builder for chaining.
             */
            public Builder setFormat(String value) {
                copyOnWrite();
                instance.setFormat(value);
                return this;
            }

            /**
             * <code>optional string format = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearFormat() {
                copyOnWrite();
                instance.clearFormat();
                return this;
            }

            /**
             * <code>optional string format = 3;</code>
             *
             * @param value The bytes for format to set.
             * @return This builder for chaining.
             */
            public Builder setFormatBytes(com.google.protobuf.ByteString value) {
                copyOnWrite();
                instance.setFormatBytes(value);
                return this;
            }

            // @@protoc_insertion_point(builder_scope:im.turms.proto.File.Description)
        }

        @Override
        @SuppressWarnings({"unchecked", "fallthrough"})
        protected Object dynamicMethod(
                MethodToInvoke method,
                Object arg0,
                Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE: {
                    return new Description();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    Object[] objects =
                            new Object[]{"bitField0_", "url_", "size_", "format_",};
                    String info =
                            "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u1004"
                                    + "\u0000\u0003\u1208\u0001";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                // fall through
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    com.google.protobuf.Parser<Description> parser =
                            PARSER;
                    if (parser == null) {
                        synchronized (Description.class) {
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

        // @@protoc_insertion_point(class_scope:im.turms.proto.File.Description)
        private static final Description DEFAULT_INSTANCE;
        static {
            Description defaultInstance = new Description();
            // New instances are implicitly immutable so no need to make
            // immutable.
            DEFAULT_INSTANCE = defaultInstance;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(Description.class,
                    defaultInstance);
        }

        public static Description getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static volatile com.google.protobuf.Parser<Description> PARSER;

        public static com.google.protobuf.Parser<Description> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    private int bitField0_;
    public static final int DESCRIPTION_FIELD_NUMBER = 1;
    private Description description_;

    /**
     * <code>optional .im.turms.proto.File.Description description = 1;</code>
     */
    @Override
    public boolean hasDescription() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional .im.turms.proto.File.Description description = 1;</code>
     */
    @Override
    public Description getDescription() {
        return description_ == null
                ? Description.getDefaultInstance()
                : description_;
    }

    /**
     * <code>optional .im.turms.proto.File.Description description = 1;</code>
     */
    private void setDescription(Description value) {
        value.getClass();
        description_ = value;
        bitField0_ |= 0x00000001;
    }

    /**
     * <code>optional .im.turms.proto.File.Description description = 1;</code>
     */
    @SuppressWarnings({"ReferenceEquality"})
    private void mergeDescription(Description value) {
        value.getClass();
        if (description_ != null
                && description_ != Description
                        .getDefaultInstance()) {
            description_ =
                    Description.newBuilder(description_)
                            .mergeFrom(value)
                            .buildPartial();
        } else {
            description_ = value;
        }
        bitField0_ |= 0x00000001;
    }

    /**
     * <code>optional .im.turms.proto.File.Description description = 1;</code>
     */
    private void clearDescription() {
        description_ = null;
        bitField0_ &= ~0x00000001;
    }

    public static final int DATA_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString data_;

    /**
     * <code>optional bytes data = 2;</code>
     *
     * @return Whether the data field is set.
     */
    @Override
    public boolean hasData() {
        return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional bytes data = 2;</code>
     *
     * @return The data.
     */
    @Override
    public com.google.protobuf.ByteString getData() {
        return data_;
    }

    /**
     * <code>optional bytes data = 2;</code>
     *
     * @param value The data to set.
     */
    private void setData(com.google.protobuf.ByteString value) {
        Class<?> valueClass = value.getClass();
        bitField0_ |= 0x00000002;
        data_ = value;
    }

    /**
     * <code>optional bytes data = 2;</code>
     */
    private void clearData() {
        bitField0_ &= ~0x00000002;
        data_ = getDefaultInstance().getData();
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

    public static File parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static File parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static File parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static File parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static File parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static File parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static File parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static File parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static File parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static File parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static File parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static File parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(File prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.File}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<File, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.File)
            FileOrBuilder {
        // Construct using im.turms.client.model.proto.model.file.File.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>optional .im.turms.proto.File.Description description = 1;</code>
         */
        @Override
        public boolean hasDescription() {
            return instance.hasDescription();
        }

        /**
         * <code>optional .im.turms.proto.File.Description description = 1;</code>
         */
        @Override
        public Description getDescription() {
            return instance.getDescription();
        }

        /**
         * <code>optional .im.turms.proto.File.Description description = 1;</code>
         */
        public Builder setDescription(
                Description value) {
            copyOnWrite();
            instance.setDescription(value);
            return this;
        }

        /**
         * <code>optional .im.turms.proto.File.Description description = 1;</code>
         */
        public Builder setDescription(
                Description.Builder builderForValue) {
            copyOnWrite();
            instance.setDescription(builderForValue.build());
            return this;
        }

        /**
         * <code>optional .im.turms.proto.File.Description description = 1;</code>
         */
        public Builder mergeDescription(
                Description value) {
            copyOnWrite();
            instance.mergeDescription(value);
            return this;
        }

        /**
         * <code>optional .im.turms.proto.File.Description description = 1;</code>
         */
        public Builder clearDescription() {
            copyOnWrite();
            instance.clearDescription();
            return this;
        }

        /**
         * <code>optional bytes data = 2;</code>
         *
         * @return Whether the data field is set.
         */
        @Override
        public boolean hasData() {
            return instance.hasData();
        }

        /**
         * <code>optional bytes data = 2;</code>
         *
         * @return The data.
         */
        @Override
        public com.google.protobuf.ByteString getData() {
            return instance.getData();
        }

        /**
         * <code>optional bytes data = 2;</code>
         *
         * @param value The data to set.
         * @return This builder for chaining.
         */
        public Builder setData(com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setData(value);
            return this;
        }

        /**
         * <code>optional bytes data = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearData() {
            copyOnWrite();
            instance.clearData();
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.File)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new File();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_",
                        "description_",
                        "data_",
                        "customAttributes_",
                        im.turms.client.model.proto.model.common.Value.class,};
                String info =
                        "\u0000\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0001\u0000\u0001\u1009\u0000\u0002"
                                + "\u100a\u0001\u000f\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<File> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (File.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.File)
    private static final File DEFAULT_INSTANCE;
    static {
        File defaultInstance = new File();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(File.class,
                defaultInstance);
    }

    public static File getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<File> PARSER;

    public static com.google.protobuf.Parser<File> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
