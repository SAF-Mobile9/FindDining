package com.saf9.mobile.find_dining.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    private Long userId;
    private Long reviewDetailId;
    private String content;
    private Long date;

    public Comment(Long userId, Long reviewDetailId, String content, Long date) {
        this.userId = userId;
        this.reviewDetailId = reviewDetailId;
        this.content = content;
        this.date = date;
    }
}
