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
 * Protobuf type {@code im.turms.proto.UserOnlineStatuses}
 */
public final class UserOnlineStatuses extends
        com.google.protobuf.GeneratedMessageLite<UserOnlineStatuses, UserOnlineStatuses.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.UserOnlineStatuses)
        UserOnlineStatusesOrBuilder {
    private UserOnlineStatuses() {
        statuses_ = emptyProtobufList();
    }

    public static final int STATUSES_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<UserOnlineStatus> statuses_;

    /**
     * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
     */
    @Override
    public java.util.List<UserOnlineStatus> getStatusesList() {
        return statuses_;
    }

    /**
     * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
     */
    public java.util.List<? extends UserOnlineStatusOrBuilder> getStatusesOrBuilderList() {
        return statuses_;
    }

    /**
     * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
     */
    @Override
    public int getStatusesCount() {
        return statuses_.size();
    }

    /**
     * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
     */
    @Override
    public UserOnlineStatus getStatuses(int index) {
        return statuses_.get(index);
    }

    /**
     * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
     */
    public UserOnlineStatusOrBuilder getStatusesOrBuilder(
            int index) {
        return statuses_.get(index);
    }

    private void ensureStatusesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<UserOnlineStatus> tmp =
                statuses_;
        if (!tmp.isModifiable()) {
            statuses_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
     */
    private void setStatuses(
            int index,
            UserOnlineStatus value) {
        value.getClass();
        ensureStatusesIsMutable();
        statuses_.set(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
     */
    private void addStatuses(UserOnlineStatus value) {
        value.getClass();
        ensureStatusesIsMutable();
        statuses_.add(value);
    }

    /**
     * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
     */
    private void addStatuses(
            int index,
            UserOnlineStatus value) {
        value.getClass();
        ensureStatusesIsMutable();
        statuses_.add(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
     */
    private void addAllStatuses(
            Iterable<? extends UserOnlineStatus> values) {
        ensureStatusesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(values, statuses_);
    }

    /**
     * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
     */
    private void clearStatuses() {
        statuses_ = emptyProtobufList();
    }

    /**
     * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
     */
    private void removeStatuses(int index) {
        ensureStatusesIsMutable();
        statuses_.remove(index);
    }

    public static UserOnlineStatuses parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserOnlineStatuses parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserOnlineStatuses parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserOnlineStatuses parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserOnlineStatuses parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserOnlineStatuses parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserOnlineStatuses parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UserOnlineStatuses parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UserOnlineStatuses parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static UserOnlineStatuses parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UserOnlineStatuses parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UserOnlineStatuses parseFrom(
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
            UserOnlineStatuses prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.UserOnlineStatuses}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<UserOnlineStatuses, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.UserOnlineStatuses)
            UserOnlineStatusesOrBuilder {
        // Construct using im.turms.client.model.proto.model.user.UserOnlineStatuses.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
         */
        @Override
        public java.util.List<UserOnlineStatus> getStatusesList() {
            return java.util.Collections.unmodifiableList(instance.getStatusesList());
        }

        /**
         * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
         */
        @Override
        public int getStatusesCount() {
            return instance.getStatusesCount();
        }

        /**
         * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
         */
        @Override
        public UserOnlineStatus getStatuses(int index) {
            return instance.getStatuses(index);
        }

        /**
         * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
         */
        public Builder setStatuses(
                int index,
                UserOnlineStatus value) {
            copyOnWrite();
            instance.setStatuses(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
         */
        public Builder setStatuses(
                int index,
                UserOnlineStatus.Builder builderForValue) {
            copyOnWrite();
            instance.setStatuses(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
         */
        public Builder addStatuses(UserOnlineStatus value) {
            copyOnWrite();
            instance.addStatuses(value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
         */
        public Builder addStatuses(
                int index,
                UserOnlineStatus value) {
            copyOnWrite();
            instance.addStatuses(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
         */
        public Builder addStatuses(
                UserOnlineStatus.Builder builderForValue) {
            copyOnWrite();
            instance.addStatuses(builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
         */
        public Builder addStatuses(
                int index,
                UserOnlineStatus.Builder builderForValue) {
            copyOnWrite();
            instance.addStatuses(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
         */
        public Builder addAllStatuses(
                Iterable<? extends UserOnlineStatus> values) {
            copyOnWrite();
            instance.addAllStatuses(values);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
         */
        public Builder clearStatuses() {
            copyOnWrite();
            instance.clearStatuses();
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.UserOnlineStatus statuses = 1;</code>
         */
        public Builder removeStatuses(int index) {
            copyOnWrite();
            instance.removeStatuses(index);
            return this;
        }

        // @@protoc_insertion_point(builder_scope:im.turms.proto.UserOnlineStatuses)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new UserOnlineStatuses();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"statuses_",
                        UserOnlineStatus.class,};
                String info =
                        "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<UserOnlineStatuses> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (UserOnlineStatuses.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.UserOnlineStatuses)
    private static final UserOnlineStatuses DEFAULT_INSTANCE;
    static {
        UserOnlineStatuses defaultInstance = new UserOnlineStatuses();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(UserOnlineStatuses.class,
                defaultInstance);
    }

    public static UserOnlineStatuses getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UserOnlineStatuses> PARSER;

    public static com.google.protobuf.Parser<UserOnlineStatuses> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
