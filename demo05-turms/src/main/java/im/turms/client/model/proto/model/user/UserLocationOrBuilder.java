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

public interface UserLocationOrBuilder extends
        // @@protoc_insertion_point(interface_extends:im.turms.proto.UserLocation)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>float latitude = 1;</code>
     *
     * @return The latitude.
     */
    float getLatitude();

    /**
     * <code>float longitude = 2;</code>
     *
     * @return The longitude.
     */
    float getLongitude();

    /**
     * <code>optional int64 timestamp = 3;</code>
     *
     * @return Whether the timestamp field is set.
     */
    boolean hasTimestamp();

    /**
     * <code>optional int64 timestamp = 3;</code>
     *
     * @return The timestamp.
     */
    long getTimestamp();

    /**
     * <pre>
     * e.g. street address, city, state, country, etc.
     * </pre>
     *
     * <code>map&lt;string, string&gt; details = 4;</code>
     */
    int getDetailsCount();

    /**
     * <pre>
     * e.g. street address, city, state, country, etc.
     * </pre>
     *
     * <code>map&lt;string, string&gt; details = 4;</code>
     */
    boolean containsDetails(String key);

    /**
     * Use {@link #getDetailsMap()} instead.
     */
    @Deprecated
    java.util.Map<String, String> getDetails();

    /**
     * <pre>
     * e.g. street address, city, state, country, etc.
     * </pre>
     *
     * <code>map&lt;string, string&gt; details = 4;</code>
     */
    java.util.Map<String, String> getDetailsMap();

    /**
     * <pre>
     * e.g. street address, city, state, country, etc.
     * </pre>
     *
     * <code>map&lt;string, string&gt; details = 4;</code>
     */

    /* nullable */
    String getDetailsOrDefault(
            String key,
            /* nullable */
            String defaultValue);

    /**
     * <pre>
     * e.g. street address, city, state, country, etc.
     * </pre>
     *
     * <code>map&lt;string, string&gt; details = 4;</code>
     */

    String getDetailsOrThrow(String key);

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    java.util.List<im.turms.client.model.proto.model.common.Value> getCustomAttributesList();

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    im.turms.client.model.proto.model.common.Value getCustomAttributes(int index);

    /**
     * <code>repeated .im.turms.proto.Value custom_attributes = 15;</code>
     */
    int getCustomAttributesCount();
}
