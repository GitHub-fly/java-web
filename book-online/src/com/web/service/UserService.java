package com.web.service;

import com.web.entity.User;
import com.web.util.Md5Util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xunmi
 * @ClassName UserService
 * @Description 用户相关业务逻辑类
 * @Date 2019/9/27
 * @Version 1.0
 **/
public class UserService {

    private List<User> userList;

    public UserService() {
        init();
    }

    /**
     * 数据初始化方法
     */
    public List<User> init() {
        userList = new ArrayList<User>(3);
        User[] users = {
                new User(1, "123", "202cb962ac59075b964b07152d234b70", "开到荼蘼", "1.jpg", "江苏南京", LocalDate.of(2019, 1, 10)),
                new User(2, "456", "250cf8b51c773f3f8dc8b4be867a9a02", "小幸运", "2.jpg", "浙江杭州", LocalDate.of(2019, 2, 20)),
                new User(3, "789", "68053af2923e00204c3ca7c6a3150cf7", "往后余生", "3.jpg", "湖北武汉", LocalDate.of(2019, 5, 20))
        };
        userList = Arrays.asList(users);
        return userList;
    }


    public User signIn(String account, String password){
        for (User user : userList) {
            if (user.getAccount().equals(account) && user.getPassword().equals(Md5Util.crypt(password))) {
                return user;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        User user = new UserService().signIn("12d3", "123");
        System.out.println(user);
    }
}
