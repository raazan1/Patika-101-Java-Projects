import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.printf("Bir Sayi Giriniz: ");
        int s = input.nextInt();

        for (int i = s-1; i >0; i--) {
            System.out.println("");
            for (int j = 0; j <s-i ; j++) {
                System.out.printf(" ");
            }
            for (int k = 1; k <=(2*i-1) ; k++) {
                System.out.printf("*");
            }


        }

    }
}