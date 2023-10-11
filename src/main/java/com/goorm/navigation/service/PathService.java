package com.goorm.navigation.service;

import java.util.List;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;
import org.springframework.stereotype.Service;

import com.goorm.navigation.domain.NodeInfo;
import com.goorm.navigation.domain.Vertex;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PathService {

    public List<Vertex> getShortestPath(double x1, double x2, double y1, double y2) {
        NodeInfo nodeInfo = new NodeInfo();
        WeightedMultigraph<String, DefaultWeightedEdge> graph = new WeightedMultigraph<>(DefaultWeightedEdge.class);

        for (Vertex v : nodeInfo.getNodes()) {
            graph.addVertex(v.getName());
        }
        return null;
    }
}
