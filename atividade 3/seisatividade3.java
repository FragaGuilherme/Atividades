import java.util.Scanner;
public class seisatividade3 {
    public static void main(String[] args) {
        double dias, horas, minutos, segundos;

        Scanner ler = new Scanner(System.in);

//=============================================================

        System.out.print("Digite os dias: ");
        dias = Double.parseDouble(ler.nextLine());

        System.out.print("Digite as horas: ");
        horas = Double.parseDouble(ler.nextLine());

        System.out.print("Digite os minutos: ");
        minutos = Double.parseDouble(ler.nextLine());

        System.out.print("Digite as segundos: ");
        segundos = Double.parseDouble(ler.nextLine());

        dias = (dias*86400);
        horas = (horas*3600);
        minutos = (minutos*60);

//=============================================================

        System.out.println((dias+horas+minutos+segundos) + " Segundos");


    }
}
