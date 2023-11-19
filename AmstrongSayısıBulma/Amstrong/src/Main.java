import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Bir Sayi Giriniz: ");
        int sayi = input.nextInt();
        Amstrong(sayi);

    }
    public static void Amstrong(int i){
        String newi = Integer.toString(i);
        int length = newi.length();
        //System.out.printf("LENGTH: " + newi.length()  );
        int sayac = 1;
        int total = 0;
        for (int j = 0; j < length; j++) {
            String ninci = newi.substring(j,sayac);
            int arm = Integer.parseInt(Integer.toString(Integer.parseInt(ninci)));
            int calc = (int) Math.pow(arm,length);
            total = total + calc;
            sayac++;
        }
        if(total == i){
            System.out.printf(i + ": Amstrong Sayısıdır = "+ total);

        }
        else{
            System.out.printf(i + ": Amstrong Sayısı Değildir = "+ total);

        }





    }
}