package Sicaklik;

import java.util.Random;

public class SicaklikAlgilayici1 implements ISicaklikAlgilayici{
    int sicaklik;    

    public SicaklikAlgilayici1() {
        Random rnd = new Random();        
        this.sicaklik =  rnd.nextInt(-10,60);              
    }
    
    @Override
    public void sicaklikOku() {
        System.out.println("X | Sicaklik Degeri " + sicaklik);        
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