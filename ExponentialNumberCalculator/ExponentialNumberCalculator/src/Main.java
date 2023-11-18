import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Üstünü Almak İstediğiniz Sayıyı Giriniz: ");
        int n = input.nextInt();

        System.out.printf("Kaç Üstünü Almak İstersiniz: ");
        int m = input.nextInt();

        int us = 1;
        for (int i = 0; i <m; i++) {
            us *= n;
        }
        System.out.printf(n + "'nin " + m + " üssü " + us);
    }
}