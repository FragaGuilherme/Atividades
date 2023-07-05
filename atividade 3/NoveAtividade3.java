import java.util.Scanner;
public class NoveAtividade3 {
    public static void main(String[] args) {
        double litros, valor;

        Scanner ler = new Scanner(System.in);

//===================================================

        System.out.print("Litros abastecidos: ");
        litros = ler.nextDouble();

        System.out.print("Valor do litro de combustível: ");
        valor = ler.nextDouble();

//===================================================

        System.out.println("Valor a ser pago: " + litros*valor);

    }
}
