import java.util.Scanner;

import Factory.IFactoryMaker;
import Factory.SicaklikAlgilayiciFactory;
import Factory.EyleyiciFactory;
import Factory.FactoryIstemci;
import Observer.Subscriber2;
import Observer.Publisher;
import Observer.Subscriber1;
import Sicaklik.ISicaklikAlgilayici;
import islemler.IEyleyici;

public class MerkeziIslemUnitesi {

        
    ISicaklikAlgilayici sicaklikAlgilayici;
    IFactoryMaker eyleyicifFactoryMaker;
    IFactoryMaker sicaklikAlgilayicifFactoryMaker;
    IEyleyici eyleyici;
    Publisher p;

    public MerkeziIslemUnitesi() {        

        FactoryIstemci mergeFactoryModules = new FactoryIstemci(new EyleyiciFactory(), new SicaklikAlgilayiciFactory());

        sicaklikAlgilayici = (ISicaklikAlgilayici) mergeFactoryModules.sicaklikAlgilayiciModul();
        eyleyici = (IEyleyici) mergeFactoryModules.eyleyiciModul();
        
        p = new Publisher();
        p.attach(new Subscriber1());       
        p.attach(new Subscriber2());        
    }

    public void sistemiBaslat() throws InterruptedException {
        AkilliCihaz.durum = Durum.bekleme; 
        System.out.println("\nYönlendiriliyorsunuz...");
        Thread.sleep(1000);               
        secenekler();

    }

    void secenekler() throws InterruptedException {

        String secim;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                // clearScreen();
                System.out.println("\n-----\nMerkezi Islem Unitesi\n-----\n1 - Sicaklik Goruntule \n2 - Soğutucu Aç\n3 - Soğutucu Kapat\n------\nq-Oturum Sonlandir");
                

                secim = scanner.nextLine();
                AkilliCihaz.durum = Durum.algilama;
                
                switch (secim) {
                    case "1":
                    AkilliCihaz.durum = Durum.islemYapiliyor;

                        sicaklikAlgilayici.sicaklikOku();
                        if (sicaklikAlgilayici.getSicaklik() < 0) {
                            p.notify("Sicaklik 0 derecenin altinda",eyleyici);
                        }else if (sicaklikAlgilayici.getSicaklik() > 50) {
                            p.notify("Sicaklik 50 derecenin üzerinde",eyleyici);
                        }                          
                    break;
                    
                    case "2":
                    AkilliCihaz.durum = Durum.islemYapiliyor;

                        sicaklikAlgilayici.setSicaklik(eyleyici.sogutucuAc(sicaklikAlgilayici.getSicaklik()));
                        if (sicaklikAlgilayici.getSicaklik() < 0) {
                            p.notify("Sicaklik 0 derecenin altinda",eyleyici);
                        }else if (sicaklikAlgilayici.getSicaklik() > 50) {
                            p.notify("Sicaklik 50 derecenin üzerinde",eyleyici);
                        }            
                    break;
                    
                    case "3":       
                    AkilliCihaz.durum = Durum.islemYapiliyor;         
                        sicaklikAlgilayici.setSicaklik(eyleyici.sogutucuKapat(sicaklikAlgilayici.getSicaklik()));                                              
                        if (sicaklikAlgilayici.getSicaklik() < 0) {
                            p.notify("Sicaklik 0 derecenin altinda",eyleyici);
                        }else if (sicaklikAlgilayici.getSicaklik() > 50) {
                            p.notify("Sicaklik 50 derecenin üzerinde",eyleyici);
                        }          
                    break;
                    
                    case "q":
                    AkilliCihaz.durum = Durum.islemYapiliyor;
                        System.out.println("Sistem Kapaniyor...");
                        Thread.sleep(200);
                    AkilliCihaz.durum = Durum.kapali;
                        System.exit(0);
                    break;
        
                    default:
                        break;
                }        
                System.out.println("Kapatmak icin q, devam etmek icin herhangi bir tusa basiniz");                
                
                AkilliCihaz.durum = Durum.algilama;    
                secim = scanner.nextLine();

            } while (!secim.equals("q"));
            AkilliCihaz.durum = Durum.kapali;
        }
                
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

}
