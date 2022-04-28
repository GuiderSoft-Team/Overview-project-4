package day043;

public class Hayvan {
    private int yasi;
    private double agirlik;
    private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public void iletisimKur(Hayvan hayvan){
        if(hayvan==null){
            System.out.println("Hayvan kendi kendine ses çıkarıyor.");
        }else {
            System.out.println(this.getIsim()+ ", '"+hayvan.getIsim()+"' ile iletişim kuruyor.");
        }
    }
}