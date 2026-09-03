import java.util.Arrays;
import java.util.Scanner;

public class OptimalStorageOnTape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of files (n): ");
        int n = scanner.nextInt();

        int[] length = new int[n];
        System.out.println("Enter the lengths of the files:");
        for (int i = 0; i < n; i++) {
            length[i] = scanner.nextInt();
        }


        Arrays.sort(length);

        int total = 0;
        int retrieval = 0;

        for (int i = 0; i < n; i++) {
            retrieval += length[i];
            total += retrieval;
        }

        double average = (double) total / n;

        System.out.println("Optimal order: " + Arrays.toString(length));
        System.out.println("Total Retrieval Time: " + total);
        System.out.println("Average Retrieval Time: " + average);

        scanner.close();
    }
}