package com.saf9.mobile.find_dining.dto;

import lombok.Getter;


@Getter
public class Image {

    private Long image_id;

    private Long review_id;
    private String image_link;

    public Image(Long review_id, String image_link) {
        this.review_id = review_id;
        this.image_link = image_link;
    }
}
