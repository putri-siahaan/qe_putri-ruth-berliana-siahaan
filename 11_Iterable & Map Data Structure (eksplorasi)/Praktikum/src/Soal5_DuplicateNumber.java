import java.util.Scanner;
import java.util.Arrays;

public class Soal5_DuplicateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean exit = false;

        while (!exit) {
            System.out.println();
            System.out.print("Input: ");
            String input = scanner.nextLine();
            int[] angka = parseArray(input);

            int length = duplicateNumber(angka);

            System.out.println("Output: " + length);
            if (length >= 2) {
                System.out.print("Penjelasan: Elemen setelah menghilangkan duplikat adalah: ");
                System.out.println(Arrays.toString(Arrays.copyOfRange(angka, 0, length)));
            } else if (length == 1) {
                System.out.println("Hanya ada satu elemen unik setelah menghapus duplikat: " + angka[0]);
            } else {
                System.out.println("Tidak ada elemen unik dalam array.");
            }


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

    public static int duplicateNumber(int[] angka) {
        if (angka.length == 0) {
            return 0;
        }

        int uniqueCount = 1;
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] != angka[i - 1]) {
                angka[uniqueCount] = angka[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}
