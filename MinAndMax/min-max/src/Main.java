import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        List<Integer> NewList=new ArrayList<Integer>();


        System.out.printf("Kaç Adet Sayı Girmek İstersiniz: ");
        int s = input.nextInt();

        for (int i = 0; i < s; i++) {
            System.out.printf("Sayi Giriniz: ");
            int s2 = input.nextInt();
            list.add(s2);
            NewList.add(s2);
        }
        for (int i = 0; i < s; i++) {
            if(list.size()==1){
                System.out.printf("\nEn Büyük Değer: "+list);
                break;
            }
            else if(list.get(0)> list.get(1)){
                list.remove(1);
            }
            else {
                list.remove(0);
            }
        }

        for (int i = 0; i < s; i++) {
            if(NewList.size()==1){
                System.out.printf("\nEn Küçük Değer: "+NewList);
                break;
            }
            else if(NewList.get(0)< NewList.get(1)){
                NewList.remove(1);
            }
            else {
                NewList.remove(0);
            }

        }




    }
}