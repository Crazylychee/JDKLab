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
 * Protobuf type {@code im.turms.proto.UserFriendRequestsWithVersion}
 */
public final class UserFriendRequestsWithVersion extends
        com.google.protobuf.GeneratedMessageLite<UserFriendRequestsWithVersion, UserFriendRequestsWithVersion.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.UserFriendRequestsWithVersion)
        UserFriendRequestsWithVersionOrBuilder {
    private UserFriendRequestsWithVersion() {
        userFriendRequests_ = emptyProtobufList();
    }

    private int bitField0_;
    public static final int USER_FRIEND_REQUESTS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<UserFriendRequest> userFriendRequests_;

    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    @Override
    public java.util.List<UserFriendRequest> getUserFriendRequestsList() {
        return userFriendRequests_;
    }

    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public java.util.List<? extends UserFriendRequestOrBuilder> getUserFriendRequestsOrBuilderList() {
        return userFriendRequests_;
    }

    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    @Override
    public int getUserFriendRequestsCount() {
        return userFriendRequests_.size();
    }

    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    @Override
    public UserFriendRequest getUserFriendRequests(
            int index) {
        return userFriendRequests_.get(index);
    }

    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public UserFriendRequestOrBuilder getUserFriendRequestsOrBuilder(
            int index) {
        return userFriendRequests_.get(index);
    }

    private void ensureUserFriendRequestsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<UserFriendRequest> tmp =
                userFriendRequests_;
        if (!tmp.isModifiable()) {
            userFriendRequests_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    private void setUserFriendRequests(
            int index,
            UserFriendRequest value) {
        value.getClass();
        ensureUserFriendRequestsIsMutable();
        userFriendRequests_.set(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    private void addUserFriendRequests(
            UserFriendRequest value) {
        value.getClass();
        ensureUserFriendRequestsIsMutable();
        userFriendRequests_.add(value);
    }

    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    private void addUserFriendRequests(
            int index,
            UserFriendRequest value) {
        value.getClass();
        ensureUserFriendRequestsIsMutable();
        userFriendRequests_.add(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    private void addAllUserFriendRequests(
            Iterable<? extends UserFriendRequest> values) {
        ensureUserFriendRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(values, userFriendRequests_);
    }

    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    private void clearUserFriendRequests() {
        userFriendRequests_ = emptyProtobufList();
    }

    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    private void removeUserFriendRequests(int index) {
        ensureUserFriendRequestsIsMutable();
        userFriendRequests_.remove(index);
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

    public static UserFriendRequestsWithVersion parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserFriendRequestsWithVersion parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserFriendRequestsWithVersion parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserFriendRequestsWithVersion parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserFriendRequestsWithVersion parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserFriendRequestsWithVersion parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserFriendRequestsWithVersion parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UserFriendRequestsWithVersion parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UserFriendRequestsWithVersion parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static UserFriendRequestsWithVersion parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UserFriendRequestsWithVersion parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UserFriendRequestsWithVersion parseFrom(
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
            UserFriendRequestsWithVersion prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.UserFriendRequestsWithVersion}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<UserFriendRequestsWithVersion, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.UserFriendRequestsWithVersion)
            UserFriendRequestsWithVersionOrBuilder {
        // Construct using
        // im.turms.client.model.proto.model.user.UserFriendRequestsWithVersion.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
         */
        @Override
        public java.util.List<UserFriendRequest> getUserFriendRequestsList() {
            return java.util.Collections.unmodifiableList(instance.getUserFriendRequestsList());
        }

        /**
         * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
         */
        @Override
        public int getUserFriendRequestsCount() {
            return instance.getUserFriendRequestsCount();
        }

        /**
         * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
         */
        @Override
        public UserFriendRequest getUserFriendRequests(
                int index) {
            return instance.getUserFriendRequests(index);
        }

        /**
         * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
         */
        public Builder setUserFriendRequests(
                int index,
                UserFriendRequest value) {
            copyOnWrite();
            instance.setUserFriendRequests(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
         */
        public Builder setUserFriendRequests(
                int index,
                UserFriendRequest.Builder builderForValue) {
            copyOnWrite();
            instance.setUserFriendRequests(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
         */
        public Builder addUserFriendRequests(
                UserFriendRequest value) {
            copyOnWrite();
            instance.addUserFriendRequests(value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
         */
        public Builder addUserFriendRequests(
                int index,
                UserFriendRequest value) {
            copyOnWrite();
            instance.addUserFriendRequests(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
         */
        public Builder addUserFriendRequests(
                UserFriendRequest.Builder builderForValue) {
            copyOnWrite();
            instance.addUserFriendRequests(builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
         */
        public Builder addUserFriendRequests(
                int index,
                UserFriendRequest.Builder builderForValue) {
            copyOnWrite();
            instance.addUserFriendRequests(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
         */
        public Builder addAllUserFriendRequests(
                Iterable<? extends UserFriendRequest> values) {
            copyOnWrite();
            instance.addAllUserFriendRequests(values);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
         */
        public Builder clearUserFriendRequests() {
            copyOnWrite();
            instance.clearUserFriendRequests();
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
         */
        public Builder removeUserFriendRequests(int index) {
            copyOnWrite();
            instance.removeUserFriendRequests(index);
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.UserFriendRequestsWithVersion)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new UserFriendRequestsWithVersion();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_",
                        "userFriendRequests_",
                        UserFriendRequest.class,
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
                com.google.protobuf.Parser<UserFriendRequestsWithVersion> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (UserFriendRequestsWithVersion.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.UserFriendRequestsWithVersion)
    private static final UserFriendRequestsWithVersion DEFAULT_INSTANCE;
    static {
        UserFriendRequestsWithVersion defaultInstance = new UserFriendRequestsWithVersion();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite
                .registerDefaultInstance(UserFriendRequestsWithVersion.class, defaultInstance);
    }

    public static UserFriendRequestsWithVersion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UserFriendRequestsWithVersion> PARSER;

    public static com.google.protobuf.Parser<UserFriendRequestsWithVersion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
