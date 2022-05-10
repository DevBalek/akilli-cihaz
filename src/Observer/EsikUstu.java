package Observer;

import islemler.IEyleyici;

public class EsikUstu implements IObserver {

    @Override
    public int acilDurum(int level, IEyleyici eyleyici) throws InterruptedException {
        System.out.println("System | Force Sogutucu Acildi!");
        return eyleyici.sogutucuAc(level);
    }
    
}
