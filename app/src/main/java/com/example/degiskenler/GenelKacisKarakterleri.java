package com.example.degiskenler;

public class GenelKacisKarakterleri {

    public static void main(String args[]) {

        //  \ işareti ile metinsel ifadelerde " kullanımında karışıklık olmaz.Ayrıca


        String yazi = "Mehmet\" 80\" notunu aldı.";
        System.out.println(yazi);

        // dersek   Mehmet" 80" notunu aldı.    şeklinde çıktı alabiliriz


        // Eğer   "C:user\desktop"  ....   vb  yol tarif edeceksek burada tek \ kullanılırsa hata olur.
        //  Bundan dolayı \\ şeklinde yazmalıyız.

        String dosyaYolu = "C:\\users\\masaüstü";
        System.out.println(dosyaYolu);

        // dersek  C:users\masaüstü  şeklinde çıktı alırız .

        String paragraf = "Merhaba \tnasılsın ?";
        System.out.println(paragraf);

        // dersek  Merhaba 	nasılsın ?    şeklinde çıktı alırız.

        String paragraf2 = "Merhaba,\nnasılsınız.\nKolay gelsin";
        System.out.println(paragraf2);

        //  dersek      Merhaba,         şeklinde alt alta çıktı alabiliriz.
        //              nasılsınız.
        //              Kolay gelsin

        String metin = "Merhaba bu \"android\"\negitimini\\java\\ dili ile öğreneceğiz.";
        System.out.println(metin);

        // dersek      Merhaba bu "android"              şeklinde çıktı alırız.
        //             egitimini\java\ dili ile öğreneceğiz.
        //

        /*
        bu iki sembol arası tüm satırlar yoruma dönüşür, kodlar bybas olup işlemez.Örnek:
         */

        /* String paragraf2 = "Merhaba,\nnasılsınız.\nKolay gelsin";
         System.out.println(paragraf2); */














    }
}
