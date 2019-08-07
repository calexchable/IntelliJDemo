package exercises;

import java.util.Scanner;

public class GradeBook {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a grade [x/100];");
        double grade = input.nextDouble();
        if (grade < 60) {
            System.out.println("F -- You Failed!");
        } else if (grade < 70) {
            System.out.println("D -- I pity you!");
        } else if (grade < 80) {
            System.out.println("C -- C's get degrees... except in graduate school! You Fail!");
        } else if (grade < 90) {
            System.out.println("B -- Fair enough, but do you want to be satisfactory?!");
        } else {
            System.out.println("A -- You did good.");
        }
    }
}
