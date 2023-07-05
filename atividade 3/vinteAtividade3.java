import java.util.Scanner;
public class vinteAtividade3 {
    public static void main(String[] args) {
        double lado;

        Scanner ler = new Scanner(System.in);

//=======================================================

        System.out.print("Digite o lado: ");
        lado = ler.nextDouble();

        lado = lado*lado;

//=======================================================

        System.out.print("A área do quadrado é: " + lado);
    }
}
