package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, yolculukTipi;
        double kmBasiUcret = 0.10, toplamTutar;
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yaşınızı belirtiniz :");
        yas = inp.nextInt();

        System.out.print("Gideceğiniz kilometreyi belirtiniz :");
        km = inp.nextInt();

        System.out.print("Yolculuk tek tön ise 1 Gidiş-dönüş ise 2 :");
        yolculukTipi = inp.nextInt();


        switch (yolculukTipi) {
            case 1:
                if (yas < 12 && yas > 0) {
                    toplamTutar = (km * kmBasiUcret) / 2;
                    System.out.println("Ödemeniz gereken tutar :" + toplamTutar);
                } else if (yas > 11 && yas < 25) {
                    toplamTutar = (km * kmBasiUcret) * 0.10;
                    System.out.println("Ödemeniz gereken tutar :" + toplamTutar);
                } else if (yas > 24 && yas < 66) {
                    toplamTutar = (km * kmBasiUcret);
                    System.out.println("Ödemeniz gereken tutar :" + toplamTutar);
                } else {
                    toplamTutar = (km * kmBasiUcret) * 0.30;
                    System.out.println("Ödemeniz gereken tutar :" + toplamTutar);
                }
                break;
            case 2:
                if (yas < 12 && yas > 0) {
                    toplamTutar = ((km * kmBasiUcret) / 2) * 2;
                    System.out.println("Ödemeniz gereken tutar :" + toplamTutar);
                } else if (yas > 11 && yas < 25) {
                    toplamTutar = ((km * kmBasiUcret) * 0.10) * 2;
                    System.out.println("Ödemeniz gereken tutar :" + toplamTutar);
                } else if (yas > 24 && yas < 66) {
                    toplamTutar = (km * kmBasiUcret) * 2;
                    System.out.println("Ödemeniz gereken tutar :" + toplamTutar);
                } else {
                    toplamTutar = ((km * kmBasiUcret) * 0.30) * 2;
                    System.out.println("Ödemeniz gereken tutar :" + toplamTutar);
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
        }
    }
}