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

package com.crazylychee.demo06turms.access.client.common.authorization.policy;

import im.turms.server.common.access.client.dto.request.TurmsRequest.KindCase;
import im.turms.server.common.infra.collection.CollectionUtil;
import lombok.Getter;

import java.util.*;

import static im.turms.server.common.access.client.dto.request.TurmsRequest.KindCase.*;

/**
 * @author James Chen
 */
@Getter
public enum PolicyStatementResource {
    // region user
    USER(Collections.emptySet(), Collections.emptySet(), Set.of(UPDATE_USER_REQUEST),
            Collections.emptySet()),
    USER_LOCATION(Collections.emptySet(), Collections.emptySet(),
            Set.of(UPDATE_USER_LOCATION_REQUEST), Collections.emptySet()),
    USER_ONLINE_STATUS(Collections.emptySet(), Collections.emptySet(),
            Set.of(UPDATE_USER_ONLINE_STATUS_REQUEST), Set.of(QUERY_USER_ONLINE_STATUSES_REQUEST)),
    USER_PROFILE(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(),
            Set.of(QUERY_USER_PROFILES_REQUEST)),
    USER_SETTING(Collections.emptySet(), Set.of(DELETE_USER_SETTINGS_REQUEST),
            Set.of(UPDATE_USER_SETTINGS_REQUEST), Set.of(QUERY_USER_SETTINGS_REQUEST)),
    NEARBY_USER(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(),
            Set.of(QUERY_NEARBY_USERS_REQUEST)),
    // endregion
    // region relationship
    RELATIONSHIP(Set.of(CREATE_RELATIONSHIP_REQUEST), Set.of(DELETE_RELATIONSHIP_REQUEST),
            Set.of(UPDATE_RELATIONSHIP_REQUEST),
            Set.of(QUERY_RELATIONSHIPS_REQUEST, QUERY_RELATED_USER_IDS_REQUEST)),
    RELATIONSHIP_GROUP(Set.of(CREATE_RELATIONSHIP_GROUP_REQUEST),
            Set.of(DELETE_RELATIONSHIP_GROUP_REQUEST), Set.of(UPDATE_RELATIONSHIP_GROUP_REQUEST),
            Set.of(QUERY_RELATIONSHIP_GROUPS_REQUEST)),
    FRIEND_REQUEST(Set.of(KindCase.CREATE_FRIEND_REQUEST_REQUEST),
            Set.of(KindCase.DELETE_FRIEND_REQUEST_REQUEST), Set.of(UPDATE_FRIEND_REQUEST_REQUEST),
            Set.of(QUERY_FRIEND_REQUESTS_REQUEST)),
    // endregion
    // region group
    GROUP(Set.of(CREATE_GROUP_REQUEST), Set.of(DELETE_GROUP_REQUEST), Set.of(UPDATE_GROUP_REQUEST),
            Set.of(QUERY_GROUPS_REQUEST)),
    GROUP_BLOCKED_USER(Set.of(CREATE_GROUP_BLOCKED_USER_REQUEST),
            Set.of(DELETE_GROUP_BLOCKED_USER_REQUEST), Collections.emptySet(),
            Set.of(QUERY_GROUP_BLOCKED_USER_IDS_REQUEST, QUERY_GROUP_BLOCKED_USER_INFOS_REQUEST)),
    GROUP_INVITATION(Set.of(CREATE_GROUP_INVITATION_REQUEST),
            Set.of(DELETE_GROUP_INVITATION_REQUEST), Set.of(UPDATE_GROUP_INVITATION_REQUEST),
            Set.of(QUERY_GROUP_INVITATIONS_REQUEST)),
    GROUP_JOIN_QUESTION(Set.of(CREATE_GROUP_JOIN_QUESTIONS_REQUEST),
            Set.of(DELETE_GROUP_JOIN_QUESTIONS_REQUEST), Set.of(UPDATE_GROUP_JOIN_QUESTION_REQUEST),
            Set.of(QUERY_GROUP_JOIN_QUESTIONS_REQUEST)),
    GROUP_JOIN_QUESTION_ANSWER(Collections.emptySet(), Collections.emptySet(),
            Collections.emptySet(), Set.of(CHECK_GROUP_JOIN_QUESTIONS_ANSWERS_REQUEST)),
    GROUP_JOIN_REQUEST(Set.of(CREATE_GROUP_JOIN_REQUEST_REQUEST),
            Set.of(DELETE_GROUP_JOIN_REQUEST_REQUEST), Set.of(UPDATE_GROUP_JOIN_REQUEST_REQUEST),
            Set.of(QUERY_GROUP_JOIN_REQUESTS_REQUEST)),
    GROUP_MEMBER(Set.of(CREATE_GROUP_MEMBERS_REQUEST), Set.of(DELETE_GROUP_MEMBERS_REQUEST),
            Set.of(UPDATE_GROUP_MEMBER_REQUEST), Set.of(QUERY_GROUP_MEMBERS_REQUEST)),
    JOINED_GROUP(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(),
            Set.of(QUERY_JOINED_GROUP_IDS_REQUEST, QUERY_JOINED_GROUP_INFOS_REQUEST)),
    // endregion
    // region message
    MESSAGE(Set.of(CREATE_MESSAGE_REQUEST, CREATE_MESSAGE_REACTIONS_REQUEST),
            Set.of(DELETE_MESSAGE_REACTIONS_REQUEST), Set.of(UPDATE_MESSAGE_REQUEST),
            Set.of(QUERY_MESSAGES_REQUEST)),
    // endregion
    // region conversation
    CONVERSATION(Collections.emptySet(), Collections.emptySet(),
            Set.of(UPDATE_CONVERSATION_REQUEST), Set.of(QUERY_CONVERSATIONS_REQUEST)),
    CONVERSATION_SETTING(Collections.emptySet(), Set.of(DELETE_CONVERSATION_SETTINGS_REQUEST),
            Set.of(UPDATE_CONVERSATION_SETTINGS_REQUEST),
            Set.of(QUERY_CONVERSATION_SETTINGS_REQUEST)),
    // endregion
    // region typing status
    TYPING_STATUS(Collections.emptySet(), Collections.emptySet(),
            Set.of(UPDATE_TYPING_STATUS_REQUEST), Collections.emptySet()),
    // endregion
    // region conference
    MEETING(Set.of(CREATE_MEETING_REQUEST), Set.of(DELETE_MEETING_REQUEST),
            Set.of(UPDATE_MEETING_REQUEST, UPDATE_MEETING_INVITATION_REQUEST),
            Set.of(QUERY_MEETINGS_REQUEST)),
    // endregion
    // region storage
    RESOURCE(Collections.emptySet(), Set.of(DELETE_RESOURCE_REQUEST),
            Set.of(UPDATE_MESSAGE_ATTACHMENT_INFO_REQUEST),
            Set.of(QUERY_RESOURCE_DOWNLOAD_INFO_REQUEST,
                    QUERY_RESOURCE_UPLOAD_INFO_REQUEST,
                    QUERY_MESSAGE_ATTACHMENT_INFOS_REQUEST));
    // endregion

    public static final Set<PolicyStatementResource> ALL =
            EnumSet.allOf(PolicyStatementResource.class);
    public static final Set<KindCase> ALL_REQUEST_TYPES;

    private final Set<KindCase> allRequestTypes;
    private final Set<KindCase> requestTypesForCreating;
    private final Set<KindCase> requestTypesForDeleting;
    private final Set<KindCase> requestTypesForUpdating;
    private final Set<KindCase> requestTypesForQuerying;

    static {
        List<Collection<KindCase>> requestTypes = new ArrayList<>(ALL.size());
        for (PolicyStatementResource resource : ALL) {
            requestTypes.add(resource.allRequestTypes);
        }
        ALL_REQUEST_TYPES = CollectionUtil.toImmutableSet(CollectionUtil.newSet(requestTypes));
    }

    PolicyStatementResource(
            Set<KindCase> requestTypesForCreating,
            Set<KindCase> requestTypesForDeleting,
            Set<KindCase> requestTypesForUpdating,
            Set<KindCase> requestTypesForQuerying) {
        this.requestTypesForCreating = requestTypesForCreating;
        this.requestTypesForDeleting = requestTypesForDeleting;
        this.requestTypesForUpdating = requestTypesForUpdating;
        this.requestTypesForQuerying = requestTypesForQuerying;
        allRequestTypes =
                CollectionUtil.toImmutableSet(CollectionUtil.newSet(requestTypesForCreating,
                        requestTypesForDeleting,
                        requestTypesForUpdating,
                        requestTypesForQuerying));
    }
}
