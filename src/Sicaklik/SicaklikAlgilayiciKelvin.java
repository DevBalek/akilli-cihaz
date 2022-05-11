package Sicaklik;

import java.util.Random;

public class SicaklikAlgilayiciKelvin implements ISicaklikAlgilayici{
    int sicaklik;
    

    public SicaklikAlgilayiciKelvin() {

        Random rnd = new Random();        
        this.sicaklik =  rnd.nextInt(-10,60);        
    }

    @Override
    public void sicaklikOku() {
        System.out.println("Celcius | Sicaklik Degeri " + sicaklik);        
    }

    @Override
    public int getSicaklik() {        
        return sicaklik;
    }

    @Override
    public void setSicaklik(int sicaklik) {
        this.sicaklik = sicaklik;        
    }

    @Override
    public void make() {
        System.out.println("Sicaklik Degeri Ekrana Yazildi.");        
    }
    
}
