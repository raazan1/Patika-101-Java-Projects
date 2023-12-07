import java.util.Scanner;
public class Main {
    static boolean Palindrome(String kelime){
        int sayac = 0;
        for (int j = kelime.length()-1; j >=0 ; ) {
            if(kelime.charAt(sayac) == kelime.charAt(j)){
                return true;
            }
            sayac++;
            j--;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Kelime Giriniz: ");
        String kelime = input.nextLine();


        System.out.println(Palindrome(kelime));




    }

}