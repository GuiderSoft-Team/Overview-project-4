package day044;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int toplam=0;
        System.out.println("Ortalaması hesaplanacak 3 sayı giriniz:");
        for (int i=0;i<3;i++){
            System.out.print((i+1)+". sayı : ");
            toplam+=input.nextInt();
        }
        double ortalama=(double) toplam/3;
        System.out.printf("Ortalama = %5.2f",ortalama);
    }
}
