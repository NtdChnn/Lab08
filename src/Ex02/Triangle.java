/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02;

/**
 *
 * @author notda
 */
public class Triangle extends GeometricObject_{
    double x1,y1,x2,y2,x3,y3;
    double side1,side2,side3;
    double area;
    double perimeter;

    public Triangle() {
    }

    public Triangle(String color, boolean filled) {
        super(color, filled);
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3, String color, boolean filled) {
        super(color, filled);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    //getter,setter
    public double getX1() {
        return x1;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }
    public double getY1() {
        return y1;
    }
    public void setY1(double y1) {
        this.y1 = y1;
    }
    public double getX2() {
        return x2;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    public double getY2() {
        return y2;
    }
    public void setY2(double y2) {
        this.y2 = y2;
    }
    public double getX3() {
        return x3;
    }
    public void setX3(double x3) {
        this.x3 = x3;
    }
    public double getY3() {
        return y3;
    }
    public void setY3(double y3) {
        this.y3 = y3;
    }
    
    
    @Override
    double getArea() {
        //side01
        side1 = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
        //side02
        side2 = Math.sqrt((Math.pow(x3-x2, 2))+(Math.pow(y3-y2, 2)));
        //side03
        side3 = Math.sqrt((Math.pow(x1-x3, 2))+(Math.pow(y1-y3, 2)));
        
        //Heron's formula
        double s = (side1+side2+side3)/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

    @Override
    double getPerimeter() {
        //side01
        side1 = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
        //side02
        side2 = Math.sqrt((Math.pow(x3-x2, 2))+(Math.pow(y3-y2, 2)));
        //side03
        side3 = Math.sqrt((Math.pow(x1-x3, 2))+(Math.pow(y1-y3, 2)));
        
        perimeter = side1+side2+side3;
        return perimeter;
    }
    
}
