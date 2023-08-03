package com.sample.stomp.Repository;

import com.sample.stomp.model.ChatMessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.UUID;

public interface ChatMessageRepository extends JpaRepository<ChatMessageEntity, Integer> {
    List<ChatMessageEntity> findAllByRoomId(String roomId);
    //'roomId'로 채팅 메시지를 검색하기위한
}