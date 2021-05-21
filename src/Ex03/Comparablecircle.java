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
public class Comparablecircle extends Circle
    implements Comparable< Comparablecircle> {

    public Comparablecircle(double radius, String color, /*double weight,*/ String name) {
        super(radius, color, /*weight,*/ name);
    }

    
    @Override
    public int compareTo( Comparablecircle o) {
        if(getArea() > o.getArea()) return 1;
        else if(getArea() < o.getArea()) return -1;
        else return 0;
    }
    
    public void max(Comparablecircle o) {
        if(compareTo(o) == 1)
        {
            System.out.printf("The larger object using max method [Circle] name = %s radius = %.2f color = %s\n",getName(),getRadius(),getColor());
        } else if(compareTo(o) == -1)
        {
            System.out.printf("The larger object using max method [Circle] name = %s radius = %.2f color = %s\n",o.getName(),o.getRadius(),o.getColor());
        } else System.out.println("");
    }
}
