/* ---------------------------------------
 *            작성자   : 권지용
 *  ---------------------------------------*/
package com.example.sw_era.Controller;

import com.example.sw_era.DTO.PostWithComment;
import com.example.sw_era.Services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@Component
public class PostsController {

    private final PostService postService;

    @GetMapping(value = "/post/{post_id}", produces = "application/json")
    public PostWithComment postData(@PathVariable(name = "post_id") Long post_id) {
        return postService.getPostWithComment(post_id);
    }

    @PostMapping(value = "/post/create")
    public void createPost(@RequestBody HashMap<String, Object> post) {
        postService.createPost(post);
    }
}
