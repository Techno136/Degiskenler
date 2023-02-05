package com.example.degiskenler;

public class DegiskenKapsami {
    int sayi= 478; //global değişken (public ten dolayı)
    // eğer static int sayı deseydik aşağıdaki main sınıfındaki sayıya erişebilirdik.

    public static void main(String args[]) {
        // sayi=7;
        // Burada hata oluşur .çünkü burası local .Local değiken globalden baskındır.
        // buradan sayı değişkenine ulaşamadık. onun yerine aşağıdaki gibi static olmayan
        // sınıflardan global değişkenlere erişilebilir.

    }

    public void metod1(){
        String yazi= "Mehmet";
        sayi = sayi+50;
        System.out.println("metod1 sayi =" +sayi);

    }

    public void metod2() {
        sayi=788;
        System.out.println("metod2 sayi= "+sayi);
    }




}
