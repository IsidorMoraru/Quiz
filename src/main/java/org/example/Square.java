package org.example;

public class Square implements Shape{

    private int edge;
    public Square(int shape){
        this.edge =shape;
    }
    @Override
    public double calculateArea() {
        return edge * edge;
    }

    @Override
    public double calculatePerimeter() {
        return edge *4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                ", area="+this.calculateArea()+
                ", perimeter="+this.calculatePerimeter()+
                '}';
    }
}
