import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Faktöriyelini Bulmak İstediğiniz Sayıyı Giriniz:");
        int s = input.nextInt();
        int Total = 1;
        for (int i = 1; i <=s; i++) {
            Total *=i;
        }
        System.out.printf( s + "'in Faktöriyeli: " + Total);

        System.out.printf("\nBir Sayı Giriniz: ");
        int n = input.nextInt();
        System.out.printf("\nBir Sayı Giriniz: ");
        int r = input.nextInt();

        int nTotal = 1;
        int rTotal = 1;
        int nrTotal = 1;

        for (int i = 1; i <= n; i++) {
            nTotal *= i;
        }
        for (int j = 1; j <= r; j++) {
            rTotal *= j;
        }
        for (int m = 1; m < n-r; m++) {
            nrTotal *=m;
        }
        int calc = nTotal / (rTotal*nrTotal);

        System.out.printf(n + "'nin "+r+"'li" + " Kombinasyonu: " + calc);
    }


}