/* ---------------------------------------
 *            작성자   : 권지용
 *  ---------------------------------------*/
package com.example.sw_era.Services;

import com.example.sw_era.Repository.CommentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    @Transactional
    public void addComment(HashMap<String, Object> comment) {
        commentRepository.addComment(Long.valueOf(comment.get("post_id").toString()), (String) comment.get("comment_text"), (String) comment.get("commenter_name"));
    }
}
