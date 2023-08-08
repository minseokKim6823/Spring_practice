package com.jojoldu.book.springboot.domain.posts;
import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import com.jojoldu.book.springboot.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false )
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    private String author;
    private String tags;

    @Column(name = "like_count")
    private Integer like_count;

    @Builder
    public Posts(String title, String content, String author, String tags, Integer like_count){
        this.title = title;
        this.content = content;
        this.author = author;
        this.tags = tags;
        this.like_count=like_count;
    }
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
        this.tags = tags;
    }
}
