import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Soal2_AngkaMuncul1Kali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit){
            System.out.print("Input: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("keluar")){
                break;
            }
            List<Integer> angkaUnik = findAngkaUnik(input);
            System.out.println("Output: " + angkaUnik);

            System.out.println();
            System.out.println("Apakah Anda ingin lanjut? (ya/tidak)");
            String next = scanner.nextLine().toLowerCase();

            System.out.println();

            if (!next.equals("ya")) {
                exit = true;
            }

        }

    }
    public static List<Integer> findAngkaUnik(String input){
        Map<Character, Integer> countMap = new HashMap<>();

        for (char a : input.toCharArray()){
            countMap.put(a, countMap.getOrDefault(a, 0) + 1);
        }

        List<Integer> angkaUnik = new ArrayList<>();

        for (char a : input.toCharArray()){
            if (countMap.get(a) == 1){
                angkaUnik.add(Character.getNumericValue(a));
            }
        }
        return angkaUnik;
    }
}

