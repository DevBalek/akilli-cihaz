package islemler;


import Sicaklik.ISicaklikAlgilayici;

public class Islem implements IIslem{
    IEyleyici eyleyici;
    ISicaklikAlgilayici sicaklikAlgilayici ; 

    public Islem(IEyleyici eyleyici, ISicaklikAlgilayici sicaklikAlgilayici) {
        this.eyleyici = eyleyici;
        this.sicaklikAlgilayici = sicaklikAlgilayici;
        
    }
    

    @Override
    public void sogutucuAc() throws InterruptedException{        
    sicaklikAlgilayici.setSicaklik(eyleyici.sogutucuAc(sicaklikAlgilayici.getSicaklik()));         
    }

    @Override
    public void sogutucuKapat() throws InterruptedException{
      sicaklikAlgilayici.setSicaklik(eyleyici.sogutucuKapat(sicaklikAlgilayici.getSicaklik()));
    }

    @Override
    public void sicaklikGoruntule() {
        sicaklikAlgilayici.sicaklikOku();
    }
    
}
