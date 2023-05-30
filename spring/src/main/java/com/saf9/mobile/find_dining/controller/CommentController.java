package com.saf9.mobile.find_dining.controller;

import com.saf9.mobile.find_dining.dto.Comment;
import com.saf9.mobile.find_dining.service.CommentService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService service;

    @GetMapping
    public List<Comment> getAllComments() {
        return service.getAllComments();
    }

    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable Long id) {
        return service.getCommentById(id);
    }
    @PostMapping
    public void insertComment(@RequestBody Comment comment) {
        service.insertComment(comment);
    }
    @PutMapping
    public void updateComment(@RequestBody Comment comment) {
        service.updateComment(comment);
    }
    @DeleteMapping("/{id}")
    public void deleteCommentById(@PathVariable Long id) {
        service.deleteCommentById(id);
    }
}
