package com.decode;

import processing.core.PApplet;

public class Point {

    public float x, y;
    public int r,g,b;
    private PApplet p;
    private float size = 5;

    public Point(float x, float y, int r, int g, int b, PApplet p) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.g = g;
        this.b = b;
        this.p = p;
    }

    void show() {
        p.noStroke();
        p.fill(r,g,b);
        p.square(x, y, size);
    }
}
