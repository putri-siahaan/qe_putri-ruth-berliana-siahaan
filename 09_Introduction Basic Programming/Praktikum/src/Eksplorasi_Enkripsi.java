import java.util.Scanner;

public class Eksplorasi_Enkripsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();
        String hasilEnkripsi = enkripsi(input);
        System.out.println("Output: " + hasilEnkripsi);
    }
    private static String enkripsi(String e){
        String hasilEnkripsi = "";
        int length = e.length();

        for (int i = 0; i < length; i++){
            char alphabet = e.charAt(i);
            if (Character.isUpperCase(alphabet)){
                alphabet = (char) (((alphabet - 'A' + 10) % 26) + 'A');
            } else if (Character.isLowerCase(alphabet)) {
                alphabet = (char) (((alphabet - 'a' + 10) % 26) + 'a');
            }
            hasilEnkripsi += alphabet;
        }
        return hasilEnkripsi;
    }
}
