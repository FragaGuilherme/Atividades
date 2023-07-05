import java.util.Scanner;
    public class Nove {
        public static void main(String[] args) {

            String nome, nomerua, cidade, estado;
            double numecasa, cep, cpf, cel;

            Scanner ler = new Scanner (System.in);

//=================================================================================

            System.out.print("Digite seu nome: ");
            nome = ler.nextLine();
            System.out.print("Digite o nome do seu estado: ");
            estado = ler.nextLine();
            System.out.print("Digite o nome da sua cidade: ");
            cidade = ler.nextLine();
            System.out.print("Digite o nome da sua rua: ");
            nomerua = ler.nextLine();
            System.out.print("Digite o número da sua casa: ");
            numecasa = ler.nextDouble();
            System.out.print("CEP da sua região: ");
            cep = ler.nextDouble();
            System.out.print("Digite seu CPF: ");
            cpf = ler.nextDouble();
            System.out.print("Digite seu número: ");
            cel = ler.nextDouble();

//=================================================================================

            System.out.print("\nInformaçoes digitadas\n");
            System.out.println(
                    "Nome: " + nome + "\n" +
                    "Endereço: " + nomerua + " " + numecasa + " " + cep + "\n" +
                    "Cidade:" + cidade + "\n" +
                    "Estado: " + estado + "\n" +
                    "CPF: " + cpf + "\n" +
                    "Tel. Celular: " + cel + "\n"
            );


        }
    }
