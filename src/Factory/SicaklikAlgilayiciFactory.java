package Factory;

import Sicaklik.SicaklikAlgilayiciCelcius;

public class SicaklikAlgilayiciFactory implements IFactoryMaker{

    @Override
    public IMakeModule factoryMakerMethod() {
        SicaklikAlgilayiciCelcius sicaklikAlgilayici = new SicaklikAlgilayiciCelcius();
        return sicaklikAlgilayici;
    }
    
    
    
}
