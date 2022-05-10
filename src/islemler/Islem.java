package islemler;

import java.util.Random;

import Sicaklik.ISicaklikAlgilayici;

public class Islem implements IIslem{
    IEyleyici eyleyici;
    ISicaklikAlgilayici sicaklikAlgilayici ;

    public Islem(IEyleyici eyleyici, ISicaklikAlgilayici sicaklikAlgilayici) {
        this.eyleyici = eyleyici;
        this.sicaklikAlgilayici=sicaklikAlgilayici;
    }
    

    @Override
    public void sogutucuAc() {
        eyleyici.sogutucuAc();    
    }

    @Override
    public void sogutucuKapat() {
        eyleyici.sogutucuKapat();
    }

    @Override
    public void sicaklikGoruntule() {
        sicaklikAlgilayici.sicaklikOku();           
    }
    
}
