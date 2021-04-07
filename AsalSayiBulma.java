package com.company;

public class Main {

    // boolean değer tanımlaması ile sadece true mu false mu diye kontrol ediyoruz.
    public static boolean asalMi(int sayi) {

        // for döngüsü ile alınan sayının 2'den küçük olunma durumuna bakıyoruz ve eğer küçükse i değerini arttırıyoruz.
        for (int i = 2; i < sayi; i++) {

            /* Alınan değer i değerine tam bölünürse if bloğuna girilir ve false değerini döndürürüz.
            Sayımız 7 ise 2'den küçük olduğu için if bloğuna girer ve tam bölünüyor mu diye kontrol eder eğer
            bölünmüyorsa i değeri 1 artar ve 3 olur 7 / 3 tam bölünüyor mu diye bakar i değeri alınan sayıdan küçük
            olana kadar bu işlem devam eder.
             */

            if (sayi % i == 0) {

                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        // for döngüsü ile hangi sayılar arasını alacağımızı giriyoruz
        for (int i = 2; i < 100; i++) {

            /* Alınan değerini asalMi methoduna yolluyoruz ve kontrolleri yapıyoruz. Eğer alınan sayı method kısmında
            false değerini döndürürse bunu ekrana yazmayız. True değerini döndürdüğünde ekrana o sayı yazılır ve
            i değeri arttırılarak işlem devam eder.
             */
            if (asalMi(i)){
                System.out.println("Asal sayı: " + i);
            }
        }
    }
}
