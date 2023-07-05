import java.util.Scanner;
public class vintetresAtividade3 {
    public static void main(String[] args) {
        double N1, base, expo, raiz, poten;

        Scanner ler = new Scanner(System.in);

//========================================================

        System.out.print("Digite o número da raiz: ");
        N1 = ler.nextDouble();

        System.out.print("Digite o número de base: ");
        base = ler.nextDouble();

        System.out.print("digite o expoente: ");
        expo = ler.nextDouble();

        raiz = Math.sqrt(N1);

        poten = Math.pow(base, expo);

//========================================================

        System.out.println("A raiz quadrada de " + N1 + " é " + raiz);

        System.out.println("A potência é: " + poten);


    }
}
