package Observer;

public class EsikAlti implements IObserver{

    @Override
    public void acilDurum(String message) throws InterruptedException {
        System.out.println("System | " + message);        
    }
    
}
