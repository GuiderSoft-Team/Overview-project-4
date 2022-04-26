package day040;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("5!= "+faktoriyel(5));



    }

    //5*4*3*2*1

    public static int faktoriyel(int n){
        if (n<2) return 1;
        return n*faktoriyel(n-1);
    }
}
