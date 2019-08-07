package exercises;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main (String[] args) {
        double AreaOfSquare;
        double length;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter length of one side of the square: ");
        length = input.nextDouble();

        AreaOfSquare = length * length;
        System.out.println("The Area of the Square is: " + AreaOfSquare + ".");
    }
}
