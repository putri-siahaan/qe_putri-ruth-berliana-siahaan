import java.util.Scanner;

public class Prioritas1_Soal2_HasilPenjualan {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++){
            Scanner scanner = new Scanner(System.in);
            int hargaBeli, hargaJual;

            System.out.println("Sampel " + i);
            System.out.println("Input harga beli = " );
            hargaBeli = scanner.nextInt();
            System.out.println("Input harga jual = ");
            hargaJual = scanner.nextInt();

            int untungrugi = (int) (hargaJual - hargaBeli);
            System.out.println(" ");

            if (untungrugi >0) {
                System.out.println("untung sebesar: " + untungrugi);
            } else if (untungrugi < 0) {
                System.out.println("rugi sebesar: " + untungrugi);
            } else {
                System.out.println("sama saja");
            }
            System.out.println(" ");
        }
    }
}