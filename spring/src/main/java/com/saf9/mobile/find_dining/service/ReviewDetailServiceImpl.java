package com.saf9.mobile.find_dining.service;

import com.saf9.mobile.find_dining.dto.ReviewDetail;
import com.saf9.mobile.find_dining.mapper.ReviewDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewDetailServiceImpl implements ReviewDetailService{

    @Autowired
    private ReviewDetailMapper mapper;

    @Override
    public List<ReviewDetail> getAllReviewDetails() {
        return mapper.getAllReviewDetails();
    }

    @Override
    public ReviewDetail getReviewDetailById(Long id) {
        return mapper.getReviewDetailById(id);
    }

    @Override
    public void insertReviewDetail(ReviewDetail reviewDetail) {
        mapper.insertReviewDetail(reviewDetail);
    }

    @Override
    public void updateReviewDetail(ReviewDetail reviewDetail) {
        mapper.updateReviewDetail(reviewDetail);
    }

    @Override
    public void deleteReviewDetailById(Long id) {
        mapper.deleteReviewDetailById(id);
    }
}
