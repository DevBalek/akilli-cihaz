import java.util.Scanner;

import Observer.Publisher;
import Sicaklik.ISicaklikAlgilayici;
import Sicaklik.SicaklikAlgilayiciCelcius;
import islemler.EyleyiciArcelik;
import islemler.IEyleyici;

public class MerkeziIslemUnitesi {

    
    int sonDeger;
    ISicaklikAlgilayici sicaklikAlgilayici;
    IEyleyici eyleyici;
    Publisher p;

    

    public MerkeziIslemUnitesi() {
        sonDeger = 20;
        sicaklikAlgilayici = new SicaklikAlgilayiciCelcius();
        p = new Publisher();
        eyleyici = new EyleyiciArcelik();
    }

    public void sistemiBaslat() throws InterruptedException {
        String quit= " ";
        
        do {
            clearScreen();
            secenekler();
            // try (Scanner scanner2 = new Scanner(System.in)) {
            //     System.out.println("Islemlere Devam Et? (y/..)");
            // }

        } while (!quit.equals("y"));


    }

    void secenekler() throws InterruptedException {

        String secim;
        
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                clearScreen();
                System.out.println("\n-----\nMerkezi Islem Unitesi\n-----\n1 - Sicaklik Goruntule \n2 - Soğutucu Aç\n3 - Soğutucu Kapat\n------\nq-Oturum Sonlandir");
                secim = scanner.nextLine();
            } while (!secim.equals("1") && !secim.equals("2") && !secim.equals("3") && !secim.equals("q"));
        }
        
        switch (secim) {
            case "1":
                // sicaklikAlgilayici.sicaklikOku();    
                System.out.println("secim1");
            break;
            
            case "2":
                sonDeger = eyleyici.sogutucuKapat(sonDeger);
                if (sonDeger < 0) {
                    p.notify("System | Sicaklik 0 derecenin altinda",eyleyici);
                }
            break;
            
            case "3":                
                sonDeger = eyleyici.sogutucuKapat(sonDeger);
                if (sonDeger > 50) {
                    p.notify("System | Sicaklik 50 derecenin üzerinde",eyleyici);
                }            
            break;
            
            case "q":
                System.out.println("Sistem Kapaniyor...");
                Thread.sleep(200);
                System.exit(0);
            break;

            default:
                break;
        }        

    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

}
