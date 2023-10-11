package com.goorm.navigation.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;
import org.junit.jupiter.api.Test;

import com.goorm.navigation.domain.Vertex;

public class PathServiceTest {
    @Test
    public void getShortestPath() {
        WeightedMultigraph<Integer, DefaultWeightedEdge> graph = new WeightedMultigraph<>(DefaultWeightedEdge.class);

        HashMap<Integer, Vertex> map = new HashMap<>();
        map.put(1, new Vertex(-6.6, 3));
        map.put(2, new Vertex(-5.2, 3));
        map.put(3, new Vertex(-2.1, 2.3));
        map.put(4, new Vertex(0.8, 2.3));
        map.put(5, new Vertex(9, 4));
        map.put(6, new Vertex(-4.7, 0.3));
        map.put(7, new Vertex(1, 0));
        map.put(8, new Vertex(-1.9, -1.1));
        map.put(9, new Vertex(-3.3, -2.5));
        map.put(10, new Vertex(1, -2.4));
        map.put(11, new Vertex(3.5, -2));
        map.put(12, new Vertex(7.8, -2.2));
        map.put(13, new Vertex(-8.4, -3.3));
        map.put(14, new Vertex(7.5, -4));

        // nodes.add(0, new Vertex(-6.6, 3));
        // nodes.add(1, new Vertex(-5.2, 3));
        // nodes.add(2, new Vertex(-2.1, 2.3));
        // nodes.add(3, new Vertex(0.8, 2.3));
        // nodes.add(4, new Vertex(9, 4));
        // nodes.add(5, new Vertex(-4.7, 0.3));
        // nodes.add(6, new Vertex(1, 0));
        // nodes.add(7, new Vertex(-1.9, -1.1));
        // nodes.add(8, new Vertex(-3.3, -2.5));
        // nodes.add(9, new Vertex(1, -2.4));
        // nodes.add(10, new Vertex(3.5, -2));
        // nodes.add(11, new Vertex(7.8, -2.2));
        // nodes.add(12, new Vertex(-8.4, -3.3));
        // nodes.add(13, new Vertex(7.5, -4));

        for (int key : map.keySet()) {
            graph.addVertex(key);
        }

        graph.setEdgeWeight(graph.addEdge(1, 2), 1);
        graph.setEdgeWeight(graph.addEdge(1, 6), 3.5);
        graph.setEdgeWeight(graph.addEdge(2, 3), 3);
        graph.setEdgeWeight(graph.addEdge(2, 6), 2.7);
        graph.setEdgeWeight(graph.addEdge(3, 4), 3);
        graph.setEdgeWeight(graph.addEdge(3, 6), 2.5);
        graph.setEdgeWeight(graph.addEdge(3, 7), 5);
        graph.setEdgeWeight(graph.addEdge(4, 5), 10);
        graph.setEdgeWeight(graph.addEdge(4, 7), 2.2);
        graph.setEdgeWeight(graph.addEdge(5, 7), 12);
        graph.setEdgeWeight(graph.addEdge(5, 11), 12.5);
        graph.setEdgeWeight(graph.addEdge(5, 12), 6);
        graph.setEdgeWeight(graph.addEdge(6, 8), 2.5);
        graph.setEdgeWeight(graph.addEdge(6, 9), 2.7);
        graph.setEdgeWeight(graph.addEdge(6, 13), 4);
        graph.setEdgeWeight(graph.addEdge(7, 8), 3.8);
        graph.setEdgeWeight(graph.addEdge(7, 10), 2.6);
        graph.setEdgeWeight(graph.addEdge(7, 11), 4.5);
        graph.setEdgeWeight(graph.addEdge(8, 9), 1.3);
        graph.setEdgeWeight(graph.addEdge(8, 10), 3);
        graph.setEdgeWeight(graph.addEdge(8, 13), 6.3);
        graph.setEdgeWeight(graph.addEdge(9, 10), 6);
        graph.setEdgeWeight(graph.addEdge(9, 13), 5.5);
        graph.setEdgeWeight(graph.addEdge(10, 11), 2.8);
        graph.setEdgeWeight(graph.addEdge(10, 14), 7);
        graph.setEdgeWeight(graph.addEdge(11, 12), 4);
        graph.setEdgeWeight(graph.addEdge(12, 14), 1.8);

        DijkstraShortestPath<Integer, DefaultWeightedEdge> shortestPath = new DijkstraShortestPath<>(graph);
        List<Integer> path = shortestPath.getPath(1, 14).getVertexList();
        double distance = shortestPath.getPathWeight(1, 14);

        for (int p : path) {
            System.out.println(p);
        }
        System.out.println(distance);
    }
}
