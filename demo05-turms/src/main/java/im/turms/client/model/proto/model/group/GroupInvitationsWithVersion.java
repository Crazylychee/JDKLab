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

package im.turms.client.model.proto.model.group;

/**
 * Protobuf type {@code im.turms.proto.GroupInvitationsWithVersion}
 */
public final class GroupInvitationsWithVersion extends
        com.google.protobuf.GeneratedMessageLite<GroupInvitationsWithVersion, GroupInvitationsWithVersion.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.GroupInvitationsWithVersion)
        GroupInvitationsWithVersionOrBuilder {
    private GroupInvitationsWithVersion() {
        groupInvitations_ = emptyProtobufList();
    }

    private int bitField0_;
    public static final int GROUP_INVITATIONS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<GroupInvitation> groupInvitations_;

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    @Override
    public java.util.List<GroupInvitation> getGroupInvitationsList() {
        return groupInvitations_;
    }

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    public java.util.List<? extends GroupInvitationOrBuilder> getGroupInvitationsOrBuilderList() {
        return groupInvitations_;
    }

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    @Override
    public int getGroupInvitationsCount() {
        return groupInvitations_.size();
    }

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    @Override
    public GroupInvitation getGroupInvitations(int index) {
        return groupInvitations_.get(index);
    }

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    public GroupInvitationOrBuilder getGroupInvitationsOrBuilder(
            int index) {
        return groupInvitations_.get(index);
    }

    private void ensureGroupInvitationsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<GroupInvitation> tmp =
                groupInvitations_;
        if (!tmp.isModifiable()) {
            groupInvitations_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    private void setGroupInvitations(
            int index,
            GroupInvitation value) {
        value.getClass();
        ensureGroupInvitationsIsMutable();
        groupInvitations_.set(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    private void addGroupInvitations(
            GroupInvitation value) {
        value.getClass();
        ensureGroupInvitationsIsMutable();
        groupInvitations_.add(value);
    }

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    private void addGroupInvitations(
            int index,
            GroupInvitation value) {
        value.getClass();
        ensureGroupInvitationsIsMutable();
        groupInvitations_.add(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    private void addAllGroupInvitations(
            Iterable<? extends GroupInvitation> values) {
        ensureGroupInvitationsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(values, groupInvitations_);
    }

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    private void clearGroupInvitations() {
        groupInvitations_ = emptyProtobufList();
    }

    /**
     * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
     */
    private void removeGroupInvitations(int index) {
        ensureGroupInvitationsIsMutable();
        groupInvitations_.remove(index);
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

    public static GroupInvitationsWithVersion parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static GroupInvitationsWithVersion parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static GroupInvitationsWithVersion parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static GroupInvitationsWithVersion parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static GroupInvitationsWithVersion parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static GroupInvitationsWithVersion parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static GroupInvitationsWithVersion parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static GroupInvitationsWithVersion parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static GroupInvitationsWithVersion parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static GroupInvitationsWithVersion parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static GroupInvitationsWithVersion parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static GroupInvitationsWithVersion parseFrom(
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
            GroupInvitationsWithVersion prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.GroupInvitationsWithVersion}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<GroupInvitationsWithVersion, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.GroupInvitationsWithVersion)
            GroupInvitationsWithVersionOrBuilder {
        // Construct using
        // im.turms.client.model.proto.model.group.GroupInvitationsWithVersion.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
         */
        @Override
        public java.util.List<GroupInvitation> getGroupInvitationsList() {
            return java.util.Collections.unmodifiableList(instance.getGroupInvitationsList());
        }

        /**
         * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
         */
        @Override
        public int getGroupInvitationsCount() {
            return instance.getGroupInvitationsCount();
        }

        /**
         * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
         */
        @Override
        public GroupInvitation getGroupInvitations(
                int index) {
            return instance.getGroupInvitations(index);
        }

        /**
         * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
         */
        public Builder setGroupInvitations(
                int index,
                GroupInvitation value) {
            copyOnWrite();
            instance.setGroupInvitations(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
         */
        public Builder setGroupInvitations(
                int index,
                GroupInvitation.Builder builderForValue) {
            copyOnWrite();
            instance.setGroupInvitations(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
         */
        public Builder addGroupInvitations(
                GroupInvitation value) {
            copyOnWrite();
            instance.addGroupInvitations(value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
         */
        public Builder addGroupInvitations(
                int index,
                GroupInvitation value) {
            copyOnWrite();
            instance.addGroupInvitations(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
         */
        public Builder addGroupInvitations(
                GroupInvitation.Builder builderForValue) {
            copyOnWrite();
            instance.addGroupInvitations(builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
         */
        public Builder addGroupInvitations(
                int index,
                GroupInvitation.Builder builderForValue) {
            copyOnWrite();
            instance.addGroupInvitations(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
         */
        public Builder addAllGroupInvitations(
                Iterable<? extends GroupInvitation> values) {
            copyOnWrite();
            instance.addAllGroupInvitations(values);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
         */
        public Builder clearGroupInvitations() {
            copyOnWrite();
            instance.clearGroupInvitations();
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupInvitation group_invitations = 1;</code>
         */
        public Builder removeGroupInvitations(int index) {
            copyOnWrite();
            instance.removeGroupInvitations(index);
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.GroupInvitationsWithVersion)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new GroupInvitationsWithVersion();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_",
                        "groupInvitations_",
                        GroupInvitation.class,
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
                com.google.protobuf.Parser<GroupInvitationsWithVersion> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (GroupInvitationsWithVersion.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.GroupInvitationsWithVersion)
    private static final GroupInvitationsWithVersion DEFAULT_INSTANCE;
    static {
        GroupInvitationsWithVersion defaultInstance = new GroupInvitationsWithVersion();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite
                .registerDefaultInstance(GroupInvitationsWithVersion.class, defaultInstance);
    }

    public static GroupInvitationsWithVersion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<GroupInvitationsWithVersion> PARSER;

    public static com.google.protobuf.Parser<GroupInvitationsWithVersion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
