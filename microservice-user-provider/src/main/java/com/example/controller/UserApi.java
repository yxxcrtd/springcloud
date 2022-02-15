package com.example.controller;

import com.example.service.AlbumService;
import com.example.utils.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static com.example.utils.JsonResult.jsonResultSuccess;

@RestController
@RequestMapping("api/user")
public class UserApi {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AlbumService albumService;

    @GetMapping("{id}")
    JsonResult<Object> findById(@PathVariable Long id, HttpServletRequest request) {
        logger.info("这是 Provider 0 === abc 123456 ===", request.getHeader("X-B3-TraceId"), request.getHeader("X-B3-SpanId"));

        return jsonResultSuccess("Provider 0 ->", albumService.findById(id));
    }

}
