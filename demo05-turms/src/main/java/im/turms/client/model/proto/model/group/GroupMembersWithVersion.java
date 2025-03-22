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
 * Protobuf type {@code im.turms.proto.GroupMembersWithVersion}
 */
public final class GroupMembersWithVersion extends
        com.google.protobuf.GeneratedMessageLite<GroupMembersWithVersion, GroupMembersWithVersion.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.GroupMembersWithVersion)
        GroupMembersWithVersionOrBuilder {
    private GroupMembersWithVersion() {
        groupMembers_ = emptyProtobufList();
    }

    private int bitField0_;
    public static final int GROUP_MEMBERS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<GroupMember> groupMembers_;

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    @Override
    public java.util.List<GroupMember> getGroupMembersList() {
        return groupMembers_;
    }

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    public java.util.List<? extends GroupMemberOrBuilder> getGroupMembersOrBuilderList() {
        return groupMembers_;
    }

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    @Override
    public int getGroupMembersCount() {
        return groupMembers_.size();
    }

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    @Override
    public GroupMember getGroupMembers(int index) {
        return groupMembers_.get(index);
    }

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    public GroupMemberOrBuilder getGroupMembersOrBuilder(
            int index) {
        return groupMembers_.get(index);
    }

    private void ensureGroupMembersIsMutable() {
        com.google.protobuf.Internal.ProtobufList<GroupMember> tmp =
                groupMembers_;
        if (!tmp.isModifiable()) {
            groupMembers_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    private void setGroupMembers(
            int index,
            GroupMember value) {
        value.getClass();
        ensureGroupMembersIsMutable();
        groupMembers_.set(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    private void addGroupMembers(GroupMember value) {
        value.getClass();
        ensureGroupMembersIsMutable();
        groupMembers_.add(value);
    }

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    private void addGroupMembers(
            int index,
            GroupMember value) {
        value.getClass();
        ensureGroupMembersIsMutable();
        groupMembers_.add(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    private void addAllGroupMembers(
            Iterable<? extends GroupMember> values) {
        ensureGroupMembersIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(values, groupMembers_);
    }

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    private void clearGroupMembers() {
        groupMembers_ = emptyProtobufList();
    }

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    private void removeGroupMembers(int index) {
        ensureGroupMembersIsMutable();
        groupMembers_.remove(index);
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

    public static GroupMembersWithVersion parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static GroupMembersWithVersion parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static GroupMembersWithVersion parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static GroupMembersWithVersion parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static GroupMembersWithVersion parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static GroupMembersWithVersion parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static GroupMembersWithVersion parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static GroupMembersWithVersion parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static GroupMembersWithVersion parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static GroupMembersWithVersion parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static GroupMembersWithVersion parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static GroupMembersWithVersion parseFrom(
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
            GroupMembersWithVersion prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.GroupMembersWithVersion}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<GroupMembersWithVersion, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.GroupMembersWithVersion)
            GroupMembersWithVersionOrBuilder {
        // Construct using
        // im.turms.client.model.proto.model.group.GroupMembersWithVersion.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
         */
        @Override
        public java.util.List<GroupMember> getGroupMembersList() {
            return java.util.Collections.unmodifiableList(instance.getGroupMembersList());
        }

        /**
         * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
         */
        @Override
        public int getGroupMembersCount() {
            return instance.getGroupMembersCount();
        }

        /**
         * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
         */
        @Override
        public GroupMember getGroupMembers(int index) {
            return instance.getGroupMembers(index);
        }

        /**
         * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
         */
        public Builder setGroupMembers(
                int index,
                GroupMember value) {
            copyOnWrite();
            instance.setGroupMembers(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
         */
        public Builder setGroupMembers(
                int index,
                GroupMember.Builder builderForValue) {
            copyOnWrite();
            instance.setGroupMembers(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
         */
        public Builder addGroupMembers(GroupMember value) {
            copyOnWrite();
            instance.addGroupMembers(value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
         */
        public Builder addGroupMembers(
                int index,
                GroupMember value) {
            copyOnWrite();
            instance.addGroupMembers(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
         */
        public Builder addGroupMembers(
                GroupMember.Builder builderForValue) {
            copyOnWrite();
            instance.addGroupMembers(builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
         */
        public Builder addGroupMembers(
                int index,
                GroupMember.Builder builderForValue) {
            copyOnWrite();
            instance.addGroupMembers(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
         */
        public Builder addAllGroupMembers(
                Iterable<? extends GroupMember> values) {
            copyOnWrite();
            instance.addAllGroupMembers(values);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
         */
        public Builder clearGroupMembers() {
            copyOnWrite();
            instance.clearGroupMembers();
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
         */
        public Builder removeGroupMembers(int index) {
            copyOnWrite();
            instance.removeGroupMembers(index);
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.GroupMembersWithVersion)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new GroupMembersWithVersion();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_",
                        "groupMembers_",
                        GroupMember.class,
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
                com.google.protobuf.Parser<GroupMembersWithVersion> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (GroupMembersWithVersion.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.GroupMembersWithVersion)
    private static final GroupMembersWithVersion DEFAULT_INSTANCE;
    static {
        GroupMembersWithVersion defaultInstance = new GroupMembersWithVersion();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite
                .registerDefaultInstance(GroupMembersWithVersion.class, defaultInstance);
    }

    public static GroupMembersWithVersion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<GroupMembersWithVersion> PARSER;

    public static com.google.protobuf.Parser<GroupMembersWithVersion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
