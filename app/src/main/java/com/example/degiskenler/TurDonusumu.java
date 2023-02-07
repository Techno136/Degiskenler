package com.example.degiskenler;

public class TurDonusumu {

    public static void main(String[] args) {

        // ondalıklı sayıdan tamsayıya dönüşüm (küçükten büyüğe)

        double d=23.56;
        long l= (long) d;
        int i= (int) l;

        System.out.println("Double değer="+d);
        System.out.println("long değer= "+l);
        System.out.println("integer değer= "+i);

        int x=67;
        long y=x;
        double z=y;

        //tam sayıdan ondalık sayıya dönüşüm (büyükten küçüğe)

        System.out.println("x = "+x);
        System.out.println("y= "+y);
        System.out.println("z= "+z);

        // sayıdan metine dönüşüm yöntemleri 3 yol
        int sayi=56;
        String yazi1= String.valueOf(sayi);
        String yazi2=Integer.toString(sayi);
        String yazi3=sayi+"";

        System.out.println(yazi1);
        System.out.println(yazi2);
        System.out.println(yazi3);

        //metinden sayıya dönüşüm yöntemleri 2 yol
        String metin="56";
        int sayi1=Integer.parseInt(metin);
        int sayi2=Integer.valueOf(metin);

        System.out.println(sayi1);
        System.out.println(sayi2);











    }
}
