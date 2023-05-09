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
public class Image {

    @Id
    @GeneratedValue
    private Long imageId;

    private Long reviewId;
    private String imageLink;

    public Image(Long reviewId, String imageLink) {
        this.reviewId = reviewId;
        this.imageLink = imageLink;
    }
}
