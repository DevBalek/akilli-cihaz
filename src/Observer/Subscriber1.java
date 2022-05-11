package Observer;

public class Subscriber1 implements IObserver {

    @Override
    public void acilDurum(String message) throws InterruptedException {
        System.out.println("Sub1 | " + message);        
    }
    
}
