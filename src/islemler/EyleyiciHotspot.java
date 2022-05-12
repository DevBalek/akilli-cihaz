package islemler;


public class EyleyiciHotspot implements IEyleyici{

    @Override
    public int sogutucuAc(int sonDeger) throws InterruptedException {
        System.out.println("HOTSPOT | Sogutucu aciliyor...");
        Thread.sleep(100);        
        System.out.println("HOTSPOT | Sogutucu acildi.");
        System.out.println("HOTSPOT | Anlik sicaklik * " + sonDeger + " -> " + (sonDeger-10));
        return sonDeger-10;
    }

    @Override
    public int sogutucuKapat(int sonDeger) throws InterruptedException {
        System.out.println("HOTSPOT | Sogutucu kapaniyor...");
        Thread.sleep(100);        
        System.out.println("HOTSPOT | Sogutucu kapandi.");  
        System.out.println("HOTSPOT | Anlik sicaklik * " + sonDeger + " -> " + (sonDeger+10)); 
        return sonDeger + 10;
    }

    @Override
    public void make() {
        System.out.println("Sogutucu Acma/Kapatma islemi gerceklestirildi.");        
    }

}
