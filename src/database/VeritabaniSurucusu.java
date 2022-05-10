package database;

public class VeritabaniSurucusu implements IVeritabaniSurucusu{

    IVeritabaniSurucusu veritabaniSurucusu;
    
    public VeritabaniSurucusu(IVeritabaniSurucusu veritabaniSurucusu) {
        this.veritabaniSurucusu = veritabaniSurucusu;
    }

    @Override
    public boolean giris(String kullaniciAdi, String sifre) {

        return veritabaniSurucusu.giris(kullaniciAdi, sifre);
        
    }
    
}
