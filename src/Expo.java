import java.util.Scanner;

public class Expo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, r;
        int total = 1;

        System.out.print("Lutfen Ussu Alinacak Sayiyi Giriniz : ");
        n = inp.nextInt();
        System.out.print("Lutfen Us Olacak Sayiyi Giriniz : ");
        r = inp.nextInt();

        for (int i = 1; i <= r; i++) {
            total *= n;
        }

        if (r < 0) {
            System.out.print("Hatali Deger Girdiniz, Lutfen Tekrar Deneyiniz ! ");
        } else {
            System.out.print("Sonuc : " + total);
        }
    }
}