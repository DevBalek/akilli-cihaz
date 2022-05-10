package Observer;

import islemler.IEyleyici;

public interface IObserver {
    int acilDurum(int level,IEyleyici eyleyici)throws InterruptedException;
}
