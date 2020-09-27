package com.breakbot.algorithms.interfaces;

public interface UnionFind {
    void init();
    void union(int p, int q);
    void connected(int p, int q);
    int find(int p);
    int count(int p);
}
