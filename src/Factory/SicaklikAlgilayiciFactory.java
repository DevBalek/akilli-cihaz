package Factory;

import Sicaklik.SicaklikAlgilayici1;

public class SicaklikAlgilayiciFactory implements IFactoryMaker{

    @Override
    public IMakeModule factoryMakerMethod() {
        SicaklikAlgilayici1 sicaklikAlgilayici = new SicaklikAlgilayici1();
        return sicaklikAlgilayici;
    }
    
    
    
}
