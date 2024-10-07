import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        // input celcius
        System.out.print("MASUKAN CELCIUS :");
        double celcius = scanner.nextDouble();

        //rumus farenheith
        double fahrenheit = (celcius * 9 / 5) + 32;

        System.out.println(celcius+"derajat farenheit sama dengan "+fahrenheit +"derajat fahrenheit");


        scanner.close();
    }
}
