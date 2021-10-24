import java.util.Scanner;

public class Kumanda {
    private String kanal = "EbegümeTv" ;
    private int ses = 25;
    private String tv_durum = "Kapalı" ;

    public Kumanda() {

    }

    Scanner scanner = new Scanner(System.in);

    // Tv açılacağı zaman tv'nin duruma göre yapılması gerekenler
    public void tv_ac() {
        if (tv_durum.equals("Açık")) {
            System.out.println("Televizyon zaten açık");
        }
        else {
            System.out.println("Televizyon açılıyor..");
            this.tv_durum = "Açık";
        }
    }

    // Tv kapanacağı zaman tv'nin duruma göre yapılması gerekenler
    public void tv_kapa() {
        if (tv_durum.equals("Kapalı")) {
            System.out.println("Televizyon zaten kapalı");
        }
        else {
            System.out.println("Televizyon kapatılıyor..");
            this.tv_durum = "Kapalı";
        }
    }

    // Tv'nin güncel sesinin öğrenilmesi ve sesin arttırılması (+) azaltılması (-) işlemleri
    public void ses_kontrol() {

        System.out.println("Televizyonun sesi: " + ses + " yüksekliğinde");

        /*
        While döngüsünün içinde if,else işlemlerimizi yapmamızın sebebi sesi bir kere kıstıktan sonra tekrardan bize
        hangi işlemi yapmak istediğimizi yani ana while döngüsüne yönlendirmemesi içindir.
         */
        while(true) {
            System.out.print("Televizyon sesini arttıkmak için + tuşuna, azaltmak için - tuşuna basınız: ");

            String ses_ayar = scanner.nextLine();

            // Sesin arttılması durumunda
            if (ses_ayar.equals("+")) {
                // Sesin max. seviyeye ulaşması durumunda
                if (ses >= 100){
                    System.out.println("Maksimum ses seviyesine ulaştınız. Ses daha fazla yükseltilemez");
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                }
                // Ses max. seviyeye gelmediyse arttırılmaya devam edilmesi halinde
                else {
                    ses += 5;
                    System.out.println("Ses seviyesi arttırıldı.\nSes Seviyesi: " + ses);
                    System.out.println("**********************************************4");
                }
            }
            //Sesin azaltılması durumunda
            else if (ses_ayar.equals("-")) {
                // Sesin min. seviyeye ulaşılması durumunda
                if (ses <= 0) {
                    System.out.println("Minimum ses seviyesine ulaştınız. Ses daha fazla kısılamaz!");
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                }
                // Ses min. seviyeye gelmediyse azaltılmaya devam edilmesi halinde
                else {
                    ses -= 5;
                    System.out.println("Ses seviyesi azaltıldı.\nSes Seviyesi: " + ses);
                    System.out.println("**********************************************4");
                }
            }
            // Ses ayarlarının yapıldığı döngünden çıkmak için
            else if (ses_ayar.equals("q")){
                System.out.println("Çıkış yapılıyor...\nGüncel Ses Seviyesi: " + ses);
                break;
            }
            // Kullanıcıdan istenilen girişler dışında giriş yapılması durumunda
            else {
                System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz...");

            }
        }
    }

    public void kanal_degistir() {

        System.out.println("Bulunduğunuz kanal: " + kanal);
        System.out.print("Geçmek istediğiniz kanalı yazınız: ");
        String new_kanal = scanner.nextLine();

        System.out.println("Yeni kanal: " + new_kanal);
    }
}
