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

package com.gsma.rcs.core.ims.service.im.chat;

import com.gsma.rcs.core.ims.service.ImsSessionListener;
import com.gsma.rcs.core.ims.service.im.chat.imdn.ImdnDocument;
import com.gsma.services.rcs.contact.ContactId;

/**
 * Chat session listener
 * 
 * @author Jean-Marc AUFFRET
 */
public interface ChatSessionListener extends ImsSessionListener {
    /**
     * New message received
     * 
     * @param msg Chat message
     * @param imdnDisplayedRequested Indicates whether display notification is requested
     */
    public void handleReceiveMessage(ChatMessage msg, boolean imdnDisplayedRequested);

    /**
     * IM error
     * 
     * @param error Error
     * @param message
     */
    public void handleImError(ChatError error, ChatMessage message);

    /**
     * Is composing event
     * 
     * @param contact Contact identifier
     * @param status Status
     */
    public void handleIsComposingEvent(ContactId contact, boolean status);

    /**
     * Notifying that a message has been sent
     * 
     * @param msgId Message ID
     * @param mimeType MIME type
     */
    public void handleMessageSent(String msgId, String mimeType);

    /**
     * Notifying failure of sending message
     * 
     * @param msgId Message ID
     * @param mimeType MIME type
     */
    public void handleMessageFailedSend(String msgId, String mimeType);

    /**
     * New message delivery status that are received as part of imdn notification
     * 
     * @param contact the remote contact identifier
     * @param ImdnDocument imdn Imdn document
     */
    public void handleMessageDeliveryStatus(ContactId contact, ImdnDocument imdn);
}