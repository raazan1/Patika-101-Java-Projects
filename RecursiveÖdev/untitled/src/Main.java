import java.util.Scanner;
public class Main {
    static int Calc(int s,int m){
        if(s<=0){
            System.out.println(" "+s);
            Calc2(s,m);
            return s;
        }
        System.out.printf(" " + s);
        return Calc(s-5,m);
    }
    static int Calc2(int s, int s1 ){

        if(s==s1){
            return 1;
        }
        System.out.print(" " + (s+5));
        return Calc2(s+5,s1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Sayi Giriniz: ");
        int s = input.nextInt();
        int m = s;
        Calc(s,m);


    }
}
