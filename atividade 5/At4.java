import java.util.Scanner;

public class At4 {
    public static void main(String[] args) {
        double raio;

        Scanner ler = new Scanner(System.in);

//========================================================================

        // Calcular a área de um círculo, sendo fornecido pelo usuário o RAIO.

        System.out.print("Digite o raio: ");
        raio = ler.nextDouble();

        raio = Math.pow(raio,2);

        System.out.println("A area do circulo é: " + (3.14 * raio) + "\n");

        // Calcular a circunferência de um círculo, onde o usuário informa o RAIO

        System.out.println("A circunferencia é de " + (2 * 3.14)*raio + "\n");

        // Calcular a hipotenusa de um triângulo retângulo, onde o usuário fornece o CATETO1 e CATETO2

        double CA1, CA2, HIP;

        System.out.print("Escreva o valor do primeiro cateto: ");
        CA1 = ler.nextDouble();

        System.out.print("Escreva o valor do segundo cateto: ");
        CA2 = ler.nextDouble();

        HIP = Math.pow(CA1,2) + Math.pow(CA2,2);

        System.out.println("A hipotenusa é: " + Math.sqrt(HIP) + "\n");

        // Calcular o perímetro de um retângulo:

        double lado1, lado2, peri;

        System.out.print("Digite o primeiro lado: ");
        lado1 = ler.nextDouble();

        System.out.print("Digite o segundo lado: ");
        lado2 = ler.nextDouble();

        System.out.print("\n" + "O perimento do retangulo é: " + 2*(lado1 + lado2) + "\n");

        //Calcular a área de um triângulo, sendo fornecido pelo usuário a BASE e a ALTURA do triângulo

        double B, H;

        System.out.print("Digite a base do triangulo: ");
        B = ler.nextDouble();

        System.out.print("Digite a altura do triangulo: ");
        H = ler.nextDouble();

        System.out.println("\n" + "A area do triangulo é: " +  (B * H) / 2);

    }
}