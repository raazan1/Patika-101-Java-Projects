import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("1.Sayıyı Giriniz:");
        int s = input.nextInt();

        System.out.printf("2.Sayıyı Giriniz:");
        int s1 = input.nextInt();

        int say = 0;
        int ebob = 0;
        while(say<s){
            say++;
            if(s%say==0 && s1%say==0){
                ebob++;
            }
        }
        System.out.printf("Ebob: "+ebob);
        int ekok = 0;
        int say1 = s;
        while(say1>0){
            if (s%say1 == 0 && s1%say1== 0) {
                ekok = say1;
                break;
            }

        }
        System.out.printf("\nEkok: " + ekok);


    }
}