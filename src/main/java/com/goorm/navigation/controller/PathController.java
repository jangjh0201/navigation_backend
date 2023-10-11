package com.goorm.navigation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goorm.navigation.service.PathService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/navigation")
public class PathController {

    private final PathService pathService;

    @GetMapping("/")
    public List<String> findPaths() {

        List<String> s = new ArrayList<>();
        return null;
    }
}
