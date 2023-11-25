import java.util.Scanner;
public class Main {
    static int  Us(int s , int s1){
        if(s1==0){
            return 1;
        } else if (s1 == 1) {
            return s;
        }
        return Us(s,s1-1)*s;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Üs Almak İstediğiniz Sayiyi Giriniz: ");
        int s = input.nextInt();
        System.out.printf("Üs Değeri Giriniz: ");
        int s1 = input.nextInt();
        System.out.println(Us(s,s1));
    }
}