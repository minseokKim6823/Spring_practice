package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private String tags;
    private Integer like_count;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.id=entity.getId();
        this.title=entity.getTitle();
        this.author=entity.getAuthor();
        this.tags=entity.getTags();
        this.like_count=entity.getLike_count();
        this.modifiedDate=entity.getModifiedDate();
    }
}
