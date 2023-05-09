package com.saf9.mobile.find_dining.controller;

import com.saf9.mobile.find_dining.dto.ReviewDetail;
import com.saf9.mobile.find_dining.repository.ReviewDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
public class ReviewDetailController {
    private final ReviewDetailRepository reviewDetailRepository;

    @PostMapping("/reviewDetail")
    public String createReviewDetail(@RequestBody ReviewDetail reviewDetail) {
        reviewDetailRepository.save(reviewDetail);
        return "form";
    }

    @ResponseBody
    @GetMapping("/reviewDetail/{id}")
    public Optional<ReviewDetail> readReviewDetail(@PathVariable("id") Long id) {
        return reviewDetailRepository.findById(id);
    }

    @PutMapping("/reviewDetail/")
    public String updateReviewDetail(@RequestBody ReviewDetail reviewDetail) {
        reviewDetailRepository.save(reviewDetail);
        return "form";
    }

    @DeleteMapping("/reviewDetail/{id}")
    public String deleteReviewDetail(@PathVariable("id") Long id) {
        reviewDetailRepository.deleteById(id);
        return "form";
    }
}
