import java.util.Scanner;
//5. Solicite ao usuário que digite um número decimal e, em seguida, imprima uma mensagem confirmando o número digitado.
public class Cinco {
    public static void main(String[] args) {
        String Decimal;
        Scanner ler = new Scanner(System.in);

//============================================================

        System.out.print("Diigte Um número Decimal: ");
        Decimal = ler.nextLine();

        System.out.println("Seu número Decimal: " + Decimal);
    }
}
