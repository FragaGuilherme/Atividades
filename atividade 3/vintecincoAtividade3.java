import java.util.Scanner;
public class vintecincoAtividade3 {
    public static void main(String[] args) {

        double N1;

        Scanner ler = new Scanner(System.in);

//=================================================================

        System.out.print("Digite o valor em dólar: ");
        N1 = ler.nextDouble();

//=================================================================

        System.out.print(N1 + " Convertido para real é: " + N1*4.78);
    }
}
