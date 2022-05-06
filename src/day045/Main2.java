package day045;

import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {

        Musteri musteri=new Musteri(001,"zafer");
        musteri.setBorcu(500);


        int no=Integer.parseInt(JOptionPane.showInputDialog("Müşterinin Sicil Nosu:"));
        musteri.setNo(no);

        String adi= JOptionPane.showInputDialog("Müşterinin Adını Giriniz:");
        musteri.setAdi(adi);
        String email= JOptionPane.showInputDialog("Müşterinin E postasını Giriniz:");
        musteri.setEmail(email);

        musteri.tahsilatYap(55);
        System.out.println(musteri);




    }
}

