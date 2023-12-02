import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Sayi Giriniz: ");
        int s = input.nextInt();

        int[] list = {-56,0,3,5,87,-5,-10,6,4,7,8,90};
        Arrays.sort(list);
        int buyuk = 0;
        for (int i = 0; i <list.length ; i++) {
            if(list[i]>s){
                buyuk = list[i];
                break;
            }
        }
        System.out.println("\nBuyuk En Yakın : " + buyuk);

        int kucuk = 0;
        for (int i = list.length-1; i >=0 ; i--) {
            if(list[i]<s){
                kucuk = list[i];
                break;
            }
        }
        System.out.println("Kucuk En Yakın Sayi: " + kucuk);
    }
}