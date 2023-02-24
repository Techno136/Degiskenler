package com.example.degiskenler;

import java.util.Scanner;

public class KonsolGirdi {

    public static void main(String args[]) {

        Scanner tarayaci = new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz :");
        String gelenAd =tarayaci.next();

        // Enter yapmadıkça alttaki satırlara geçmez !!!

        System.out.println("Lütfen yaşınızı giriniz");
        Integer gelenYas= tarayaci.nextInt();

        System.out.println("Lütfen boyunuzu giriniz");
        Double gelenBoy = tarayaci.nextDouble();

        System.out.println("Evli misiniz ?");
        Boolean evlimi = tarayaci.nextBoolean();

        System.out.println("Adınız :"+gelenAd);
        System.out.println("Yaşınız :"+gelenYas);
        System.out.println("Boyunuz :"+gelenBoy);
        System.out.println("Evli mi : "+evlimi);





    }


}
