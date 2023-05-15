package com.saf9.mobile.find_dining.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(columnDefinition = "varchar(50) COLLATE utf8_general_ci")
    private String nickName;
    @Column(columnDefinition = "varchar(50) COLLATE utf8_general_ci")
    private String phone;
    @Column(columnDefinition = "varchar(50) COLLATE utf8_general_ci")
    private String address;
    private Long getLiked;

    public User(String nickName, String phone, String address, Long getLiked) {
        this.nickName = nickName;
        this.phone = phone;
        this.address = address;
        this.getLiked = getLiked;
    }
}
