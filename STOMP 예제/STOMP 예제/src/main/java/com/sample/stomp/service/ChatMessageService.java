package com.sample.stomp.service;

import com.sample.stomp.Repository.ChatMessageRepository;
import com.sample.stomp.model.ChatMessage;
import com.sample.stomp.model.ChatMessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ChatMessageService {
    private final ChatMessageRepository chatMessageRepository;

    @Autowired
    public ChatMessageService(ChatMessageRepository chatMessageRepository) {
        this.chatMessageRepository = chatMessageRepository;
    }
    @Transactional
    public void saveChatMessage(ChatMessage chatMessage) {
        // ChatMessageEntity 생성
        ChatMessageEntity chatMessageEntity = chatMessage.toEntity();

        // ChatMessageEntity를 DB에 저장
        chatMessageRepository.save(chatMessageEntity);
    }
}
