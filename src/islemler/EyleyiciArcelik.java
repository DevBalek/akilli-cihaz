package islemler;

public class EyleyiciArcelik implements IEyleyici{

   
    @Override
    public int sogutucuAc(int sonDeger) throws InterruptedException {
        System.out.println("ARCELIK | Sogutucu aciliyor...");
        Thread.sleep(100);        
        System.out.println("ARCELIK | Sogutucu acildi.");
        return sonDeger-10;
    }

    @Override
    public int sogutucuKapat(int sonDeger) throws InterruptedException {
        System.out.println("ARCELIK | Sogutucu kapaniyor...");
        Thread.sleep(100);        
        System.out.println("ARCELIK | Sogutucu kapandi.");   
        return sonDeger + 10;
    }
    
}
