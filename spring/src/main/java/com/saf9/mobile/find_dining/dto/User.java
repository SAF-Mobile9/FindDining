package com.saf9.mobile.find_dining.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue
    private Long userId;

    private String nickName;
    private String phone;
    private String address;
    private Long getLiked;

    public User(String nickName, String phone, String address, Long getLiked) {
        this.nickName = nickName;
        this.phone = phone;
        this.address = address;
        this.getLiked = getLiked;
    }
}
