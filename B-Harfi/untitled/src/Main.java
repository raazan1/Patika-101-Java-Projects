import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            String[][] list = new String[9][3];
        System.out.println(list[0].length);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (i == 0 || i == 4 || i==8) {
                    list[i][j] = " * ";
                } else if (j == 0 || j == 3 || j==2) {
                    list[i][j] = " * ";
                }
            }
        }
        for (String[] row : list){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }




    }
}