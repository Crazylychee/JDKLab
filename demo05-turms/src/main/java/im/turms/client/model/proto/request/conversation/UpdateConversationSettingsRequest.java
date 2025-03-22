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
 * Protobuf type {@code im.turms.proto.UpdateConversationSettingsRequest}
 */
public final class UpdateConversationSettingsRequest extends
        com.google.protobuf.GeneratedMessageLite<UpdateConversationSettingsRequest, UpdateConversationSettingsRequest.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.UpdateConversationSettingsRequest)
        UpdateConversationSettingsRequestOrBuilder {
    private UpdateConversationSettingsRequest() {
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

    public static final int SETTINGS_FIELD_NUMBER = 3;

    private static final class SettingsDefaultEntryHolder {
        static final com.google.protobuf.MapEntryLite<String, im.turms.client.model.proto.model.common.Value> defaultEntry =
                com.google.protobuf.MapEntryLite.newDefaultInstance(
                        com.google.protobuf.WireFormat.FieldType.STRING,
                        "",
                        com.google.protobuf.WireFormat.FieldType.MESSAGE,
                        im.turms.client.model.proto.model.common.Value.getDefaultInstance());
    }

    private com.google.protobuf.MapFieldLite<String, im.turms.client.model.proto.model.common.Value> settings_ =
            com.google.protobuf.MapFieldLite.emptyMapField();

    private com.google.protobuf.MapFieldLite<String, im.turms.client.model.proto.model.common.Value> internalGetSettings() {
        return settings_;
    }

    private com.google.protobuf.MapFieldLite<String, im.turms.client.model.proto.model.common.Value> internalGetMutableSettings() {
        if (!settings_.isMutable()) {
            settings_ = settings_.mutableCopy();
        }
        return settings_;
    }

    @Override

    public int getSettingsCount() {
        return internalGetSettings().size();
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
     */
    @Override

    public boolean containsSettings(String key) {
        Class<?> keyClass = key.getClass();
        return internalGetSettings().containsKey(key);
    }

    /**
     * Use {@link #getSettingsMap()} instead.
     */
    @Override
    @Deprecated
    public java.util.Map<String, im.turms.client.model.proto.model.common.Value> getSettings() {
        return getSettingsMap();
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
     */
    @Override

    public java.util.Map<String, im.turms.client.model.proto.model.common.Value> getSettingsMap() {
        return java.util.Collections.unmodifiableMap(internalGetSettings());
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
     */
    @Override

    public /* nullable */
    im.turms.client.model.proto.model.common.Value getSettingsOrDefault(
            String key,
            /* nullable */
            im.turms.client.model.proto.model.common.Value defaultValue) {
        Class<?> keyClass = key.getClass();
        java.util.Map<String, im.turms.client.model.proto.model.common.Value> map =
                internalGetSettings();
        return map.getOrDefault(key, defaultValue);
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
     */
    @Override

    public im.turms.client.model.proto.model.common.Value getSettingsOrThrow(String key) {
        Class<?> keyClass = key.getClass();
        java.util.Map<String, im.turms.client.model.proto.model.common.Value> map =
                internalGetSettings();
        if (!map.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        return map.get(key);
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
     */
    private java.util.Map<String, im.turms.client.model.proto.model.common.Value> getMutableSettingsMap() {
        return internalGetMutableSettings();
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

    public static UpdateConversationSettingsRequest parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateConversationSettingsRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateConversationSettingsRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateConversationSettingsRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateConversationSettingsRequest parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateConversationSettingsRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateConversationSettingsRequest parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateConversationSettingsRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UpdateConversationSettingsRequest parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateConversationSettingsRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UpdateConversationSettingsRequest parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateConversationSettingsRequest parseFrom(
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
            UpdateConversationSettingsRequest prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.UpdateConversationSettingsRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<UpdateConversationSettingsRequest, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.UpdateConversationSettingsRequest)
            UpdateConversationSettingsRequestOrBuilder {
        // Construct using
        // im.turms.client.model.proto.request.conversation.UpdateConversationSettingsRequest.newBuilder()
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

        @Override

        public int getSettingsCount() {
            return instance.getSettingsMap()
                    .size();
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
         */
        @Override

        public boolean containsSettings(String key) {
            Class<?> keyClass = key.getClass();
            return instance.getSettingsMap()
                    .containsKey(key);
        }

        public Builder clearSettings() {
            copyOnWrite();
            instance.getMutableSettingsMap()
                    .clear();
            return this;
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
         */

        public Builder removeSettings(String key) {
            Class<?> keyClass = key.getClass();
            copyOnWrite();
            instance.getMutableSettingsMap()
                    .remove(key);
            return this;
        }

        /**
         * Use {@link #getSettingsMap()} instead.
         */
        @Override
        @Deprecated
        public java.util.Map<String, im.turms.client.model.proto.model.common.Value> getSettings() {
            return getSettingsMap();
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
         */
        @Override
        public java.util.Map<String, im.turms.client.model.proto.model.common.Value> getSettingsMap() {
            return java.util.Collections.unmodifiableMap(instance.getSettingsMap());
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
         */
        @Override

        public /* nullable */
        im.turms.client.model.proto.model.common.Value getSettingsOrDefault(
                String key,
                /* nullable */
                im.turms.client.model.proto.model.common.Value defaultValue) {
            Class<?> keyClass = key.getClass();
            java.util.Map<String, im.turms.client.model.proto.model.common.Value> map =
                    instance.getSettingsMap();
            return map.getOrDefault(key, defaultValue);
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
         */
        @Override

        public im.turms.client.model.proto.model.common.Value getSettingsOrThrow(
                String key) {
            Class<?> keyClass = key.getClass();
            java.util.Map<String, im.turms.client.model.proto.model.common.Value> map =
                    instance.getSettingsMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
         */
        public Builder putSettings(
                String key,
                im.turms.client.model.proto.model.common.Value value) {
            Class<?> keyClass = key.getClass();
            Class<?> valueClass = value.getClass();
            copyOnWrite();
            instance.getMutableSettingsMap()
                    .put(key, value);
            return this;
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>map&lt;string, .im.turms.proto.Value&gt; settings = 3;</code>
         */
        public Builder putAllSettings(
                java.util.Map<String, im.turms.client.model.proto.model.common.Value> values) {
            copyOnWrite();
            instance.getMutableSettingsMap()
                    .putAll(values);
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.UpdateConversationSettingsRequest)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new UpdateConversationSettingsRequest();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_",
                        "userId_",
                        "groupId_",
                        "settings_",
                        SettingsDefaultEntryHolder.defaultEntry,
                        "customAttributes_",
                        im.turms.client.model.proto.model.common.Value.class,};
                String info =
                        "\u0000\u0004\u0000\u0001\u0001\u000f\u0004\u0001\u0001\u0000\u0001\u1002\u0000\u0002"
                                + "\u1002\u0001\u00032\u000f\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<UpdateConversationSettingsRequest> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (UpdateConversationSettingsRequest.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.UpdateConversationSettingsRequest)
    private static final UpdateConversationSettingsRequest DEFAULT_INSTANCE;
    static {
        UpdateConversationSettingsRequest defaultInstance = new UpdateConversationSettingsRequest();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite
                .registerDefaultInstance(UpdateConversationSettingsRequest.class, defaultInstance);
    }

    public static UpdateConversationSettingsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UpdateConversationSettingsRequest> PARSER;

    public static com.google.protobuf.Parser<UpdateConversationSettingsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
