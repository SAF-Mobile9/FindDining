package com.saf9.mobile.find_dining.mapper;

import com.saf9.mobile.find_dining.dto.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ReviewMapper {
    List<Review> getAllReviews();
    Review getReviewById(Long id);
    void insertReview(Review review);
    void updateReview(Review review);
    void deleteReviewById(Long id);

}
