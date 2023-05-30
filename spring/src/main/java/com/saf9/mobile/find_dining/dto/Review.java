package com.saf9.mobile.find_dining.dto;

import lombok.Getter;


@Getter
public class Review {

    private Long review_id;

    private Long user_id;
    private Long store_id;
    private String image_address;
    private Long score;
    private Long date;
    private Long num_comments;
    private Long liked;

    public Review(Long user_id, Long store_id, String image_address, Long score, Long date, Long num_comments, Long liked) {
        this.user_id = user_id;
        this.store_id = store_id;
        this.image_address = image_address;
        this.score = score;
        this.date = date;
        this.num_comments = num_comments;
        this.liked = liked;
    }
}
