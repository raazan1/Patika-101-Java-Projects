import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matris = {
                {2,3,4},
                {5,6,4}
        };
        System.out.println("Matris : ");
        for (int i = 0; i < matris.length ; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.printf(" "+matris[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Transpoze : " );
        for (int i = 0; i < matris[0].length; i++) {
            for (int j = 0; j <matris.length; j++) {
                System.out.printf(" "+matris[j][i]);
            }
            System.out.println(" ");
        }
    }
}