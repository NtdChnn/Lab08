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
public class Rectangles extends GeometricObject {
    double height;
    double lenght;

    public Rectangles() {
    }

    public Rectangles(double height, double lenght) {
        this.height = height;
        this.lenght = lenght;
    }

    public Rectangles(double height, double lenght, String color, /*double weight,*/ String name) {
        super(color, /*weight,*/ name);
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
    
    public boolean equals(Rectangles o) {
        return getArea() == o.getArea();
    }
}
