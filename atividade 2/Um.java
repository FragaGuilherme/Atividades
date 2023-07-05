import java.util.Scanner;
//1. Faça um programa que peça para o usuário digitar o nome e a cidade que ele mora, e apresente na tela a mensagem: Olá
//_______________, você mora na cidade de ________________
public class Um {
    public static void main(String[] args) {
        String Nome, Cidade;
        Scanner ler = new Scanner(System.in);

//============================================================

        System.out.print("Diigte seu nome: ");
        Nome = ler.nextLine();

        System.out.print("Digite sua cidade: ");
        Cidade = ler.nextLine();

        System.out.println("Olá " + Nome + ", você mora na cidade de " + Cidade );
    }
}
