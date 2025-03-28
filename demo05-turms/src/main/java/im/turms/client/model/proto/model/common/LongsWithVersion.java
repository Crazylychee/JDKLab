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

package im.turms.client.model.proto.model.common;

/**
 * Protobuf type {@code im.turms.proto.LongsWithVersion}
 */
public final class LongsWithVersion
        extends com.google.protobuf.GeneratedMessageLite<LongsWithVersion, LongsWithVersion.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.LongsWithVersion)
        LongsWithVersionOrBuilder {
    private LongsWithVersion() {
        longs_ = emptyLongList();
    }

    private int bitField0_;
    public static final int LONGS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.LongList longs_;

    /**
     * <code>repeated int64 longs = 1;</code>
     *
     * @return A list containing the longs.
     */
    @Override
    public java.util.List<Long> getLongsList() {
        return longs_;
    }

    /**
     * <code>repeated int64 longs = 1;</code>
     *
     * @return The count of longs.
     */
    @Override
    public int getLongsCount() {
        return longs_.size();
    }

    /**
     * <code>repeated int64 longs = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The longs at the given index.
     */
    @Override
    public long getLongs(int index) {
        return longs_.getLong(index);
    }

    private final int longsMemoizedSerializedSize = -1;

    private void ensureLongsIsMutable() {
        com.google.protobuf.Internal.LongList tmp = longs_;
        if (!tmp.isModifiable()) {
            longs_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <code>repeated int64 longs = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The longs to set.
     */
    private void setLongs(int index, long value) {
        ensureLongsIsMutable();
        longs_.setLong(index, value);
    }

    /**
     * <code>repeated int64 longs = 1;</code>
     *
     * @param value The longs to add.
     */
    private void addLongs(long value) {
        ensureLongsIsMutable();
        longs_.addLong(value);
    }

    /**
     * <code>repeated int64 longs = 1;</code>
     *
     * @param values The longs to add.
     */
    private void addAllLongs(Iterable<? extends Long> values) {
        ensureLongsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(values, longs_);
    }

    /**
     * <code>repeated int64 longs = 1;</code>
     */
    private void clearLongs() {
        longs_ = emptyLongList();
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

    public static LongsWithVersion parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LongsWithVersion parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LongsWithVersion parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LongsWithVersion parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LongsWithVersion parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LongsWithVersion parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LongsWithVersion parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static LongsWithVersion parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static LongsWithVersion parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static LongsWithVersion parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static LongsWithVersion parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static LongsWithVersion parseFrom(
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
            LongsWithVersion prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.LongsWithVersion}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<LongsWithVersion, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.LongsWithVersion)
            LongsWithVersionOrBuilder {
        // Construct using im.turms.client.model.proto.model.common.LongsWithVersion.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>repeated int64 longs = 1;</code>
         *
         * @return A list containing the longs.
         */
        @Override
        public java.util.List<Long> getLongsList() {
            return java.util.Collections.unmodifiableList(instance.getLongsList());
        }

        /**
         * <code>repeated int64 longs = 1;</code>
         *
         * @return The count of longs.
         */
        @Override
        public int getLongsCount() {
            return instance.getLongsCount();
        }

        /**
         * <code>repeated int64 longs = 1;</code>
         *
         * @param index The index of the element to return.
         * @return The longs at the given index.
         */
        @Override
        public long getLongs(int index) {
            return instance.getLongs(index);
        }

        /**
         * <code>repeated int64 longs = 1;</code>
         *
         * @param value The longs to set.
         * @return This builder for chaining.
         */
        public Builder setLongs(int index, long value) {
            copyOnWrite();
            instance.setLongs(index, value);
            return this;
        }

        /**
         * <code>repeated int64 longs = 1;</code>
         *
         * @param value The longs to add.
         * @return This builder for chaining.
         */
        public Builder addLongs(long value) {
            copyOnWrite();
            instance.addLongs(value);
            return this;
        }

        /**
         * <code>repeated int64 longs = 1;</code>
         *
         * @param values The longs to add.
         * @return This builder for chaining.
         */
        public Builder addAllLongs(Iterable<? extends Long> values) {
            copyOnWrite();
            instance.addAllLongs(values);
            return this;
        }

        /**
         * <code>repeated int64 longs = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearLongs() {
            copyOnWrite();
            instance.clearLongs();
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.LongsWithVersion)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new LongsWithVersion();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects =
                        new Object[]{"bitField0_", "longs_", "lastUpdatedDate_",};
                String info =
                        "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001%\u0002\u1002\u0000";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<LongsWithVersion> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (LongsWithVersion.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.LongsWithVersion)
    private static final LongsWithVersion DEFAULT_INSTANCE;
    static {
        LongsWithVersion defaultInstance = new LongsWithVersion();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(LongsWithVersion.class,
                defaultInstance);
    }

    public static LongsWithVersion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<LongsWithVersion> PARSER;

    public static com.google.protobuf.Parser<LongsWithVersion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
