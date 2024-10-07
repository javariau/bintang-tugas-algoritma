import java.util.Scanner;
    public class lingkaran {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner =  new Scanner(System.in);
        
        System.out.print("masukkan jar-jarilingkaran(cm):");

        double radius = scanner.nextDouble();

        // menghitung keliling
        double keliling = 2 * Math.PI * radius;

        //membulatakan hasil trdekat
        long bulatterdekat = (int) Math.round(keliling);

        


        System.out.println("KELILING LINGKARAN ASLI :"+keliling   );
        System.out.println("KELILING LINGKARAN(DI BULATKAN TERDEKAT)"+bulatterdekat);
        
        scanner.close();
        
        
    }
}




