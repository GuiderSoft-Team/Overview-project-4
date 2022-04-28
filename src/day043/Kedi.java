package day043;

//Kedi: subclass, child
//Hayvan: superclass, parent
public class Kedi extends Hayvan{
    private String gozRengi;
    private String cinsi;

    public String getGozRengi() {
        return gozRengi;
    }

    public void setGozRengi(String gozRengi) {
        this.gozRengi = gozRengi;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    @Override
    public void iletisimKur(Hayvan hayvan) {
        if(hayvan==null||hayvan==this){
            System.err.println("İletişim kurulacak bir hayvan bulunmuyor.");
        }else {
            System.out.println("Kedi " + this.getIsim() + ", " + hayvan.getIsim() + " ile iletişim kurdu.");
        }
    }
}
