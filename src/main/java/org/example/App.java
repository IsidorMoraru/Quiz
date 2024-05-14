package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ShapesManager shapesManager=new ShapesManager();

        Rectangle r=new Rectangle(3,5);
        Square s=new Square(5);
        Circle c=new Circle(6);
        Triangle t=new Triangle(3,4,5);

        shapesManager.addShape(r);
        shapesManager.addShape(s);
        shapesManager.addShape(c);
        shapesManager.addShape(t);
        shapesManager.addShape(t);


        shapesManager.listAll();
        shapesManager.printTotalAreaAndPerimeter();


    }
}
