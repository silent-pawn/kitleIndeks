import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden, örn 1,75 giriniz : ");
        double boy = scan.nextDouble();

        System.out.print("Lütfen kilonuzu girin : ");
        double kilo = scan.nextDouble();

        double indeks = kilo / (boy*boy);
        System.out.println("Vücut kitle indeksiniz: " + indeks);

        String durum = (indeks < 18.5) ?
                "Zayıf"
                : (indeks < 25) ?
                "Normal"
                : (indeks <30) ?
                "Kilolu"
                :"Obez";
        System.out.println("Kilo durumunuz: " + durum);
    }
}