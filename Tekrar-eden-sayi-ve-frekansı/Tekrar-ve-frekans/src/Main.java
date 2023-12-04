import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20,5, 10, 10, 20, 5, 20};
        int m;
        for (int i = 0; i <list.length-1;i++) {
            for (int j = i+1; j<list.length;j++) {
                if (list[j]>list[i]) {
                    m = list[i];
                    list[i] = list[j];
                    list[j] = m;
                }
            }
        }
        System.out.printf("Sıralama: ");
        for (int k = 0; k< list.length; k++) {
            System.out.printf(" " + list[k]);
        }
        int sayac = 0;
        for (int i = 0; i < list.length-1;) {
            for (int j = i+1; j < list.length; j++) {
                if(list[i]==list[j]){
                    sayac++;
                }
            }
            System.out.printf("\nSayi: " + list[i] + " :Tekrar Sayisi: " + (sayac+1));
            sayac=0;
            i++;
        }
    }

}