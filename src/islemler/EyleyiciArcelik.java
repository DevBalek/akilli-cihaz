package islemler;

public class EyleyiciArcelik implements IEyleyici{

    @Override
    public void sogutucuAc() {
        System.out.println("Arcelik | Sogutucu aciliyor...");
        System.out.println("Arcelik | Sogutucu acildi.");
        
    }

    @Override
    public void sogutucuKapat() {
        System.out.println("Arcelik | Sogutucu kapaniyor...");
        System.out.println("Arcelik | Sogutucu kapandi.");   
        
    }
    
}
