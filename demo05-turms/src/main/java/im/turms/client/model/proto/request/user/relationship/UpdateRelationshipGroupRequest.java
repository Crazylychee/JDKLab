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
 * Protobuf type {@code im.turms.proto.UpdateRelationshipGroupRequest}
 */
public final class UpdateRelationshipGroupRequest extends
        com.google.protobuf.GeneratedMessageLite<UpdateRelationshipGroupRequest, UpdateRelationshipGroupRequest.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.UpdateRelationshipGroupRequest)
        UpdateRelationshipGroupRequestOrBuilder {
    private UpdateRelationshipGroupRequest() {
        newName_ = "";
        customAttributes_ = emptyProtobufList();
    }

    public static final int GROUP_INDEX_FIELD_NUMBER = 1;
    private int groupIndex_;

    /**
     * <pre>
     * Query filter
     * </pre>
     *
     * <code>int32 group_index = 1;</code>
     *
     * @return The groupIndex.
     */
    @Override
    public int getGroupIndex() {
        return groupIndex_;
    }

    /**
     * <pre>
     * Query filter
     * </pre>
     *
     * <code>int32 group_index = 1;</code>
     *
     * @param value The groupIndex to set.
     */
    private void setGroupIndex(int value) {

        groupIndex_ = value;
    }

    /**
     * <pre>
     * Query filter
     * </pre>
     *
     * <code>int32 group_index = 1;</code>
     */
    private void clearGroupIndex() {

        groupIndex_ = 0;
    }

    public static final int NEW_NAME_FIELD_NUMBER = 2;
    private String newName_;

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>string new_name = 2;</code>
     *
     * @return The newName.
     */
    @Override
    public String getNewName() {
        return newName_;
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>string new_name = 2;</code>
     *
     * @return The bytes for newName.
     */
    @Override
    public com.google.protobuf.ByteString getNewNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(newName_);
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>string new_name = 2;</code>
     *
     * @param value The newName to set.
     */
    private void setNewName(String value) {
        Class<?> valueClass = value.getClass();

        newName_ = value;
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>string new_name = 2;</code>
     */
    private void clearNewName() {

        newName_ = getDefaultInstance().getNewName();
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>string new_name = 2;</code>
     *
     * @param value The bytes for newName to set.
     */
    private void setNewNameBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        newName_ = value.toStringUtf8();

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

    public static UpdateRelationshipGroupRequest parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateRelationshipGroupRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateRelationshipGroupRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateRelationshipGroupRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateRelationshipGroupRequest parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateRelationshipGroupRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateRelationshipGroupRequest parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateRelationshipGroupRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UpdateRelationshipGroupRequest parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateRelationshipGroupRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UpdateRelationshipGroupRequest parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateRelationshipGroupRequest parseFrom(
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
            UpdateRelationshipGroupRequest prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.UpdateRelationshipGroupRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<UpdateRelationshipGroupRequest, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.UpdateRelationshipGroupRequest)
            UpdateRelationshipGroupRequestOrBuilder {
        // Construct using
        // im.turms.client.model.proto.request.user.relationship.UpdateRelationshipGroupRequest.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <pre>
         * Query filter
         * </pre>
         *
         * <code>int32 group_index = 1;</code>
         *
         * @return The groupIndex.
         */
        @Override
        public int getGroupIndex() {
            return instance.getGroupIndex();
        }

        /**
         * <pre>
         * Query filter
         * </pre>
         *
         * <code>int32 group_index = 1;</code>
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
         * <pre>
         * Query filter
         * </pre>
         *
         * <code>int32 group_index = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearGroupIndex() {
            copyOnWrite();
            instance.clearGroupIndex();
            return this;
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>string new_name = 2;</code>
         *
         * @return The newName.
         */
        @Override
        public String getNewName() {
            return instance.getNewName();
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>string new_name = 2;</code>
         *
         * @return The bytes for newName.
         */
        @Override
        public com.google.protobuf.ByteString getNewNameBytes() {
            return instance.getNewNameBytes();
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>string new_name = 2;</code>
         *
         * @param value The newName to set.
         * @return This builder for chaining.
         */
        public Builder setNewName(String value) {
            copyOnWrite();
            instance.setNewName(value);
            return this;
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>string new_name = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearNewName() {
            copyOnWrite();
            instance.clearNewName();
            return this;
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>string new_name = 2;</code>
         *
         * @param value The bytes for newName to set.
         * @return This builder for chaining.
         */
        public Builder setNewNameBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setNewNameBytes(value);
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.UpdateRelationshipGroupRequest)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new UpdateRelationshipGroupRequest();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"groupIndex_",
                        "newName_",
                        "customAttributes_",
                        im.turms.client.model.proto.model.common.Value.class,};
                String info =
                        "\u0000\u0003\u0000\u0000\u0001\u000f\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u0208"
                                + "\u000f\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<UpdateRelationshipGroupRequest> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (UpdateRelationshipGroupRequest.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.UpdateRelationshipGroupRequest)
    private static final UpdateRelationshipGroupRequest DEFAULT_INSTANCE;
    static {
        UpdateRelationshipGroupRequest defaultInstance = new UpdateRelationshipGroupRequest();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite
                .registerDefaultInstance(UpdateRelationshipGroupRequest.class, defaultInstance);
    }

    public static UpdateRelationshipGroupRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UpdateRelationshipGroupRequest> PARSER;

    public static com.google.protobuf.Parser<UpdateRelationshipGroupRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
