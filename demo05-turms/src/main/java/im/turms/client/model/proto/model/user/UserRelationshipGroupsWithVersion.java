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
 * Protobuf type {@code im.turms.proto.UserRelationshipGroupsWithVersion}
 */
public final class UserRelationshipGroupsWithVersion extends
        com.google.protobuf.GeneratedMessageLite<UserRelationshipGroupsWithVersion, UserRelationshipGroupsWithVersion.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.UserRelationshipGroupsWithVersion)
        UserRelationshipGroupsWithVersionOrBuilder {
    private UserRelationshipGroupsWithVersion() {
        userRelationshipGroups_ = emptyProtobufList();
    }

    private int bitField0_;
    public static final int USER_RELATIONSHIP_GROUPS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<UserRelationshipGroup> userRelationshipGroups_;

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    @Override
    public java.util.List<UserRelationshipGroup> getUserRelationshipGroupsList() {
        return userRelationshipGroups_;
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public java.util.List<? extends UserRelationshipGroupOrBuilder> getUserRelationshipGroupsOrBuilderList() {
        return userRelationshipGroups_;
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    @Override
    public int getUserRelationshipGroupsCount() {
        return userRelationshipGroups_.size();
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    @Override
    public UserRelationshipGroup getUserRelationshipGroups(
            int index) {
        return userRelationshipGroups_.get(index);
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    public UserRelationshipGroupOrBuilder getUserRelationshipGroupsOrBuilder(
            int index) {
        return userRelationshipGroups_.get(index);
    }

    private void ensureUserRelationshipGroupsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<UserRelationshipGroup> tmp =
                userRelationshipGroups_;
        if (!tmp.isModifiable()) {
            userRelationshipGroups_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    private void setUserRelationshipGroups(
            int index,
            UserRelationshipGroup value) {
        value.getClass();
        ensureUserRelationshipGroupsIsMutable();
        userRelationshipGroups_.set(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    private void addUserRelationshipGroups(
            UserRelationshipGroup value) {
        value.getClass();
        ensureUserRelationshipGroupsIsMutable();
        userRelationshipGroups_.add(value);
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    private void addUserRelationshipGroups(
            int index,
            UserRelationshipGroup value) {
        value.getClass();
        ensureUserRelationshipGroupsIsMutable();
        userRelationshipGroups_.add(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    private void addAllUserRelationshipGroups(
            Iterable<? extends UserRelationshipGroup> values) {
        ensureUserRelationshipGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(values, userRelationshipGroups_);
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    private void clearUserRelationshipGroups() {
        userRelationshipGroups_ = emptyProtobufList();
    }

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    private void removeUserRelationshipGroups(int index) {
        ensureUserRelationshipGroupsIsMutable();
        userRelationshipGroups_.remove(index);
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

    public static UserRelationshipGroupsWithVersion parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserRelationshipGroupsWithVersion parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserRelationshipGroupsWithVersion parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserRelationshipGroupsWithVersion parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserRelationshipGroupsWithVersion parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserRelationshipGroupsWithVersion parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserRelationshipGroupsWithVersion parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UserRelationshipGroupsWithVersion parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UserRelationshipGroupsWithVersion parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static UserRelationshipGroupsWithVersion parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UserRelationshipGroupsWithVersion parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UserRelationshipGroupsWithVersion parseFrom(
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
            UserRelationshipGroupsWithVersion prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.UserRelationshipGroupsWithVersion}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<UserRelationshipGroupsWithVersion, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.UserRelationshipGroupsWithVersion)
            UserRelationshipGroupsWithVersionOrBuilder {
        // Construct using
        // im.turms.client.model.proto.model.user.UserRelationshipGroupsWithVersion.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
         */
        @Override
        public java.util.List<UserRelationshipGroup> getUserRelationshipGroupsList() {
            return java.util.Collections.unmodifiableList(instance.getUserRelationshipGroupsList());
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
         */
        @Override
        public int getUserRelationshipGroupsCount() {
            return instance.getUserRelationshipGroupsCount();
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
         */
        @Override
        public UserRelationshipGroup getUserRelationshipGroups(
                int index) {
            return instance.getUserRelationshipGroups(index);
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
         */
        public Builder setUserRelationshipGroups(
                int index,
                UserRelationshipGroup value) {
            copyOnWrite();
            instance.setUserRelationshipGroups(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
         */
        public Builder setUserRelationshipGroups(
                int index,
                UserRelationshipGroup.Builder builderForValue) {
            copyOnWrite();
            instance.setUserRelationshipGroups(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
         */
        public Builder addUserRelationshipGroups(
                UserRelationshipGroup value) {
            copyOnWrite();
            instance.addUserRelationshipGroups(value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
         */
        public Builder addUserRelationshipGroups(
                int index,
                UserRelationshipGroup value) {
            copyOnWrite();
            instance.addUserRelationshipGroups(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
         */
        public Builder addUserRelationshipGroups(
                UserRelationshipGroup.Builder builderForValue) {
            copyOnWrite();
            instance.addUserRelationshipGroups(builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
         */
        public Builder addUserRelationshipGroups(
                int index,
                UserRelationshipGroup.Builder builderForValue) {
            copyOnWrite();
            instance.addUserRelationshipGroups(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
         */
        public Builder addAllUserRelationshipGroups(
                Iterable<? extends UserRelationshipGroup> values) {
            copyOnWrite();
            instance.addAllUserRelationshipGroups(values);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
         */
        public Builder clearUserRelationshipGroups() {
            copyOnWrite();
            instance.clearUserRelationshipGroups();
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
         */
        public Builder removeUserRelationshipGroups(int index) {
            copyOnWrite();
            instance.removeUserRelationshipGroups(index);
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.UserRelationshipGroupsWithVersion)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new UserRelationshipGroupsWithVersion();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_",
                        "userRelationshipGroups_",
                        UserRelationshipGroup.class,
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
                com.google.protobuf.Parser<UserRelationshipGroupsWithVersion> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (UserRelationshipGroupsWithVersion.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.UserRelationshipGroupsWithVersion)
    private static final UserRelationshipGroupsWithVersion DEFAULT_INSTANCE;
    static {
        UserRelationshipGroupsWithVersion defaultInstance = new UserRelationshipGroupsWithVersion();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite
                .registerDefaultInstance(UserRelationshipGroupsWithVersion.class, defaultInstance);
    }

    public static UserRelationshipGroupsWithVersion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UserRelationshipGroupsWithVersion> PARSER;

    public static com.google.protobuf.Parser<UserRelationshipGroupsWithVersion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
