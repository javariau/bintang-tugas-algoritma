import java.util.Scanner;
public class kubus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //sisi kubus
        System.out.println("masukan sisi kubus:");
        double sisi = scanner.nextDouble();


        //menghitung volume
        double volume = Math.pow (sisi,3);

        System.out.println("sisi nya :"+sisi);
        System.out.println("jadi vole kubusnya adalah"+volume);


        scanner.close();
    }
}
