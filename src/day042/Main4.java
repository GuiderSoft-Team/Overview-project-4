package day042;

public class Main4 {
    public static void main(String[] args) {
        /*Erişim belirteçleri (Access Modifiers)
            public: Tüm dünyadaki package'lardan erişilebilir
            protected: Aynı package ve aynı package olmasa bile alt sınıflardan
            (default): Aynı package içerisindeki tüm sınıflardan erişilebilir
            private: Sadece tanımlandığı sınıf içinden erişilebilir
        * */
        Kisi k=new Kisi();
        Kisi k500=new Kisi();
        new Kisi();
        //k.adi="Serdar";
        //k.yasi=40;
        k.setAdi("Ahmet");
        k500.setAdi("Fikri");
        System.out.println(k.getAdi());
        System.out.println(k500.getAdi());
        System.out.println("Oluşturulan nesne adedi = "+Kisi.sayac);
    }
}
