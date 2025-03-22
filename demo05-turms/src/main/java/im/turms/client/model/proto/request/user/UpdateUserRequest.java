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
 * Protobuf type {@code im.turms.proto.UpdateUserRequest}
 */
public final class UpdateUserRequest extends
        com.google.protobuf.GeneratedMessageLite<UpdateUserRequest, UpdateUserRequest.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.UpdateUserRequest)
        UpdateUserRequestOrBuilder {
    private UpdateUserRequest() {
        password_ = "";
        name_ = "";
        intro_ = "";
        profilePicture_ = "";
        customAttributes_ = emptyProtobufList();
    }

    private int bitField0_;
    public static final int PASSWORD_FIELD_NUMBER = 1;
    private String password_;

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>optional string password = 1;</code>
     *
     * @return Whether the password field is set.
     */
    @Override
    public boolean hasPassword() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>optional string password = 1;</code>
     *
     * @return The password.
     */
    @Override
    public String getPassword() {
        return password_;
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>optional string password = 1;</code>
     *
     * @return The bytes for password.
     */
    @Override
    public com.google.protobuf.ByteString getPasswordBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(password_);
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>optional string password = 1;</code>
     *
     * @param value The password to set.
     */
    private void setPassword(String value) {
        Class<?> valueClass = value.getClass();
        bitField0_ |= 0x00000001;
        password_ = value;
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>optional string password = 1;</code>
     */
    private void clearPassword() {
        bitField0_ &= ~0x00000001;
        password_ = getDefaultInstance().getPassword();
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>optional string password = 1;</code>
     *
     * @param value The bytes for password to set.
     */
    private void setPasswordBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        password_ = value.toStringUtf8();
        bitField0_ |= 0x00000001;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private String name_;

    /**
     * <code>optional string name = 2;</code>
     *
     * @return Whether the name field is set.
     */
    @Override
    public boolean hasName() {
        return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional string name = 2;</code>
     *
     * @return The name.
     */
    @Override
    public String getName() {
        return name_;
    }

    /**
     * <code>optional string name = 2;</code>
     *
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString getNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }

    /**
     * <code>optional string name = 2;</code>
     *
     * @param value The name to set.
     */
    private void setName(String value) {
        Class<?> valueClass = value.getClass();
        bitField0_ |= 0x00000002;
        name_ = value;
    }

    /**
     * <code>optional string name = 2;</code>
     */
    private void clearName() {
        bitField0_ &= ~0x00000002;
        name_ = getDefaultInstance().getName();
    }

    /**
     * <code>optional string name = 2;</code>
     *
     * @param value The bytes for name to set.
     */
    private void setNameBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        name_ = value.toStringUtf8();
        bitField0_ |= 0x00000002;
    }

    public static final int INTRO_FIELD_NUMBER = 3;
    private String intro_;

    /**
     * <code>optional string intro = 3;</code>
     *
     * @return Whether the intro field is set.
     */
    @Override
    public boolean hasIntro() {
        return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     * <code>optional string intro = 3;</code>
     *
     * @return The intro.
     */
    @Override
    public String getIntro() {
        return intro_;
    }

    /**
     * <code>optional string intro = 3;</code>
     *
     * @return The bytes for intro.
     */
    @Override
    public com.google.protobuf.ByteString getIntroBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(intro_);
    }

    /**
     * <code>optional string intro = 3;</code>
     *
     * @param value The intro to set.
     */
    private void setIntro(String value) {
        Class<?> valueClass = value.getClass();
        bitField0_ |= 0x00000004;
        intro_ = value;
    }

    /**
     * <code>optional string intro = 3;</code>
     */
    private void clearIntro() {
        bitField0_ &= ~0x00000004;
        intro_ = getDefaultInstance().getIntro();
    }

    /**
     * <code>optional string intro = 3;</code>
     *
     * @param value The bytes for intro to set.
     */
    private void setIntroBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        intro_ = value.toStringUtf8();
        bitField0_ |= 0x00000004;
    }

    public static final int PROFILE_PICTURE_FIELD_NUMBER = 4;
    private String profilePicture_;

    /**
     * <code>optional string profile_picture = 4;</code>
     *
     * @return Whether the profilePicture field is set.
     */
    @Override
    public boolean hasProfilePicture() {
        return ((bitField0_ & 0x00000008) != 0);
    }

    /**
     * <code>optional string profile_picture = 4;</code>
     *
     * @return The profilePicture.
     */
    @Override
    public String getProfilePicture() {
        return profilePicture_;
    }

    /**
     * <code>optional string profile_picture = 4;</code>
     *
     * @return The bytes for profilePicture.
     */
    @Override
    public com.google.protobuf.ByteString getProfilePictureBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(profilePicture_);
    }

    /**
     * <code>optional string profile_picture = 4;</code>
     *
     * @param value The profilePicture to set.
     */
    private void setProfilePicture(String value) {
        Class<?> valueClass = value.getClass();
        bitField0_ |= 0x00000008;
        profilePicture_ = value;
    }

    /**
     * <code>optional string profile_picture = 4;</code>
     */
    private void clearProfilePicture() {
        bitField0_ &= ~0x00000008;
        profilePicture_ = getDefaultInstance().getProfilePicture();
    }

    /**
     * <code>optional string profile_picture = 4;</code>
     *
     * @param value The bytes for profilePicture to set.
     */
    private void setProfilePictureBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        profilePicture_ = value.toStringUtf8();
        bitField0_ |= 0x00000008;
    }

    public static final int PROFILE_ACCESS_STRATEGY_FIELD_NUMBER = 5;
    private int profileAccessStrategy_;

    /**
     * <code>optional .im.turms.proto.ProfileAccessStrategy profile_access_strategy = 5;</code>
     *
     * @return Whether the profileAccessStrategy field is set.
     */
    @Override
    public boolean hasProfileAccessStrategy() {
        return ((bitField0_ & 0x00000010) != 0);
    }

    /**
     * <code>optional .im.turms.proto.ProfileAccessStrategy profile_access_strategy = 5;</code>
     *
     * @return The enum numeric value on the wire for profileAccessStrategy.
     */
    @Override
    public int getProfileAccessStrategyValue() {
        return profileAccessStrategy_;
    }

    /**
     * <code>optional .im.turms.proto.ProfileAccessStrategy profile_access_strategy = 5;</code>
     *
     * @return The profileAccessStrategy.
     */
    @Override
    public im.turms.client.model.proto.constant.ProfileAccessStrategy getProfileAccessStrategy() {
        im.turms.client.model.proto.constant.ProfileAccessStrategy result =
                im.turms.client.model.proto.constant.ProfileAccessStrategy
                        .forNumber(profileAccessStrategy_);
        return result == null
                ? im.turms.client.model.proto.constant.ProfileAccessStrategy.UNRECOGNIZED
                : result;
    }

    /**
     * <code>optional .im.turms.proto.ProfileAccessStrategy profile_access_strategy = 5;</code>
     *
     * @param value The enum numeric value on the wire for profileAccessStrategy to set.
     */
    private void setProfileAccessStrategyValue(int value) {
        bitField0_ |= 0x00000010;
        profileAccessStrategy_ = value;
    }

    /**
     * <code>optional .im.turms.proto.ProfileAccessStrategy profile_access_strategy = 5;</code>
     *
     * @param value The profileAccessStrategy to set.
     */
    private void setProfileAccessStrategy(
            im.turms.client.model.proto.constant.ProfileAccessStrategy value) {
        profileAccessStrategy_ = value.getNumber();
        bitField0_ |= 0x00000010;
    }

    /**
     * <code>optional .im.turms.proto.ProfileAccessStrategy profile_access_strategy = 5;</code>
     */
    private void clearProfileAccessStrategy() {
        bitField0_ &= ~0x00000010;
        profileAccessStrategy_ = 0;
    }

    public static final int USER_DEFINED_ATTRIBUTES_FIELD_NUMBER = 6;

    private static final class UserDefinedAttributesDefaultEntryHolder {
        static final com.google.protobuf.MapEntryLite<String, im.turms.client.model.proto.model.common.Value> defaultEntry =
                com.google.protobuf.MapEntryLite.newDefaultInstance(
                        com.google.protobuf.WireFormat.FieldType.STRING,
                        "",
                        com.google.protobuf.WireFormat.FieldType.MESSAGE,
                        im.turms.client.model.proto.model.common.Value.getDefaultInstance());
    }

    private com.google.protobuf.MapFieldLite<String, im.turms.client.model.proto.model.common.Value> userDefinedAttributes_ =
            com.google.protobuf.MapFieldLite.emptyMapField();

    private com.google.protobuf.MapFieldLite<String, im.turms.client.model.proto.model.common.Value> internalGetUserDefinedAttributes() {
        return userDefinedAttributes_;
    }

    private com.google.protobuf.MapFieldLite<String, im.turms.client.model.proto.model.common.Value> internalGetMutableUserDefinedAttributes() {
        if (!userDefinedAttributes_.isMutable()) {
            userDefinedAttributes_ = userDefinedAttributes_.mutableCopy();
        }
        return userDefinedAttributes_;
    }

    @Override

    public int getUserDefinedAttributesCount() {
        return internalGetUserDefinedAttributes().size();
    }

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 6;</code>
     */
    @Override

    public boolean containsUserDefinedAttributes(String key) {
        Class<?> keyClass = key.getClass();
        return internalGetUserDefinedAttributes().containsKey(key);
    }

    /**
     * Use {@link #getUserDefinedAttributesMap()} instead.
     */
    @Override
    @Deprecated
    public java.util.Map<String, im.turms.client.model.proto.model.common.Value> getUserDefinedAttributes() {
        return getUserDefinedAttributesMap();
    }

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 6;</code>
     */
    @Override

    public java.util.Map<String, im.turms.client.model.proto.model.common.Value> getUserDefinedAttributesMap() {
        return java.util.Collections.unmodifiableMap(internalGetUserDefinedAttributes());
    }

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 6;</code>
     */
    @Override

    public /* nullable */
    im.turms.client.model.proto.model.common.Value getUserDefinedAttributesOrDefault(
            String key,
            /* nullable */
            im.turms.client.model.proto.model.common.Value defaultValue) {
        Class<?> keyClass = key.getClass();
        java.util.Map<String, im.turms.client.model.proto.model.common.Value> map =
                internalGetUserDefinedAttributes();
        return map.getOrDefault(key, defaultValue);
    }

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 6;</code>
     */
    @Override

    public im.turms.client.model.proto.model.common.Value getUserDefinedAttributesOrThrow(
            String key) {
        Class<?> keyClass = key.getClass();
        java.util.Map<String, im.turms.client.model.proto.model.common.Value> map =
                internalGetUserDefinedAttributes();
        if (!map.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        return map.get(key);
    }

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 6;</code>
     */
    private java.util.Map<String, im.turms.client.model.proto.model.common.Value> getMutableUserDefinedAttributesMap() {
        return internalGetMutableUserDefinedAttributes();
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

    public static UpdateUserRequest parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateUserRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateUserRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateUserRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateUserRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateUserRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateUserRequest parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateUserRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UpdateUserRequest parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateUserRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UpdateUserRequest parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateUserRequest parseFrom(
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
            UpdateUserRequest prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.UpdateUserRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<UpdateUserRequest, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.UpdateUserRequest)
            UpdateUserRequestOrBuilder {
        // Construct using im.turms.client.model.proto.request.user.UpdateUserRequest.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>optional string password = 1;</code>
         *
         * @return Whether the password field is set.
         */
        @Override
        public boolean hasPassword() {
            return instance.hasPassword();
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>optional string password = 1;</code>
         *
         * @return The password.
         */
        @Override
        public String getPassword() {
            return instance.getPassword();
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>optional string password = 1;</code>
         *
         * @return The bytes for password.
         */
        @Override
        public com.google.protobuf.ByteString getPasswordBytes() {
            return instance.getPasswordBytes();
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>optional string password = 1;</code>
         *
         * @param value The password to set.
         * @return This builder for chaining.
         */
        public Builder setPassword(String value) {
            copyOnWrite();
            instance.setPassword(value);
            return this;
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>optional string password = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearPassword() {
            copyOnWrite();
            instance.clearPassword();
            return this;
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>optional string password = 1;</code>
         *
         * @param value The bytes for password to set.
         * @return This builder for chaining.
         */
        public Builder setPasswordBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setPasswordBytes(value);
            return this;
        }

        /**
         * <code>optional string name = 2;</code>
         *
         * @return Whether the name field is set.
         */
        @Override
        public boolean hasName() {
            return instance.hasName();
        }

        /**
         * <code>optional string name = 2;</code>
         *
         * @return The name.
         */
        @Override
        public String getName() {
            return instance.getName();
        }

        /**
         * <code>optional string name = 2;</code>
         *
         * @return The bytes for name.
         */
        @Override
        public com.google.protobuf.ByteString getNameBytes() {
            return instance.getNameBytes();
        }

        /**
         * <code>optional string name = 2;</code>
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
         * <code>optional string name = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearName() {
            copyOnWrite();
            instance.clearName();
            return this;
        }

        /**
         * <code>optional string name = 2;</code>
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
         * <code>optional string intro = 3;</code>
         *
         * @return Whether the intro field is set.
         */
        @Override
        public boolean hasIntro() {
            return instance.hasIntro();
        }

        /**
         * <code>optional string intro = 3;</code>
         *
         * @return The intro.
         */
        @Override
        public String getIntro() {
            return instance.getIntro();
        }

        /**
         * <code>optional string intro = 3;</code>
         *
         * @return The bytes for intro.
         */
        @Override
        public com.google.protobuf.ByteString getIntroBytes() {
            return instance.getIntroBytes();
        }

        /**
         * <code>optional string intro = 3;</code>
         *
         * @param value The intro to set.
         * @return This builder for chaining.
         */
        public Builder setIntro(String value) {
            copyOnWrite();
            instance.setIntro(value);
            return this;
        }

        /**
         * <code>optional string intro = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearIntro() {
            copyOnWrite();
            instance.clearIntro();
            return this;
        }

        /**
         * <code>optional string intro = 3;</code>
         *
         * @param value The bytes for intro to set.
         * @return This builder for chaining.
         */
        public Builder setIntroBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setIntroBytes(value);
            return this;
        }

        /**
         * <code>optional string profile_picture = 4;</code>
         *
         * @return Whether the profilePicture field is set.
         */
        @Override
        public boolean hasProfilePicture() {
            return instance.hasProfilePicture();
        }

        /**
         * <code>optional string profile_picture = 4;</code>
         *
         * @return The profilePicture.
         */
        @Override
        public String getProfilePicture() {
            return instance.getProfilePicture();
        }

        /**
         * <code>optional string profile_picture = 4;</code>
         *
         * @return The bytes for profilePicture.
         */
        @Override
        public com.google.protobuf.ByteString getProfilePictureBytes() {
            return instance.getProfilePictureBytes();
        }

        /**
         * <code>optional string profile_picture = 4;</code>
         *
         * @param value The profilePicture to set.
         * @return This builder for chaining.
         */
        public Builder setProfilePicture(String value) {
            copyOnWrite();
            instance.setProfilePicture(value);
            return this;
        }

        /**
         * <code>optional string profile_picture = 4;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearProfilePicture() {
            copyOnWrite();
            instance.clearProfilePicture();
            return this;
        }

        /**
         * <code>optional string profile_picture = 4;</code>
         *
         * @param value The bytes for profilePicture to set.
         * @return This builder for chaining.
         */
        public Builder setProfilePictureBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setProfilePictureBytes(value);
            return this;
        }

        /**
         * <code>optional .im.turms.proto.ProfileAccessStrategy profile_access_strategy = 5;</code>
         *
         * @return Whether the profileAccessStrategy field is set.
         */
        @Override
        public boolean hasProfileAccessStrategy() {
            return instance.hasProfileAccessStrategy();
        }

        /**
         * <code>optional .im.turms.proto.ProfileAccessStrategy profile_access_strategy = 5;</code>
         *
         * @return The enum numeric value on the wire for profileAccessStrategy.
         */
        @Override
        public int getProfileAccessStrategyValue() {
            return instance.getProfileAccessStrategyValue();
        }

        /**
         * <code>optional .im.turms.proto.ProfileAccessStrategy profile_access_strategy = 5;</code>
         *
         * @param value The profileAccessStrategy to set.
         * @return This builder for chaining.
         */
        public Builder setProfileAccessStrategyValue(int value) {
            copyOnWrite();
            instance.setProfileAccessStrategyValue(value);
            return this;
        }

        /**
         * <code>optional .im.turms.proto.ProfileAccessStrategy profile_access_strategy = 5;</code>
         *
         * @return The profileAccessStrategy.
         */
        @Override
        public im.turms.client.model.proto.constant.ProfileAccessStrategy getProfileAccessStrategy() {
            return instance.getProfileAccessStrategy();
        }

        /**
         * <code>optional .im.turms.proto.ProfileAccessStrategy profile_access_strategy = 5;</code>
         *
         * @param value The enum numeric value on the wire for profileAccessStrategy to set.
         * @return This builder for chaining.
         */
        public Builder setProfileAccessStrategy(
                im.turms.client.model.proto.constant.ProfileAccessStrategy value) {
            copyOnWrite();
            instance.setProfileAccessStrategy(value);
            return this;
        }

        /**
         * <code>optional .im.turms.proto.ProfileAccessStrategy profile_access_strategy = 5;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearProfileAccessStrategy() {
            copyOnWrite();
            instance.clearProfileAccessStrategy();
            return this;
        }

        @Override

        public int getUserDefinedAttributesCount() {
            return instance.getUserDefinedAttributesMap()
                    .size();
        }

        /**
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 6;</code>
         */
        @Override

        public boolean containsUserDefinedAttributes(String key) {
            Class<?> keyClass = key.getClass();
            return instance.getUserDefinedAttributesMap()
                    .containsKey(key);
        }

        public Builder clearUserDefinedAttributes() {
            copyOnWrite();
            instance.getMutableUserDefinedAttributesMap()
                    .clear();
            return this;
        }

        /**
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 6;</code>
         */

        public Builder removeUserDefinedAttributes(String key) {
            Class<?> keyClass = key.getClass();
            copyOnWrite();
            instance.getMutableUserDefinedAttributesMap()
                    .remove(key);
            return this;
        }

        /**
         * Use {@link #getUserDefinedAttributesMap()} instead.
         */
        @Override
        @Deprecated
        public java.util.Map<String, im.turms.client.model.proto.model.common.Value> getUserDefinedAttributes() {
            return getUserDefinedAttributesMap();
        }

        /**
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 6;</code>
         */
        @Override
        public java.util.Map<String, im.turms.client.model.proto.model.common.Value> getUserDefinedAttributesMap() {
            return java.util.Collections.unmodifiableMap(instance.getUserDefinedAttributesMap());
        }

        /**
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 6;</code>
         */
        @Override

        public /* nullable */
        im.turms.client.model.proto.model.common.Value getUserDefinedAttributesOrDefault(
                String key,
                /* nullable */
                im.turms.client.model.proto.model.common.Value defaultValue) {
            Class<?> keyClass = key.getClass();
            java.util.Map<String, im.turms.client.model.proto.model.common.Value> map =
                    instance.getUserDefinedAttributesMap();
            return map.getOrDefault(key, defaultValue);
        }

        /**
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 6;</code>
         */
        @Override

        public im.turms.client.model.proto.model.common.Value getUserDefinedAttributesOrThrow(
                String key) {
            Class<?> keyClass = key.getClass();
            java.util.Map<String, im.turms.client.model.proto.model.common.Value> map =
                    instance.getUserDefinedAttributesMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }

        /**
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 6;</code>
         */
        public Builder putUserDefinedAttributes(
                String key,
                im.turms.client.model.proto.model.common.Value value) {
            Class<?> keyClass = key.getClass();
            Class<?> valueClass = value.getClass();
            copyOnWrite();
            instance.getMutableUserDefinedAttributesMap()
                    .put(key, value);
            return this;
        }

        /**
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 6;</code>
         */
        public Builder putAllUserDefinedAttributes(
                java.util.Map<String, im.turms.client.model.proto.model.common.Value> values) {
            copyOnWrite();
            instance.getMutableUserDefinedAttributesMap()
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.UpdateUserRequest)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new UpdateUserRequest();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_",
                        "password_",
                        "name_",
                        "intro_",
                        "profilePicture_",
                        "profileAccessStrategy_",
                        "userDefinedAttributes_",
                        UserDefinedAttributesDefaultEntryHolder.defaultEntry,
                        "customAttributes_",
                        im.turms.client.model.proto.model.common.Value.class,};
                String info =
                        "\u0000\u0007\u0000\u0001\u0001\u000f\u0007\u0001\u0001\u0000\u0001\u1208\u0000\u0002"
                                + "\u1208\u0001\u0003\u1208\u0002\u0004\u1208\u0003\u0005\u100c\u0004\u00062\u000f\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<UpdateUserRequest> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (UpdateUserRequest.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.UpdateUserRequest)
    private static final UpdateUserRequest DEFAULT_INSTANCE;
    static {
        UpdateUserRequest defaultInstance = new UpdateUserRequest();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(UpdateUserRequest.class,
                defaultInstance);
    }

    public static UpdateUserRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UpdateUserRequest> PARSER;

    public static com.google.protobuf.Parser<UpdateUserRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
