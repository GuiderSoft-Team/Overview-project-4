package day045;

public class Musteri {
    private int no;
    private String adi;
    private String tel;
    private String email;
    private double borcu;


    public Musteri(int no, String adi) {
        this.no = no;
        this.adi = adi;
    }

    public Musteri() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBorcu() {
        return borcu;
    }

    public void setBorcu(double borcu) {
        this.borcu = borcu;
    }

    public double tahsilatYap(double miktar){
     return borcu=borcu-miktar;
    }


    @Override
    public String toString() {
        return String.format("Kimden:info@sirketim.com \nKime:%s \nKonu:Alacaklar\nSayın %s Gecen Ay Ödenmesi Gereken (%5.2f) TL henüz ödenmemiştir.",email,adi,borcu);
    }
}
