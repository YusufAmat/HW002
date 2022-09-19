import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        //TODO: Write a Java program that will accept two numbers and check if two numbers are equal or not.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen birinci sayiyi giriniz : ");
        int sayi1 = scanner.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        int sayi2 = scanner.nextInt();
        if (sayi1 == sayi2) {
            System.out.println("Girmis oldugunuz " + sayi1 + " sayisi ile " + sayi2 + " sayisi birbirine esittir.");
        } else {
            System.out.println("Girmis oldugunuz " + sayi1 + " sayisi ile " + sayi2 + " sayisi birbirine esit degildir.");
        }
    }
}
