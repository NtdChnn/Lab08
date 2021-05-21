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
public class Comparablerectangles extends Rectangles
    implements Comparable< Comparablerectangles> {

    public Comparablerectangles(double height, double lenght, String color, /*double weight,*/ String name) {
        super(height, lenght, color, /*weight,*/ name);
    }

    
    @Override
    public int compareTo( Comparablerectangles o) {
        if(getArea() > o.getArea()) return 1;
        else if(getArea() < o.getArea()) return -1;
        else return 0;
    }
    
    public void max(Comparablerectangles o) {
        if(compareTo(o) == 1)
        {
           System.out.printf("The larger object using max method [Rectangles] name = %s width = %.2f hight = %.2f color = %s\n",getName(),getLenght(),getHeight(),getColor());
        } else if(compareTo(o) == -1)
        {
            System.out.printf("The larger object using max method [Rectangles] name = %s width = %.2f hight = %.2f color = %s\n",o.getName(),o.getLenght(),o.getHeight(),o.getColor());
        } else System.out.println("");
    }
}
