import java.util.Scanner;
public class dezenoveAtvividade4 {
    public static void main(String[] args) {

        double idade, mes;

        Scanner ler = new Scanner(System.in);

//====================================================

        System.out.print("Digite sua idade: ");
        idade = ler.nextDouble();

        System.out.print("Digite os meses: ");
        mes = ler.nextDouble();

        idade = idade * 365; mes = mes * 30;

//====================================================

        System.out.print("Você tem " + (idade+mes) + " de idade aproximados");

    }
}
