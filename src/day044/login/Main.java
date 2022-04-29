package day044.login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Yeni parola: ");
        String parola= input.nextLine();
        System.out.print("Onay parolası: ");
        String onay=input.nextLine();
        if (checkPassword(parola,onay)){
            System.out.println("Parola onaylandı.");
        }else {
            System.err.println("Eşleşme sağlanamadı.");
        }

    }

    public static boolean checkPassword(String password,String confimation){
        return password.equals(confimation);
    }
}
