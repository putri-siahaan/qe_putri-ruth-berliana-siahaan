public class Prioritas2_Soal2_segitigaAsterik {
    public static void main(String[] args) {
        printSegitigaAsterik(5);
    }
    public static void printSegitigaAsterik (int tinggi){
        for (int i = 1; i <= tinggi; i++){

            for (int j = tinggi; j > i; j--){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
