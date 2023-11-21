public class Main {
    public static void main(String[] args) {
        int sayac = 2;
        int sayac1 =0;
        while (sayac<=100){
            for (int i = 2; i <= 100; i++) {
                if (sayac %i == 0) {
                    sayac1++;
                }
            }
            if (sayac1 >2) {
                System.out.printf(sayac + " :Asal Değil\n");
                sayac1=0;
            }
            else {
                System.out.printf(sayac + " :Asal\n");
                sayac1=0;
            }

            sayac++;

        }
    }
}