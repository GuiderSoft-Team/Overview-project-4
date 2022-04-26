package day041;

import java.util.ArrayList;

public class Kelimeler {
    private ArrayList<String> liste;
    private String cumle;

    public Kelimeler(String cumle) {
        this.cumle=cumle;
        liste=new ArrayList<>();
    }


    public ArrayList<String> getWords(int harfAdedi){
        cumle=cumle.replaceAll(",","");
        String[] kelimeler=cumle.split(" ");
        for(String kelime:kelimeler){
            if(kelime.length()==harfAdedi){
                liste.add(kelime);
            }
        }
        return liste;
    }
}
