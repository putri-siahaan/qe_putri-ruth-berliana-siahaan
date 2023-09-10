import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Soal3_IndeksDariJumlahTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while(!exit){
            System.out.println();
            System.out.print("Input: ");
            String input = scanner.nextLine();
            String[] elements = input.split(" ");

            int[] angka = new int[elements.length];
            for (int i=0; i < elements.length; i++){
                angka[i] = Integer.parseInt(elements[i]);
            }

            System.out.print("target: ");
            int target = scanner.nextInt();

            int[] hasil = findIndex(angka, target);
            if (hasil[0] != -1){
                System.out.println();
                System.out.println("Output: [" + hasil[0] + ", " + hasil[1] + "]");
            }else{
                System.out.println("Tidak ada pasangan yang sesuai untuk dijumlahkan agar sesuai dengan hasil target.");
            }

            scanner.nextLine();

            System.out.println();
            System.out.println("Apakah Anda ingin melanjutkan? (ya/tidak): ");
            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("ya")) {
                exit = true;
            }
        }
    }
    public static int[] findIndex(int[] angka, int target){
        Map<Integer, Integer> angkaKeIndeks = new HashMap<>();

        for (int i=0; i < angka.length; i++){
            int complement = target - angka[i];
            if (angkaKeIndeks.containsKey(complement)){
                return new int[]{angkaKeIndeks.get(complement), i};
            }
            angkaKeIndeks.put(angka[i], i);
        }
        return new int[]{-1, -1};
    }
}
