package com.example.degiskenler;

public class PrimitifTipKopyalama {

    public static void main(String args[]) {

        int sayi1=30;
        int sayi2 = sayi1;

        sayi1 = sayi2+5;

        System.out.println("sayı1= "+sayi1);
        System.out.println("sayı2= "+sayi2);

        // burada sayı1= 35 , sayı2 = 30 çıkar.Çünkü sadece sayı1 değişir.

        int x = 60;
        int y = 50;
        y=x;

        x= 80;
        System.out.println("x= "+x);
        System.out.println("y= "+y);

        // denirse x= 80 , y=60 olacaktır.Çünkü biz sonradan x'i değiştirdik. y'nin bundan haberi yok





    }
}
