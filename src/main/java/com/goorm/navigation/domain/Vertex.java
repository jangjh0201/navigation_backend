package com.goorm.navigation.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Vertex {

    private String name;

    private double x;

    private double y;

    @Builder
    public Vertex(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
}
