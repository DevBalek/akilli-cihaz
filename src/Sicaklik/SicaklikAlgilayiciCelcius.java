package Sicaklik;

import java.util.Random;

public class SicaklikAlgilayiciCelcius implements ISicaklikAlgilayici{

    @Override
    public String sicaklikOku() {

        Random rnd = new Random();
        int random= rnd.nextInt(0,200);
        
        System.out.println("Celcius | Sicaklik Degeri " + random);
        
        return "Celcius | Sicaklik Degeri " + random;
    }


}