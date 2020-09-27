package com.breakbot.algorithms.entity;

import lombok.Data;

@Data
public class Point {
    private int p;
    private int q;
    public Point(int p, int q){
        this.p = p;
        this.q = q;
    }
}
