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
 * Protobuf type {@code im.turms.proto.Group}
 */
public final class Group extends com.google.protobuf.GeneratedMessageLite<Group, Group.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.Group)
        GroupOrBuilder {
    private Group() {
        name_ = "";
        intro_ = "";
        announcement_ = "";
        customAttributes_ = emptyProtobufList();
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;

    /**
     * <code>optional int64 id = 1;</code>
     *
     * @return Whether the id field is set.
     */
    @Override
    public boolean hasId() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional int64 id = 1;</code>
     *
     * @return The id.
     */
    @Override
    public long getId() {
        return id_;
    }

    /**
     * <code>optional int64 id = 1;</code>
     *
     * @param value The id to set.
     */
    private void setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
    }

    /**
     * <code>optional int64 id = 1;</code>
     */
    private void clearId() {
        bitField0_ &= ~0x00000001;
        id_ = 0L;
    }

    public static final int TYPE_ID_FIELD_NUMBER = 2;
    private long typeId_;

    /**
     * <code>optional int64 type_id = 2;</code>
     *
     * @return Whether the typeId field is set.
     */
    @Override
    public boolean hasTypeId() {
        return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional int64 type_id = 2;</code>
     *
     * @return The typeId.
     */
    @Override
    public long getTypeId() {
        return typeId_;
    }

    /**
     * <code>optional int64 type_id = 2;</code>
     *
     * @param value The typeId to set.
     */
    private void setTypeId(long value) {
        bitField0_ |= 0x00000002;
        typeId_ = value;
    }

    /**
     * <code>optional int64 type_id = 2;</code>
     */
    private void clearTypeId() {
        bitField0_ &= ~0x00000002;
        typeId_ = 0L;
    }

    public static final int CREATOR_ID_FIELD_NUMBER = 3;
    private long creatorId_;

    /**
     * <code>optional int64 creator_id = 3;</code>
     *
     * @return Whether the creatorId field is set.
     */
    @Override
    public boolean hasCreatorId() {
        return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     * <code>optional int64 creator_id = 3;</code>
     *
     * @return The creatorId.
     */
    @Override
    public long getCreatorId() {
        return creatorId_;
    }

    /**
     * <code>optional int64 creator_id = 3;</code>
     *
     * @param value The creatorId to set.
     */
    private void setCreatorId(long value) {
        bitField0_ |= 0x00000004;
        creatorId_ = value;
    }

    /**
     * <code>optional int64 creator_id = 3;</code>
     */
    private void clearCreatorId() {
        bitField0_ &= ~0x00000004;
        creatorId_ = 0L;
    }

    public static final int OWNER_ID_FIELD_NUMBER = 4;
    private long ownerId_;

    /**
     * <code>optional int64 owner_id = 4;</code>
     *
     * @return Whether the ownerId field is set.
     */
    @Override
    public boolean hasOwnerId() {
        return ((bitField0_ & 0x00000008) != 0);
    }

    /**
     * <code>optional int64 owner_id = 4;</code>
     *
     * @return The ownerId.
     */
    @Override
    public long getOwnerId() {
        return ownerId_;
    }

    /**
     * <code>optional int64 owner_id = 4;</code>
     *
     * @param value The ownerId to set.
     */
    private void setOwnerId(long value) {
        bitField0_ |= 0x00000008;
        ownerId_ = value;
    }

    /**
     * <code>optional int64 owner_id = 4;</code>
     */
    private void clearOwnerId() {
        bitField0_ &= ~0x00000008;
        ownerId_ = 0L;
    }

    public static final int NAME_FIELD_NUMBER = 5;
    private String name_;

    /**
     * <code>optional string name = 5;</code>
     *
     * @return Whether the name field is set.
     */
    @Override
    public boolean hasName() {
        return ((bitField0_ & 0x00000010) != 0);
    }

    /**
     * <code>optional string name = 5;</code>
     *
     * @return The name.
     */
    @Override
    public String getName() {
        return name_;
    }

    /**
     * <code>optional string name = 5;</code>
     *
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString getNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }

    /**
     * <code>optional string name = 5;</code>
     *
     * @param value The name to set.
     */
    private void setName(String value) {
        Class<?> valueClass = value.getClass();
        bitField0_ |= 0x00000010;
        name_ = value;
    }

    /**
     * <code>optional string name = 5;</code>
     */
    private void clearName() {
        bitField0_ &= ~0x00000010;
        name_ = getDefaultInstance().getName();
    }

    /**
     * <code>optional string name = 5;</code>
     *
     * @param value The bytes for name to set.
     */
    private void setNameBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        name_ = value.toStringUtf8();
        bitField0_ |= 0x00000010;
    }

    public static final int INTRO_FIELD_NUMBER = 6;
    private String intro_;

    /**
     * <code>optional string intro = 6;</code>
     *
     * @return Whether the intro field is set.
     */
    @Override
    public boolean hasIntro() {
        return ((bitField0_ & 0x00000020) != 0);
    }

    /**
     * <code>optional string intro = 6;</code>
     *
     * @return The intro.
     */
    @Override
    public String getIntro() {
        return intro_;
    }

    /**
     * <code>optional string intro = 6;</code>
     *
     * @return The bytes for intro.
     */
    @Override
    public com.google.protobuf.ByteString getIntroBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(intro_);
    }

    /**
     * <code>optional string intro = 6;</code>
     *
     * @param value The intro to set.
     */
    private void setIntro(String value) {
        Class<?> valueClass = value.getClass();
        bitField0_ |= 0x00000020;
        intro_ = value;
    }

    /**
     * <code>optional string intro = 6;</code>
     */
    private void clearIntro() {
        bitField0_ &= ~0x00000020;
        intro_ = getDefaultInstance().getIntro();
    }

    /**
     * <code>optional string intro = 6;</code>
     *
     * @param value The bytes for intro to set.
     */
    private void setIntroBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        intro_ = value.toStringUtf8();
        bitField0_ |= 0x00000020;
    }

    public static final int ANNOUNCEMENT_FIELD_NUMBER = 7;
    private String announcement_;

    /**
     * <code>optional string announcement = 7;</code>
     *
     * @return Whether the announcement field is set.
     */
    @Override
    public boolean hasAnnouncement() {
        return ((bitField0_ & 0x00000040) != 0);
    }

    /**
     * <code>optional string announcement = 7;</code>
     *
     * @return The announcement.
     */
    @Override
    public String getAnnouncement() {
        return announcement_;
    }

    /**
     * <code>optional string announcement = 7;</code>
     *
     * @return The bytes for announcement.
     */
    @Override
    public com.google.protobuf.ByteString getAnnouncementBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(announcement_);
    }

    /**
     * <code>optional string announcement = 7;</code>
     *
     * @param value The announcement to set.
     */
    private void setAnnouncement(String value) {
        Class<?> valueClass = value.getClass();
        bitField0_ |= 0x00000040;
        announcement_ = value;
    }

    /**
     * <code>optional string announcement = 7;</code>
     */
    private void clearAnnouncement() {
        bitField0_ &= ~0x00000040;
        announcement_ = getDefaultInstance().getAnnouncement();
    }

    /**
     * <code>optional string announcement = 7;</code>
     *
     * @param value The bytes for announcement to set.
     */
    private void setAnnouncementBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        announcement_ = value.toStringUtf8();
        bitField0_ |= 0x00000040;
    }

    public static final int CREATION_DATE_FIELD_NUMBER = 8;
    private long creationDate_;

    /**
     * <code>optional int64 creation_date = 8;</code>
     *
     * @return Whether the creationDate field is set.
     */
    @Override
    public boolean hasCreationDate() {
        return ((bitField0_ & 0x00000080) != 0);
    }

    /**
     * <code>optional int64 creation_date = 8;</code>
     *
     * @return The creationDate.
     */
    @Override
    public long getCreationDate() {
        return creationDate_;
    }

    /**
     * <code>optional int64 creation_date = 8;</code>
     *
     * @param value The creationDate to set.
     */
    private void setCreationDate(long value) {
        bitField0_ |= 0x00000080;
        creationDate_ = value;
    }

    /**
     * <code>optional int64 creation_date = 8;</code>
     */
    private void clearCreationDate() {
        bitField0_ &= ~0x00000080;
        creationDate_ = 0L;
    }

    public static final int LAST_UPDATED_DATE_FIELD_NUMBER = 9;
    private long lastUpdatedDate_;

    /**
     * <code>optional int64 last_updated_date = 9;</code>
     *
     * @return Whether the lastUpdatedDate field is set.
     */
    @Override
    public boolean hasLastUpdatedDate() {
        return ((bitField0_ & 0x00000100) != 0);
    }

    /**
     * <code>optional int64 last_updated_date = 9;</code>
     *
     * @return The lastUpdatedDate.
     */
    @Override
    public long getLastUpdatedDate() {
        return lastUpdatedDate_;
    }

    /**
     * <code>optional int64 last_updated_date = 9;</code>
     *
     * @param value The lastUpdatedDate to set.
     */
    private void setLastUpdatedDate(long value) {
        bitField0_ |= 0x00000100;
        lastUpdatedDate_ = value;
    }

    /**
     * <code>optional int64 last_updated_date = 9;</code>
     */
    private void clearLastUpdatedDate() {
        bitField0_ &= ~0x00000100;
        lastUpdatedDate_ = 0L;
    }

    public static final int MUTE_END_DATE_FIELD_NUMBER = 10;
    private long muteEndDate_;

    /**
     * <code>optional int64 mute_end_date = 10;</code>
     *
     * @return Whether the muteEndDate field is set.
     */
    @Override
    public boolean hasMuteEndDate() {
        return ((bitField0_ & 0x00000200) != 0);
    }

    /**
     * <code>optional int64 mute_end_date = 10;</code>
     *
     * @return The muteEndDate.
     */
    @Override
    public long getMuteEndDate() {
        return muteEndDate_;
    }

    /**
     * <code>optional int64 mute_end_date = 10;</code>
     *
     * @param value The muteEndDate to set.
     */
    private void setMuteEndDate(long value) {
        bitField0_ |= 0x00000200;
        muteEndDate_ = value;
    }

    /**
     * <code>optional int64 mute_end_date = 10;</code>
     */
    private void clearMuteEndDate() {
        bitField0_ &= ~0x00000200;
        muteEndDate_ = 0L;
    }

    public static final int ACTIVE_FIELD_NUMBER = 11;
    private boolean active_;

    /**
     * <code>optional bool active = 11;</code>
     *
     * @return Whether the active field is set.
     */
    @Override
    public boolean hasActive() {
        return ((bitField0_ & 0x00000400) != 0);
    }

    /**
     * <code>optional bool active = 11;</code>
     *
     * @return The active.
     */
    @Override
    public boolean getActive() {
        return active_;
    }

    /**
     * <code>optional bool active = 11;</code>
     *
     * @param value The active to set.
     */
    private void setActive(boolean value) {
        bitField0_ |= 0x00000400;
        active_ = value;
    }

    /**
     * <code>optional bool active = 11;</code>
     */
    private void clearActive() {
        bitField0_ &= ~0x00000400;
        active_ = false;
    }

    public static final int USER_DEFINED_ATTRIBUTES_FIELD_NUMBER = 12;

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
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 12;</code>
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
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 12;</code>
     */
    @Override

    public java.util.Map<String, im.turms.client.model.proto.model.common.Value> getUserDefinedAttributesMap() {
        return java.util.Collections.unmodifiableMap(internalGetUserDefinedAttributes());
    }

    /**
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 12;</code>
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
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 12;</code>
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
     * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 12;</code>
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

    public static Group parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Group parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Group parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Group parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Group parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Group parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Group parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Group parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Group parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Group parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Group parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Group parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Group prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.Group}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<Group, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.Group)
            GroupOrBuilder {
        // Construct using im.turms.client.model.proto.model.group.Group.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>optional int64 id = 1;</code>
         *
         * @return Whether the id field is set.
         */
        @Override
        public boolean hasId() {
            return instance.hasId();
        }

        /**
         * <code>optional int64 id = 1;</code>
         *
         * @return The id.
         */
        @Override
        public long getId() {
            return instance.getId();
        }

        /**
         * <code>optional int64 id = 1;</code>
         *
         * @param value The id to set.
         * @return This builder for chaining.
         */
        public Builder setId(long value) {
            copyOnWrite();
            instance.setId(value);
            return this;
        }

        /**
         * <code>optional int64 id = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearId() {
            copyOnWrite();
            instance.clearId();
            return this;
        }

        /**
         * <code>optional int64 type_id = 2;</code>
         *
         * @return Whether the typeId field is set.
         */
        @Override
        public boolean hasTypeId() {
            return instance.hasTypeId();
        }

        /**
         * <code>optional int64 type_id = 2;</code>
         *
         * @return The typeId.
         */
        @Override
        public long getTypeId() {
            return instance.getTypeId();
        }

        /**
         * <code>optional int64 type_id = 2;</code>
         *
         * @param value The typeId to set.
         * @return This builder for chaining.
         */
        public Builder setTypeId(long value) {
            copyOnWrite();
            instance.setTypeId(value);
            return this;
        }

        /**
         * <code>optional int64 type_id = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearTypeId() {
            copyOnWrite();
            instance.clearTypeId();
            return this;
        }

        /**
         * <code>optional int64 creator_id = 3;</code>
         *
         * @return Whether the creatorId field is set.
         */
        @Override
        public boolean hasCreatorId() {
            return instance.hasCreatorId();
        }

        /**
         * <code>optional int64 creator_id = 3;</code>
         *
         * @return The creatorId.
         */
        @Override
        public long getCreatorId() {
            return instance.getCreatorId();
        }

        /**
         * <code>optional int64 creator_id = 3;</code>
         *
         * @param value The creatorId to set.
         * @return This builder for chaining.
         */
        public Builder setCreatorId(long value) {
            copyOnWrite();
            instance.setCreatorId(value);
            return this;
        }

        /**
         * <code>optional int64 creator_id = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearCreatorId() {
            copyOnWrite();
            instance.clearCreatorId();
            return this;
        }

        /**
         * <code>optional int64 owner_id = 4;</code>
         *
         * @return Whether the ownerId field is set.
         */
        @Override
        public boolean hasOwnerId() {
            return instance.hasOwnerId();
        }

        /**
         * <code>optional int64 owner_id = 4;</code>
         *
         * @return The ownerId.
         */
        @Override
        public long getOwnerId() {
            return instance.getOwnerId();
        }

        /**
         * <code>optional int64 owner_id = 4;</code>
         *
         * @param value The ownerId to set.
         * @return This builder for chaining.
         */
        public Builder setOwnerId(long value) {
            copyOnWrite();
            instance.setOwnerId(value);
            return this;
        }

        /**
         * <code>optional int64 owner_id = 4;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearOwnerId() {
            copyOnWrite();
            instance.clearOwnerId();
            return this;
        }

        /**
         * <code>optional string name = 5;</code>
         *
         * @return Whether the name field is set.
         */
        @Override
        public boolean hasName() {
            return instance.hasName();
        }

        /**
         * <code>optional string name = 5;</code>
         *
         * @return The name.
         */
        @Override
        public String getName() {
            return instance.getName();
        }

        /**
         * <code>optional string name = 5;</code>
         *
         * @return The bytes for name.
         */
        @Override
        public com.google.protobuf.ByteString getNameBytes() {
            return instance.getNameBytes();
        }

        /**
         * <code>optional string name = 5;</code>
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
         * <code>optional string name = 5;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearName() {
            copyOnWrite();
            instance.clearName();
            return this;
        }

        /**
         * <code>optional string name = 5;</code>
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
         * <code>optional string intro = 6;</code>
         *
         * @return Whether the intro field is set.
         */
        @Override
        public boolean hasIntro() {
            return instance.hasIntro();
        }

        /**
         * <code>optional string intro = 6;</code>
         *
         * @return The intro.
         */
        @Override
        public String getIntro() {
            return instance.getIntro();
        }

        /**
         * <code>optional string intro = 6;</code>
         *
         * @return The bytes for intro.
         */
        @Override
        public com.google.protobuf.ByteString getIntroBytes() {
            return instance.getIntroBytes();
        }

        /**
         * <code>optional string intro = 6;</code>
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
         * <code>optional string intro = 6;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearIntro() {
            copyOnWrite();
            instance.clearIntro();
            return this;
        }

        /**
         * <code>optional string intro = 6;</code>
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
         * <code>optional string announcement = 7;</code>
         *
         * @return Whether the announcement field is set.
         */
        @Override
        public boolean hasAnnouncement() {
            return instance.hasAnnouncement();
        }

        /**
         * <code>optional string announcement = 7;</code>
         *
         * @return The announcement.
         */
        @Override
        public String getAnnouncement() {
            return instance.getAnnouncement();
        }

        /**
         * <code>optional string announcement = 7;</code>
         *
         * @return The bytes for announcement.
         */
        @Override
        public com.google.protobuf.ByteString getAnnouncementBytes() {
            return instance.getAnnouncementBytes();
        }

        /**
         * <code>optional string announcement = 7;</code>
         *
         * @param value The announcement to set.
         * @return This builder for chaining.
         */
        public Builder setAnnouncement(String value) {
            copyOnWrite();
            instance.setAnnouncement(value);
            return this;
        }

        /**
         * <code>optional string announcement = 7;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearAnnouncement() {
            copyOnWrite();
            instance.clearAnnouncement();
            return this;
        }

        /**
         * <code>optional string announcement = 7;</code>
         *
         * @param value The bytes for announcement to set.
         * @return This builder for chaining.
         */
        public Builder setAnnouncementBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setAnnouncementBytes(value);
            return this;
        }

        /**
         * <code>optional int64 creation_date = 8;</code>
         *
         * @return Whether the creationDate field is set.
         */
        @Override
        public boolean hasCreationDate() {
            return instance.hasCreationDate();
        }

        /**
         * <code>optional int64 creation_date = 8;</code>
         *
         * @return The creationDate.
         */
        @Override
        public long getCreationDate() {
            return instance.getCreationDate();
        }

        /**
         * <code>optional int64 creation_date = 8;</code>
         *
         * @param value The creationDate to set.
         * @return This builder for chaining.
         */
        public Builder setCreationDate(long value) {
            copyOnWrite();
            instance.setCreationDate(value);
            return this;
        }

        /**
         * <code>optional int64 creation_date = 8;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearCreationDate() {
            copyOnWrite();
            instance.clearCreationDate();
            return this;
        }

        /**
         * <code>optional int64 last_updated_date = 9;</code>
         *
         * @return Whether the lastUpdatedDate field is set.
         */
        @Override
        public boolean hasLastUpdatedDate() {
            return instance.hasLastUpdatedDate();
        }

        /**
         * <code>optional int64 last_updated_date = 9;</code>
         *
         * @return The lastUpdatedDate.
         */
        @Override
        public long getLastUpdatedDate() {
            return instance.getLastUpdatedDate();
        }

        /**
         * <code>optional int64 last_updated_date = 9;</code>
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
         * <code>optional int64 last_updated_date = 9;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearLastUpdatedDate() {
            copyOnWrite();
            instance.clearLastUpdatedDate();
            return this;
        }

        /**
         * <code>optional int64 mute_end_date = 10;</code>
         *
         * @return Whether the muteEndDate field is set.
         */
        @Override
        public boolean hasMuteEndDate() {
            return instance.hasMuteEndDate();
        }

        /**
         * <code>optional int64 mute_end_date = 10;</code>
         *
         * @return The muteEndDate.
         */
        @Override
        public long getMuteEndDate() {
            return instance.getMuteEndDate();
        }

        /**
         * <code>optional int64 mute_end_date = 10;</code>
         *
         * @param value The muteEndDate to set.
         * @return This builder for chaining.
         */
        public Builder setMuteEndDate(long value) {
            copyOnWrite();
            instance.setMuteEndDate(value);
            return this;
        }

        /**
         * <code>optional int64 mute_end_date = 10;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearMuteEndDate() {
            copyOnWrite();
            instance.clearMuteEndDate();
            return this;
        }

        /**
         * <code>optional bool active = 11;</code>
         *
         * @return Whether the active field is set.
         */
        @Override
        public boolean hasActive() {
            return instance.hasActive();
        }

        /**
         * <code>optional bool active = 11;</code>
         *
         * @return The active.
         */
        @Override
        public boolean getActive() {
            return instance.getActive();
        }

        /**
         * <code>optional bool active = 11;</code>
         *
         * @param value The active to set.
         * @return This builder for chaining.
         */
        public Builder setActive(boolean value) {
            copyOnWrite();
            instance.setActive(value);
            return this;
        }

        /**
         * <code>optional bool active = 11;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearActive() {
            copyOnWrite();
            instance.clearActive();
            return this;
        }

        @Override

        public int getUserDefinedAttributesCount() {
            return instance.getUserDefinedAttributesMap()
                    .size();
        }

        /**
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 12;</code>
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
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 12;</code>
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
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 12;</code>
         */
        @Override
        public java.util.Map<String, im.turms.client.model.proto.model.common.Value> getUserDefinedAttributesMap() {
            return java.util.Collections.unmodifiableMap(instance.getUserDefinedAttributesMap());
        }

        /**
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 12;</code>
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
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 12;</code>
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
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 12;</code>
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
         * <code>map&lt;string, .im.turms.proto.Value&gt; user_defined_attributes = 12;</code>
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.Group)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new Group();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_",
                        "id_",
                        "typeId_",
                        "creatorId_",
                        "ownerId_",
                        "name_",
                        "intro_",
                        "announcement_",
                        "creationDate_",
                        "lastUpdatedDate_",
                        "muteEndDate_",
                        "active_",
                        "userDefinedAttributes_",
                        UserDefinedAttributesDefaultEntryHolder.defaultEntry,
                        "customAttributes_",
                        im.turms.client.model.proto.model.common.Value.class,};
                String info =
                        "\u0000\r\u0000\u0001\u0001\u000f\r\u0001\u0001\u0000\u0001\u1002\u0000\u0002\u1002"
                                + "\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1208\u0004\u0006\u1208\u0005\u0007"
                                + "\u1208\u0006\b\u1002\u0007\t\u1002\b\n\u1002\t\u000b\u1007\n\f2\u000f\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<Group> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (Group.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.Group)
    private static final Group DEFAULT_INSTANCE;
    static {
        Group defaultInstance = new Group();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(Group.class,
                defaultInstance);
    }

    public static Group getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Group> PARSER;

    public static com.google.protobuf.Parser<Group> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
