package com.saf9.mobile.find_dining.service;

import com.saf9.mobile.find_dining.dto.Image;

import java.util.List;

public interface ImageService {
    List<Image> getAllImages();
    Image getImageById(Long id);
    void insertImage(Image image);
    void updateImage(Image image);
    void deleteImageById(Long id);
}
