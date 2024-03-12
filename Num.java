import java.util.Arrays;
import java.util.Scanner;

public class Num {
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

        System.out.println("Enter a target value:");
        int target = scanner.nextInt();

        int index = Arrays.binarySearch(numArray, target);
        if (index >= 0) {
            System.out.println("Target value found at index: " + index);
        } else {
            System.out.println("Target value not found in the dataset.");
        }
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
