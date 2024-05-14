package org.example;

public class Triangle implements Shape{
    private int l1;
    private int l2;
    private int l3;
    public Triangle(int l1,int l2, int l3){
        this.l1=l1;
        this.l2=l2;
        this.l3=l3;
    }
    @Override
    public double calculateArea() {
        return Math.sqrt(this.semiPerimeter()
                        *(this.semiPerimeter()-l1)
                        *(this.semiPerimeter()-l2)
                        *(this.semiPerimeter()-l3));
    }


    @Override
    public double calculatePerimeter() {
        return l1+l2+l3;
    }

    public double semiPerimeter(){
        return this.calculatePerimeter()/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                ", area="+this.calculateArea()+
                ", perimeter="+this.calculatePerimeter()+
                '}';
    }
}
