import java.util.Scanner;

import Observer.Subscriber2;
import Observer.Publisher;
import Observer.Subscriber1;
import Sicaklik.ISicaklikAlgilayici;
import Sicaklik.SicaklikAlgilayiciCelcius;
import islemler.EyleyiciArcelik;
import islemler.IEyleyici;

public class MerkeziIslemUnitesi {

        
    ISicaklikAlgilayici sicaklikAlgilayici;
    IEyleyici eyleyici;
    Publisher p;

    

    public MerkeziIslemUnitesi() {        
        sicaklikAlgilayici = new SicaklikAlgilayiciCelcius();
        p = new Publisher();
        eyleyici = new EyleyiciArcelik();
        p.attach(new Subscriber1());       
        p.attach(new Subscriber2());        
    }

    public void sistemiBaslat() throws InterruptedException {
                        
        secenekler();

    }

    void secenekler() throws InterruptedException {

        String secim;
        
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                clearScreen();
                System.out.println("\n-----\nMerkezi Islem Unitesi\n-----\n1 - Sicaklik Goruntule \n2 - Soğutucu Aç\n3 - Soğutucu Kapat\n------\nq-Oturum Sonlandir");
                
                secim = scanner.nextLine();
                
                
                switch (secim) {
                    case "1":
                        sicaklikAlgilayici.sicaklikOku();
                        if (sicaklikAlgilayici.getSicaklik() < 0) {
                            p.notify("Sicaklik 0 derecenin altinda",eyleyici);
                        }else if (sicaklikAlgilayici.getSicaklik() > 50) {
                            p.notify("Sicaklik 50 derecenin üzerinde",eyleyici);
                        }                          
                    break;
                    
                    case "2":
                        sicaklikAlgilayici.setSicaklik(eyleyici.sogutucuAc(sicaklikAlgilayici.getSicaklik()));
                        if (sicaklikAlgilayici.getSicaklik() < 0) {
                            p.notify("Sicaklik 0 derecenin altinda",eyleyici);
                        }else if (sicaklikAlgilayici.getSicaklik() > 50) {
                            p.notify("Sicaklik 50 derecenin üzerinde",eyleyici);
                        }            
                    break;
                    
                    case "3":                
                        sicaklikAlgilayici.setSicaklik(eyleyici.sogutucuKapat(sicaklikAlgilayici.getSicaklik())); 
                        if (sicaklikAlgilayici.getSicaklik() < 0) {
                            p.notify("Sicaklik 0 derecenin altinda",eyleyici);
                        }else if (sicaklikAlgilayici.getSicaklik() > 50) {
                            p.notify("Sicaklik 50 derecenin üzerinde",eyleyici);
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
                
                System.out.println("Kapatmak icin q, devam etmek icin herhangi bir tusa basiniz");                
                secim = scanner.nextLine();

            } while (!secim.equals("q"));
        }
                
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

}
