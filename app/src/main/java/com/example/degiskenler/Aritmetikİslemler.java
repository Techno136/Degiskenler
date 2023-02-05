package com.example.degiskenler;

public class Aritmetikİslemler {

    public static void main(String args[]){

        double DaireAlani;
        double pi= 3.14;
        int yariCap= 2;

        DaireAlani=pi*yariCap*yariCap;
        System.out.println("Daire alanı= "+DaireAlani);

        int x ;
        int v=30;
        int v0=40;
        int t = 5;

        x= ((v+v0)/2)*t;

        System.out.println("x= "+x);

        // Aritmetik operatör ipuçları

        int a = 10;
        a = a+7;    // yerine
        // a +=7    // yazılırsa aynı olur.
        System.out.println("a= "+a);
        a+=9;
        System.out.println("a= "+a);

        //dersek bir önceki satırda a= 17 değerini aldığından yeni a=17+9= 26 olacak.

        int b =20;
        b=b/5;

        System.out.println("b= "+b);

        // b=4

        // yerine b/=2 ;  de yazılabilir . b=2

        b/=2;
        System.out.println("b= "+b);

        int c =2;   // c=2 atadık   c=2 olur
        int d=c++;  // önce d=c yap sonra c yi 1 artırır.    d=2 ve c= 3 oldu
        int e=c--;  // önce yukarıda değeri değişen c yi e ye ata.Sonra 1 çıkar.      e=3 ve c=2 ye düşer


        System.out.println("c="+c);
        System.out.println("d= "+d);
        System.out.println("e= "+e);

        int m=2 ;    // m=2
        int n=++m;  // önce m yi 1 artırıp sonra n e atar.  n=3 ve m=3 olur.
        int p=--m;  // önce m den 1 çıkarıp sonra p ye atar.  p=2 ve m=2 olur

        System.out.println("m="+m);
        System.out.println("n= "+n);
        System.out.println("p= "+p);

        int carpim=30;
        carpim *=50;

        System.out.println("carpim= "+carpim);


















    }
}
