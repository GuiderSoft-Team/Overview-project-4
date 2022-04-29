package day044.vecizeler;

public class Vecize {
    private String aciklama;
    private String sahibi;

    public Vecize() {
    }

    public Vecize(String aciklama, String sahibi) {
        this.aciklama = aciklama;
        this.sahibi = sahibi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getSahibi() {
        return sahibi;
    }

    public void setSahibi(String sahibi) {
        this.sahibi = sahibi;
    }

    @Override
    public String toString() {
        return String.format("%s [%s]",aciklama,sahibi);
    }
}
