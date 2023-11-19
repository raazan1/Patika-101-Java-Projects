import javax.accessibility.AccessibleText;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Attempt = 3;
        int Balance = 5000;
        int Select;
        while (Attempt>0){
            System.out.printf("Kullanıcı Adı:");
            String UserName = input.nextLine();

            System.out.printf("Şifre:");
            String Password = input.nextLine();

            if(UserName.equals("Melik") && Password.equals("1234")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do{
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    Select = input.nextInt();
                    switch (Select){
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            Balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            int price1 = input.nextInt();
                            if (price1 > Balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                Balance -= price1;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + Balance);
                            break;
                        default:
                            System.out.printf("Geçersiz İşlem !!!");
                    }

                }while (Select !=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            }
            else{
                Attempt--;
                System.out.printf("Hatalı Kullanıcı Adı veya Parola: ");
                if (Attempt == 0) {
                    System.out.printf("Hesabınız Bloke Olmuştur !!!");
                }
                else {
                    System.out.printf("Kalan Hakkınız: " + Attempt);
                }


            }


        }
    }
}