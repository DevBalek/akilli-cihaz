import java.util.Scanner;

import database.IVeritabaniSurucusu;
import database.PostgreVeritabaniSurucusu;

public class AkilliCihaz {

    public static Durum durum = Durum.kapali;

    public static void main(String[] args) throws Exception {
        durum = Durum.acilisTestiYapiliyor;
        String secim = " ";
        
        
        System.out.println("Sistem Acildi");
        
        durum = Durum.bekleme;
        
        // durum = Durum.servisDisi;
        IVeritabaniSurucusu veritabaniSurucusu = new PostgreVeritabaniSurucusu();
        
        
        
        if(durum == Durum.servisDisi){
            System.out.println("Sistem Servis Disidir.");
            System.exit(1);
        }
        
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                clearScreen();
                                
                System.out.println("\nSistemi baslatmak icin 1'i tuslayiniz");
                System.out.println("------\nSistemi kapatmak icin 0'i tuslayiniz.");
                secim = scanner.nextLine();
                
                if(secim.equals("0")) System.exit(0);
                
            } while (!secim.equals("1"));
            
            
            MerkeziIslemUnitesi merkeziIslemUnitesi = new MerkeziIslemUnitesi();        
            
            System.out.println("Kullanici Adi Giriniz:");
            String kullaniciAdi = scanner.nextLine();
            System.out.println("Sifre Giriniz:");
            String sifre = scanner.nextLine();

            if(veritabaniSurucusu.giris(kullaniciAdi, sifre))
                merkeziIslemUnitesi.sistemiBaslat();


        }
    
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

}
