import java.util.Scanner;
//8. Solicite ao usuário que digite um número inteiro e um número decimal, e em seguida, imprima uma mensagem mostrando
//os números fornecidos
public class Oito {
    public static void main(String[] args) {
        String Inteiro, Decimal;
        Scanner ler = new Scanner(System.in);

//============================================================

        System.out.print("Diigte seu Inteiro: ");
        Inteiro = ler.nextLine();

        System.out.print("Digite sua Decimal: ");
        Decimal = ler.nextLine();

        System.out.println("seu número é " + Inteiro + ", Seu segundo número: " + Decimal );
    }
}
