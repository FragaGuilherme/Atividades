import java.util.Scanner;
public class umativade3 {
    public static void main(String[] args) {
        int N1, N2;

        Scanner ler = new Scanner(System.in);

//==================================================================
        System.out.print("Digite o primeiro número: ");
        N1 = Integer.parseInt(ler.nextLine());

        System.out.print("Digite o segundo número: ");
        N2 = Integer.parseInt(ler.nextLine());

//==================================================================

        System.out.println("A soma dos números é: " + (N1 + N2));
    }
}
