package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShapesManager {
    List<Shape> shapeList=new ArrayList<>();

    public void addShape(Shape s){

        if(shapeList.contains(s)){
            System.out.println("Try another one!");
        }

        else{
        shapeList.add(s);}
    }

    public double totalAreaOfShapes(){

        double sumArea=0;

        for(Shape s:shapeList){
            sumArea+=s.calculateArea();
        }

        return sumArea;}

    public double totalPerimeterOfShapes(){

        double sumPerimeter=0;

        for(Shape s:shapeList){
            sumPerimeter+=s.calculatePerimeter();
        }
        return sumPerimeter;}


public void listAll(){

        if(shapeList.isEmpty()){
            System.out.println("Empty list");
        }

        for(Shape s:shapeList){
            System.out.println(s);
        }
}


public void printTotalAreaAndPerimeter(){
        System.out.println("TotaArea: "+
                            this.totalAreaOfShapes() +
                            " Total perimeter: "+
                            this.totalPerimeterOfShapes());
    }

}
