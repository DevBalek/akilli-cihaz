import islemler.EyleyiciHotspot;
import islemler.Islem;

public class AkilliCihaz {
    public static void main(String[] args) throws Exception {
        Islem islem = new Islem( new EyleyiciHotspot() );

        islem.sogutucuAc();
        islem.sogutucuKapat();
        islem.sicaklikGoruntule();
    }
}
