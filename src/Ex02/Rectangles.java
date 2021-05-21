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
public class Rectangles extends GeometricObject_ {
    double height;
    double lenght;

    public Rectangles() {
    }

    public Rectangles(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangles(double height, double lenght, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.lenght = lenght;
    }

    //getter,setter
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    
    

    @Override
    double getArea() {
        if(height <= 0 || lenght <= 0)
        {
            System.out.println("! Error on Rectangle ! ");
            return 0;
        } else return height*lenght;
    }

    @Override
    double getPerimeter() {
        return 2*(height+lenght);
    }
}
