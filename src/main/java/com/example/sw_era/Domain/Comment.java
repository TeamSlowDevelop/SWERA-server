/* ---------------------------------------
 *            작성자   : 권지용
 *  ---------------------------------------*/
package com.example.sw_era.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "post_id", nullable = false)
    private Long post_id;

    @Column(name = "comment_text", nullable = false)
    private String comment_text;

    @Column(name = "commenter_name", nullable = false)
    private String commenter_name;

    @Column(name = "comment_date", nullable = false)
    private LocalDateTime comment_date;
}
