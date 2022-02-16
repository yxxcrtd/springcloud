package com.example.service.impl;

import com.example.service.AlbumService;

import org.springframework.stereotype.Service;


@Service
public class AlbumServiceImpl implements AlbumService {

    @Override
    public String findById(String id) {
        System.out.println("============ 这是 provider 打印结果 =================");
        return "1234567";
    }

}
