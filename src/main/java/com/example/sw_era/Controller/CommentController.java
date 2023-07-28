/* ---------------------------------------
*            작성자   : 권지용
*  ---------------------------------------*/
package com.example.sw_era.Controller;

import com.example.sw_era.Services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@Component
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/comment")
    public void addComment(@RequestBody HashMap<String, Object> comment) {
        commentService.addComment(comment);
    }
}
