import java.util.Scanner;
public class Quatroatividade3 {
    public static void main(String[] args) {

        double cel;

        Scanner ler = new Scanner(System.in);

//=================================================================

        System.out.print("Digite os graus em Celsius: ");
        cel = ler.nextDouble();

//=================================================================

        System.out.print((cel*1.8)+32 + " Fahrenheit");
    }
}
