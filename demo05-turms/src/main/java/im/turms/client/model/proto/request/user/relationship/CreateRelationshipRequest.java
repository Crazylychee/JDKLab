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

/**
 * Protobuf type {@code im.turms.proto.CreateRelationshipRequest}
 */
public final class CreateRelationshipRequest extends
        com.google.protobuf.GeneratedMessageLite<CreateRelationshipRequest, CreateRelationshipRequest.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.CreateRelationshipRequest)
        CreateRelationshipRequestOrBuilder {
    private CreateRelationshipRequest() {
        name_ = "";
        customAttributes_ = emptyProtobufList();
    }

    private int bitField0_;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private long userId_;

    /**
     * <code>int64 user_id = 1;</code>
     *
     * @return The userId.
     */
    @Override
    public long getUserId() {
        return userId_;
    }

    /**
     * <code>int64 user_id = 1;</code>
     *
     * @param value The userId to set.
     */
    private void setUserId(long value) {

        userId_ = value;
    }

    /**
     * <code>int64 user_id = 1;</code>
     */
    private void clearUserId() {

        userId_ = 0L;
    }

    public static final int BLOCKED_FIELD_NUMBER = 2;
    private boolean blocked_;

    /**
     * <code>bool blocked = 2;</code>
     *
     * @return The blocked.
     */
    @Override
    public boolean getBlocked() {
        return blocked_;
    }

    /**
     * <code>bool blocked = 2;</code>
     *
     * @param value The blocked to set.
     */
    private void setBlocked(boolean value) {

        blocked_ = value;
    }

    /**
     * <code>bool blocked = 2;</code>
     */
    private void clearBlocked() {

        blocked_ = false;
    }

    public static final int GROUP_INDEX_FIELD_NUMBER = 3;
    private int groupIndex_;

    /**
     * <code>optional int32 group_index = 3;</code>
     *
     * @return Whether the groupIndex field is set.
     */
    @Override
    public boolean hasGroupIndex() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional int32 group_index = 3;</code>
     *
     * @return The groupIndex.
     */
    @Override
    public int getGroupIndex() {
        return groupIndex_;
    }

    /**
     * <code>optional int32 group_index = 3;</code>
     *
     * @param value The groupIndex to set.
     */
    private void setGroupIndex(int value) {
        bitField0_ |= 0x00000001;
        groupIndex_ = value;
    }

    /**
     * <code>optional int32 group_index = 3;</code>
     */
    private void clearGroupIndex() {
        bitField0_ &= ~0x00000001;
        groupIndex_ = 0;
    }

    public static final int NAME_FIELD_NUMBER = 4;
    private String name_;

    /**
     * <code>optional string name = 4;</code>
     *
     * @return Whether the name field is set.
     */
    @Override
    public boolean hasName() {
        return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional string name = 4;</code>
     *
     * @return The name.
     */
    @Override
    public String getName() {
        return name_;
    }

    /**
     * <code>optional string name = 4;</code>
     *
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString getNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }

    /**
     * <code>optional string name = 4;</code>
     *
     * @param value The name to set.
     */
    private void setName(String value) {
        Class<?> valueClass = value.getClass();
        bitField0_ |= 0x00000002;
        name_ = value;
    }

    /**
     * <code>optional string name = 4;</code>
     */
    private void clearName() {
        bitField0_ &= ~0x00000002;
        name_ = getDefaultInstance().getName();
    }

    /**
     * <code>optional string name = 4;</code>
     *
     * @param value The bytes for name to set.
     */
    private void setNameBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        name_ = value.toStringUtf8();
        bitField0_ |= 0x00000002;
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

    public static CreateRelationshipRequest parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static CreateRelationshipRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static CreateRelationshipRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static CreateRelationshipRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static CreateRelationshipRequest parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static CreateRelationshipRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static CreateRelationshipRequest parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static CreateRelationshipRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static CreateRelationshipRequest parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static CreateRelationshipRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static CreateRelationshipRequest parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static CreateRelationshipRequest parseFrom(
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
            CreateRelationshipRequest prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.CreateRelationshipRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<CreateRelationshipRequest, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.CreateRelationshipRequest)
            CreateRelationshipRequestOrBuilder {
        // Construct using
        // im.turms.client.model.proto.request.user.relationship.CreateRelationshipRequest.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>int64 user_id = 1;</code>
         *
         * @return The userId.
         */
        @Override
        public long getUserId() {
            return instance.getUserId();
        }

        /**
         * <code>int64 user_id = 1;</code>
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
         * <code>int64 user_id = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearUserId() {
            copyOnWrite();
            instance.clearUserId();
            return this;
        }

        /**
         * <code>bool blocked = 2;</code>
         *
         * @return The blocked.
         */
        @Override
        public boolean getBlocked() {
            return instance.getBlocked();
        }

        /**
         * <code>bool blocked = 2;</code>
         *
         * @param value The blocked to set.
         * @return This builder for chaining.
         */
        public Builder setBlocked(boolean value) {
            copyOnWrite();
            instance.setBlocked(value);
            return this;
        }

        /**
         * <code>bool blocked = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearBlocked() {
            copyOnWrite();
            instance.clearBlocked();
            return this;
        }

        /**
         * <code>optional int32 group_index = 3;</code>
         *
         * @return Whether the groupIndex field is set.
         */
        @Override
        public boolean hasGroupIndex() {
            return instance.hasGroupIndex();
        }

        /**
         * <code>optional int32 group_index = 3;</code>
         *
         * @return The groupIndex.
         */
        @Override
        public int getGroupIndex() {
            return instance.getGroupIndex();
        }

        /**
         * <code>optional int32 group_index = 3;</code>
         *
         * @param value The groupIndex to set.
         * @return This builder for chaining.
         */
        public Builder setGroupIndex(int value) {
            copyOnWrite();
            instance.setGroupIndex(value);
            return this;
        }

        /**
         * <code>optional int32 group_index = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearGroupIndex() {
            copyOnWrite();
            instance.clearGroupIndex();
            return this;
        }

        /**
         * <code>optional string name = 4;</code>
         *
         * @return Whether the name field is set.
         */
        @Override
        public boolean hasName() {
            return instance.hasName();
        }

        /**
         * <code>optional string name = 4;</code>
         *
         * @return The name.
         */
        @Override
        public String getName() {
            return instance.getName();
        }

        /**
         * <code>optional string name = 4;</code>
         *
         * @return The bytes for name.
         */
        @Override
        public com.google.protobuf.ByteString getNameBytes() {
            return instance.getNameBytes();
        }

        /**
         * <code>optional string name = 4;</code>
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
         * <code>optional string name = 4;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearName() {
            copyOnWrite();
            instance.clearName();
            return this;
        }

        /**
         * <code>optional string name = 4;</code>
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.CreateRelationshipRequest)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new CreateRelationshipRequest();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_",
                        "userId_",
                        "blocked_",
                        "groupIndex_",
                        "name_",
                        "customAttributes_",
                        im.turms.client.model.proto.model.common.Value.class,};
                String info =
                        "\u0000\u0005\u0000\u0001\u0001\u000f\u0005\u0000\u0001\u0000\u0001\u0002\u0002\u0007"
                                + "\u0003\u1004\u0000\u0004\u1208\u0001\u000f\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<CreateRelationshipRequest> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (CreateRelationshipRequest.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.CreateRelationshipRequest)
    private static final CreateRelationshipRequest DEFAULT_INSTANCE;
    static {
        CreateRelationshipRequest defaultInstance = new CreateRelationshipRequest();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite
                .registerDefaultInstance(CreateRelationshipRequest.class, defaultInstance);
    }

    public static CreateRelationshipRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<CreateRelationshipRequest> PARSER;

    public static com.google.protobuf.Parser<CreateRelationshipRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
