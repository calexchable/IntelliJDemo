package org.launchcode.java.studios;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        double area;
        double radius;
        double pi;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle: ");
        radius = input.nextDouble();
        pi = 3.14;
        area = pi * radius * radius;
        System.out.println("The Area of Circle is " + area + ".");
    }
}
