package Sicaklik;

import java.util.Random;

public class SicaklikAlgilayiciKelvin implements ISicaklikAlgilayici{

    @Override
    public String sicaklikOku() {

        Random rnd = new Random();
        int random= rnd.nextInt(0,100);        

        System.out.println("Kelvin | Sicaklik Degeri " + random);
        return "Kelvin | Sicaklik Degeri " + random;
    }
}
