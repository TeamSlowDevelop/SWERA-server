/* ---------------------------------------
 *            작성자   : 권지용
 *  ---------------------------------------*/
package com.example.sw_era.DTO;

import com.example.sw_era.Domain.Comment;
import com.example.sw_era.Domain.Post;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PostWithComment {
    private Post post;
    private List<Comment> comments;

    public PostWithComment(Post post, List<Comment> comments) {
        this.post = post;
        this.comments = comments;
    }
}
