package Observer;

import islemler.IEyleyici;

public class EsikAlti implements IObserver{

    @Override
    public int acilDurum(int level, IEyleyici eyleyici) throws InterruptedException {
        eyleyici.sogutucuKapat(level);
        return 0;
    }
    
}
