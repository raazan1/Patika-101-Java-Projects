import java.util.Scanner;
public class Main {
    static int reversNumber(int n)
    {
        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        return reversed_n;
    }

    // Main function
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Sayi Giriniz: ");
        int n = input.nextInt();

        int reverseN = reversNumber(n);


        if (n == reverseN)
            System.out.println(n + " Palindrom Sayisidir.");
        else
            System.out.println(n +  " Palindrom Sayisi Değildir");
    }
}