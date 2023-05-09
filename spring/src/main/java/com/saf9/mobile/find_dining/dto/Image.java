package com.saf9.mobile.find_dining.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageId;

    private Long reviewId;
    @Column(columnDefinition = "varchar(50) COLLATE utf8_general_ci")
    private String imageLink;

    public Image(Long reviewId, String imageLink) {
        this.reviewId = reviewId;
        this.imageLink = imageLink;
    }
}
