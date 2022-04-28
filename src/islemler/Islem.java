package islemler;

import java.util.Random;

public class Islem implements IIslem{
    IEyleyici eyleyici;


    public Islem(IEyleyici eyleyici) {
        this.eyleyici = eyleyici;
    }

    @Override
    public void sogutucuAc() {
        eyleyici.sogutucuAc();        
    }

    @Override
    public void sogutucuKapat() {
         eyleyici.sogutucuKapat();
    }

    @Override
    public void sicaklikGoruntule() {
        Random rnd = new Random();
        int random = rnd.nextInt(0,50);
        System.out.println("Sicaklik deger: " + random);        
    }
    
}
