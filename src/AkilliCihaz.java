import islemler.EyleyiciArcelik;
import islemler.EyleyiciHotspot;
import islemler.Islem;

public class AkilliCihaz {
    public static void main(String[] args) throws Exception {
        Islem islem = new Islem( new EyleyiciArcelik() );

        islem.sogutucuAc();
        islem.sogutucuKapat();
        islem.sicaklikGoruntule();
    }
}
