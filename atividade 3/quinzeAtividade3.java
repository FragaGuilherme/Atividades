import java.util.Scanner;
public class quinzeAtividade3 {
    public static void main(String[] args) {
        double peso, altura;

        Scanner ler = new Scanner(System.in);

//========================================================

        System.out.print("Digite seu peso: ");
        peso = ler.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = ler.nextDouble();

//========================================================

        System.out.print("O seu IMC " + peso/(altura*altura));
    }
}
