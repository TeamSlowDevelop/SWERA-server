/* ---------------------------------------
 *            작성자   : 권지용
 *  ---------------------------------------*/
package com.example.sw_era.Repository;

import com.example.sw_era.Domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query(value = "SELECT * FROM comments WHERE post_id = :post_id", nativeQuery = true)
    List<Comment> findByPostId(@Param("post_id") Long post_id);

    @Modifying
    @Query(value = "INSERT INTO comments (post_id, comment_text, commenter_name) VALUES (:post_id, :comment_text, :commenter_name)", nativeQuery = true)
    void addComment(@Param("post_id") Long post_id, @Param("comment_text") String comment_text, @Param("commenter_name") String commenter_name);
}
