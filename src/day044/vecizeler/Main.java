package day044.vecizeler;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pano pano1=new Pano();
        pano1.vecizeEkle(new Vecize("Cennet anaların ayakları altındadır.","HZ. MUHAMMED (S.A.V)"));
        pano1.vecizeEkle(new Vecize("Cahil kimsenin yanında kitap gibi sessiz ol.","MEVLANA"));
        pano1.vecizeEkle(new Vecize("Camdan evde oturanlar başkalarına taş atmamalıdırlar.","G. NERBERT"));
        pano1.yayinla();
    }
}
