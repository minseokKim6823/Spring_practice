package com.example.chatapp;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@Setter
@Getter
public class Chat {

    private String id;
    private String msg;
    private String sender;
    private String receiver;

    private LocalDateTime createdAt;
}
