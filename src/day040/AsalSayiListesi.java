package day040;

public class AsalSayiListesi {
    public static void main(String[] args) {


        System.out.println("1'den 100'e kadar asal saılar");
        System.out.println("-".repeat(33));
        int temp = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
            int deger = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    deger = 1;
                    break;
                }
            }
            if(deger==0)
            {
                System.out.print(sayi+" ");
                temp++;
            }
        }
    }
}
