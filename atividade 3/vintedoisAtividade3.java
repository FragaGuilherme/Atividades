import java.util.Scanner;
public class vintedoisAtividade3 {
    public static void main(String[] args) {
        double N1, N2;

        Scanner ler = new Scanner(System.in);

//========================================================

        System.out.print("Digite o primeiro número: ");
        N1 = ler.nextDouble();

        System.out.print("Digite o segundo número: ");
        N2 = ler.nextDouble();

//========================================================

        if (N1 > N2){
            System.out.print("O primeiro número é o maior número");
        }else {
            System.out.print("O segundo número é o maior número");
        }
    }
}
