package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double MilesPerGallon;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter miles traveled: ");
        miles = input.nextDouble();

        System.out.println("Enter gallons used: ");
        gallons = input.nextDouble();

        MilesPerGallon = miles/gallons;
        System.out.println("Your Auto runs approx. " + MilesPerGallon + " mpg.");
    }
}
