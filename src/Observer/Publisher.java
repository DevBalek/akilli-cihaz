package Observer;

import java.util.ArrayList;
import java.util.List;

import islemler.IEyleyici;

public class Publisher implements IPublisher{

    List<IObserver>observerList;

    Publisher(){
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
    public void acilDurumBildirimi(String mesaj, String level, IEyleyici eyleyici) {
        String[] bolum = level.split(" ");
        int sicaklikDegeri = Integer.parseInt(bolum[1]);

        for (IObserver iObserver : observerList) {
            iObserver.acilDurum(sicaklikDegeri, eyleyici);
        }
        
    }
    
}
