import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArray = new int[10];

        System.out.println("Enter 10 integers (duplicate values are not allowed):");

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (containsDuplicate(numArray, num)) {
                System.out.println("Duplicate value entered. Please enter a different value.");
                i--; 
            } else {
                numArray[i] = num;
            }
        }

        Arrays.sort(numArray); 

        System.out.println("The sorted numbers you entered are:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numArray[i] + " ");
        }

        System.out.println();
    }

    private static boolean containsDuplicate(int[] array, int num) {
        for (int i : array) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}
