import java.util.Scanner;
public class Main {
    static int fib(int s){
        if(s==1 || s==2){
            return 1;
        }
        return fib(s-1) + fib(s-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Sayi Giriniz: ");
        int s = input.nextInt();
        System.out.printf("Fibonacci : " + fib(s));

    }
}