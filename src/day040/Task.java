package day040;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    public static ArrayList asallist(int sayi)
    {
        ArrayList <Integer>list=new ArrayList<>();
        for(int x=0;x<sayi;x++)
        {
           if( isPrimeNumber(x,x/2))
           {
              list.add(x);
           }
        }
        return list;
    }
    static boolean isPrimeNumber(int a, int b) {
        if (a < 2)
            return false;
        if (b == 1) {
            return true;
        } else {
            if (a % b == 0) {
                return false;
            } else {
                return isPrimeNumber(a, b - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("sayi giriniz");

        int a = girdi.nextInt();
        int b = a / 2;
        if (isPrimeNumber(a, b)) {
            System.out.println(a + " asal sayidir");

        } else {
            System.out.println(a + " asal degildir");
        }
        System.out.println("girilen sayiya kadar asal olan sayilar:"+ asallist(a));

    }
}