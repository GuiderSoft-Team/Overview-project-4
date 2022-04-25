package day040;

public class Main2 {
    public static void main(String[] args) {
/*        int[] sayilar={1,5,7,9,11};
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        System.out.println("Toplam = "+toplam);

        int sayac=0;
        toplam=0;
        while (sayac<sayilar.length){
            toplam+=sayilar[sayac];
            sayac++;
        }
        System.out.println("Toplam = "+toplam);*/

/*        int carpim=1;
        for (int i = 1; i <=5 ; i++) {
            carpim*=i;//carpim=carpim*i;
        }
        System.out.println("Çarpım = "+carpim);*/


        System.out.println("5!= "+faktoriyel(5));
        System.out.println("6!= "+faktoriyel(6));

    }

    public static int faktoriyel(int n){
        int carpim=1;
        for (int i = 2; i <=n ; i++) {
            carpim*=i;
        }
        return carpim;
    }


}
