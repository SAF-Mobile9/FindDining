package com.saf9.mobile.find_dining.mapper;

import com.saf9.mobile.find_dining.dto.Image;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ImageMapper {
    List<Image> getAllImages();
    Image getImageById(Long id);
    void insertImage(Image image);
    void updateImage(Image image);
    void deleteImageById(Long id);
}
