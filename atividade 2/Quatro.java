import java.util.Scanner;
//4. Solicite ao usuário que digite um número inteiro e, em seguida, imprima uma mensagem confirmando o número digitado
public class Quatro {
    public static void main(String[] args) {
        String Inteiro;
        Scanner ler = new Scanner(System.in);

//============================================================

        System.out.print("Diigte Um número inteiro: ");
        Inteiro = ler.nextLine();

        System.out.println("Seu número Inteiro: " + Inteiro);
    }
}
