import java.util.Scanner;
public class oitoAtividade3 {
    public static void main(String[] args) {
        double valor, des;

        Scanner ler = new Scanner(System.in);

//========================================================

        System.out.print("digite o valor: ");
        valor = ler.nextDouble();

        des = valor * 0.1;

//========================================================

        System.out.print(valor-des + " O valor com desconto");

    }
}
