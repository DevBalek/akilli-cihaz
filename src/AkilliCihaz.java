import Sicaklik.SicaklikAlgilayiciKelvin;
import database.PostgreVeritabaniSurucusu;
import database.VeritabaniSurucusu;
import islemler.EyleyiciArcelik;
import islemler.Islem;

public class AkilliCihaz {
    public static void main(String[] args) throws Exception {
        
        VeritabaniSurucusu veritabani = new VeritabaniSurucusu( new PostgreVeritabaniSurucusu() ) ;
        veritabani.giris("kullaniciAdi", "sifre");
        
        Islem islem = new Islem( new EyleyiciArcelik(), new SicaklikAlgilayiciKelvin() );

        islem.sogutucuAc();
        islem.sogutucuKapat();
        islem.sicaklikGoruntule();
    }
}
