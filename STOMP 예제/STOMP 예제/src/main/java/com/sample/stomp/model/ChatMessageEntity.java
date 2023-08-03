package com.sample.stomp.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "chat_message")
public class ChatMessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "message_id", columnDefinition = "BINARY(16)")
    private UUID messageId;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private ChatMessage.MessageType type;

    @Column(name = "room_id")
    private String roomId;

    @Column(name = "sender")
    private String sender;

    @Column(name = "message")
    private String message;

    @Column(name = "sent_time")
    private LocalDateTime sentTime;

    public ChatMessageEntity(ChatMessage chatMessage) {
        this.type = chatMessage.getType();
        this.roomId = chatMessage.getRoomId();
        this.sender = chatMessage.getSender();
        this.message = chatMessage.getMessage();
        this.sentTime = chatMessage.getSentTime();
    }
}
