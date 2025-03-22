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

package im.turms.client.model.proto.request.group.enrollment;

/**
 * Protobuf type {@code im.turms.proto.UpdateGroupInvitationRequest}
 */
public final class UpdateGroupInvitationRequest extends
        com.google.protobuf.GeneratedMessageLite<UpdateGroupInvitationRequest, UpdateGroupInvitationRequest.Builder>
        implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.UpdateGroupInvitationRequest)
        UpdateGroupInvitationRequestOrBuilder {
    private UpdateGroupInvitationRequest() {
        reason_ = "";
        customAttributes_ = emptyProtobufList();
    }

    private int bitField0_;
    public static final int INVITATION_ID_FIELD_NUMBER = 1;
    private long invitationId_;

    /**
     * <pre>
     * Query filter
     * </pre>
     *
     * <code>int64 invitation_id = 1;</code>
     *
     * @return The invitationId.
     */
    @Override
    public long getInvitationId() {
        return invitationId_;
    }

    /**
     * <pre>
     * Query filter
     * </pre>
     *
     * <code>int64 invitation_id = 1;</code>
     *
     * @param value The invitationId to set.
     */
    private void setInvitationId(long value) {

        invitationId_ = value;
    }

    /**
     * <pre>
     * Query filter
     * </pre>
     *
     * <code>int64 invitation_id = 1;</code>
     */
    private void clearInvitationId() {

        invitationId_ = 0L;
    }

    public static final int RESPONSE_ACTION_FIELD_NUMBER = 2;
    private int responseAction_;

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>.im.turms.proto.ResponseAction response_action = 2;</code>
     *
     * @return The enum numeric value on the wire for responseAction.
     */
    @Override
    public int getResponseActionValue() {
        return responseAction_;
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>.im.turms.proto.ResponseAction response_action = 2;</code>
     *
     * @return The responseAction.
     */
    @Override
    public im.turms.client.model.proto.constant.ResponseAction getResponseAction() {
        im.turms.client.model.proto.constant.ResponseAction result =
                im.turms.client.model.proto.constant.ResponseAction.forNumber(responseAction_);
        return result == null
                ? im.turms.client.model.proto.constant.ResponseAction.UNRECOGNIZED
                : result;
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>.im.turms.proto.ResponseAction response_action = 2;</code>
     *
     * @param value The enum numeric value on the wire for responseAction to set.
     */
    private void setResponseActionValue(int value) {
        responseAction_ = value;
    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>.im.turms.proto.ResponseAction response_action = 2;</code>
     *
     * @param value The responseAction to set.
     */
    private void setResponseAction(im.turms.client.model.proto.constant.ResponseAction value) {
        responseAction_ = value.getNumber();

    }

    /**
     * <pre>
     * Update
     * </pre>
     *
     * <code>.im.turms.proto.ResponseAction response_action = 2;</code>
     */
    private void clearResponseAction() {

        responseAction_ = 0;
    }

    public static final int REASON_FIELD_NUMBER = 3;
    private String reason_;

    /**
     * <code>optional string reason = 3;</code>
     *
     * @return Whether the reason field is set.
     */
    @Override
    public boolean hasReason() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional string reason = 3;</code>
     *
     * @return The reason.
     */
    @Override
    public String getReason() {
        return reason_;
    }

    /**
     * <code>optional string reason = 3;</code>
     *
     * @return The bytes for reason.
     */
    @Override
    public com.google.protobuf.ByteString getReasonBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(reason_);
    }

    /**
     * <code>optional string reason = 3;</code>
     *
     * @param value The reason to set.
     */
    private void setReason(String value) {
        Class<?> valueClass = value.getClass();
        bitField0_ |= 0x00000001;
        reason_ = value;
    }

    /**
     * <code>optional string reason = 3;</code>
     */
    private void clearReason() {
        bitField0_ &= ~0x00000001;
        reason_ = getDefaultInstance().getReason();
    }

    /**
     * <code>optional string reason = 3;</code>
     *
     * @param value The bytes for reason to set.
     */
    private void setReasonBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        reason_ = value.toStringUtf8();
        bitField0_ |= 0x00000001;
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

    public static UpdateGroupInvitationRequest parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateGroupInvitationRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateGroupInvitationRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateGroupInvitationRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateGroupInvitationRequest parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UpdateGroupInvitationRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UpdateGroupInvitationRequest parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateGroupInvitationRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite
                .parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UpdateGroupInvitationRequest parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateGroupInvitationRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UpdateGroupInvitationRequest parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UpdateGroupInvitationRequest parseFrom(
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
            UpdateGroupInvitationRequest prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code im.turms.proto.UpdateGroupInvitationRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<UpdateGroupInvitationRequest, Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.UpdateGroupInvitationRequest)
            UpdateGroupInvitationRequestOrBuilder {
        // Construct using
        // im.turms.client.model.proto.request.group.enrollment.UpdateGroupInvitationRequest.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        /**
         * <pre>
         * Query filter
         * </pre>
         *
         * <code>int64 invitation_id = 1;</code>
         *
         * @return The invitationId.
         */
        @Override
        public long getInvitationId() {
            return instance.getInvitationId();
        }

        /**
         * <pre>
         * Query filter
         * </pre>
         *
         * <code>int64 invitation_id = 1;</code>
         *
         * @param value The invitationId to set.
         * @return This builder for chaining.
         */
        public Builder setInvitationId(long value) {
            copyOnWrite();
            instance.setInvitationId(value);
            return this;
        }

        /**
         * <pre>
         * Query filter
         * </pre>
         *
         * <code>int64 invitation_id = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearInvitationId() {
            copyOnWrite();
            instance.clearInvitationId();
            return this;
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>.im.turms.proto.ResponseAction response_action = 2;</code>
         *
         * @return The enum numeric value on the wire for responseAction.
         */
        @Override
        public int getResponseActionValue() {
            return instance.getResponseActionValue();
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>.im.turms.proto.ResponseAction response_action = 2;</code>
         *
         * @param value The responseAction to set.
         * @return This builder for chaining.
         */
        public Builder setResponseActionValue(int value) {
            copyOnWrite();
            instance.setResponseActionValue(value);
            return this;
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>.im.turms.proto.ResponseAction response_action = 2;</code>
         *
         * @return The responseAction.
         */
        @Override
        public im.turms.client.model.proto.constant.ResponseAction getResponseAction() {
            return instance.getResponseAction();
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>.im.turms.proto.ResponseAction response_action = 2;</code>
         *
         * @param value The enum numeric value on the wire for responseAction to set.
         * @return This builder for chaining.
         */
        public Builder setResponseAction(
                im.turms.client.model.proto.constant.ResponseAction value) {
            copyOnWrite();
            instance.setResponseAction(value);
            return this;
        }

        /**
         * <pre>
         * Update
         * </pre>
         *
         * <code>.im.turms.proto.ResponseAction response_action = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearResponseAction() {
            copyOnWrite();
            instance.clearResponseAction();
            return this;
        }

        /**
         * <code>optional string reason = 3;</code>
         *
         * @return Whether the reason field is set.
         */
        @Override
        public boolean hasReason() {
            return instance.hasReason();
        }

        /**
         * <code>optional string reason = 3;</code>
         *
         * @return The reason.
         */
        @Override
        public String getReason() {
            return instance.getReason();
        }

        /**
         * <code>optional string reason = 3;</code>
         *
         * @return The bytes for reason.
         */
        @Override
        public com.google.protobuf.ByteString getReasonBytes() {
            return instance.getReasonBytes();
        }

        /**
         * <code>optional string reason = 3;</code>
         *
         * @param value The reason to set.
         * @return This builder for chaining.
         */
        public Builder setReason(String value) {
            copyOnWrite();
            instance.setReason(value);
            return this;
        }

        /**
         * <code>optional string reason = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearReason() {
            copyOnWrite();
            instance.clearReason();
            return this;
        }

        /**
         * <code>optional string reason = 3;</code>
         *
         * @param value The bytes for reason to set.
         * @return This builder for chaining.
         */
        public Builder setReasonBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setReasonBytes(value);
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

        // @@protoc_insertion_point(builder_scope:im.turms.proto.UpdateGroupInvitationRequest)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0,
            Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new UpdateGroupInvitationRequest();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{"bitField0_",
                        "invitationId_",
                        "responseAction_",
                        "reason_",
                        "customAttributes_",
                        im.turms.client.model.proto.model.common.Value.class,};
                String info =
                        "\u0000\u0004\u0000\u0001\u0001\u000f\u0004\u0000\u0001\u0000\u0001\u0002\u0002\f"
                                + "\u0003\u1208\u0000\u000f\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<UpdateGroupInvitationRequest> parser =
                        PARSER;
                if (parser == null) {
                    synchronized (UpdateGroupInvitationRequest.class) {
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

    // @@protoc_insertion_point(class_scope:im.turms.proto.UpdateGroupInvitationRequest)
    private static final UpdateGroupInvitationRequest DEFAULT_INSTANCE;
    static {
        UpdateGroupInvitationRequest defaultInstance = new UpdateGroupInvitationRequest();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite
                .registerDefaultInstance(UpdateGroupInvitationRequest.class, defaultInstance);
    }

    public static UpdateGroupInvitationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UpdateGroupInvitationRequest> PARSER;

    public static com.google.protobuf.Parser<UpdateGroupInvitationRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
