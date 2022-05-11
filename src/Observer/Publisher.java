package Observer;

import java.util.ArrayList;
import java.util.List;

import islemler.IEyleyici;

public class Publisher implements IPublisher{

    List<IObserver>observerList;

    public Publisher(){
        observerList = new ArrayList<>();
    }

    @Override
    public void attach(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notify(String mesaj ,IEyleyici eyleyici) throws InterruptedException {        
        
        for (IObserver iObserver : observerList) {
            iObserver.acilDurum(mesaj);
        }
        
    }
    
}
