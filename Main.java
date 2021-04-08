package com.company;

import java.util.Scanner;

public class Main {

    public static int cikarma(int a, int b) {

        return (a - b);
    }

    public static double bolme(int a, int b) {

        return ((double) a / b);
    }

    public static int toplama(int a, int b) {

        return (a + b);
    }

    /*
        toplama ve carpma methodunun iki tane olmasının sebebi yazdığımız methoda overloading uyguluyoruz ve
        kullanıcının iki veya üç input girmesi üzerine bu methodlardan birini kullanıyoruz
     */
    public static int toplama(int a, int b,int c) {

        return (a + b + c);
    }

    public static int carpma(int a, int b) {

        return (a * b);
    }

    public static int carpma(int a, int b, int c) {

        return (a * b * c);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String islemler = "1. Toplama işlemi\n" +
                          "2. Çıkarma işlemi\n" +
                          "3. Çarpma işlemi\n" +
                          "4. Bölme işlemi\n" +
                          "Çıkış için q tuşuna basınız.";

        System.out.println("----------------------------");
        System.out.println(islemler);
        System.out.println("----------------------------");

        /*
         Hak değeri kullanıcının 1,2,3,4 veya q dışında herhangi bir değer girmesi sonucunda kullanıcıya hatalı giriş
         yaptığının bilgisini vericez ve giriş hakkından düşürme yapıcaz.
         hak değerini while döngüsünün içine yazdığımızda değerimiz en dıştaki else değerinin içinde hak değeri 1
         azalacak fakat while döngüsünün başına döndüğümüzde hak = 2 olarak tekrar alınacak ve bu yüzden değerimiz
         sürekli 2 olarak kalacak
        */
        int hak = 2;

        while (true) {

            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {

                System.out.println("Programdan çıkılıyor...");
                break;
            }

            else if (islem.equals("1")) {

                System.out.print("Kaç değer toplayacaksınız ? (2 veya 3) ");

                int kacsayi = scanner.nextInt(); // kullanıcının toplamak istediği sayı değerine göre input alıyoruz.

                // Kullanıcının 2 girmesi durumunda çalışacak blok
                if (kacsayi == 2) {

                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine(); /* nextLine döndürmemizin sebebi basta string değerin scanner aldığımız için
                    burada int değeri aldığımızda programın sıkıntı çıkarmaması için yazıyoruz.
                    */

                    System.out.println("Girilen sayıların toplamı: " + toplama(a, b));

                }

                // Kullanıcının 3 girmesi durumunda çalışacak blok
                else if (kacsayi == 3) {

                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların toplamı: " + toplama(a, b, c));

                }

                // Kullanıcının istenilen değerler dışında bir input girmesi durumunda verilecek mesaj
                else {
                    scanner.nextLine();
                    System.out.println("Bunun için uygun method bulunmamaktadır.");
                }
            }

            else if (islem.equals("2")) {
                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıların çıkarma sonucu: " + cikarma(a, b));
            }

            else if (islem.equals("3")) {
                System.out.print("Kaç değer üzerinden çarpma işlemi yapacaksınız? (2 veya 3) ");
                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {

                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların çarpımızı: " + carpma(a, b));
                }

                else if (kacsayi == 3) {

                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların çarpımı: " + carpma(a, b, c));
                }

                else {

                    System.out.println("Bunun için uygun method bulunmamaktadır.");
                    scanner.nextLine(); // burada kullanıcıdan alınan input istenilen değerler dışındaysa ekrana iki
                    // defa İşlemi seçiniz yazdırmaması için yazılmıştır.
                }
            }

            else if (islem.equals("4")) {

                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Girilen sayıların bölme sonucu: " + bolme(a, b));
            }

            else {

                System.out.println("Yanlış işlem girdiniz lütfen tekrar deneyiniz...");

                System.out.println("Kalan hakkınız: " + hak);
                /*
                Kullanıcının yanlış değer girmesi durumunda kalan hak değeri ekrana yazdırılır ve hak değerinden 1
                azaltma yapılır
                 */
                hak--;

                // Kullanıcının hak değerinin bittiyse çalışacak blok
                if (hak < 0) {
                    System.out.println("Çok fazla hatalı giriş yaptınız. Lütfen daha sonra tekrar deneyiniz..");
                    break;
                }

            }
        }
        
    }
}