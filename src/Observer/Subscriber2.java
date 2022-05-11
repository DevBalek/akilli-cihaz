package Observer;

public class Subscriber2 implements IObserver{

    @Override
    public void acilDurum(String message) throws InterruptedException {
        System.out.println("Sub2 | " + message);        
    }
    
}
