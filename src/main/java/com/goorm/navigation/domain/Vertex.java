package com.goorm.navigation.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Vertex {

    private double x;

    private double y;

    @Builder
    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
