package com.saf9.mobile.find_dining.service;

import com.saf9.mobile.find_dining.dto.ReviewDetail;

import java.util.List;

public interface ReviewDetailService {
    List<ReviewDetail> getAllReviewDetails();
    ReviewDetail getReviewDetailById(Long id);
    void insertReviewDetail(ReviewDetail reviewDetail);
    void updateReviewDetail(ReviewDetail reviewDetail);
    void deleteReviewDetailById(Long id);
}
