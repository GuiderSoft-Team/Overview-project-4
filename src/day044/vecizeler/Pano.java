package day044.vecizeler;

import java.util.ArrayList;

public class Pano {
    private ArrayList<Vecize> vecizeler;

    public Pano() {
        vecizeler=new ArrayList<>();
    }

    public void vecizeEkle(Vecize vecize){
        vecizeler.add(vecize);
    }

    public void yayinla(){
        int index=(int)(Math.floor(Math.random()*vecizeler.size()));
        System.out.println(vecizeler.get(index));
    }
}
