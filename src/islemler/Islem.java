package islemler;


import Sicaklik.ISicaklikAlgilayici;

public class Islem implements IIslem{
    IEyleyici eyleyici;
    ISicaklikAlgilayici sicaklikAlgilayici ;
    int sonDeger;

    public Islem(IEyleyici eyleyici, ISicaklikAlgilayici sicaklikAlgilayici) {
        this.eyleyici = eyleyici;
        this.sicaklikAlgilayici = sicaklikAlgilayici;
        sonDeger = 0;
    }
    

    @Override
    public void sogutucuAc() throws InterruptedException{        
        sonDeger = eyleyici.sogutucuAc(sicaklikAlgilayici.sicaklikOku());        
    }

    @Override
    public void sogutucuKapat() throws InterruptedException{
        sonDeger = eyleyici.sogutucuKapat(sicaklikAlgilayici.sicaklikOku());
    }

    @Override
    public void sicaklikGoruntule() {
        sonDeger = sicaklikAlgilayici.sicaklikOku();
    }
    
}
