package islemler;

import Factory.IMakeModule;

public interface IEyleyici extends IMakeModule{
    
    int sogutucuAc(int sonDeger)throws InterruptedException ;
    int sogutucuKapat(int sonDeger)throws InterruptedException ;    
    
}
