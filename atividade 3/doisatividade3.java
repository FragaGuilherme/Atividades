import java.util.Scanner;
public class doisatividade3 {
    public static void main(String[] args) {
        int Raio;
        double Area;

        Scanner ler = new Scanner(System.in);
//======================================================================

        System.out.print("Digite o raio do circulo: ");
        Raio = Integer.parseInt(ler.nextLine());
        Area = (Raio*Raio) * 3.14;

//=======================================================================

        System.out.print("A área do círculo é: " + Area);
    }
}
