package day044.findingvalue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] sayilar={5,9,2,7,6,2};
        int result;
        Scanner input=new Scanner(System.in);
        System.out.print("Aradığınız değer: ");
        int deger=input.nextInt();
        if((result=findValue(sayilar,deger))!=-1){
            System.out.printf("Aradığınız değerin index numarası: %d",result);
        }else {
            System.err.println("Aradığınız değer bulunamadı.");
        }
    }

    public static int findValue(int[] dizi,int deger){
        int result=-1;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]==deger){
                result=i;
                break;
            }
        }
        return result;
    }
}
