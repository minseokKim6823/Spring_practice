package com.jojoldu.book.springboot.web.dto;
import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;
    private Integer like_count = 0;


    @Builder
    public PostsSaveRequestDto(String title, String content, String author, Integer like_count){
        this.title=title;
        this.content=content;
        this.author=author;
        this.like_count=like_count;
    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .like_count(like_count)
                .build();
    }
}
