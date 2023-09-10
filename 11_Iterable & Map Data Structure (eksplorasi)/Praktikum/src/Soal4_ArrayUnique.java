import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Soal4_ArrayUnique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit){
            System.out.println();
            System.out.print("array1: ");
            String inputArray1 = scanner.nextLine();
            int[] array1 = parseArray(inputArray1);

            System.out.print("array2: ");
            String inputArray2 = scanner.nextLine();
            int[] array2 = parseArray(inputArray2);

            int[] angkaUnik = findUniqueNumbers(array1, array2);

            if (angkaUnik.length > 0) {
                System.out.println();
                System.out.print("Output: [");
                for (int i = 0; i < angkaUnik.length; i++) {
                    System.out.print(angkaUnik[i]);
                    if (i < angkaUnik.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            } else {
                System.out.println("Tidak ada elemen unik dari array pertama");
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

    public static int[] findUniqueNumbers(int[] array1, int[] array2){
        Set<Integer> angkaUnik = new HashSet<>();

        for (int angka : array1) {
            if (!contains(array2, angka)) {
                angkaUnik.add(angka);
            }
        }

        int[] result = new int[angkaUnik.size()];
        int index = 0;
        for (int angka : angkaUnik) {
            result[index++] = angka;
        }

        return result;
    }

    public static boolean contains(int[] array, int target) {
        for (int angka : array) {
            if (angka == target) {
                return true;
            }
        }
        return false;
    }
}
