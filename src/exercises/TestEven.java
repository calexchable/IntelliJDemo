package exercises;

public class TestEven {
    public static void main (String[] args) {
        System.out.println("Initial Number List:");
        int numbers[] = {1, 5, 4, 7, 34, 83, 79};

        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println("\nList of Even Numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("\nList of Odd Numbers:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println("\nNew Numbers List (Fibs):");
        int fibs [] = {1, 1, 2, 3, 5, 8, 13, 21, 34};
        for (int fibnum : fibs) {
            System.out.println(fibnum);
        }
    }
}
