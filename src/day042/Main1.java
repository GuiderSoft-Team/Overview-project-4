package day042;

public class Main1 {
    public static void main(String[] args) {
        int x = 7;
        System.out.println("x= " + x);
        int y = x;
        System.out.println("y= " + y);
        y = 5;
        System.out.println("y= " + y);
        System.out.println("x= " + x);


        bilgiDuzenle(x);
        System.out.println("x= " + x);
    }

    public static void bilgiDuzenle(int x) {
        x = 5;
    }
}
