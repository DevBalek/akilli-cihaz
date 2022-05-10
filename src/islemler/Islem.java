package islemler;


import Sicaklik.ISicaklikAlgilayici;

public class Islem implements IIslem{
    IEyleyici eyleyici;
    ISicaklikAlgilayici sicaklikAlgilayici ;

    public Islem(IEyleyici eyleyici, ISicaklikAlgilayici sicaklikAlgilayici) {
        this.eyleyici = eyleyici;
        this.sicaklikAlgilayici=sicaklikAlgilayici;
    }
    

    @Override
    public void sogutucuAc() throws InterruptedException{
        String[] string = sicaklikAlgilayici.sicaklikOku().split(" ");
        int sicaklik = Integer.parseInt(string[4]);
        eyleyici.sogutucuAc(sicaklik);    
    }

    @Override
    public void sogutucuKapat() throws InterruptedException{
        String[] string = sicaklikAlgilayici.sicaklikOku().split(" ");
        int sicaklik = Integer.parseInt(string[4]);
        
        eyleyici.sogutucuKapat(sicaklik);
    }

    @Override
    public void sicaklikGoruntule() {
        sicaklikAlgilayici.sicaklikOku();           
    }
    
}
