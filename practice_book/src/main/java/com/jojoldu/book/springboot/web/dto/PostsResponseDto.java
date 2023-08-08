package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import com.jojoldu.book.springboot.domain.user.User;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private String tags;
    private Integer like_count;

    public PostsResponseDto(Posts entity){
        this.id= entity.getId();
        this.title=entity.getTitle();
        this.content=entity.getContent();
        this.author=entity.getAuthor();
        this.tags=entity.getTags();
        this.like_count=entity.getLike_count();
    }

}
