package day043;

public class Main2 {
    public static void main(String[] args) {
        Kedi kedi=new Kedi();
        kedi.setIsim("Boncuk");
        Kedi kedi1=new Kedi();
        kedi1.setIsim("Mırnav");

        Hayvan hy5=new Kedi();
        hy5.setIsim("Kara");

        kedi.iletisimKur(kedi1);
        kedi.iletisimKur(hy5);
        kedi.iletisimKur(kedi);
    }
}
