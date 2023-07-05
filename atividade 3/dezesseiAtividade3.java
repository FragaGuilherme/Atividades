import java.util.Scanner;
public class dezesseiAtividade3 {
    public static void main(String[] args) {
        double valor, porcen, des;

        Scanner ler = new Scanner(System.in);

//========================================================

        System.out.print("digite o valor: ");
        valor = ler.nextDouble();

        System.out.print("digite a porcentagem: ");
        porcen = ler.nextDouble();

        des = (porcen * valor) / 100;

//========================================================

        System.out.print(valor-des + " O valor com desconto");

    }
}
