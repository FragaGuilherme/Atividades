import java.util.Scanner;
public class DezAtividade3 {
    public static void main(String[] args) {
        int aluguel, diaria;

        Scanner ler = new Scanner(System.in);

//=========================================================

        System.out.print("Digite a quantidade de dias: ");
        aluguel = ler.nextInt();

        System.out.print("Digite o Valor do aluguel diário: ");
        diaria = ler.nextInt();

//=========================================================

        System.out.println(aluguel*diaria + " Totais a pagar");
    }
}
