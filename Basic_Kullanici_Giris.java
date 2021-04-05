package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sys_kullanici = "r1mpl3"; // Kullanıcının girdiği kullanici değeri ile kıyaslama yapılan değer
        String sys_sifre = "2810Beyza"; //  Kullanıcının girdiği sifre değeri ile kıyaslama yapılan değer
        int hak = 2; // Kullanıcı yanlış giriş yaptıkça hak değerinden düşülecek

        System.out.println("Kullanıcı Giriş Programına Hoş Geldiniz");
        System.out.println("---------------------------------------");

        while (true){

            System.out.print("Kullanıcı isminizi giriniz: ");
            String kullanici = scanner.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            String sifre = scanner.nextLine();

            // Kullanici ve şifre doğru ise çalışacak blok
            if (kullanici.equals(sys_kullanici) && sifre.equals(sys_sifre)){
                System.out.println("Hoşgeldiniz Sayın " + kullanici);
                break;
            }


            // Kullanıcı adı doğru sifre yanlış girildiğinde çalışacak blok
            else if (kullanici.equals(sys_kullanici) &&  !sifre.equals(sys_sifre)){
                System.out.println("Şifreyi yanlış girdiniz!\n" +
                        "Kalan hakkınız: " + hak);
                hak--; //Kullanıcı yanlış giriş yaptığı için hak değeri azaltılıyor

                // Hak değeri bittiğinde çalışan blok ve kullanıcıya verilen bilgi
                if (hak < 0){
                    System.out.println("Kalan hakkınız bitmiş bulunmaktadır. Lütfen daha sonra tekrar deneyiniz");
                    break;
                }
            }

            // Kullanıcı adı yanlış giriliğ şifre doğru girildiğinde çalışacak blok
            else if (!kullanici.equals(sys_kullanici) && sifre.equals(sys_sifre)){
                System.out.println("Kullanıcı adını yanlış girdiniz!\n" +
                        "Kalan hakkınız: " + hak);
                hak--;
                if (hak < 0){
                    System.out.println("Kalan hakkınız bitmiş bulunmaktadır. Lütfen daha sonra tekrar deneyiniz");
                    break;
                }
            }

            // else bloğunda da kullanıcı adı ve şifre yanlış girildiğinde çalışacak blok
            else {
                System.out.println("Kullanıcı adı ve Şifreyi yanlış girdiniz.\n" +
                        "Kalan hakkınız: " + hak);
                hak--;
                if (hak < 0){
                    System.out.println("Kalan hakkınız bitmiş bulunmaktadır. Lütfen daha sonra tekrar deneyiniz");
                    break;
                }
            }
        }
    }
}
