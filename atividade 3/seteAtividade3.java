import java.util.Scanner;
public class seteAtividade3 {
    public static void main(String[] args) {
        int N1, N2;

        Scanner ler = new Scanner(System.in);

//==============================================================

        System.out.print("Digite o primeiro número inteiro: ");
        N1 = Integer.parseInt(ler.nextLine());

        System.out.print("Digite o segundo número inteiro: ");
        N2 = Integer.parseInt(ler.nextLine());

//==============================================================

        System.out.println("Os números foram multiplicados: " + N1*N2);

    }
}
