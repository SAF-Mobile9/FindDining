package com.saf9.mobile.find_dining.service;

import com.saf9.mobile.find_dining.dto.Review;
import com.saf9.mobile.find_dining.mapper.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    private ReviewMapper mapper;

    @Override
    public List<Review> getAllReviews() {
        return mapper.getAllReviews();
    }

    @Override
    public Review getReviewById(Long id) {
        return mapper.getReviewById(id);
    }

    @Override
    public void insertReview(Review review) {
        mapper.insertReview(review);
    }

    @Override
    public void updateReview(Review review) {
        mapper.updateReview(review);
    }

    @Override
    public void deleteReviewById(Long id) {
        mapper.deleteReviewById(id);
    }
}
