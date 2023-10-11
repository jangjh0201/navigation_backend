package com.goorm.navigation.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
public class NodeInfo {
    private List<Vertex> nodes;

    @Builder
    public NodeInfo() {
        nodes = new ArrayList<>();
        nodes.add(0, new Vertex("v1", -6.6, 3));
        nodes.add(1, new Vertex("v2", -5.2, 3));
        nodes.add(2, new Vertex("v3", -2.1, 2.3));
        nodes.add(3, new Vertex("v4", 0.8, 2.3));
        nodes.add(4, new Vertex("v5", 9, 4));
        nodes.add(5, new Vertex("v6", -4.7, 0.3));
        nodes.add(6, new Vertex("v7", 1, 0));
        nodes.add(7, new Vertex("v8", -1.9, -1.1));
        nodes.add(8, new Vertex("v9", -3.3, -2.5));
        nodes.add(9, new Vertex("v10", 1, -2.4));
        nodes.add(10, new Vertex("v11", 3.5, -2));
        nodes.add(11, new Vertex("v12", 7.8, -2.2));
        nodes.add(12, new Vertex("v13", -8.4, -3.3));
        nodes.add(13, new Vertex("v14", 7.5, -4));
    }
}
