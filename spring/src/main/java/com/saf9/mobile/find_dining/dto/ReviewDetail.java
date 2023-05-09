package com.saf9.mobile.find_dining.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewDetail {

    @Id
    @GeneratedValue
    private Long reviewDetailId;

    private Long reviewId;
    private String comment;
    private String foodType;

    public ReviewDetail(Long reviewId, String comment, String foodType) {
        this.reviewId = reviewId;
        this.comment = comment;
        this.foodType = foodType;
    }
}
