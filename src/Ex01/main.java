/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

import java.util.Scanner;

/**
 *
 * @author notda
 */
public class main {
    public static void main(String[] args) {
        System.out.print("Enter Color : ");
        Scanner color_ = new Scanner(System.in);
        String color = color_.nextLine();
        System.out.print("[1] Filled [2] Not filled : ");
        Scanner filled_ = new Scanner(System.in);
        boolean filled;
        filled = filled_.nextInt() == 1;
        System.out.print("Enter X1 : ");
        Scanner x1_ = new Scanner(System.in);
        double x1 = x1_.nextDouble();
        System.out.print("Enter Y1 : ");
        Scanner y1_ = new Scanner(System.in);
        double y1 = y1_.nextDouble();
        System.out.print("Enter X2 : ");
        Scanner x2_ = new Scanner(System.in);
        double x2 = x2_.nextDouble();
        System.out.print("Enter Y2 : ");
        Scanner y2_ = new Scanner(System.in);
        double y2 = y2_.nextDouble();
        System.out.print("Enter X3 : ");
        Scanner x3_ = new Scanner(System.in);
        double x3 = x3_.nextDouble();
        System.out.print("Enter Y3 : ");
        Scanner y3_ = new Scanner(System.in);
        double y3 = y3_.nextDouble();
        
        if(x1 == x2 && y1 == y2)
        { 
            System.out.println("! It's not Triangle !");
        } else if(x2 == x3 && y2 == y3)
        {
            System.out.println("! It's not Triangle !");
        } else if(x3 == x1 && y3 == y1)
        {
            System.out.println("! It's not Triangle !");
        } else {
        
        Triangle Tr1 = new Triangle(x1,y1,x2,y2,x3,y3,color,filled);
        
        System.out.println("Triangle Color : "+Tr1.getColor());
        System.out.println("Triangle Filled : "+Tr1.isFilled());
        System.out.printf("Triangle Perimeter : %.2f",Tr1.getPerimeter());
        System.out.printf("\nTriangle Area : %.2f\n",Tr1.getArea());
        }
    }
}
