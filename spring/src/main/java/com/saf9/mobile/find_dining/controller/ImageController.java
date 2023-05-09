package com.saf9.mobile.find_dining.controller;

import com.saf9.mobile.find_dining.dto.Image;
import com.saf9.mobile.find_dining.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
public class ImageController {
    private final ImageRepository imageRepository;

    @PostMapping("/image")
    public String createImage(@RequestBody Image image) {
        imageRepository.save(image);
        return "form";
    }

    @ResponseBody
    @GetMapping("/image/{id}")
    public Optional<Image> readImage(@PathVariable("id") Long id) {
        return imageRepository.findById(id);
    }

    @PutMapping("/image/")
    public String updateImage(@RequestBody Image image) {
        imageRepository.save(image);
        return "form";
    }

    @DeleteMapping("/image/{id}")
    public String deleteImage(@PathVariable("id") Long id) {
        imageRepository.deleteById(id);
        return "form";
    }
}
