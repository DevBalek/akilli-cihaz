package islemler;

public class EyleyiciArcelik implements IEyleyici{

   
    @Override
    public int sogutucuAc(int sonDeger) throws InterruptedException {
        System.out.println("ARCELIK | Sogutucu aciliyor...");
        Thread.sleep(100);        
        System.out.println("ARCELIK | Sogutucu acildi.");
        System.out.println("ARCELIK | Soğutma * " + sonDeger + " -> " + (sonDeger-10));
        sonDeger -= 10;
        return sonDeger;
    }
    
    @Override
    public int sogutucuKapat(int sonDeger) throws InterruptedException {
        System.out.println("ARCELIK | Sogutucu kapaniyor...");
        Thread.sleep(100);        
        System.out.println("ARCELIK | Sogutucu kapandi.");   
        System.out.println("ARCELIK | Soğutma Kapali * " + sonDeger + " -> " + (sonDeger + 10));
        
        sonDeger += 10;
        return sonDeger;
    }
    
}
