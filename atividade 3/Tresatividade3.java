import java.util.Scanner;
public class Tresatividade3 {
    public static void main(String[] args) {
        double Base, alt;

        Scanner ler = new Scanner(System.in) ;

//===============================================================

        System.out.print("Digite a base do triangulo: ");
        Base = ler.nextDouble();

        System.out.print("Digite a altura do triangulo");
        alt = ler.nextDouble();

//================================================================

        System.out.println("A área do triangulo é " + (Base*alt)/2 );
    }
}
