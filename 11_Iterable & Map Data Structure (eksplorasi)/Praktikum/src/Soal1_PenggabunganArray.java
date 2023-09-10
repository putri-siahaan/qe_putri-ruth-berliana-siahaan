import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class Soal1_PenggabunganArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.print("Array 1: ");
            String input1 = scanner.nextLine();
            String[] array1 = input1.split(" ");

            System.out.print("Array 2: ");
            String input2 = scanner.nextLine();
            String[] array2 = input2.split(" ");

            String[] mergedArray = mergeArrays(array1, array2);

            System.out.print("Output: ");
            System.out.println(Arrays.toString(mergedArray));

            System.out.println();
            System.out.println("Apakah Anda ingin mencoba menggabungkan 2 array lagi? (ya/tidak)");
            String next = scanner.nextLine().toLowerCase();

            System.out.println();

            if (!next.equals("ya")) {
                exit = true;
            }
    }
}

    public static String[] mergeArrays(String[] array1, String[] array2) {
        Set<String> uniqueNames = new HashSet<>();

        List<String> mergedList = new ArrayList<>();

        for (String name : array1) {
            if (!uniqueNames.contains(name)) {
                mergedList.add(name);
                uniqueNames.add(name);
            }
        }

        for (String name : array2) {
            if (!uniqueNames.contains(name)) {
                mergedList.add(name);
                uniqueNames.add(name);
            }
        }

        String[] mergedArray = new String[mergedList.size()];
        mergedArray = mergedList.toArray(mergedArray);

        return mergedArray;
    }
}
