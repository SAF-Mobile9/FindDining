package com.saf9.mobile.find_dining.dto;

import lombok.Getter;
@Getter
public class User {

    private Long user_id;

    private String nick_name;
    private String phone;
    private String address;
    private Long get_liked;

    public User(String nick_name, String phone, String address, Long get_liked) {
        this.nick_name = nick_name;
        this.phone = phone;
        this.address = address;
        this.get_liked = get_liked;
    }
}
