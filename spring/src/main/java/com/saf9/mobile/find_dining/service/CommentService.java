package com.saf9.mobile.find_dining.service;

import com.saf9.mobile.find_dining.dto.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getAllComments();
    Comment getCommentById(Long id);
    void insertComment(Comment comment);
    void updateComment(Comment comment);
    void deleteCommentById(Long id);
}
