/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02;

import java.util.ArrayList;

/**
 *
 * @author notda
 */
public class main {
    public static void main(String[] args) {
        ArrayList<GeometricObject_> Ob = new ArrayList<>();
        Ob.add(new Circle(1,"Red",true));
        Ob.add(new Circle(1,"Blue",true));
        Ob.add(new Rectangles(1,1,"Grey",false));
        Ob.add(new Rectangles(1,1,"White",false));
        Ob.add(new Triangle(0,0,1,0,0,1,"Black",true));
        System.out.println("First Circle Area : "+Ob.get(0).getArea());
        System.out.println("Second Circle Area : "+Ob.get(1).getArea());
        System.out.println("First Rectangle Area : "+Ob.get(2).getArea());
        System.out.println("Second Rectangle Area : "+Ob.get(3).getArea());
        System.out.println("First Triangle Area : "+Ob.get(4).getArea());
        System.out.println("Sum Area is "+sumArea(Ob));
    }
    public static double sumArea(ArrayList<GeometricObject_> Obs)
    {
        double sumArea = 0;
        for(GeometricObject_ Ob : Obs)
        {
                sumArea += Ob.getArea();
        }
        
        return sumArea;
    } 
}
