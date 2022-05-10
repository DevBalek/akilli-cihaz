package Observer;

import islemler.IEyleyici;

public class EsikAlti implements IObserver{

    @Override
    public int acilDurum(int level, IEyleyici eyleyici) throws InterruptedException {
        System.out.println("System | Force Sogutucu Kapandi...");
        return eyleyici.sogutucuKapat(level);
    }
    
}
