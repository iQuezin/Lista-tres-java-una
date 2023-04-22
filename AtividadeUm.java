import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {

        System.out.println("Kayque dos Santos Almeida / RA: 4231923060.");

        Scanner scanner = new Scanner(System.in);

        double nota = -1;

        while (nota < 0 || nota > 10) {
            System.out.print("Digite a nota: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("NOTA INVÁLIDA!");

            }
        }

        System.out.println("Nota = " + nota);

        scanner.close();
    }
}