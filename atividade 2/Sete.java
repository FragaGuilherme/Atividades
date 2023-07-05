import java.util.Scanner;
//7. Solicite ao usuário que digite o seu nome, idade e cidade onde reside, e em seguida, imprima uma mensagem utilizando
//essas informações.
public class Sete {
    public static void main(String[] args) {
        String Nome, Idade, Cidade;
        Scanner ler = new Scanner(System.in);

//============================================================

        System.out.print("Diigte seu nome: ");
        Nome = ler.nextLine();

        System.out.print("Digite sua Idade: ");
        Idade = ler.nextLine();

        System.out.print("Digite sua cidade: ");
        Cidade = ler.nextLine();

        System.out.println("Seu nome é " + Nome + ", você tem " + Idade + " anos e mora na cidade de " + Cidade );
    }
}
