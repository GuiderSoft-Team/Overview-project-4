package day043;

public class Main {
    public static void main(String[] args) {
        Hayvan myHayvan=new Hayvan();
        myHayvan.setYasi(2);
        myHayvan.setAgirlik(3.2);
        myHayvan.setIsim("Hayvan 1");

        Hayvan hayvan2=new Hayvan();
        hayvan2.setYasi(5);
        hayvan2.setAgirlik(10.7);
        hayvan2.setIsim("Hayvan 2");
        myHayvan.iletisimKur(hayvan2);


    }
}
