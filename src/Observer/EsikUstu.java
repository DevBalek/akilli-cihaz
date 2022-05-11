package Observer;

public class EsikUstu implements IObserver {

    @Override
    public void acilDurum(String message) throws InterruptedException {
        System.out.println("SystemInfo | " + message);        
    }
    
}
