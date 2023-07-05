import java.util.Scanner;
public class cincoAtividade3 {
    public static void main(String[] args) {

        double horas, sal;

        Scanner ler = new Scanner(System.in);
//========================================================
        System.out.print("Digite as horas trabalhadas: ");
        horas = ler.nextDouble();

        System.out.print("Valor da hora: ");
        sal = ler.nextDouble();

//========================================================

        System.out.println((horas*sal + " Seu salário diário"));
    }
}
