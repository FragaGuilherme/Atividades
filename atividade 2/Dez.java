import java.util.Scanner;
public class Dez {
    public static void main(String[] args) {
        int N1, N2, X;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        N1 = (int) ler.nextDouble();
        System.out.print("Digite o primeiro segundo inteiro: ");
        N2 = (int) ler.nextDouble();

        X = N1;
        N1 = N2;
        N2 = X;

        System.out.println("\n Valores Trocados \n");
        System.out.println("Primeiro Valor: " + N1);
        System.out.println("Segundo Valor: " + N2);
    }

}
