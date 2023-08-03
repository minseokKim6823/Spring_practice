package com.sample.stomp.service;

import com.sample.stomp.Repository.ChatMessageRepository;
import com.sample.stomp.model.ChatMessage;
import com.sample.stomp.model.ChatMessageEntity;
import com.sample.stomp.model.ChatRoom;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
@Slf4j

public class ChatService {

    private Map<String, ChatRoom> chatRooms;
    private final ChatMessageRepository chatMessageRepository;

    @Autowired
    public ChatService(ChatMessageRepository chatMessageRepository) {
        this.chatMessageRepository = chatMessageRepository;
    }


    public void saveChatMessage(ChatMessage chatMessage) {
        ChatMessageEntity entity = chatMessage.toEntity();
        chatMessageRepository.save(entity);
    }
    @PostConstruct
    //의존관게 주입완료되면 실행되는 코드
    private void init() {
        chatRooms = new LinkedHashMap<>();
    }


    //채팅방 불러오기
    public List<ChatRoom> findAllRoom() {
        //채팅방 최근 생성 순으로 반환
        List<ChatRoom> result = new ArrayList<>(chatRooms.values());
        Collections.reverse(result);

        return result;
    }

    //채팅방 하나 불러오기
    public ChatRoom findById(String roomId) {
        return chatRooms.get(roomId);
    }

    //채팅방 생성
    public ChatRoom createRoom(String name) {
        ChatRoom chatRoom = ChatRoom.create(name);
        chatRooms.put(chatRoom.getRoomId(), chatRoom);
        return chatRoom;
    }


}
