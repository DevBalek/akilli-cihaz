import java.util.Scanner;

public class AkilliCihaz {

    static Durum durum = Durum.kapali;

    public static void main(String[] args) throws Exception {
        durum = Durum.acilisTestiYapiliyor;
        String secim = " ";
        
        
        System.out.println("Sistem Acildi");
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                clearScreen();
                
                System.out.println("Sistemi baslatmak icin 1'i tuslayiniz");
                System.out.println("------\nSistemi kapatmak icin 0'i tuslayiniz.");
                secim = scanner.nextLine();
                
                if(secim.equals("0")) System.exit(0);

            } while (!secim.equals("1"));

            MerkeziIslemUnitesi merkeziIslemUnitesi = new MerkeziIslemUnitesi();        
            merkeziIslemUnitesi.sistemiBaslat();

        }
    
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

}
