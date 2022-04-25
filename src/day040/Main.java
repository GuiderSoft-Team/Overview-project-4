package day040;

import java.util.Scanner;

public class Main {
    private int x;
    public static void main(String[] args) {
        //Task: 1'den 10'a kadar olan sayıların toplamını bulunuz.
        //System.out.println("Toplam = "+getToplam(20));
/*        Scanner input=new Scanner(System.in);
        System.out.print("Başlangıç Değeri : ");
        int baslangic= input.nextInt();
        System.out.print("Bitiş Değeri : ");
        int bitis= input.nextInt();


        System.out.println("Toplam = "+getToplam(baslangic,bitis));*/

//        System.out.println("Toplam = "+nToplam(10));
        System.out.println("Toplam = "+nToplam(0,10,2));

    }

    public static int nToplam(int n){

        return n*(n+1)/2;
    }

    public static int nToplam(int m,int n,int artis){
        int terimSayisi=(n-m)/artis+1;
        return ((n+m)/2)*terimSayisi;
    }

    public static int getToplam(int m, int n){
        //m:10, n: 5
        //m:  5  n: 10 , temp: 5
        if(m>n){
            int temp=n;
            n=m;
            m=temp;
        }
        int toplam=0;
        for (int i = m; i <=n ; i++) {
            toplam+=i;
        }
        return toplam;
    }
    public static int getToplam(int n){
        int toplam=0;
        for (int i = 1; i <=n ; i++) {
            toplam+=i;
        }
        return toplam;
    }
}
