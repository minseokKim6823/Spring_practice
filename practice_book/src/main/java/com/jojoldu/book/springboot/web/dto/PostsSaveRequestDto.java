package com.jojoldu.book.springboot.web.dto;
import com.jojoldu.book.springboot.config.auth.LoginUser;
import com.jojoldu.book.springboot.config.auth.dto.SessionUser;
import com.jojoldu.book.springboot.domain.posts.Posts;
import com.jojoldu.book.springboot.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {
        if (user != null) {
            model.addAttribute("userName", user.getName());
            model.addAttribute("author", user.getName()); // 세션에서 가져온 사용자 이름을 author 변수에 추가
            //String name = user.getName(); // 세션에서 가져온 사용자 이름을 t 변수에 할당
            //this.author = name;
        }
        return "index";

    }
    private String title;
    private String content;
    private String author;
    private String tags;
    private Integer like_count = 0;


    @Builder
    public PostsSaveRequestDto(String title, String content, String tags, Integer like_count){
        this.title=title;
        this.content=content;
        this.tags=tags;
        this.like_count=like_count;
    }

    public Posts toEntity(SessionUser user){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(user.getName())
                .tags(tags)
                .like_count(like_count)
                .build();
    }
}
