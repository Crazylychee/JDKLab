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

/**
 * Protobuf type {@code im.turms.proto.UpdateUserLocationRequest}
 */
public final class UpdateUserLocationRequest extends
        com.google.protobuf.GeneratedMessageLite<UpdateUserLocationRequest, UpdateUserLocationRequest.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.UpdateUserLocationRequest)
        UpdateUserLocationRequestOrBuilder {
    private UpdateUserLocationRequest() {
        customAttributes_ = emptyProtobufList();
    }

    public static final int LATITUDE_FIELD_NUMBER = 1;
    private float latitude_;

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>float latitude = 1;</code>
     *
     * @return The latitude.
     */
    @Override
    public float getLatitude() {
        return latitude_;
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>float latitude = 1;</code>
     *
     * @param value The latitude to set.
     */
    private void setLatitude(float value) {

        latitude_ = value;
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>float latitude = 1;</code>
     */
    private void clearLatitude() {

        latitude_ = 0F;
    }

    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private float longitude_;

    /**
     * <code>float longitude = 2;</code>
     *
     * @return The longitude.
     */
    @Override
    public float getLongitude() {
        return longitude_;
    }

    /**
     * <code>float longitude = 2;</code>
     *
     * @param value The longitude to set.
     */
    private void setLongitude(float value) {

        longitude_ = value;
    }

    /**
     * <code>float longitude = 2;</code>
     */
    private void clearLongitude() {

        longitude_ = 0F;
    }

    public static final int DETAILS_FIELD_NUMBER = 3;

    private static final class DetailsDefaultEntryHolder {
        static final com.google.protobuf.MapEntryLite<String, String> defaultEntry =
                com.google.protobuf.MapEntryLite.newDefaultInstance(
                        com.google.protobuf.WireFormat.FieldType.STRING,
                        "",
                        com.google.protobuf.WireFormat.FieldType.STRING,
                        "");
    }

    private com.google.protobuf.MapFieldLite<String, String> details_ =
            com.google.protobuf.MapFieldLite.emptyMapField();

    private com.google.protobuf.MapFieldLite<String, String> internalGetDetails() {
        return details_;
    }

    private com.google.protobuf.MapFieldLite<String, String> internalGetMutableDetails() {
        if (!details_.isMutable()) {
            details_ = details_.mutableCopy();
        }
        return details_;
    }

    @Override

    public int getDetailsCount() {
        return internalGetDetails().size();
    }

    /**
     * <code>map&lt;string, string&gt; details = 3;</code>
     */
    @Override

    public boolean containsDetails(String key) {
        Class<?> keyClass = key.getClass();
        return internalGetDetails().containsKey(key);
    }

    /**
     * Use {@link #getDetailsMap()} instead.
     */
    @Override
    @Deprecated
    public java.util.Map<String, String> getDetails() {
        return getDetailsMap();
    }

    /**
     * <code>map&lt;string, string&gt; details = 3;</code>
     */
    @Override

    public java.util.Map<String, String> getDetailsMap() {
        return java.util.Collections.unmodifiableMap(internalGetDetails());
    }

    /**
     * <code>map&lt;string, string&gt; details = 3;</code>
     */
    @Override

    public /* nullable */
    String getDetailsOrDefault(
            String key,
            /* nullable */
            String defaultValue) {
        Class<?> keyClass = key.getClass();
        java.util.Map<String, String> map = internalGetDetails();
        return map.getOrDefault(key, defaultValue);
    }

    /**
     * <code>map&lt;string, string&gt; details = 3;</code>
     */
    @Override

    public String getDetailsOrThrow(String key) {
        Class<?> keyClass = key.getClass();
        java.util.Map<String, String> map = internalGetDetails();
        if (!map.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        return map.get(key);
    }

    /**
     * <code>map&lt;string, string&gt; details = 3;</code>
     */
    private java.util.Map<String, String> getMutableDetailsMap() {
        return internalGetMutableDetails();
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

    public static UpdateUserLocationRequest parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateUserLocationRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateUserLocationRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateUserLocationRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateUserLocationRequest parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateUserLocationRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateUserLocationRequest parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateUserLocationRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UpdateUserLocationRequest parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateUserLocationRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UpdateUserLocationRequest parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateUserLocationRequest parseFrom(
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
            UpdateUserLocationRequest prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.UpdateUserLocationRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<UpdateUserLocationRequest, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.UpdateUserLocationRequest)
            UpdateUserLocationRequestOrBuilder {
        // Construct using
        // im.turms.client.model.proto.request.user.UpdateUserLocationRequest.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>float latitude = 1;</code>
         *
         * @return The latitude.
         */
        @Override
        public float getLatitude() {
            return instance.getLatitude();
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>float latitude = 1;</code>
         *
         * @param value The latitude to set.
         * @return This builder for chaining.
         */
        public Builder setLatitude(float value) {
            copyOnWrite();
            instance.setLatitude(value);
            return this;
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>float latitude = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearLatitude() {
            copyOnWrite();
            instance.clearLatitude();
            return this;
        }

        /**
         * <code>float longitude = 2;</code>
         *
         * @return The longitude.
         */
        @Override
        public float getLongitude() {
            return instance.getLongitude();
        }

        /**
         * <code>float longitude = 2;</code>
         *
         * @param value The longitude to set.
         * @return This builder for chaining.
         */
        public Builder setLongitude(float value) {
            copyOnWrite();
            instance.setLongitude(value);
            return this;
        }

        /**
         * <code>float longitude = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearLongitude() {
            copyOnWrite();
            instance.clearLongitude();
            return this;
        }

        @Override

        public int getDetailsCount() {
            return instance.getDetailsMap()
                    .size();
        }

        /**
         * <code>map&lt;string, string&gt; details = 3;</code>
         */
        @Override

        public boolean containsDetails(String key) {
            Class<?> keyClass = key.getClass();
            return instance.getDetailsMap()
                    .containsKey(key);
        }

        public Builder clearDetails() {
            copyOnWrite();
            instance.getMutableDetailsMap()
                    .clear();
            return this;
        }

        /**
         * <code>map&lt;string, string&gt; details = 3;</code>
         */

        public Builder removeDetails(String key) {
            Class<?> keyClass = key.getClass();
            copyOnWrite();
            instance.getMutableDetailsMap()
                    .remove(key);
            return this;
        }

        /**
         * Use {@link #getDetailsMap()} instead.
         */
        @Override
        @Deprecated
        public java.util.Map<String, String> getDetails() {
            return getDetailsMap();
        }

        /**
         * <code>map&lt;string, string&gt; details = 3;</code>
         */
        @Override
        public java.util.Map<String, String> getDetailsMap() {
            return java.util.Collections.unmodifiableMap(instance.getDetailsMap());
        }

        /**
         * <code>map&lt;string, string&gt; details = 3;</code>
         */
        @Override

        public /* nullable */
        String getDetailsOrDefault(
                String key,
                /* nullable */
                String defaultValue) {
            Class<?> keyClass = key.getClass();
            java.util.Map<String, String> map = instance.getDetailsMap();
            return map.getOrDefault(key, defaultValue);
        }

        /**
         * <code>map&lt;string, string&gt; details = 3;</code>
         */
        @Override

        public String getDetailsOrThrow(String key) {
            Class<?> keyClass = key.getClass();
            java.util.Map<String, String> map = instance.getDetailsMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }

        /**
         * <code>map&lt;string, string&gt; details = 3;</code>
         */
        public Builder putDetails(String key, String value) {
            Class<?> keyClass = key.getClass();
            Class<?> valueClass = value.getClass();
            copyOnWrite();
            instance.getMutableDetailsMap()
                    .put(key, value);
            return this;
        }

        /**
         * <code>map&lt;string, string&gt; details = 3;</code>
         */
        public Builder putAllDetails(java.util.Map<String, String> values) {
            copyOnWrite();
            instance.getMutableDetailsMap()
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.UpdateUserLocationRequest)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new UpdateUserLocationRequest();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"latitude_",
                        "longitude_",
                        "details_",
                        DetailsDefaultEntryHolder.defaultEntry,
                        "customAttributes_",
                        im.turms.client.model.proto.model.common.Value.class,};
                String info =
                        "\u0000\u0004\u0000\u0000\u0001\u000f\u0004\u0001\u0001\u0000\u0001\u0001\u0002\u0001"
                                + "\u00032\u000f\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<UpdateUserLocationRequest> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (UpdateUserLocationRequest.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.UpdateUserLocationRequest)
    private static final UpdateUserLocationRequest DEFAULT_INSTANCE;
    static {
        UpdateUserLocationRequest defaultInstance = new UpdateUserLocationRequest();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite
                .registerDefaultInstance(UpdateUserLocationRequest.class, defaultInstance);
    }

    public static UpdateUserLocationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UpdateUserLocationRequest> PARSER;

    public static com.google.protobuf.Parser<UpdateUserLocationRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
