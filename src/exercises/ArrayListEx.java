package exercises;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main (String[] args) {
        ArrayList <Integer> ListOfNumbers = new ArrayList();
        ListOfNumbers.add(1);
        ListOfNumbers.add(10);
        ListOfNumbers.add(27);
        ListOfNumbers.add(3);
        ListOfNumbers.add(16);
        ListOfNumbers.add(4);
        ListOfNumbers.add(9);

        int sumOfList = SumOfEven(ListOfNumbers);
        System.out.println(sumOfList);
    }

    public static int SumOfEven(ArrayList<Integer> numberList) {
        int sum = 0;
        for (Integer number : numberList) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
