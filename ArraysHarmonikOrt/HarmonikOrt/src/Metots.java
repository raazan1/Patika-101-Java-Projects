public class Metots {
    static boolean average(int[] list){
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum +=list[i];
        }
        System.out.println(sum/list.length);

        return true;
    }

    static boolean Harmonic(int[] dizi){
        double toplam = 0.0;
        for(int i = 0; i < dizi.length; i++)
            toplam += 1.0 / dizi[i];
        double harmonikOrtalama = (double) dizi.length / toplam;
        System.out.println(harmonikOrtalama);
        return true;
    }
}
