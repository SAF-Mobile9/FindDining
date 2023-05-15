package com.saf9.mobile.find_dining.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    private Long userId;
    private Long storeId;
    @Column(columnDefinition = "varchar(50) COLLATE utf8_general_ci")
    private String imageAddress;
    private Long score;
    private Long date;
    private Long numComments;
    private Long liked;

    public Review(Long userId, Long storeId, String imageAddress, Long score, Long date, Long numComments, Long liked) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.storeId = storeId;
        this.imageAddress = imageAddress;
        this.score = score;
        this.date = date;
        this.numComments = numComments;
        this.liked = liked;
    }
}
