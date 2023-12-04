import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Kaç Adet Sayi Eklemek İstersiniz: ");
        int s = input.nextInt();
        int[] list =new int[s];
        int m;

        for (int i = 1; i <= s; i++) {
            System.out.printf(i+".Sayiyi Giriniz: ");
            int s1 = input.nextInt();
            list[i-1]=s1;
        }
        for (int i = 0; i <list.length-1;i++) {
            for (int j = i+1; j<list.length;j++) {
                if (list[j]>list[i]) {
                    m = list[i];
                    list[i] = list[j];
                    list[j] = m;
                }
            }

        }
        System.out.printf("Sıralama: ");
        for (int k = 0; k<s; k++) {
            System.out.printf(" " + list[k]);
        }
    }
}