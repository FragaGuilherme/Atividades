import java.util.Scanner;
//3. Solicite ao usuário que digite a sua idade e, em seguida, imprima uma mensagem informando a idade fornecida
public class Três {
    public static void main(String[] args) {
        String Idade;
        Scanner ler = new Scanner(System.in);

//============================================================

        System.out.print("Diigte sua Idade: ");
        Idade = ler.nextLine();

        System.out.println("Sua idade: " + Idade);
    }
}
