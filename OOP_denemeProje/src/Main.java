import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Televizyon Uygulamanıza Hoş Geldiniz: ");
        Kumanda kumanda = new Kumanda();
        System.out.println("***************************************");
        String islemler = ("""                
                1- Tv Aç
                
                2- Tv Kapat
                
                3- Kanal Değiştir
                
                4- Ses Ayarları
                
                5- Çıkış için q tuşuna basınız
                """);
        System.out.println(islemler);

        // Kullanıcının String islemler kısmından yaptığı seçime göre ekranda gözükmesi gereken methodlar
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir işlem seçiniz: ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Çıkış yapılıyor, iyi günler dileriz..");
                break;
            }
            else if (islem.equals("1")) {
                kumanda.tv_ac();
            }
            else if (islem.equals("2")) {
                kumanda.tv_kapa();
            }
            else if (islem.equals("3")) {
                kumanda.kanal_degistir();
            }
            else if (islem.equals("4")) {
                kumanda.ses_kontrol();
            }
            else {
                System.out.println("Yanlış giriş yaptınız, lütfen tekrar deneyiniz!");
            }

        }
    }
}
