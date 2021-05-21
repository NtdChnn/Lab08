/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author notda
 */
public class main {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    int menu = 0;    
        while(menu != 4)
        {
         System.out.print("Menu ([1] Circle [2] Ractangle [3] Triangle [4] Exit) : ");
         Scanner menu_ = new Scanner(System.in);
         menu = menu_.nextInt();
         if(menu == 1) //Circle
         {
             System.out.print("Circle c1 (name radius color) : ");
             Scanner C1_ = new Scanner(System.in);
             String[] C1 = C1_.nextLine().split(" ");
             String c1n = C1[0];
             double c1R = Double.parseDouble(C1[1]);
             String c1C = C1[2];
             if(c1R <= 0)
             {
                 System.out.printf("! %s is ERROR !\n",c1n);
             } else {
                System.out.print("Circle c2 (name radius color) : ");
                Scanner C2_ = new Scanner(System.in);
                String[] C2 = C2_.nextLine().split(" ");
                String c2n = C2[0];
                double c2R = Double.parseDouble(C2[1]);
                String c2C = C2[2];
                if(c2R <= 0)
                {
                    System.out.printf("! %s is ERROR !\n",c2n);
                } else {
                    Comparablecircle c1 = new Comparablecircle(c1R,c1C,c1n);
                    Comparablecircle c2 = new Comparablecircle(c2R,c2C,c2n);
                    
                    
                    System.out.println("Equal Circles,if their radius are the same : "+c1.equals(c2));
                    c1.max(c2);
                }
                System.out.println("-------------------------------------");
             }
         } else if(menu == 2) //Ractangle
         {
             System.out.print("Ractangle r1 (name width hight color) : ");
             Scanner R1_ = new Scanner(System.in);
             String[] R1 = R1_.nextLine().split(" ");
             String r1n = R1[0];
             double r1w = Double.parseDouble(R1[1]);
             double r1h = Double.parseDouble(R1[2]);
             String r1C = R1[3];
             if(r1w <= 0 || r1h <= 0)
             {
                 System.out.printf("! %s is Error !",r1n);
             } else {
                 System.out.print("Ractangle r2 (name width hight color) : ");
                Scanner R2_ = new Scanner(System.in);
                String[] R2 = R2_.nextLine().split(" ");
                String r2n = R2[0];
                double r2w = Double.parseDouble(R2[1]);
                double r2h = Double.parseDouble(R2[2]);
                String r2C = R2[3];
                if(r2w <= 0 || r2h <= 0)
                    {
                        System.out.printf("! %s is Error !",r2n);
                    } else {
                        Comparablerectangles r1 = new Comparablerectangles(r1h,r1w,r1C,r1n);
                        Comparablerectangles r2 = new Comparablerectangles(r2h,r2w,r2C,r2n);
                        
                        System.out.println("Equal Rectangles,if their Area are the same : "+r1.equals(r2));
                        r1.max(r2);
                     
                }
                System.out.println("-------------------------------------");
             }
         } else if(menu == 3) //Triangle
         {
             System.out.print("triangle r1 (name side01 side02 side03 color) : ");
             Scanner T1_ = new Scanner(System.in);
             String[] T1 = T1_.nextLine().split(" ");
             String t1n = T1[0];
             double t1s1 = Double.parseDouble(T1[1]);
             double t1s2 = Double.parseDouble(T1[2]);
             double t1s3 = Double.parseDouble(T1[3]);
             String t1C = T1[4];
             
             if((t1s1+t1s2+t1s3) < 2*(Math.max(t1s1,Math.max(t1s2, t1s3))))
             {
                 System.out.printf("! %s is Error !",t1n);
             } else {
                 System.out.print("triangle r1 (name side01 side02 side03 color) : ");
                Scanner T2_ = new Scanner(System.in);
                String[] T2 = T2_.nextLine().split(" ");
                String t2n = T2[0];
                double t2s1 = Double.parseDouble(T2[1]);
                double t2s2 = Double.parseDouble(T2[2]);
                double t2s3 = Double.parseDouble(T2[3]);
                String t2C = T2[4];
                
                if((t1s1+t1s2+t1s3) < 2*(Math.max(t1s1,Math.max(t1s2, t1s3))))
                {
                    System.out.printf("! %s is Error !",t2n);
                } else {
                        Comparabletriangle t1 = new Comparabletriangle(t1s1,t1s2,t1s3,t1C,t1n);
                        Comparabletriangle t2 = new Comparabletriangle(t2s1,t2s2,t2s3,t2C,t2n);
                        
                        System.out.println("Equal Triangles,if their Area are the same : "+t1.equals(t2));
                        t1.max(t2);
                }
                System.out.println("-------------------------------------");
             }
         } else if(menu != 4)
         {System.out.println("Invalid Menu");
          System.out.println("-------------------------------------");}
        }        
        System.out.println("End of Program");        
    }
}
