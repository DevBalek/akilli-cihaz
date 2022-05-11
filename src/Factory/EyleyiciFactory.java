package Factory;

import islemler.EyleyiciHotspot;

public class EyleyiciFactory implements IFactoryMaker {

    @Override
    public IMakeModule factoryMakerMethod() {
        EyleyiciHotspot eyleyiciHotspot = new EyleyiciHotspot();
        return eyleyiciHotspot;
    }
    
}
