/*
 0 + 1 = 1

 1 + 1 = 2

 1 + 2 = 3

 2 + 3 = 5

 3 + 5 = 8

 5 + 8 = 13

 13 + 8 = 21

 21 + 8 = 34
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Kaç Fibonacci gerek: ");
        int sayi=input.nextInt();
        int birinci=0;
        int ikinci=1;
        int ucuncu=birinci+ikinci;

        System.out.println("Fibonacci Sayıları ");
        System.out.print(birinci+ " "+ikinci+ " ");

        while(sayi>0){
            System.out.print(ucuncu+ " ");
            sayi--;
            birinci=ikinci;
            ikinci=ucuncu;
            ucuncu=birinci+ikinci;


        }
    }
}