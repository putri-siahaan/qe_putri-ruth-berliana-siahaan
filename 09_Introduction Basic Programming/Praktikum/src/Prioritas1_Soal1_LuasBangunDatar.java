public class Prioritas1_Soal1_LuasBangunDatar {
    public static void main(String[] args) {
        //Luas Segitiga
        int alas = 20;
        int tinggi = 25;

        int luasSegitiga = ((alas * tinggi)/2);

        System.out.println("a. Luas Segitiga: ");
        System.out.println(luasSegitiga);

        //Luas Persegi Panjang
        int panjang = 40;
        int lebar = 6;

        int luasPersegiPanjang = panjang * lebar;

        System.out.println("b. Luas Persegi Panjang: ");
        System.out.println(luasPersegiPanjang);

        //Luas Lingkaran
        final double phi = 3.14;
        double jarijari = 7;

        double luaslingkaran = phi * jarijari * jarijari ;

        System.out.println("c. Luas Lingkaran: ");
        System.out.println(luaslingkaran);
    }
}
