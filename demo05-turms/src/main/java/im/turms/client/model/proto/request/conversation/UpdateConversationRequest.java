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

package im.turms.client.model.proto.request.conversation;

/**
 * Protobuf type {@code im.turms.proto.UpdateConversationRequest}
 */
public final class UpdateConversationRequest extends
        com.google.protobuf.GeneratedMessageLite<UpdateConversationRequest, UpdateConversationRequest.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.UpdateConversationRequest)
        UpdateConversationRequestOrBuilder {
    private UpdateConversationRequest() {
        customAttributes_ = emptyProtobufList();
    }

    private int bitField0_;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private long userId_;

    /**
     * <pre>
     * Query filter
     * </pre>
     *
     * <code>optional int64 user_id = 1;</code>
     *
     * @return Whether the userId field is set.
     */
    @Override
    public boolean hasUserId() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <pre>
     * Query filter
     * </pre>
     *
     * <code>optional int64 user_id = 1;</code>
     *
     * @return The userId.
     */
    @Override
    public long getUserId() {
        return userId_;
    }

    /**
     * <pre>
     * Query filter
     * </pre>
     *
     * <code>optional int64 user_id = 1;</code>
     *
     * @param value The userId to set.
     */
    private void setUserId(long value) {
        bitField0_ |= 0x00000001;
        userId_ = value;
    }

    /**
     * <pre>
     * Query filter
     * </pre>
     *
     * <code>optional int64 user_id = 1;</code>
     */
    private void clearUserId() {
        bitField0_ &= ~0x00000001;
        userId_ = 0L;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 2;
    private long groupId_;

    /**
     * <code>optional int64 group_id = 2;</code>
     *
     * @return Whether the groupId field is set.
     */
    @Override
    public boolean hasGroupId() {
        return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional int64 group_id = 2;</code>
     *
     * @return The groupId.
     */
    @Override
    public long getGroupId() {
        return groupId_;
    }

    /**
     * <code>optional int64 group_id = 2;</code>
     *
     * @param value The groupId to set.
     */
    private void setGroupId(long value) {
        bitField0_ |= 0x00000002;
        groupId_ = value;
    }

    /**
     * <code>optional int64 group_id = 2;</code>
     */
    private void clearGroupId() {
        bitField0_ &= ~0x00000002;
        groupId_ = 0L;
    }

    public static final int READ_DATE_FIELD_NUMBER = 3;
    private long readDate_;

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>int64 read_date = 3;</code>
     *
     * @return The readDate.
     */
    @Override
    public long getReadDate() {
        return readDate_;
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>int64 read_date = 3;</code>
     *
     * @param value The readDate to set.
     */
    private void setReadDate(long value) {

        readDate_ = value;
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>int64 read_date = 3;</code>
     */
    private void clearReadDate() {

        readDate_ = 0L;
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

    public static UpdateConversationRequest parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateConversationRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateConversationRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateConversationRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateConversationRequest parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateConversationRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateConversationRequest parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateConversationRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UpdateConversationRequest parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateConversationRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UpdateConversationRequest parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateConversationRequest parseFrom(
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
            UpdateConversationRequest prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.UpdateConversationRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<UpdateConversationRequest, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.UpdateConversationRequest)
            UpdateConversationRequestOrBuilder {
        // Construct using
        // im.turms.client.model.proto.request.conversation.UpdateConversationRequest.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <pre>
         * Query filter
         * </pre>
         *
         * <code>optional int64 user_id = 1;</code>
         *
         * @return Whether the userId field is set.
         */
        @Override
        public boolean hasUserId() {
            return instance.hasUserId();
        }

        /**
         * <pre>
         * Query filter
         * </pre>
         *
         * <code>optional int64 user_id = 1;</code>
         *
         * @return The userId.
         */
        @Override
        public long getUserId() {
            return instance.getUserId();
        }

        /**
         * <pre>
         * Query filter
         * </pre>
         *
         * <code>optional int64 user_id = 1;</code>
         *
         * @param value The userId to set.
         * @return This builder for chaining.
         */
        public Builder setUserId(long value) {
            copyOnWrite();
            instance.setUserId(value);
            return this;
        }

        /**
         * <pre>
         * Query filter
         * </pre>
         *
         * <code>optional int64 user_id = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearUserId() {
            copyOnWrite();
            instance.clearUserId();
            return this;
        }

        /**
         * <code>optional int64 group_id = 2;</code>
         *
         * @return Whether the groupId field is set.
         */
        @Override
        public boolean hasGroupId() {
            return instance.hasGroupId();
        }

        /**
         * <code>optional int64 group_id = 2;</code>
         *
         * @return The groupId.
         */
        @Override
        public long getGroupId() {
            return instance.getGroupId();
        }

        /**
         * <code>optional int64 group_id = 2;</code>
         *
         * @param value The groupId to set.
         * @return This builder for chaining.
         */
        public Builder setGroupId(long value) {
            copyOnWrite();
            instance.setGroupId(value);
            return this;
        }

        /**
         * <code>optional int64 group_id = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearGroupId() {
            copyOnWrite();
            instance.clearGroupId();
            return this;
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>int64 read_date = 3;</code>
         *
         * @return The readDate.
         */
        @Override
        public long getReadDate() {
            return instance.getReadDate();
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>int64 read_date = 3;</code>
         *
         * @param value The readDate to set.
         * @return This builder for chaining.
         */
        public Builder setReadDate(long value) {
            copyOnWrite();
            instance.setReadDate(value);
            return this;
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>int64 read_date = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearReadDate() {
            copyOnWrite();
            instance.clearReadDate();
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.UpdateConversationRequest)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new UpdateConversationRequest();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_",
                        "userId_",
                        "groupId_",
                        "readDate_",
                        "customAttributes_",
                        im.turms.client.model.proto.model.common.Value.class,};
                String info =
                        "\u0000\u0004\u0000\u0001\u0001\u000f\u0004\u0000\u0001\u0000\u0001\u1002\u0000\u0002"
                                + "\u1002\u0001\u0003\u0002\u000f\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<UpdateConversationRequest> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (UpdateConversationRequest.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.UpdateConversationRequest)
    private static final UpdateConversationRequest DEFAULT_INSTANCE;
    static {
        UpdateConversationRequest defaultInstance = new UpdateConversationRequest();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite
                .registerDefaultInstance(UpdateConversationRequest.class, defaultInstance);
    }

    public static UpdateConversationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UpdateConversationRequest> PARSER;

    public static com.google.protobuf.Parser<UpdateConversationRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
