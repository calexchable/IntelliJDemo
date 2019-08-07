package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main (String[] args) {
        double AreaOfRectangle;
        double length;
        double width;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        length = input.nextDouble();

        System.out.println("Enter width of rectangle: ");
        width = input.nextDouble();

        AreaOfRectangle = length * width;
        System.out.println("The Area of the Rectangle is: " + AreaOfRectangle + ".");
    }
}
