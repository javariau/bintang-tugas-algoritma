import java.util.Scanner;
public class celcius {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new scanner(System.in);

        //input suhu
        System.out.print("masukkan suhu celcius :");
        double celcius = scanner.nextDouble;

        //menghitung farenheit
        double farenheit = (celcius * 9/5)+32;

        System.out.printf("suhu celcius dan farenheit menghasilkan %.2f %n adalah %.2f %n",celcius,farenheit);
        

        scanner.close();

    }
}
