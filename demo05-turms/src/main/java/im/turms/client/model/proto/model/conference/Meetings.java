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

package im.turms.client.model.proto.model.conference;

/**
 * Protobuf type {@code im.turms.proto.Meetings}
 */
public final class Meetings
        extends com.google.protobuf.GeneratedMessageLite<Meetings, Meetings.Builder> implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.Meetings)
        MeetingsOrBuilder {
    private Meetings() {
        meetings_ = emptyProtobufList();
    }

    public static final int MEETINGS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<Meeting> meetings_;

    /**
     * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
     */
    @Override
    public java.util.List<Meeting> getMeetingsList() {
        return meetings_;
    }

    /**
     * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
     */
    public java.util.List<? extends MeetingOrBuilder> getMeetingsOrBuilderList() {
        return meetings_;
    }

    /**
     * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
     */
    @Override
    public int getMeetingsCount() {
        return meetings_.size();
    }

    /**
     * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
     */
    @Override
    public Meeting getMeetings(int index) {
        return meetings_.get(index);
    }

    /**
     * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
     */
    public MeetingOrBuilder getMeetingsOrBuilder(
            int index) {
        return meetings_.get(index);
    }

    private void ensureMeetingsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<Meeting> tmp =
                meetings_;
        if (!tmp.isModifiable()) {
            meetings_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
     */
    private void setMeetings(
            int index,
            Meeting value) {
        value.getClass();
        ensureMeetingsIsMutable();
        meetings_.set(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
     */
    private void addMeetings(Meeting value) {
        value.getClass();
        ensureMeetingsIsMutable();
        meetings_.add(value);
    }

    /**
     * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
     */
    private void addMeetings(
            int index,
            Meeting value) {
        value.getClass();
        ensureMeetingsIsMutable();
        meetings_.add(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
     */
    private void addAllMeetings(
            Iterable<? extends Meeting> values) {
        ensureMeetingsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(values, meetings_);
    }

    /**
     * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
     */
    private void clearMeetings() {
        meetings_ = emptyProtobufList();
    }

    /**
     * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
     */
    private void removeMeetings(int index) {
        ensureMeetingsIsMutable();
        meetings_.remove(index);
    }

    public static Meetings parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Meetings parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Meetings parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Meetings parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Meetings parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Meetings parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Meetings parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Meetings parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Meetings parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Meetings parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Meetings parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Meetings parseFrom(
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
            Meetings prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.Meetings}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<Meetings, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.Meetings)
            MeetingsOrBuilder {
        // Construct using im.turms.client.model.proto.model.conference.Meetings.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
         */
        @Override
        public java.util.List<Meeting> getMeetingsList() {
            return java.util.Collections.unmodifiableList(instance.getMeetingsList());
        }

        /**
         * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
         */
        @Override
        public int getMeetingsCount() {
            return instance.getMeetingsCount();
        }

        /**
         * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
         */
        @Override
        public Meeting getMeetings(int index) {
            return instance.getMeetings(index);
        }

        /**
         * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
         */
        public Builder setMeetings(
                int index,
                Meeting value) {
            copyOnWrite();
            instance.setMeetings(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
         */
        public Builder setMeetings(
                int index,
                Meeting.Builder builderForValue) {
            copyOnWrite();
            instance.setMeetings(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
         */
        public Builder addMeetings(Meeting value) {
            copyOnWrite();
            instance.addMeetings(value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
         */
        public Builder addMeetings(
                int index,
                Meeting value) {
            copyOnWrite();
            instance.addMeetings(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
         */
        public Builder addMeetings(
                Meeting.Builder builderForValue) {
            copyOnWrite();
            instance.addMeetings(builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
         */
        public Builder addMeetings(
                int index,
                Meeting.Builder builderForValue) {
            copyOnWrite();
            instance.addMeetings(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
         */
        public Builder addAllMeetings(
                Iterable<? extends Meeting> values) {
            copyOnWrite();
            instance.addAllMeetings(values);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
         */
        public Builder clearMeetings() {
            copyOnWrite();
            instance.clearMeetings();
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Meeting meetings = 1;</code>
         */
        public Builder removeMeetings(int index) {
            copyOnWrite();
            instance.removeMeetings(index);
            return this;
        }

        // @@protoc_insertion_point(builder_scope:im.turms.proto.Meetings)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new Meetings();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"meetings_",
                        Meeting.class,};
                String info =
                        "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<Meetings> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (Meetings.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.Meetings)
    private static final Meetings DEFAULT_INSTANCE;
    static {
        Meetings defaultInstance = new Meetings();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(Meetings.class,
                defaultInstance);
    }

    public static Meetings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Meetings> PARSER;

    public static com.google.protobuf.Parser<Meetings> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
