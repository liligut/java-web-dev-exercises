package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius = 0;
        Scanner input; // Comments do not have to start at the beginning of a line.
        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        if (!input.hasNextDouble()){
            System.out.println("Error: You must enter a positive decimal number");
        }else{
            radius = input.nextDouble();
            while (radius<0){
                System.out.println("Enter a positive radius: ");
                radius = input.nextDouble();
            }
            input.close();
            double  area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius "+ radius +" is: " + area);
        }



    }
}
