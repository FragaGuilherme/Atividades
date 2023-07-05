import java.util.Scanner;
public class trezeAtividade3 {
    public static void main(String[] args) {
        double N1;
        int N2;

        Scanner ler = new Scanner(System.in);

//=================================================================

        System.out.print("Digite o Valor do produto: ");
        N1 = ler.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        N2 = ler.nextInt();

//=================================================================

        System.out.println("O valor total: " + N1*N2);

    }
}
