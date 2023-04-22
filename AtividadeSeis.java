import java.util.Scanner;

public class AtividadeSeis {

    public static void main(String[] args) {

        System.out.println("Kayque dos Santos Almeida / RA: 4231923060.");

        Scanner scanner = new Scanner(System.in);

        int numeroUm, numeroDois, maior, menor;

        System.out.print("Primeiro número: ");
        numeroUm = scanner.nextInt();

        System.out.print("Segundo número: ");
        numeroDois = scanner.nextInt();

        if (numeroUm > numeroDois) {
            maior = numeroUm;
            menor = numeroDois;
        } else {
            maior = numeroDois;
            menor = numeroUm;
        }

        for (int i = menor; i <= maior; i++)
            System.out.println(i);

        scanner.close();
    }
}
