

public class OOP_Atm {
      public static void main(String[] args) {        
      hesap hesap = new hesap("ali","12345",1000);            
      atm atm = new atm();
      atm.calis(hesap);
      System.out.println("Programdan Cikiliyor...");
    }    
}