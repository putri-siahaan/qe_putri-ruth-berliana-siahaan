import java.util.Scanner;

public class Soal6_MaximumSumSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean exit = false;

        while (!exit){
            System.out.println();
            System.out.print("Input: ");
            String input = scanner.nextLine();
            int[] angka = parseArray(input);

            System.out.print("k= ");
            int k = scanner.nextInt();
            scanner.nextLine();

            int maximumSum = findMaximumSumSubArray(angka, k);

            System.out.println("Output: " + maximumSum);

            System.out.println();
            System.out.println("Apakah Anda ingin melanjutkan? (ya/tidak): ");
            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("ya")) {
                exit = true;
            }
        }
    }

    public static int[] parseArray(String input) {
        String[] elements = input.split(" ");
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }
        return array;
    }

    public static int findMaximumSumSubArray(int[] angka, int k) {
        int maximumSum = 0;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += angka[i];
        }
        maximumSum = currentSum;

        for (int i = k; i < angka.length; i++) {
            currentSum = currentSum - angka[i - k] + angka[i];
            maximumSum = Math.max(maximumSum, currentSum);
        }

        return maximumSum;
    }
}
