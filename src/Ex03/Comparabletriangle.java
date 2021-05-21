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
public class Comparabletriangle extends Triangle
    implements Comparable< Comparabletriangle> {

    public Comparabletriangle(double side1, double side2, double side3, String color, /*double weight,*/ String name) {
        super(side1, side2, side3, color,/* weight,*/ name);
    }
    
    @Override
    public int compareTo( Comparabletriangle o) {
        if(getArea() > o.getArea()) return 1;
        else if(getArea() < o.getArea()) return -1;
        else return 0;
    }
    
    public void max(Comparabletriangle o) {
        if(compareTo(o) == 1)
        {
            System.out.printf("The larger object using max method [Triangles] name = %s side1 = %.2f side2 = %.2f side3 = %.2f color = %s\n",getName(),getSide1(),getSide2(),getSide3(),getColor());
        } else if(compareTo(o) == -1)
        {
             System.out.printf("The larger object using max method [Triangles] name = %s side1 = %.2f side2 = %.2f side3 = %.2f color = %s\n",o.getName(),o.getSide1(),o.getSide2(),o.getSide3(),o.getColor());
        } else System.out.println("");
    }
}
