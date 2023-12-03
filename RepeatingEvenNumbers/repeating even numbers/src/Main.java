public class Main {
    public static void main(String[] args) {
        int[] list = {55,66,55,66,2,4,66,2,10};
        int s = list.length-1;
        int sayac = 0;
        for (int i = 0; i < list.length;) {
            for (int j = s; j >0 ; j--) {
                    if(list[i]%2==0 && list[j]%2==0 &&list[i] == list[j]){
                        if(sayac>=1){
                            System.out.println("\n**** TEKRAR EDEN  SAYİ ****\n : "+list[i]+"--İndis No:"+i);
                            break;
                        }
                        sayac++;
                    }
            }
            i++;
            sayac=0;
        }
    }
}