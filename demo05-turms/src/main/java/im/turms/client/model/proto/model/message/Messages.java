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
 * Protobuf type {@code im.turms.proto.Messages}
 */
public final class Messages
        extends com.google.protobuf.GeneratedMessageLite<Messages, Messages.Builder> implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.Messages)
        MessagesOrBuilder {
    private Messages() {
        messages_ = emptyProtobufList();
    }

    public static final int MESSAGES_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<Message> messages_;

    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    @Override
    public java.util.List<Message> getMessagesList() {
        return messages_;
    }

    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public java.util.List<? extends MessageOrBuilder> getMessagesOrBuilderList() {
        return messages_;
    }

    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    @Override
    public int getMessagesCount() {
        return messages_.size();
    }

    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    @Override
    public Message getMessages(int index) {
        return messages_.get(index);
    }

    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public MessageOrBuilder getMessagesOrBuilder(
            int index) {
        return messages_.get(index);
    }

    private void ensureMessagesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<Message> tmp =
                messages_;
        if (!tmp.isModifiable()) {
            messages_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    private void setMessages(int index, Message value) {
        value.getClass();
        ensureMessagesIsMutable();
        messages_.set(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    private void addMessages(Message value) {
        value.getClass();
        ensureMessagesIsMutable();
        messages_.add(value);
    }

    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    private void addMessages(int index, Message value) {
        value.getClass();
        ensureMessagesIsMutable();
        messages_.add(index, value);
    }

    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    private void addAllMessages(
            Iterable<? extends Message> values) {
        ensureMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(values, messages_);
    }

    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    private void clearMessages() {
        messages_ = emptyProtobufList();
    }

    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    private void removeMessages(int index) {
        ensureMessagesIsMutable();
        messages_.remove(index);
    }

    public static Messages parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Messages parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Messages parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Messages parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Messages parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Messages parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Messages parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Messages parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Messages parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Messages parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Messages parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Messages parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Messages prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.Messages}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<Messages, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.Messages)
            MessagesOrBuilder {
        // Construct using im.turms.client.model.proto.model.message.Messages.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <code>repeated .im.turms.proto.Message messages = 1;</code>
         */
        @Override
        public java.util.List<Message> getMessagesList() {
            return java.util.Collections.unmodifiableList(instance.getMessagesList());
        }

        /**
         * <code>repeated .im.turms.proto.Message messages = 1;</code>
         */
        @Override
        public int getMessagesCount() {
            return instance.getMessagesCount();
        }

        /**
         * <code>repeated .im.turms.proto.Message messages = 1;</code>
         */
        @Override
        public Message getMessages(int index) {
            return instance.getMessages(index);
        }

        /**
         * <code>repeated .im.turms.proto.Message messages = 1;</code>
         */
        public Builder setMessages(
                int index,
                Message value) {
            copyOnWrite();
            instance.setMessages(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Message messages = 1;</code>
         */
        public Builder setMessages(
                int index,
                Message.Builder builderForValue) {
            copyOnWrite();
            instance.setMessages(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Message messages = 1;</code>
         */
        public Builder addMessages(Message value) {
            copyOnWrite();
            instance.addMessages(value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Message messages = 1;</code>
         */
        public Builder addMessages(
                int index,
                Message value) {
            copyOnWrite();
            instance.addMessages(index, value);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Message messages = 1;</code>
         */
        public Builder addMessages(
                Message.Builder builderForValue) {
            copyOnWrite();
            instance.addMessages(builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Message messages = 1;</code>
         */
        public Builder addMessages(
                int index,
                Message.Builder builderForValue) {
            copyOnWrite();
            instance.addMessages(index, builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Message messages = 1;</code>
         */
        public Builder addAllMessages(
                Iterable<? extends Message> values) {
            copyOnWrite();
            instance.addAllMessages(values);
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Message messages = 1;</code>
         */
        public Builder clearMessages() {
            copyOnWrite();
            instance.clearMessages();
            return this;
        }

        /**
         * <code>repeated .im.turms.proto.Message messages = 1;</code>
         */
        public Builder removeMessages(int index) {
            copyOnWrite();
            instance.removeMessages(index);
            return this;
        }

        // @@protoc_insertion_point(builder_scope:im.turms.proto.Messages)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new Messages();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"messages_",
                        Message.class,};
                String info =
                        "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<Messages> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (Messages.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.Messages)
    private static final Messages DEFAULT_INSTANCE;
    static {
        Messages defaultInstance = new Messages();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(Messages.class,
                defaultInstance);
    }

    public static Messages getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Messages> PARSER;

    public static com.google.protobuf.Parser<Messages> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
