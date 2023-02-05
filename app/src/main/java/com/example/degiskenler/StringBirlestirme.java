package com.example.degiskenler;

public class StringBirlestirme {

    public static void main(String args[]){

        String yazi="Mehmet";
        String sonuc=yazi+"merhaba";

        String str= "Kişinin adi: " +"Ahmet";
        int not= 80;

        System.out.println(sonuc);
        System.out.println(str);

        String ders=" matematik";
        String OgrenciAdi = "Zeynep";

        String metin= OgrenciAdi+ders+" dersinden "+not+" aldı.";
        System.out.println(metin);

        // dersek    Zeynep matematik dersinden 80 aldı.   şeklinde çıktı olur.

        int x = 50;
        int y=40;
        System.out.println("Toplam = " +(x+y));

        // dersek       Toplam = 90  şeklinde çıktı alırız.








    }
}
