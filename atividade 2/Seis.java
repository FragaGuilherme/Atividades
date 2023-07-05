import java.util.Scanner;
//6. Solicite ao usuário que digite dois números inteiros e, em seguida, imprima uma mensagem mostrando os números
//fornecidos.Olá

public class Seis {
    public static void main(String[] args) {
        String N1, N2;
        Scanner ler = new Scanner(System.in);

//============================================================

        System.out.print("Diigte o primeiro número ");
        N1 = ler.nextLine();

        System.out.print("Digite o segundo número ");
        N2 = ler.nextLine();

        System.out.println("seu primeiro número é: " + N1 + "\nseu segundo núemro é: " + N2);
    }
}
