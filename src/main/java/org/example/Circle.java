package org.example;

public class Circle implements Shape{

    private int r;
    public Circle(int r){
        this.r=r;
    }
    @Override
    public double calculateArea() {
        return (Math.PI*r)*(Math.PI*r);
    }

    @Override
    public double calculatePerimeter() {
        return 2*(Math.PI*r);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", area="+this.calculateArea()+
                ", perimeter="+this.calculatePerimeter()+
                '}';
    }
}
