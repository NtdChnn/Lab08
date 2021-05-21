/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03;

import java.util.Date;

/**
 *
 * @author notda
 */
public abstract class GeometricObject {
    String color;
//    double weight;
    Date dateCreated;
    String name;

    public GeometricObject(String color, /*double weight,*/ String name) {
        this.color = color;
        //this.weight = weight;
        this.name = name;
        dateCreated = new Date();
    }

    public GeometricObject() {
        dateCreated = new Date();
    }
    
    //getter,setter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    /*public double getWeight() {
    return weight;
    }
    public void setWeight(double weight) {
    this.weight = weight;
    }*/
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    abstract double getArea();  
    abstract double getPerimeter();
}
