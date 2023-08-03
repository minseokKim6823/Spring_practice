package com.sample.stomp;

import com.sample.stomp.model.ChatMessage;
import com.sample.stomp.model.ChatMessageEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StompApplication { // http://localhost:8081/chat/room으로 입장

    public static void main(String[] args) {
        //ChatMessage chatMessage=new ChatMessage();
        //ChatMessageEntity chatMessageEntity = new ChatMessageEntity();

        SpringApplication.run(StompApplication.class, args);
        //System.out.println(chatMessageEntity.getMessage());
        //System.out.println(chatMessage.getMessage());
    }

}
