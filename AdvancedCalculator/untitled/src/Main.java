import java.util.Scanner;
public class Main {
    static void topla(){
        Scanner input = new Scanner(System.in);
        System.out.printf("\nKaç Adet Sayi İle İşlem Yapmak İstersiniz:");
        int len = input.nextInt();
        int say = 1;
        int total = 0;
        while(true){
            System.out.printf(say + ". Sayi = ");
            int s1 = input.nextInt();
            total += s1;
            if(say == len){
                break;
            }
            say++;
        }
        System.out.printf(len + " Sayinin Toplamı: " + total + "\n");
        main();
    }
    static void cikar(){
        Scanner input = new Scanner(System.in);
        System.out.printf("\nKaç Adet Sayi İle Çıkarma İşlemi Yapmak İstersiniz:");
        int len = input.nextInt();
        int total = 0;
        for (int i = 0; i < len; i++) {
            System.out.print(i + ". sayı :");
            int s = input.nextInt();
            total -= s;
        }
        System.out.printf("Sonuç: " + total + "\n");
        main();

    }
    static void carp(){
        Scanner input = new Scanner(System.in);
        System.out.printf("\nKaç Adet Sayi İle Çarpma İşlemi Yapmak İstersiniz:");
        int len = input.nextInt();
        int total = 1;
        for (int i = 1; i <= len; i++) {
            System.out.print(i + ". sayı :");
            int s = input.nextInt();
            total*=s;
        }
        System.out.printf("\nSonuç : " + total + "\n");
        main();

    }
    static void bol(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Bölünecek Ana Sayiyi Giriniz:  ");
        double m = input.nextDouble();
        System.out.printf("\nKaç Adet Sayi İle Bölme İşlemi Yapmak İstersiniz:");
        int len = input.nextInt();

        for (int i = 1; i <= len; i++) {
            System.out.printf(i + ".Sayi = ");
            int s = input.nextInt();
            m/=s;
        }
        System.out.printf("Sonuç : " + m + "\n");
        main();
    }
    static void uss(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Taban Değeri: ");
        int s1 = input.nextInt();
        System.out.printf("Üs Değeri: ");
        int s2 = input.nextInt();
        int total = 1;
        for (int i = 0; i < s2; i++) {
            total*= s1;
        }
        System.out.printf("Sonuç: " + total + "\n");
        main();
    }
    static void factor(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Sayi: ");
        int s1 = input.nextInt();
        int total = 1;
        for (int i = 1; i <= s1; i++) {
            total *= i;
        }
        System.out.printf("Sonuç: " + total + "\n");
        main();456785
    }
    static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Modunu Almak İstediğiniz sayiyi giriniz: ");
        int s = input.nextInt();
        System.out.printf("Kaçli Mod Almak İstersiniz: ");
        int s1 = input.nextInt();

        int mod = s% s1;

        System.out.printf("Sonuç: " + mod + "\n");
        main();
    }
    static void AlanCevre(){
        Scanner input = new Scanner(System.in);
        System.out.printf("1.Kenar: ");
        int k = input.nextInt();
        System.out.printf("2.Kenar: ");
        int k1 = input.nextInt();

        int alan = k*k1;
        int çevre = (k+k1)*2;

        System.out.printf("Alan: " + alan + "\nçvere: " + çevre );
    }

    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.printf("İslem Seçiniz:  \"1- Toplama İşlemi\"\n" +
                "                + \"2- Çıkarma İşlemi\"\n" +
                "                + \"3- Çarpma İşlemi\"\n" +
                "                + \"4- Bölme işlemi\"\n" +
                "                + \"5- Üslü Sayı Hesaplama\"\n" +
                "                + \"6- Faktoriyel Hesaplama\"\n" +
                "                + \"7- Mod Alma\"\n" +
                "                + \"8- Dikdörtgen Alan ve Çevre Hesabı\"\n" +
                "                + \"0- Çıkış Yap\"\n : ");

        int select = input.nextInt();
        do{
            switch (select){
                case 1:
                    topla();
                    break;
                case 2:
                    cikar();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                    bol();
                    break;
                case 5:
                    uss();
                    break;
                case 6:
                    factor();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    AlanCevre();
                    break;
                case 0:
                    break;
                default:
                    System.out.printf("Geçersiz İşlem !!!");
            }
        }while (select != 0);

    }
    public static void main(String[] args) {
       main();
    }
}