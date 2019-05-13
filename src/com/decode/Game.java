package com.decode;

import processing.core.PApplet;

public class Game extends PApplet {
    private int spawnLimit = 16;
    private float t = -3;
    private Point[] points = new Point[spawnLimit];

    @Override
    public void settings() {
        size((int)Constants.SCREEN_SIZE.x, (int)Constants.SCREEN_SIZE.y);
    }

    @Override
    public void setup() {
        background(0);
    }

    @Override
    public void draw() {
        background(0);
        fill(255,255,255);
        text("T="+t,0,10);
        t += 0.1;

        for (int i = 0; i < spawnLimit; i++) {
            points[i] = new Point(t, t, 255, 0 ,255, this);
        }
    }

    public static void main(String[] args){ PApplet.main("com.decode.Game", args); }
}