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
 * Protobuf type {@code im.turms.proto.NearbyUsers}
 */
public final class NearbyUsers extends
        com.google.protobuf.GeneratedMessageLite<NearbyUsers, NearbyUsers.Builder> implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.NearbyUsers)
        NearbyUsersOrBuilder {
    private NearbyUsers() {
        nearbyUsers_ = emptyProtobufList();
    }

    public static final int NEARBY_USERS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<NearbyUser> nearbyUsers_;

    /**
     * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
     */
    @Override
    public java.util.List<NearbyUser> getNearbyUsersList() {
        return nearbyUsers_;
    }

    /**
     * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
     */
    public java.util.List<? extends NearbyUserOrBuilder> getNearbyUsersOrBuilderList() {
        return nearbyUsers_;
    }

    /**
     * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
     */
    @Override
    public int getNearbyUsersCount() {
        return nearbyUsers_.size();
    }

    /**
     * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
     */
    @Override
    public NearbyUser getNearbyUsers(int index) {
        return nearbyUsers_.get(index);
    }

    /**
     * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
     */
    public NearbyUserOrBuilder getNearbyUsersOrBuilder(
            int index) {
        return nearbyUsers_.get(index);
    }

    private void ensureNearbyUsersIsMutable() {
        com.google.protobuf.Internal.ProtobufList<NearbyUser> tmp =
                nearbyUsers_;
        if (!tmp.isModifiable()) {
            nearbyUsers_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
     */
    private void setNearbyUsers(
            int index,
            NearbyUser value) {
        value.getClass();
        ensureNearbyUsersIsMutable();
        nearbyUsers_.set(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
     */
    private void addNearbyUsers(NearbyUser value) {
        value.getClass();
        ensureNearbyUsersIsMutable();
        nearbyUsers_.add(value);
    }

    /**
     * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
     */
    private void addNearbyUsers(
            int index,
            NearbyUser value) {
        value.getClass();
        ensureNearbyUsersIsMutable();
        nearbyUsers_.add(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
     */
    private void addAllNearbyUsers(
            Iterable<? extends NearbyUser> values) {
        ensureNearbyUsersIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(values, nearbyUsers_);
    }

    /**
     * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
     */
    private void clearNearbyUsers() {
        nearbyUsers_ = emptyProtobufList();
    }

    /**
     * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
     */
    private void removeNearbyUsers(int index) {
        ensureNearbyUsersIsMutable();
        nearbyUsers_.remove(index);
    }

    public static NearbyUsers parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static NearbyUsers parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static NearbyUsers parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static NearbyUsers parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static NearbyUsers parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static NearbyUsers parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static NearbyUsers parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static NearbyUsers parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static NearbyUsers parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static NearbyUsers parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static NearbyUsers parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static NearbyUsers parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(NearbyUsers prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.NearbyUsers}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<NearbyUsers, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.NearbyUsers)
            NearbyUsersOrBuilder {
        // Construct using im.turms.client.model.proto.model.user.NearbyUsers.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
         */
        @Override
        public java.util.List<NearbyUser> getNearbyUsersList() {
            return java.util.Collections.unmodifiableList(instance.getNearbyUsersList());
        }

        /**
         * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
         */
        @Override
        public int getNearbyUsersCount() {
            return instance.getNearbyUsersCount();
        }

        /**
         * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
         */
        @Override
        public NearbyUser getNearbyUsers(int index) {
            return instance.getNearbyUsers(index);
        }

        /**
         * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
         */
        public Builder setNearbyUsers(
                int index,
                NearbyUser value) {
            copyOnWrite();
            instance.setNearbyUsers(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
         */
        public Builder setNearbyUsers(
                int index,
                NearbyUser.Builder builderForValue) {
            copyOnWrite();
            instance.setNearbyUsers(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
         */
        public Builder addNearbyUsers(NearbyUser value) {
            copyOnWrite();
            instance.addNearbyUsers(value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
         */
        public Builder addNearbyUsers(
                int index,
                NearbyUser value) {
            copyOnWrite();
            instance.addNearbyUsers(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
         */
        public Builder addNearbyUsers(
                NearbyUser.Builder builderForValue) {
            copyOnWrite();
            instance.addNearbyUsers(builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
         */
        public Builder addNearbyUsers(
                int index,
                NearbyUser.Builder builderForValue) {
            copyOnWrite();
            instance.addNearbyUsers(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
         */
        public Builder addAllNearbyUsers(
                Iterable<? extends NearbyUser> values) {
            copyOnWrite();
            instance.addAllNearbyUsers(values);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
         */
        public Builder clearNearbyUsers() {
            copyOnWrite();
            instance.clearNearbyUsers();
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.NearbyUser nearby_users = 1;</code>
         */
        public Builder removeNearbyUsers(int index) {
            copyOnWrite();
            instance.removeNearbyUsers(index);
            return this;
        }

        // @@protoc_insertion_point(builder_scope:im.turms.proto.NearbyUsers)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new NearbyUsers();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"nearbyUsers_",
                        NearbyUser.class,};
                String info =
                        "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<NearbyUsers> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (NearbyUsers.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.NearbyUsers)
    private static final NearbyUsers DEFAULT_INSTANCE;
    static {
        NearbyUsers defaultInstance = new NearbyUsers();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(NearbyUsers.class,
                defaultInstance);
    }

    public static NearbyUsers getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<NearbyUsers> PARSER;

    public static com.google.protobuf.Parser<NearbyUsers> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
