package com.breakbot.algorithms.implementations;

import com.breakbot.algorithms.entity.Point;
import com.breakbot.algorithms.interfaces.UnionFind;

import java.util.ArrayList;
import java.util.List;

public class ImpUnionFind implements UnionFind {
    private List<Point> points;
    public void init() {
        this.points = new ArrayList();
        union(0,1);
        union(1,4);
        union(4,5);
        union(6,7);
        union(10,12);
        union(12,4);
        union(7,9);
        union(9,11);
    }

    public void union(int p, int q) {
        this.points.add(new Point(p,q));
    }

    public void connected(int p, int q) {

    }

    public int find(int p) {
        return 0;
    }

    public int count(int p) {
        return 0;
    }
}
