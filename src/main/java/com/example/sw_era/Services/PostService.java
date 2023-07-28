/* ---------------------------------------
 *            작성자   : 권지용
 *  ---------------------------------------*/
package com.example.sw_era.Services;

import com.example.sw_era.DTO.PostWithComment;
import com.example.sw_era.Domain.Comment;
import com.example.sw_era.Domain.Post;
import com.example.sw_era.Repository.CommentRepository;
import com.example.sw_era.Repository.PostRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PostService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public PostService(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    public PostWithComment getPostWithComment(Long postId) {
        Post post = postRepository.findById(postId).orElse(null);
        List<Comment> comments = commentRepository.findByPostId(postId);

        return new PostWithComment(post, comments);
    }
    @Transactional
    public void createPost(HashMap<String, Object> post_info) {
        postRepository.insertPost((String) post_info.get("title"), (String) post_info.get("author"), (String) post_info.get("content"));
    }
}
