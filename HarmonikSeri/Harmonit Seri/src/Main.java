import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Sayi Giriniz: ");
        int s = input.nextInt();
        double Total = 0.0;
        for (int i = 1; i <=s; i++) {
            Total += (1.0/i);

        }
        System.out.printf("\nHarmonik Seri: " +Total);

    }
}