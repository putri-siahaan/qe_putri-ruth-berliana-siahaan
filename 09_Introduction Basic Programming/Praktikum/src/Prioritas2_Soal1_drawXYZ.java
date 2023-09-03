public class Prioritas2_Soal1_drawXYZ {
    public static void main(String[] args) {
        drawXYZ(5);
    }
    public static void drawXYZ(int height) {
        int nilai = 1;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (nilai % 3 == 0){
                    System.out.print("X ");
                } else if (nilai % 2 == 0) {
                    System.out.print("Z ");
                } else if (nilai % 2 == 1) {
                    System.out.print("Y ");
                }
                nilai++;
            }
            System.out.println();
        }
    }
}
