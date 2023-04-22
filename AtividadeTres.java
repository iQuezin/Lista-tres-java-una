import java.util.Scanner;

public class AtividadeTres {

    public static void main(String[] args) {

        System.out.println("Kayque dos Santos Almeida / RA: 4231923060.");

        Scanner scanner = new Scanner(System.in);

        String nome, gen, Ec;
        int idade;
        double salario;
        char sexo, EstadoC;

        // Nome:
        do {
            System.out.print("Nome: ");
            nome = scanner.next();
        } while (nome.length() < 3);
        // Idade:
        do {
            System.out.print("Idade: ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);
        // Salário:
        do {
            System.out.print("Salário: ");
            salario = scanner.nextDouble();
        } while (salario < 0);
        // Sexo:
        do {
            System.out.print("Sexo (f, m): ");
            sexo = scanner.next().charAt(0);

            if (sexo == 'f') {
                gen = "feminino";
            } else {
                gen = "masculino";
            }
        } while (sexo != 'f' && sexo != 'm');
        // Estado Civil
        do {
            System.out.print("Estado Civil (s, c, v, d): ");
            EstadoC = scanner.next().charAt(0);

            if (EstadoC == 's') {
                Ec = "solteiro";
            } else if (EstadoC == 'c') {
                Ec = "casado";
            } else if (EstadoC == 'v') {
                Ec = "viúvo";
            } else {
                Ec = "divorsiado";
            }
        } while (EstadoC != 's' && EstadoC != 'c' && EstadoC != 'v' && EstadoC != 'd');

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.printf("Salário: R$ %.2f mensais", salario);
        System.out.println("\nSexo: " + gen);
        System.out.println("Estado Civil: " + Ec);

        scanner.close();
    }
}
