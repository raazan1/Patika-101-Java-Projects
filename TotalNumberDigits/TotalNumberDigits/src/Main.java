import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Bir Sayı Giriniz: ");
        int s = input.nextInt();

        String sString = Integer.toString(s);
        int sayac = 1;
        int total = 0;
        for (int i = 0; i <sString.length(); i++) {
            String ninci = sString.substring(i,sayac);
            int ninciInt = Integer.parseInt(ninci);
             total+=ninciInt;
            System.out.printf("\nninci sayi : " + ninci);
            sayac++;
        }
        System.out.printf(" \n" + s +" :Sayısının Basamakları Toplamı: " + total);

    }
}