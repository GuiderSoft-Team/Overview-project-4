package day040;

public class Task {

    public static boolean findPrimeNumber(int num){
        int temp = 0;
        if (num<2) return false;
        for (int i = 2; i < num ; i++) {
            if (num%i==0) {
                temp ++;
            }
        }
        if (temp==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(findPrimeNumber(1));
        System.out.println(findPrimeNumber(-1));
        System.out.println(findPrimeNumber(8));
        System.out.println(findPrimeNumber(31));

        for (int i = 1; i <=100 ; i++) {
            if (findPrimeNumber(i)==true){
                System.out.print(i+" ");
            }
        }
    }

}
