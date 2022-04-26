package day041;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*        for (int i = 0; i <= 100; i++) {
            System.out.println(i+" sayısı "+(isPrime(i)?"asaldır.":"asal değildir."));
        }*/


        AsalSayilar as=new AsalSayilar();
        int[] asallar=as.getPrimeNumbers(100);

        System.out.println(Arrays.toString(asallar));
        System.out.printf("%d adet asal sayı bulundu.",asallar.length);


    }

    public static boolean isPrime(int number){
        //Sıfırdan küçük ise false
        if(number<2){
            return false;
        }
        //2 veya 3 ise true
        if(number==2||number==3){
            return true;
        }

        //2'ye tam bölünen bütün sayılar false
        if(number%2==0){
            return false;
        }
        //Sayının Karekökünü alıyoruz
        int sqrt=(int) Math.sqrt(number)+1;
        for (int i = 3; i <sqrt ; i+=2) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
