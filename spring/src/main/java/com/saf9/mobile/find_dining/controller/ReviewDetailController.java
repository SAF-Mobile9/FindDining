package com.saf9.mobile.find_dining.controller;

import com.saf9.mobile.find_dining.dto.ReviewDetail;
import com.saf9.mobile.find_dining.service.ReviewDetailService;
import com.saf9.mobile.find_dining.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/reviewDetail")
public class ReviewDetailController {

    @Autowired
    private ReviewDetailService service;

    public List<ReviewDetail> getAllReviewDetails() {
        return service.getAllReviewDetails();
    }
    public ReviewDetail getReviewDetailById(Long id) {
        return service.getReviewDetailById(id);
    }
    public void insertReviewDetail(ReviewDetail reviewDetail) {
        service.insertReviewDetail(reviewDetail);
    }
    public void updateReviewDetail(ReviewDetail reviewDetail) {
        service.updateReviewDetail(reviewDetail);
    }
    public void deleteReviewDetailById(Long id) {
        service.deleteReviewDetailById(id);
    }
}
