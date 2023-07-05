import java.util.Scanner;
public class doze {
    public static void main(String[] args) {
        double valor, acre;

        Scanner ler = new Scanner(System.in);

//========================================================

        System.out.print("digite o valor: ");
        valor = ler.nextDouble();

        acre = valor * 0.15;

//========================================================

        System.out.print(valor+acre + " O valor do acrescimo");

    }
}
