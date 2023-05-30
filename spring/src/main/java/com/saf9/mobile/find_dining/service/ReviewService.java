package com.saf9.mobile.find_dining.service;

import com.saf9.mobile.find_dining.dto.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews();
    Review getReviewById(Long id);
    void insertReview(Review review);
    void updateReview(Review review);
    void deleteReviewById(Long id);
}
