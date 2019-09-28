package com.web.service;

import com.web.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xunmi
 * @ClassName BookService
 * @Description 图书业务逻辑类
 * @Date 2019/9/27
 * @Version 1.0
 **/
public class BookService {

    private static List<Book> bookList;

    public static List<Book> init() {
        bookList = new ArrayList<Book>(10);
        Book[] books = {
                new Book(1, "漫长的婚约", "book1.jpg", "[法]塞巴斯蒂安"),
                new Book(2, "庸人自扰", "book2.jpg", "[英]戴伦•麦加维"),
                new Book(3, "绿山墙的安妮", "book3.jpg", "[美]理查德·耶茨"),
                new Book(4, "敌人与邻居", "book4.jpg", "[英]伊恩·布莱克"),
                new Book(5, "哀伤纪", "book5.jpg", "钟晓阳"),
                new Book(6, "南渡君臣", "book6.jpg", "虞云国"),
                new Book(7, "沉睡着", "book7.jpg", "[墨] 罗多尔弗"),
                new Book(8, "杜尚", "book8.jpg", "[美]卡尔文·汤"),
                new Book(9, "町火箭", "book9.jpg", "[日]池井户润"),
                new Book(10, "军事密码", "book10.jpg", "郭建龙")
        };
        bookList = Arrays.asList(books);
        return bookList;
    }
}
