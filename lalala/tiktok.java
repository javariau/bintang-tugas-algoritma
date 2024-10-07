import java.util.Scanner;
    public class tiktok {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner =  new Scanner(System.in);

        //menghitung panjang
        System.out.print("masukan panjang (cm):");
        double Panjang =scanner.nextDouble();
        
        //menghitung lebar
        System.out.print("masukan lebar (cm):");
        double Lebar =scanner.nextDouble();

        //menghitung luas
        double Luas = Panjang*Lebar;

    
       System.out.printf("panjang dengan lebar akan menhasilkan Luas %.2f cm dan %.2f cm %n akan menghasilkan %.2f cm².%n",Panjang,Lebar,Luas);

        scanner.close();
    }
        
}
