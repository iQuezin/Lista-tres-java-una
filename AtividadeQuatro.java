import java.util.Scanner;

public class AtividadeQuatro {

    public static void main(String[] args) {

        System.out.println("Kayque dos Santos Almeida / RA: 4231923060.");

        Scanner scanner = new Scanner(System.in);

        double numeroUm, numeroDois, numeroTres, numeroQuatro, numeroCinco;

        System.out.print("Número Um: ");
        numeroUm = scanner.nextDouble();
        System.out.print("Número Dois: ");
        numeroDois = scanner.nextDouble();
        System.out.print("Número Três: ");
        numeroTres = scanner.nextDouble();
        System.out.print("Número Quatro: ");
        numeroQuatro = scanner.nextDouble();
        System.out.print("Número Cinco: ");
        numeroCinco = scanner.nextDouble();

        double soma = numeroUm + numeroDois + numeroTres + numeroQuatro + numeroCinco;
        double media = (numeroUm + numeroDois + numeroTres + numeroQuatro + numeroCinco) / 5;

        System.out.printf("Soma = %.2f", soma);
        System.out.printf("\nMédia = %.2f", media);

        scanner.close();
    }
}
