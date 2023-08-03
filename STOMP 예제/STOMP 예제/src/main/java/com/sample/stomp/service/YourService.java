package com.sample.stomp.service;

import com.sample.stomp.model.ChatMessage;
import com.sample.stomp.model.ChatMessageEntity;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Getter
@Service
public class YourService {
    private ChatMessage.MessageType type;
    private String roomId;
    private String sender;
    private String message;
    private LocalDateTime sentTime;
    private final ChatService chatService;

    @Autowired
    public YourService(ChatService chatService) {
        this.chatService = chatService;
    }


    public void someMethod() {

        ChatMessageEntity chatMessageEntity=new ChatMessageEntity();
        // 데이터 불러오기
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setType(chatMessageEntity.getType());
        chatMessage.setRoomId(chatMessageEntity.getRoomId());
        chatMessage.setSender(chatMessageEntity.getSender());
        chatMessage.setMessage(chatMessageEntity.getMessage());
        chatMessage.setSentTime(chatMessageEntity.getSentTime());;

        // 데이터 저장
        chatService.saveChatMessage(chatMessage);
    }
}

