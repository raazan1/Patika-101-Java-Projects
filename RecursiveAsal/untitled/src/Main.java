import java.util.Scanner;
public class Main {
    static int Asal(int s,int s1){

        if(s1==1){
            return 1;
        }
        else {
            if(s%s1==0){
                return 0;
            }
            else return Asal(s,s1-1);

        }




    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Sayi Giriniz: ");
        int s = input.nextInt();
        int ret = Asal(s,s/2);

        if (ret == 1) {
            System.out.printf(s+ " : Asaldır:");

        }else {
            System.out.printf(s+ " : AsalDeğil:");

        }

    }
}