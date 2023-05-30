package com.saf9.mobile.find_dining.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
public class Comment {
    private Long comment_id;

    private Long user_id;
    private Long review_detail_id;
    private String content;
    private Long date;

    public Comment(Long user_id, Long review_detail_id, String content, Long date) {
        this.user_id = user_id;
        this.review_detail_id = review_detail_id;
        this.content = content;
        this.date = date;
    }
}
