package day040;

import java.util.Scanner;

public class AsalSayiBul {
   public static boolean isAsal(int number){
        int count=0;

        if(number==1){//Bir, asal sayı olmadıgı için countun varsayılan değerini bir artırdık.yoksa bir için true döner
            count++;
        }

        for (int i = 2; i <number ; i++) {
            if(number%i==0){

                count++;
            }
        }
        if(count==0){

            return true;
        }else {

            return false;
        }


    }

    public static void asal(int number){


        for (int i = 1; i <=number ; i++) {
            if(isAsal(i)){
                System.out.print(i+",");
            }
        }

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz:");
        int number= input.nextInt();

        System.out.println(isAsal(number));//asal sayı sorgulama
        asal(100);// 100 e kadar asal sayıları yazdıran metot


    }
}
