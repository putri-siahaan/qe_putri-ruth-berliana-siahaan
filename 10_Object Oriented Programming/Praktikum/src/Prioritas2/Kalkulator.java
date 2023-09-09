package Prioritas2;

public class Kalkulator {
    public static int add(int x, int y){
        return x + y;
    }

    public static int substract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static int divide(int x, int y){
        return x / y;
    }

    public static void main(String[] args) {
        System.out.println("Penjumlahan: " + add(3,4));
        System.out.println("Pengurangan: " + substract(15,4));
        System.out.println("Perkalian: "+ multiply(10, 10));
        System.out.println("Pembagian: " + divide(12,3));
    }

}
