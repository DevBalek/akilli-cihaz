package islemler;

public class EyleyiciHotspot implements IEyleyici{

    @Override
    public void sogutucuAc() {
        System.out.println("HOTSPOT | Sogutucu aciliyor...");
        System.out.println("HOTSPOT | Sogutucu acildi.");
        
    }

    @Override
    public void sogutucuKapat() {
        System.out.println("HOTSPOT | Sogutucu kapaniyor...");
        System.out.println("HOTSPOT | Sogutucu kapandi.");   
        
    }
    
}
