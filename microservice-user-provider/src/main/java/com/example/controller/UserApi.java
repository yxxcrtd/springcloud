package com.example.controller;

import static com.example.utils.JsonResult.jsonResultSuccess;

import com.example.service.AlbumService;
import com.example.utils.JsonResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class UserApi {

    @Autowired
    private AlbumService albumService;

    @GetMapping("{id}")
    JsonResult<Object> findById(@PathVariable String id) {
        return jsonResultSuccess("Provider 0 ->", albumService.findById(id));
    }

}
