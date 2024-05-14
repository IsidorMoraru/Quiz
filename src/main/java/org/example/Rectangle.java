package org.example;

public class Rectangle implements Shape {
    private int width;
    private int height;
    public Rectangle(int w, int h){
        this.width=w;
        this.height=h;
    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area="+this.calculateArea()+
                ", perimeter="+this.calculatePerimeter()+
                '}';
    }
}
