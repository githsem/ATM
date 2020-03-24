import java.util.Scanner;


public class atm {
    public void calis(hesap hesap){
    
        login login = new login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamiza Hosgeldiniz...");
        System.out.println("************************");
        System.out.println("Kullanici Girisi ");
        System.out.println("************************");
        int giris_hakki = 3;
        
        while (true){
            if(login.login(hesap)){
                System.out.println("Giris Basarili");
                break;
            }
            else {
                System.out.println("Giris Basarisiz...");
                giris_hakki-=1;
                System.out.println("Kalan Giris Hakki  :  "+giris_hakki);
            }
            if (giris_hakki==0){
                System.out.println("Giris  Hakkiniz  Bitti...");
                return;
            }
                           
        }
        System.out.println("*******************************");
        String islemler= "1. Bakiye Goruntuleme\n"
                         +"2. Para Yatirma\n"
                         +"3. Para Cekme\n"
                         +"Cikis icin q'ye basin";
        System.out.println(islemler);
        System.out.println("*******************************");
        
        while (true){
            System.out.print("Islemi Seciniz  :  ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz  :  "+hesap.getBakiye());
            }
            else if (islem.equals("2")){
                System.out.print("Yatirmak Istediginiz Tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
                
            }
            else if (islem.equals("3")){
                System.out.print("Cekmek Istediginiz Tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else {
                System.out.println("Gecersiz Islem...");
            }
        }
                
        
    }
    
}
