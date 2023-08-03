package com.sample.stomp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {

    public enum MessageType {
        ENTER, TALK, TEXT
    }

    private MessageType type;
    //채팅방 ID
    private String roomId;
    //보내는 사람
    private String sender;
    //내용
    private String message;
    // 날짜와 시간 정보
    private LocalDateTime sentTime;

    private String formattedSentTime;
    @JsonIgnore
    public LocalDateTime getSentTime() {
        return sentTime;
    }
    public ChatMessageEntity toEntity() {
        return new ChatMessageEntity();
    }
}
