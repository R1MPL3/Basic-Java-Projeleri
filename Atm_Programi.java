package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        While döngüsü ile Atm Programı

        İşlemler;
        1. İşlem : Bakiye Öğrenme
        2. İşlem : Para Çekme
        3. İşlem : Para Yatırma
        q tuşuna basıldığında programdan çıkılsın
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ziravak Atmsine HoşGeldiniz...");

        String islemler = ("1- Bakiye Öğrenme\n" +
                           "2- Para Çekme\n" +
                           "3- Para Yatırma\n" +
                           "4- Çıkmak için 'q' tuşuna basınız");
        System.out.println("------------------------------------");
        System.out.println(islemler);
        System.out.println("------------------------------------");

        int bakiye = 1000; // Program başladığında hesapta bulunan paranın miktarı
        int hak = 3; // Kullanıcı hatalı giriş yaptığında azalacak olan giriş hakkı

        while (true){

            System.out.print("Bir işlem seçiniz: ");
            String secim = scanner.nextLine();

            if (secim.equals("q")){
                System.out.println("Bizi tercih ettiğiniz için teşekkür eder, iyi günler dileriz...");
                break;
            }
            
            else if (secim.equals("1")){
                System.out.println("Mevcut bakiyeniz: " + bakiye + "₺'dir");
            }
            
            else if (secim.equals("2")){
                System.out.print("Hesabınızdan çekmek istediğiniz miktar: ");
                int cek = scanner.nextInt();
                scanner.nextLine(); // String bir scanner aldığımız için int scan aldıktan sonra bu kodu girmemiz gerekiyor. Aksi halde olduğunda while bize true değerini
                // döndürdüğü sırada biz if'in içine girersek (aşağıdaki if) çıktıktan sonra ekrana iki defa Bir işlem seçiniz yazısı çıkacak ve alt satıra geçilmeden yazacak.
                
                if (cek > bakiye){ // Çekilmek istenen miktar hesapta bulunandan yüksek ise
                    System.out.println("Yeterli bakiyeniz bulunmamaktadır!");
                }
                
                else{
                    bakiye -= cek; // Çekilmek istenen miktar hesapta bulunan paraya eşit veya daha düşük ise bakiyeden bu miktar düşürülür
                    System.out.println("Hesabınızdan " + cek + "₺ çekilmiştir."); // Kullanıcıya çekilen miktarın bilgisi verilir.
                }
            }
            
            else if (secim.equals("3")){
                System.out.print("Hesabınıza yükleyeceğiniz miktar: ");
                int yatir = scanner.nextInt();
                scanner.nextLine(); // Yukarıda string bir scanner aldığımız için int scan aldıktan sonra scanner.NextLine(); almamız gerekli
                bakiye += yatir; // Kullanıcı hesaba yükleyeceği paranın miktarını girdikten sonra hesabına girilen paranın tanımlanması
                System.out.println("Hesabınıza " + yatir + "₺ yüklenmiştir."); // Kullanıcıya yüklenen paranın miktarı hakkında bilgi verilir.
            }
            
            else {
                System.out.println("Hatalı giriş yaptınız tekrar deneyiniz.");
                hak--;
                System.out.println("Kalan deneme hakkınız: " + hak); // Kullanıcı yanlış bir değer girdiğinde kalan hak değeri gösterilir ve her seferinde düşürülür.

                if (hak <= 0){ // Kullanıcıya tanımlanan hak kadar yanlış giriş gerçekleştiyse burası çalışır.
                    System.out.println("Çok fazla hatalı giriş yaptınız. Lütfen daha sonra tekrar deneyiniz.\n" +
                            "Ziravak Atmsi İyi Günler Diler...");
                    break;
                }
            }
        }
    }
}
