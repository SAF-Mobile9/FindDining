package com.saf9.mobile.find_dining.controller;

import com.saf9.mobile.find_dining.dto.Contents;
import com.saf9.mobile.find_dining.repository.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class HomeController {

    private final ContentsRepository contentsRepository;
    private final ImageRepository imageRepository;
    private final ReviewRepository reviewRepository;
    private final ReviewDetailRepository reviewDetailRepository;
    private final UserRepository userRepository;


    @GetMapping("/")
    public String home() {
        return "form";
    }

    @PostMapping("/")
    public String form(@ModelAttribute ContentRequest content) {
        contentsRepository.save(new Contents(content.getContent()));
        return "redirect:/";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Contents> contents = new ArrayList<>();
        Iterable<Contents> contentsIterable = contentsRepository.findAll();
        contentsIterable.forEach(contents::add);

        model.addAttribute("contents", contents);
        return "list";
    }

    @Data
    @AllArgsConstructor
    static class ContentRequest{
        private String content;
    }

}