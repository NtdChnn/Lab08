/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03;

/**
 *
 * @author notda
 */
public class Triangle extends GeometricObject{
    double side1,side2,side3;
    double area;
    double perimeter;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color, /*double weight,*/ String name) {
        super(color, /*weight,*/ name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    
    //getter,setter
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    
    
    
    @Override
    double getArea() {
//        //side01
//        side1 = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
//        //side02
//        side2 = Math.sqrt((Math.pow(x3-x2, 2))+(Math.pow(y3-y2, 2)));
//        //side03
//        side3 = Math.sqrt((Math.pow(x1-x3, 2))+(Math.pow(y1-y3, 2)));
        
        //Heron's formula
        double s = (side1+side2+side3)/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

    @Override
    double getPerimeter() {
//        //side01
//        side1 = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
//        //side02
//        side2 = Math.sqrt((Math.pow(x3-x2, 2))+(Math.pow(y3-y2, 2)));
//        //side03
//        side3 = Math.sqrt((Math.pow(x1-x3, 2))+(Math.pow(y1-y3, 2)));
        
        perimeter = side1+side2+side3;
        return perimeter;
    }
    
    public boolean equals(Triangle o) {
        return getArea() == o.getArea();
    }
}
