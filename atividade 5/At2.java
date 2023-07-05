import java.lang.Math;
import java.util.Scanner;
public class At2 {
    public static void main(String[] args) {
        double N1 = 0.0, N2 = 0.0, ANG = 0.0;

        Scanner ler = new Scanner(System.in);

//======================================================================

        System.out.print("Digite o primeiro número: ");
        N1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        N2 = ler.nextInt();

        System.out.print("Digite um angulo: ");
        ANG = ler.nextInt();

//======================================================================

        System.out.println("Arredondar um número para cima:" + Math.round(N1));

        System.out.println("Arredondar um número para baixo: " + Math.floor(N1));

        System.out.println("Gerar um número aleatório entre 0 e 1: " + Math.random());

        System.out.println("Calcular o valor absoluto de um número: " + Math.abs(N1));

        System.out.println("Calcular o máximo entre dois números: " + Math.max(N1, N2));

        System.out.println("Calcular o mínimo entre dois números: " + Math.min(N1, N2));

        System.out.println("Calcular o seno de um ângulo em radianos: " + Math.asin(Math.toRadians(ANG)));

        System.out.println("Calcular o cosseno de um ângulo em radianos: " + Math.acos(Math.toRadians(ANG)));

    }
}
