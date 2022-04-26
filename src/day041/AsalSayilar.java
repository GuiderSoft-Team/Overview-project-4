package day041;

public class AsalSayilar {
    private int[] sayilar;


    public int[] getPrimeNumbers(int value){
        for (int i = 0; i <= value; i++) {
            if(isPrime(i)){
                if(sayilar==null){
                    sayilar=new int[1];
                    sayilar[0]=i;
                }else {
                    int[] temp = new int[sayilar.length];
                    for (int j = 0; j < sayilar.length; j++) {
                        temp[j] = sayilar[j];
                    }
                    sayilar = new int[sayilar.length + 1];
                    for (int j = 0; j < temp.length; j++) {
                        sayilar[j] = temp[j];
                    }
                    sayilar[sayilar.length - 1] = i;
                }
            }
        }
        return sayilar;
    }

    public boolean isPrime(int number){
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
