package com.web.entity;

/**
 * @author xunmi
 * @ClassName User
 * @Description 学生实体类
 * @Date 2019/9/27
 * @Version 1.0
 **/
public class User {

    private  String account;
    private String password;
    private String nickname;
    private String avatar;

    public User() {

    }

    public User(String account, String password, String nickname, String avatar) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.avatar = avatar;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }

}
