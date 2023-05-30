package com.saf9.mobile.find_dining.dto;

import lombok.Getter;

@Getter
public class ReviewDetail {

    private Long review_detail_id;

    private Long review_id;
    private String comment;
    private String food_type;

    public ReviewDetail(Long review_id, String comment, String food_type) {
        this.review_id = review_id;
        this.comment = comment;
        this.food_type = food_type;
    }
}
