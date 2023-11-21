import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Bir Sayi Giriniz: ");
        int s = input.nextInt();
        int total = 0;
        for (int i = 1; i < s; i++) {
            if (s%i==0) {
                total +=i;
            }
        }
        if(s==total){
            System.out.printf(s+" :Mukemmel Sayidir");
        }
        else {
            System.out.printf(s+" :Mukemmel Sayi Değildir");

        }
    }
}