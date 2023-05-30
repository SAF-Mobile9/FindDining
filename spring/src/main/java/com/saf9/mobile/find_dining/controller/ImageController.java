package com.saf9.mobile.find_dining.controller;

import com.saf9.mobile.find_dining.dto.Image;
import com.saf9.mobile.find_dining.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageController {

    @Autowired
    private ImageService service;

    @GetMapping
    public List<Image> getAllImages() {
        return service.getAllImages();
    }
    @GetMapping("/{id}")
    public Image getImageById(@PathVariable Long id) {
        return service.getImageById(id);
    }
    @PostMapping
    public void insertImage(@RequestBody Image image) {
        service.insertImage(image);
    }
    @PutMapping
    public void updateImage(@RequestBody Image image) {
        service.updateImage(image);
    }
    @DeleteMapping("/{id}")
    public void deleteImageById(@PathVariable Long id) {
        service.deleteImageById(id);
    }
}
