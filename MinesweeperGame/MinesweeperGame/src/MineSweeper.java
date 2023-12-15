import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class MineSweeper {
    Scanner input = new Scanner(System.in);
    int count;
    int satır;
    int sütun;
    int sizeSatır;
    int sizeSütun;
    String[][] list;
    String[][] hiddenList;
    int randSatir;
    int randSütun;

    public void selectArea(){
        System.out.printf("\nAçmak İstediğiniz Satır Giriniz: ");
        this.sütun = input.nextInt();
        System.out.printf("\nAçmak İstediğiniz Sütun Giriniz: ");
        this.satır = input.nextInt();
    }
    public void CreateField(){
        System.out.println("!!! Oyun Ortamını Oluşturun !!!");
        System.out.println("Sütun Belirleyin: ");
        sizeSatır = input.nextInt();
        System.out.println("Satır Belirleyin: ");
        sizeSütun = input.nextInt();
        System.out.printf(sizeSatır + "x" + sizeSütun + "'luk ortam oluşturuldu Bol Şans");
    }

    public void Sweeper(){
        CreateField();
        System.out.printf("satır::::" + sizeSatır);
        Random rand = new Random();
        this.hiddenList = new  String[sizeSütun][sizeSatır];
        this.list = new String[sizeSütun][sizeSatır];
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list[0].length; j++) {
                this.list[i][j]="-";
                this.hiddenList[i][j]="-";
            }
            System.out.println("");
        }
        int mayinSayisi = (sizeSatır*sizeSütun)/4;

        for (int i = 0; i < mayinSayisi; i++) {
            this.randSatir = rand.nextInt(sizeSatır);
            this.randSütun = rand.nextInt(sizeSütun);
            this.list[this.randSütun][this.randSatir] = "*";
        }
        LocationOfMines();
        mineLocation();
    }
    public void mineLocation(){
        selectArea();
        if(this.list[sütun][satır] == "*"){
            System.out.printf("\nMayına Bastın\nOyunu Kaybettin!!!");
            LocationOfMines();
        }
        if(win() == true){
            System.out.printf("\n!!!! OYUNU KAZANDIN !!!!\n");
            LocationOfMines();
        }

        else{

            control();
            LocationOfMines();
            mineLocation();
        }
    }
    public boolean win(){
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list[0].length; j++) {
                if(this.list[i][j].equals("-") ){
                    return false;
                }
            }
        }
        return true;
    }
    public void control(){
        int a = this.sütun;
        int b = this.satır;

        count = 0;
        for (int i = (a - 1); i <= (a + 1); i++) {
            for (int j = (b - 1); j <= (b + 1); j++) {
                if (i < 0 || j < 0 || i >= sizeSatır || j >= sizeSütun
                ) {
                    continue;
                }
                if (this.list[i][j].equals("*")) {
                    count++;
                }
            }
        }
        this.hiddenList[a][b] = String.valueOf(count);
        this.list[a][b] = String.valueOf(count);
        for (int i = 0; i < this.sizeSatır; i++) {
            for (int j = 0; j < this.sizeSütun; j++) {
                System.out.print(this.hiddenList[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public  void LocationOfMines(){
        System.out.printf("Mayınların Konumu : \n");
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list[0].length; j++) {
                System.out.printf("  "+this.list[i][j]);
            }
            System.out.println("");
        }
        System.out.printf("Mayın Tarlası: \n");
        for (int i = 0; i < this.hiddenList.length; i++) {
            for (int j = 0; j < this.hiddenList[0].length; j++) {
                System.out.printf("  "+this.hiddenList[i][j]);
            }
            System.out.println("");
        }
    }

}
