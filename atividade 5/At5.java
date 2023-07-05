import java.util.Scanner;
import java.lang.Math;

public class ati_5 {
    public static void main(String[] args) {
        double CAOP , HIP;

        Scanner ler = new Scanner(System.in);

//==========================================================================================

        System.out.println("digite o cateto oposto: ");
        CAOP = ler.nextDouble();
        System.out.println("digite a hipotenusa: ");
        HIP = ler.nextDouble();

//==========================================================================================

        System.out.println("O valor do cateto adjacente é: " + Math.sqrt(Math.pow(HIP,2 ) - Math.pow(CAOP, 2)));
    }
}
