package day042;

public class Kisi {
    static int sayac;
    private String adi;
    private int yasi;

    public Kisi() {
        Kisi.sayac++;
    }

    public Kisi(String adi, int yasi) {
        this.adi = adi;
        this.yasi = yasi;
        Kisi.sayac++;
    }



    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    public void setAdi(String adi){
        this.adi=adi;
    }

    public String getAdi(){
        return adi;
    }


    void konus() {
        System.out.println("Kişi konuşuyor.");
    }
}
