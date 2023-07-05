import java.util.Scanner;
//2. Solicite ao usuário que digite o seu nome e, em seguida, imprima uma mensagem de boas-vindas utilizando o nome fornecido.
public class Dois {
    public static void main(String[] args) {
        String Nome;
        Scanner ler = new Scanner(System.in);

//============================================================

        System.out.print("Diigte seu nome: ");
        Nome = ler.nextLine();

        System.out.println(Nome + ", seja bem vindo");
    }
}
