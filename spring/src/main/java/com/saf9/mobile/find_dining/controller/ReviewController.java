package com.saf9.mobile.find_dining.controller;

import com.saf9.mobile.find_dining.dto.Review;
import com.saf9.mobile.find_dining.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
public class ReviewController {
    private final ReviewRepository reviewRepository;

    @PostMapping("/review")
    public String createReview(@RequestBody Review review) {
        reviewRepository.save(review);
        return "form";
    }

    @ResponseBody
    @GetMapping("/review/{id}")
    public Optional<Review> readReview(@PathVariable("id") Long id) {
        return reviewRepository.findById(id);
    }

    @PutMapping("/review/")
    public String updateReview(@RequestBody Review review) {
        reviewRepository.save(review);
        return "form";
    }

    @DeleteMapping("/review/{id}")
    public String deleteReview(@PathVariable("id") Long id) {
        reviewRepository.deleteById(id);
        return "form";
    }
}
