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
public class Circle extends GeometricObject_ {
    double radius;

    public Circle() {
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    //getter,setter
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    
    @Override
    double getArea() {
        if(radius <= 0)
        {
            System.out.println("! Error on Circle !");  
            return 0;
        } else return Math.PI*radius*radius;
    }

    @Override
    double getPerimeter() {
        return Math.PI*radius*2;
    }
    
}
