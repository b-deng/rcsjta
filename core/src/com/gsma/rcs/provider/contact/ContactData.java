/*******************************************************************************
 * Software Name : RCS IMS Stack
 *
 * Copyright (C) 2010 France Telecom S.A.
 * Copyright (C) 2014 Sony Mobile Communications Inc.
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
 *
 * NOTE: This file has been modified by Sony Mobile Communications Inc.
 * Modifications are licensed under the License.
 ******************************************************************************/

package com.gsma.rcs.provider.contact;

import com.gsma.services.rcs.capability.CapabilitiesLog;
import com.gsma.services.rcs.filetransfer.FileTransferLog;

import android.net.Uri;

/**
 * RCS Contact address book data constants
 * 
 * @author Jean-Marc AUFFRET
 */
/* package private */public final class ContactData {
    /**
     * Database URI
     */
    static final Uri CONTENT_URI = Uri.parse("content://com.gsma.rcs.capability/capability");

    /**
     * Unique base column id
     */
    static final String KEY_BASECOLUMN_ID = FileTransferLog.BASECOLUMN_ID;

    /**
     * ContactId formatted number of contact associated to the capabilities.
     */
    static final String KEY_CONTACT = CapabilitiesLog.CONTACT;

    /**
     * Column Name
     */
    static final String KEY_DISPLAY_NAME = "display_name";

    /**
     * Column name
     */
    static final String KEY_PRESENCE_SHARING_STATUS = "presence_sharing_status";

    /**
     * Column name
     */
    static final String KEY_TIMESTAMP = "timestamp";

    /**
     * Column name
     */
    static final String KEY_RCS_STATUS = "rcs_status";

    /**
     * Column name
     */
    static final String KEY_REGISTRATION_STATE = "registration_state";

    /**
     * Column name
     */
    static final String KEY_RCS_STATUS_TIMESTAMP = "rcs_status_timestamp";

    /**
     * Column name
     */
    static final String KEY_PRESENCE_FREE_TEXT = "presence_free_text";

    /**
     * Column name
     */
    static final String KEY_PRESENCE_WEBLINK_NAME = "presence_weblink_name";

    /**
     * Column name
     */
    static final String KEY_PRESENCE_WEBLINK_URL = "presence_weblink_url";

    /**
     * Column name
     */
    static final String KEY_PRESENCE_PHOTO_EXIST_FLAG = "presence_photo_exist_flag";

    /**
     * Column name
     */
    static final String KEY_PRESENCE_PHOTO_ETAG = "presence_photo_etag";

    /**
     * Column name
     */
    static final String KEY_PRESENCE_PHOTO_DATA = "presence_photo_data";

    /**
     * Column name
     */
    static final String KEY_PRESENCE_GEOLOC_EXIST_FLAG = "presence_geoloc_exist_flag";

    /**
     * Column name
     */
    static final String KEY_PRESENCE_GEOLOC_LATITUDE = "presence_geoloc_latitude";

    /**
     * Column name
     */
    static final String KEY_PRESENCE_GEOLOC_LONGITUDE = "presence_geoloc_longitude";

    /**
     * Column name
     */
    static final String KEY_PRESENCE_GEOLOC_ALTITUDE = "presence_geoloc_altitude";

    /**
     * Column name
     */
    static final String KEY_PRESENCE_TIMESTAMP = "presence_timestamp";

    /**
     * Column name
     */
    static final String KEY_CAPABILITY_TIME_LAST_RQST = "capability_time_last_rqst";

    /**
     * Column name
     */
    static final String KEY_CAPABILITY_CS_VIDEO = "capability_cs_video";

    /**
     * Image sharing capability. Values: 1 (true), 0 (false)
     */
    static final String KEY_CAPABILITY_IMAGE_SHARING = CapabilitiesLog.CAPABILITY_IMAGE_SHARE;

    /**
     * Video sharing capability. Values: 1 (true), 0 (false)
     */
    static final String KEY_CAPABILITY_VIDEO_SHARING = CapabilitiesLog.CAPABILITY_VIDEO_SHARE;

    /**
     * IM/Chat capability. Values: 1 (true), 0 (false)
     */
    static final String KEY_CAPABILITY_IM_SESSION = CapabilitiesLog.CAPABILITY_IM_SESSION;

    /**
     * File transfer capability. Values: 1 (true), 0 (false)
     */
    static final String KEY_CAPABILITY_FILE_TRANSFER = CapabilitiesLog.CAPABILITY_FILE_TRANSFER;

    /**
     * Column name
     */
    static final String KEY_CAPABILITY_PRESENCE_DISCOVERY = "capability_presence_discovery";

    /**
     * Column name
     */
    static final String KEY_CAPABILITY_SOCIAL_PRESENCE = "capability_social_presence";

    /**
     * Geolocation push capability. Values: 1 (true), 0 (false)
     */
    static final String KEY_CAPABILITY_GEOLOCATION_PUSH = CapabilitiesLog.CAPABILITY_GEOLOC_PUSH;

    /**
     * Column name
     */
    static final String KEY_CAPABILITY_FILE_TRANSFER_HTTP = "capability_file_transfer_http";

    /**
     * Column name
     */
    static final String KEY_CAPABILITY_FILE_TRANSFER_THUMBNAIL = "capability_file_transfer_thumbnail";

    /**
     * Supported RCS extensions. List of features tags semicolon separated (e.g. <TAG1>;<TAG2>;
     * ;TAGn)
     */
    static final String KEY_CAPABILITY_EXTENSIONS = CapabilitiesLog.CAPABILITY_EXTENSIONS;

    /**
     * Column name
     */
    // TODO: Refer to Ipcall api here in future releases
    // static final String KEY_CAPABILITY_IP_VOICE_CALL = CapabilitiesLog.CAPABILITY_IP_VOICE_CALL;
    static final String KEY_CAPABILITY_IP_VOICE_CALL = "capability_ip_voice_call";

    /**
     * Column name
     */
    // TODO: Refer to Ipcall api here in future releases
    // static final String KEY_CAPABILITY_IP_VIDEO_CALL = CapabilitiesLog.CAPABILITY_IP_VIDEO_CALL;
    static final String KEY_CAPABILITY_IP_VIDEO_CALL = "capability_ip_video_call";

    /**
     * Column name
     */
    static final String KEY_CAPABILITY_GROUP_CHAT_SF = "capability_group_chat_sf";

    /**
     * Column name
     */
    static final String KEY_CAPABILITY_FILE_TRANSFER_SF = "capability_file_transfer_sf";

    /**
     * Is an automata. Values: 1 (true), 0 (false).
     */
    static final String KEY_AUTOMATA = CapabilitiesLog.AUTOMATA;

    /**
     * Timestamp of the last capability refresh
     */
    static final String KEY_CAPABILITY_TIME_LAST_REFRESH = CapabilitiesLog.TIMESTAMP;

    /**
     * TRUE value
     */
    public static final String TRUE_VALUE = Boolean.toString(true);

    /**
     * FALSE value
     */
    public static final String FALSE_VALUE = Boolean.toString(false);

    /**
     * Column name
     */
    static final String KEY_BLOCKING_TIMESTAMP = "blocking_timestamp";

    /**
     * Column name
     */
    static final String KEY_BLOCKED = "blocked";

    /**
     * BLOCKED value is not set
     */
    static final int BLOCKED_VALUE_NOT_SET = 0;

    /**
     * BLOCKED value is set
     */
    static final int BLOCKED_VALUE_SET = 1;

    /**
     * Aggregation data constants
     */
    public static final class AggregationData {
        /**
         * Database URI
         */
        static final Uri CONTENT_URI = Uri
                .parse("content://com.gsma.services.rcs.provider.capability/aggregation");

        /**
         * Column name
         */
        static final String KEY_ID = "_id";

        /**
         * Column name
         */
        static final String KEY_RCS_NUMBER = "rcs_number";

        /**
         * Column name
         */
        static final String KEY_RAW_CONTACT_ID = "raw_contact_id";

        /**
         * Column name
         */
        static final String KEY_RCS_RAW_CONTACT_ID = "rcs_raw_contact_id";
    }
}