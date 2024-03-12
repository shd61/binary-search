import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArray = new int[10];

        System.out.println("Enter 10 integers (duplicate values are not allowed):");

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (containsDuplicate(numArray, num)) {
                System.out.println("Duplicate value entered. Please enter a different value.");
                i--; // Decrementing i to re-prompt for the same index
            } else {
                numArray[i] = num;
            }
        }

        System.out.println("The numbers you entered are:");

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
