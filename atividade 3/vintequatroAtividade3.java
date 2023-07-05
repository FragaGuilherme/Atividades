import java.util.Scanner;
public class vintequatroAtividade3 {
    public static void main(String[] args) {
        int N1, i;

        Scanner ler = new Scanner(System.in);

//====================================================

        System.out.print("Digite o número inteiro: ");
        N1 = ler.nextInt();

        for (i = 1;i <= 10; i++){
            System.out.print(" " + N1 + "X" + i + "=" + (N1*i));
        }
        System.out.println("\n Botei um espaço no começo para separar as multiplicações =D");
    }
}
