package day040;

import java.util.Scanner;

public class TaskOverview4 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int sayi=input.nextInt();
        int temp = 0;

        for (int i = 2; i <sayi/2 ; i++) {
            if(sayi%2==0){
                temp ++;
            }
        }
        if(temp==0){
            System.out.println("Sayınız asal sayıdır.");
        }else {
            System.out.println("Sayınız asal sayı değildir.");
        }

    }


}















       /* if(sayi<1){
            System.out.println("1 den buyuk sayilar, asal sayi olabilir");
        }
        else{
            for(int i=1;i<=sayi;i++){
                int kalan=sayi%i;
                if(kalan==0){
                    temp++;
                }
            }
            if(temp==2){
                System.out.println("Sayınız asal sayıdır");
            }
            else{
                System.out.println("Saynız asal sayı değildir");
            }
        }*/

