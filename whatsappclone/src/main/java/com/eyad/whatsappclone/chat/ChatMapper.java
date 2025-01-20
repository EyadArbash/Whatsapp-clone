package com.eyad.whatsappclone.chat;

import org.springframework.stereotype.Service;

@Service
public class ChatMapper {
    public ChatResponse toChatResponse(Chat c, String userId) {
        return ChatResponse.builder()
                .id(c.getId())
                .name(c.getChatName(userId))
                .lastMessage(c.getLastMessage())
                .isRecipientOnline(c.getRecipient().isUserOnline())
                .senderId(c.getSender().getId())
                .recipientId(c.getRecipient().getId())
                .lastMessageTime(c.getLastMessageTime())
                .build();
    }
}
