package com.saf9.mobile.find_dining.service;

import com.saf9.mobile.find_dining.dto.Image;
import com.saf9.mobile.find_dining.mapper.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImageServiceImpl implements ImageService{

    @Autowired
    private ImageMapper mapper;
    @Override
    public List<Image> getAllImages() {
        return mapper.getAllImages();
    }

    @Override
    public Image getImageById(Long id) {
        return mapper.getImageById(id);
    }

    @Override
    public void insertImage(Image image) {
        mapper.insertImage(image);
    }

    @Override
    public void updateImage(Image image) {
        mapper.updateImage(image);
    }

    @Override
    public void deleteImageById(Long id) {
        mapper.deleteImageById(id);
    }
}
