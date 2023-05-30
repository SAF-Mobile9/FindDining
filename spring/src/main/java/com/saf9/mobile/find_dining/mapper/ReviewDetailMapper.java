package com.saf9.mobile.find_dining.mapper;

import com.saf9.mobile.find_dining.dto.Comment;
import com.saf9.mobile.find_dining.dto.ReviewDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ReviewDetailMapper {
    List<ReviewDetail> getAllReviewDetails();
    ReviewDetail getReviewDetailById(Long id);
    void insertReviewDetail(ReviewDetail reviewDetail);
    void updateReviewDetail(ReviewDetail reviewDetail);
    void deleteReviewDetailById(Long id);
}
