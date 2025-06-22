package org.aston.module_five;

public class Adapter {
    public static void main(String[] args) {
        Shape shape = new RectangleAdapter(new LegacyRectangle());
        shape.draw(10, 20, 30, 40);
    }
}

class LegacyRectangle {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.printf("LegacyRectangle: (%d,%d) to (%d,%d)\n", x1, y1, x2, y2);
    }
}

interface Shape {
    void draw(int x, int y, int width, int height);
}

class RectangleAdapter implements Shape {
    private LegacyRectangle adaptee;

    public RectangleAdapter(LegacyRectangle adaptee) {
        this.adaptee = adaptee;
    }

    public void draw(int x, int y, int width, int height) {
        adaptee.draw(x, y, x + width, y + height);
    }
}