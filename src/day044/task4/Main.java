package day044.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");
        System.out.println("İşlemin sonucu = "+hesapla(input.nextInt()));
    }

    public static int hesapla(int deger){
        return deger*3+1;
    }
}
