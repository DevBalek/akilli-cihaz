package Observer;

import islemler.IEyleyici;

public interface IPublisher {
    void attach(IObserver observer);
    void detach(IObserver observer);
    void notify(String mesaj,IEyleyici eyleyici) throws InterruptedException;

}
