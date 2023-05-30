package com.saf9.mobile.find_dining.mapper;

import com.saf9.mobile.find_dining.dto.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface CommentMapper {
    List<Comment> getAllComments();
    Comment getCommentById(Long id);
    void insertComment(Comment comment);
    void updateComment(Comment comment);
    void deleteCommentById(Long id);
}
