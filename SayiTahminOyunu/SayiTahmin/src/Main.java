import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int randNumber = rand.nextInt(100);
        System.out.println(randNumber);

        int[] list = new int[5];
        int sayac = 5;
        int hataPayı = 0;
        int listInds = 0;
        while(sayac>0){
            System.out.printf("\n"+sayac+" Kere Tahmin Hakkınız Var"+"\nTahmininizi Giriniz: (0 ile 100 aralığında)  : ");
            int number = input.nextInt();
            list[listInds] = number;
            listInds++;
            if(number<0 || number>99){
                if(hataPayı==0){
                    System.out.printf("Aralık dışı sayı girdiniz birdahaki hatalı girişinizde hakkınızdan düşülecektir !!! ");
                }
                if(hataPayı>=1){
                    System.out.printf( hataPayı + " kez aralık dışı sayı girdiniz ve hakkınız azaldı!!!");
                    sayac--;
                }
                hataPayı++;
            }
            if(number>0 && number<100){
                if(randNumber == number){
                    System.out.printf("!*!*! Tebrikler Doğru Tahmin ettiğiniz sayı !*!*! :"+ randNumber +": Kalan Hakkınız : " + sayac);
                    System.out.printf("\nTahminleriniz : " + Arrays.toString(list));

                    break;
                }
                else {
                    System.out.printf("\nYanlış Tahmin :((\n");
                    sayac--;
                    if(sayac==0){
                        System.out.printf(":(((( !!!!!!!!!!! Üzgünüz Kaybettiniz !!!!!!!!!!! :((((");
                        System.out.printf("\nTahminleriniz : " + Arrays.toString(list));
                    }
                }
                }
            }
        }

    }
