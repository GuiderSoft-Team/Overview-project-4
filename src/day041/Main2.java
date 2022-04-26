package day041;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Cümle : ");
        String cumle=input.nextLine();

        Kelimeler kelimeler=new Kelimeler(cumle);
        System.out.println(Arrays.toString(kelimeler.getWords(5).toArray()));

    }
}
