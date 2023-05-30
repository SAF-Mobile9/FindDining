package com.saf9.mobile.find_dining.service;

import com.saf9.mobile.find_dining.dto.Comment;
import com.saf9.mobile.find_dining.mapper.CommentMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper mapper;

    @Override
    public List<Comment> getAllComments() {
        return mapper.getAllComments();
    }

    @Override
    public Comment getCommentById(Long id) {
        return mapper.getCommentById(id);
    }

    @Override
    public void insertComment(Comment comment) {
        mapper.insertComment(comment);
    }

    @Override
    public void updateComment(Comment comment) {
        mapper.updateComment(comment);
    }

    @Override
    public void deleteCommentById(Long id) {
        mapper.deleteCommentById(id);
    }
}
