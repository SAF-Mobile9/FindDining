package com.saf9.mobile.find_dining.controller;

import com.saf9.mobile.find_dining.dto.Comment;
import com.saf9.mobile.find_dining.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
public class CommentController {

    private final CommentRepository commentRepository;

    @PostMapping("/comment")
    public String createComment(@RequestBody Comment comment) {
        commentRepository.save(comment);
        return "form";
    }

    @ResponseBody
    @GetMapping("/comment/{id}")
    public Optional<Comment> readComment(@PathVariable("id") Long id) {
        return commentRepository.findById(id);
    }

    @PutMapping("/comment/")
    public String updateComment(@RequestBody Comment comment) {
        commentRepository.save(comment);
        return "form";
    }

    @DeleteMapping("/comment/{id}")
    public String deleteComment(@PathVariable("id") Long id) {
        commentRepository.deleteById(id);
        return "form";
    }
}
