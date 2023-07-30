/* ---------------------------------------
 *            작성자   : 권지용
 *  ---------------------------------------*/
package com.example.sw_era.Repository;

import com.example.sw_era.Domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface PostRepository extends JpaRepository<Post, Long> {
    @Modifying
    @Query(value = "INSERT INTO post (title, content, author) VALUES (:title, :content, :author)", nativeQuery = true)
    void insertPost(@Param("title") String title, @Param("content") String content, @Param("author") String author);
}