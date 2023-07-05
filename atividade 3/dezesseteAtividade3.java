import java.util.Scanner;
public class dezesseteAtividade3 {
    public static void main(String[] args) {
        double valor;
        int parcelas;

        Scanner ler = new Scanner(System.in);

//==============================================================

        System.out.print("Digite o valor: ");
        valor = ler.nextDouble();

        System.out.print("Digite o número de parcelas: ");
        parcelas = ler.nextInt();

//=============================================================

        System.out.print("O valor de cada parcela: " + valor/parcelas);
    }
}
