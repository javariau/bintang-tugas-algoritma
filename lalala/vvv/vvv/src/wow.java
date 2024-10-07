import java.util.Scanner;
public class wow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //meng input suhu celcius
        System.out.print("masukan suhu celcius :");
        double celcius = scanner.nextDouble();

        //menhitung fahrenheit
        double fahrenheit = (celcius * 9.0/5.0) + 32.0;

        System.out.println(celcius +"derajat celcius samadengan fahrenheit" + fahrenheit +"derajat fahrenheit.");


        scanner.close();
    
    }
}
