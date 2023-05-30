package com.saf9.mobile.find_dining.controller;

import com.saf9.mobile.find_dining.dto.Review;
import com.saf9.mobile.find_dining.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private ReviewService service;

    @GetMapping
    public List<Review> getAllReviews() {
        return service.getAllReviews();
    }
    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable Long id) {
        return service.getReviewById(id);
    }
    @PostMapping
    public void insertReview(@RequestBody Review review) {
        service.insertReview(review);
    }
    @PutMapping
    public void updateReview(@RequestBody Review review) {
        service.updateReview(review);
    }
    @DeleteMapping("/{id}")
    public void deleteReviewById(@PathVariable Long id) {
        service.deleteReviewById(id);
    }

}
