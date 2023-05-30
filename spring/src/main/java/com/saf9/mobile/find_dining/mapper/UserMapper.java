package com.saf9.mobile.find_dining.mapper;

import com.saf9.mobile.find_dining.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> getAllUsers();
    User getUserById(Long id);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUserById(Long id);
}
