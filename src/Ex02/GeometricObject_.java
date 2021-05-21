/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02;

import java.util.Date;

/**
 *
 * @author notda
 */
public abstract class GeometricObject_ {
    String color;
    boolean filled;
    Date dateCreated;

    public GeometricObject_() {
        dateCreated = new Date();
    }

    public GeometricObject_(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }
    
    //getter,setter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    
    abstract double getArea();  
    abstract double getPerimeter();
}
