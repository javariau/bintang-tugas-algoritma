import java.util.Scanner;

 public class penjualan {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        //HARGA TEKUR PERKILO
        final int HARGA_TELUR_KG = 28000;

        //JUMLAH TULUR PERKILO
        System.out.print("jumlah telur(kg) :");
        double jumlahTelur=  scanner.nextDouble();

        //MENGHITUNG TOTAL BAYAR
        double Totalbayar = jumlahTelur*HARGA_TELUR_KG;

        // UANG YANG DIKASI
        System.out.print("uang yang diberikan :");
        double uangDiberikan=  scanner.nextDouble();

        // UANG KEMBALIAN
        double Kembalian =  uangDiberikan-Totalbayar;
        System.out.printf("total bayar:%.2f %n",Totalbayar);
        System.out.printf("Kembaliannya:%.2f %n",Kembalian);

       if ( uangDiberikan < Totalbayar){
        System.out.println("duit lu itu kurang");
       }else if (uangDiberikan == Totalbayar) {
        System.out.println("ngapain disini udah pas duitnya");
        
       } 
    
       else {
        System.out.println(" kembaliannya sumbangin ajala");
       }
               
        scanner.close();


    }
}
