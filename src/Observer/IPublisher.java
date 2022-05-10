package Observer;

import islemler.IEyleyici;

public interface IPublisher {
    void attach(IObserver observer);
    void detach(IObserver observer);
    void notify(String mesaj,String level,IEyleyici eyleyici) throws InterruptedException;

}
