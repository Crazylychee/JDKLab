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

package im.turms.client.model.proto.model.user;

/**
 * Protobuf type {@code im.turms.proto.UserRelationshipsWithVersion}
 */
public final class UserRelationshipsWithVersion extends
        com.google.protobuf.GeneratedMessageLite<UserRelationshipsWithVersion, UserRelationshipsWithVersion.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.UserRelationshipsWithVersion)
        UserRelationshipsWithVersionOrBuilder {
    private UserRelationshipsWithVersion() {
        userRelationships_ = emptyProtobufList();
    }

    private int bitField0_;
    public static final int USER_RELATIONSHIPS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<UserRelationship> userRelationships_;

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    @Override
    public java.util.List<UserRelationship> getUserRelationshipsList() {
        return userRelationships_;
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public java.util.List<? extends UserRelationshipOrBuilder> getUserRelationshipsOrBuilderList() {
        return userRelationships_;
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    @Override
    public int getUserRelationshipsCount() {
        return userRelationships_.size();
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    @Override
    public UserRelationship getUserRelationships(int index) {
        return userRelationships_.get(index);
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public UserRelationshipOrBuilder getUserRelationshipsOrBuilder(
            int index) {
        return userRelationships_.get(index);
    }

    private void ensureUserRelationshipsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<UserRelationship> tmp =
                userRelationships_;
        if (!tmp.isModifiable()) {
            userRelationships_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    private void setUserRelationships(
            int index,
            UserRelationship value) {
        value.getClass();
        ensureUserRelationshipsIsMutable();
        userRelationships_.set(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    private void addUserRelationships(
            UserRelationship value) {
        value.getClass();
        ensureUserRelationshipsIsMutable();
        userRelationships_.add(value);
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    private void addUserRelationships(
            int index,
            UserRelationship value) {
        value.getClass();
        ensureUserRelationshipsIsMutable();
        userRelationships_.add(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    private void addAllUserRelationships(
            Iterable<? extends UserRelationship> values) {
        ensureUserRelationshipsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(values, userRelationships_);
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    private void clearUserRelationships() {
        userRelationships_ = emptyProtobufList();
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    private void removeUserRelationships(int index) {
        ensureUserRelationshipsIsMutable();
        userRelationships_.remove(index);
    }

    public static final int LAST_UPDATED_DATE_FIELD_NUMBER = 2;
    private long lastUpdatedDate_;

    /**
     * <code>optional int64 last_updated_date = 2;</code>
     *
     * @return Whether the lastUpdatedDate field is set.
     */
    @Override
    public boolean hasLastUpdatedDate() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional int64 last_updated_date = 2;</code>
     *
     * @return The lastUpdatedDate.
     */
    @Override
    public long getLastUpdatedDate() {
        return lastUpdatedDate_;
    }

    /**
     * <code>optional int64 last_updated_date = 2;</code>
     *
     * @param value The lastUpdatedDate to set.
     */
    private void setLastUpdatedDate(long value) {
        bitField0_ |= 0x00000001;
        lastUpdatedDate_ = value;
    }

    /**
     * <code>optional int64 last_updated_date = 2;</code>
     */
    private void clearLastUpdatedDate() {
        bitField0_ &= ~0x00000001;
        lastUpdatedDate_ = 0L;
    }

    public static UserRelationshipsWithVersion parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserRelationshipsWithVersion parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserRelationshipsWithVersion parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserRelationshipsWithVersion parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserRelationshipsWithVersion parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserRelationshipsWithVersion parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserRelationshipsWithVersion parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UserRelationshipsWithVersion parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UserRelationshipsWithVersion parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static UserRelationshipsWithVersion parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UserRelationshipsWithVersion parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UserRelationshipsWithVersion parseFrom(
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
            UserRelationshipsWithVersion prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.UserRelationshipsWithVersion}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<UserRelationshipsWithVersion, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.UserRelationshipsWithVersion)
            UserRelationshipsWithVersionOrBuilder {
        // Construct using
        // im.turms.client.model.proto.model.user.UserRelationshipsWithVersion.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
         */
        @Override
        public java.util.List<UserRelationship> getUserRelationshipsList() {
            return java.util.Collections.unmodifiableList(instance.getUserRelationshipsList());
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
         */
        @Override
        public int getUserRelationshipsCount() {
            return instance.getUserRelationshipsCount();
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
         */
        @Override
        public UserRelationship getUserRelationships(
                int index) {
            return instance.getUserRelationships(index);
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
         */
        public Builder setUserRelationships(
                int index,
                UserRelationship value) {
            copyOnWrite();
            instance.setUserRelationships(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
         */
        public Builder setUserRelationships(
                int index,
                UserRelationship.Builder builderForValue) {
            copyOnWrite();
            instance.setUserRelationships(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
         */
        public Builder addUserRelationships(
                UserRelationship value) {
            copyOnWrite();
            instance.addUserRelationships(value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
         */
        public Builder addUserRelationships(
                int index,
                UserRelationship value) {
            copyOnWrite();
            instance.addUserRelationships(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
         */
        public Builder addUserRelationships(
                UserRelationship.Builder builderForValue) {
            copyOnWrite();
            instance.addUserRelationships(builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
         */
        public Builder addUserRelationships(
                int index,
                UserRelationship.Builder builderForValue) {
            copyOnWrite();
            instance.addUserRelationships(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
         */
        public Builder addAllUserRelationships(
                Iterable<? extends UserRelationship> values) {
            copyOnWrite();
            instance.addAllUserRelationships(values);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
         */
        public Builder clearUserRelationships() {
            copyOnWrite();
            instance.clearUserRelationships();
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
         */
        public Builder removeUserRelationships(int index) {
            copyOnWrite();
            instance.removeUserRelationships(index);
            return this;
        }

        /**
         * <code>optional int64 last_updated_date = 2;</code>
         *
         * @return Whether the lastUpdatedDate field is set.
         */
        @Override
        public boolean hasLastUpdatedDate() {
            return instance.hasLastUpdatedDate();
        }

        /**
         * <code>optional int64 last_updated_date = 2;</code>
         *
         * @return The lastUpdatedDate.
         */
        @Override
        public long getLastUpdatedDate() {
            return instance.getLastUpdatedDate();
        }

        /**
         * <code>optional int64 last_updated_date = 2;</code>
         *
         * @param value The lastUpdatedDate to set.
         * @return This builder for chaining.
         */
        public Builder setLastUpdatedDate(long value) {
            copyOnWrite();
            instance.setLastUpdatedDate(value);
            return this;
        }

        /**
         * <code>optional int64 last_updated_date = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearLastUpdatedDate() {
            copyOnWrite();
            instance.clearLastUpdatedDate();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:im.turms.proto.UserRelationshipsWithVersion)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new UserRelationshipsWithVersion();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_",
                        "userRelationships_",
                        UserRelationship.class,
                        "lastUpdatedDate_",};
                String info =
                        "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1002"
                                + "\u0000";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<UserRelationshipsWithVersion> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (UserRelationshipsWithVersion.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.UserRelationshipsWithVersion)
    private static final UserRelationshipsWithVersion DEFAULT_INSTANCE;
    static {
        UserRelationshipsWithVersion defaultInstance = new UserRelationshipsWithVersion();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite
                .registerDefaultInstance(UserRelationshipsWithVersion.class, defaultInstance);
    }

    public static UserRelationshipsWithVersion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UserRelationshipsWithVersion> PARSER;

    public static com.google.protobuf.Parser<UserRelationshipsWithVersion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
