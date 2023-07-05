import java.lang.Math;
import java.util.Scanner;
public class At3 {
    public static void main(String[] args) {
        double angulo = 0;

        Scanner ler = new Scanner(System.in);

//===============================================================================

        System.out.print("Digite o ângulo: ");
        angulo = ler.nextDouble();

//===============================================================================

        System.out.println("Calcular a tangente de um ângulo (VALOR) em radianos: " + Math.toRadians(Math.atan(angulo)));
        System.out.println("Calcular o arco seno do VALOR: " + Math.asin(Math.toRadians(angulo)));
        System.out.println("Calcular o arco cosseno do VALOR: " + Math.toRadians(Math.acos(angulo)));
        System.out.println("Calcular o arco tangente do VALOR: " + Math.toRadians(Math.atan(angulo)));
        System.out.println("Calcular o logaritmo natural do VALOR: " + Math.log(angulo));
    }
}
