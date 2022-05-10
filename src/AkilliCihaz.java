import Sicaklik.SicaklikAlgilayiciKelvin;
import islemler.EyleyiciArcelik;
import islemler.Islem;

public class AkilliCihaz {
    public static void main(String[] args) throws Exception {
        
        Islem islem = new Islem( new EyleyiciArcelik(), new SicaklikAlgilayiciKelvin() );
                
        islem.sogutucuAc();
        islem.sogutucuKapat();
        islem.sicaklikGoruntule();
    }
}
