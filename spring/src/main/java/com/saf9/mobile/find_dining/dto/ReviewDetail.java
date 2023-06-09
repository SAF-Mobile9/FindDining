package com.saf9.mobile.find_dining.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewDetailId;

    private Long reviewId;
    @Column(columnDefinition = "varchar(50) COLLATE utf8_general_ci")
    private String comment;
    @Column(columnDefinition = "varchar(50) COLLATE utf8_general_ci")
    private String foodType;

    public ReviewDetail(Long reviewId, String comment, String foodType) {
        this.reviewId = reviewId;
        this.comment = comment;
        this.foodType = foodType;
    }
}
