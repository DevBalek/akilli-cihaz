package Sicaklik;

import Factory.IMakeModule;

public interface ISicaklikAlgilayici extends IMakeModule{
    void sicaklikOku();    
    int getSicaklik();
    void setSicaklik(int sicaklik);
}
