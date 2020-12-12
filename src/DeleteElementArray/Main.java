package DeleteElementArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter size of array: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Enter size less than 20");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element: ");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i]+"\t");
        }

        System.out.println();

        System.out.print("Enter value need to find: ");
        int valueInput = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == valueInput){
                for (int j = i; j < array.length -1; j++) {
                    array[j] = array[j+1];
                }
                array[array.length-1] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i]+"\t");
        }
    }
}
