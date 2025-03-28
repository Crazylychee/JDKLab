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

package im.turms.client.model.proto.model.message;

/**
 * Protobuf type {@code im.turms.proto.MessagesWithTotalList}
 */
public final class MessagesWithTotalList extends
        com.google.protobuf.GeneratedMessageLite<MessagesWithTotalList, MessagesWithTotalList.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.MessagesWithTotalList)
        MessagesWithTotalListOrBuilder {
    private MessagesWithTotalList() {
        messagesWithTotalList_ = emptyProtobufList();
    }

    public static final int MESSAGES_WITH_TOTAL_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<MessagesWithTotal> messagesWithTotalList_;

    /**
     * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
     */
    @Override
    public java.util.List<MessagesWithTotal> getMessagesWithTotalListList() {
        return messagesWithTotalList_;
    }

    /**
     * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
     */
    public java.util.List<? extends MessagesWithTotalOrBuilder> getMessagesWithTotalListOrBuilderList() {
        return messagesWithTotalList_;
    }

    /**
     * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
     */
    @Override
    public int getMessagesWithTotalListCount() {
        return messagesWithTotalList_.size();
    }

    /**
     * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
     */
    @Override
    public MessagesWithTotal getMessagesWithTotalList(
            int index) {
        return messagesWithTotalList_.get(index);
    }

    /**
     * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
     */
    public MessagesWithTotalOrBuilder getMessagesWithTotalListOrBuilder(
            int index) {
        return messagesWithTotalList_.get(index);
    }

    private void ensureMessagesWithTotalListIsMutable() {
        com.google.protobuf.Internal.ProtobufList<MessagesWithTotal> tmp =
                messagesWithTotalList_;
        if (!tmp.isModifiable()) {
            messagesWithTotalList_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
     */
    private void setMessagesWithTotalList(
            int index,
            MessagesWithTotal value) {
        value.getClass();
        ensureMessagesWithTotalListIsMutable();
        messagesWithTotalList_.set(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
     */
    private void addMessagesWithTotalList(
            MessagesWithTotal value) {
        value.getClass();
        ensureMessagesWithTotalListIsMutable();
        messagesWithTotalList_.add(value);
    }

    /**
     * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
     */
    private void addMessagesWithTotalList(
            int index,
            MessagesWithTotal value) {
        value.getClass();
        ensureMessagesWithTotalListIsMutable();
        messagesWithTotalList_.add(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
     */
    private void addAllMessagesWithTotalList(
            Iterable<? extends MessagesWithTotal> values) {
        ensureMessagesWithTotalListIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(values, messagesWithTotalList_);
    }

    /**
     * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
     */
    private void clearMessagesWithTotalList() {
        messagesWithTotalList_ = emptyProtobufList();
    }

    /**
     * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
     */
    private void removeMessagesWithTotalList(int index) {
        ensureMessagesWithTotalListIsMutable();
        messagesWithTotalList_.remove(index);
    }

    public static MessagesWithTotalList parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static MessagesWithTotalList parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static MessagesWithTotalList parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static MessagesWithTotalList parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static MessagesWithTotalList parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static MessagesWithTotalList parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static MessagesWithTotalList parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static MessagesWithTotalList parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static MessagesWithTotalList parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static MessagesWithTotalList parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static MessagesWithTotalList parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static MessagesWithTotalList parseFrom(
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
            MessagesWithTotalList prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.MessagesWithTotalList}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<MessagesWithTotalList, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.MessagesWithTotalList)
            MessagesWithTotalListOrBuilder {
        // Construct using
        // im.turms.client.model.proto.model.message.MessagesWithTotalList.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
         */
        @Override
        public java.util.List<MessagesWithTotal> getMessagesWithTotalListList() {
            return java.util.Collections.unmodifiableList(instance.getMessagesWithTotalListList());
        }

        /**
         * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
         */
        @Override
        public int getMessagesWithTotalListCount() {
            return instance.getMessagesWithTotalListCount();
        }

        /**
         * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
         */
        @Override
        public MessagesWithTotal getMessagesWithTotalList(
                int index) {
            return instance.getMessagesWithTotalList(index);
        }

        /**
         * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
         */
        public Builder setMessagesWithTotalList(
                int index,
                MessagesWithTotal value) {
            copyOnWrite();
            instance.setMessagesWithTotalList(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
         */
        public Builder setMessagesWithTotalList(
                int index,
                MessagesWithTotal.Builder builderForValue) {
            copyOnWrite();
            instance.setMessagesWithTotalList(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
         */
        public Builder addMessagesWithTotalList(
                MessagesWithTotal value) {
            copyOnWrite();
            instance.addMessagesWithTotalList(value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
         */
        public Builder addMessagesWithTotalList(
                int index,
                MessagesWithTotal value) {
            copyOnWrite();
            instance.addMessagesWithTotalList(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
         */
        public Builder addMessagesWithTotalList(
                MessagesWithTotal.Builder builderForValue) {
            copyOnWrite();
            instance.addMessagesWithTotalList(builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
         */
        public Builder addMessagesWithTotalList(
                int index,
                MessagesWithTotal.Builder builderForValue) {
            copyOnWrite();
            instance.addMessagesWithTotalList(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
         */
        public Builder addAllMessagesWithTotalList(
                Iterable<? extends MessagesWithTotal> values) {
            copyOnWrite();
            instance.addAllMessagesWithTotalList(values);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
         */
        public Builder clearMessagesWithTotalList() {
            copyOnWrite();
            instance.clearMessagesWithTotalList();
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.MessagesWithTotal messages_with_total_list = 1;</code>
         */
        public Builder removeMessagesWithTotalList(int index) {
            copyOnWrite();
            instance.removeMessagesWithTotalList(index);
            return this;
        }

        // @@protoc_insertion_point(builder_scope:im.turms.proto.MessagesWithTotalList)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new MessagesWithTotalList();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"messagesWithTotalList_",
                        MessagesWithTotal.class,};
                String info =
                        "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<MessagesWithTotalList> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (MessagesWithTotalList.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.MessagesWithTotalList)
    private static final MessagesWithTotalList DEFAULT_INSTANCE;
    static {
        MessagesWithTotalList defaultInstance = new MessagesWithTotalList();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite
                .registerDefaultInstance(MessagesWithTotalList.class, defaultInstance);
    }

    public static MessagesWithTotalList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<MessagesWithTotalList> PARSER;

    public static com.google.protobuf.Parser<MessagesWithTotalList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
