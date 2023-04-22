import java.util.Scanner;

public class AtividadeDois {

    public static void main(String[] args) {

        System.out.println("Kayque dos Santos Almeida / RA: 4231923060.");

        Scanner scanner = new Scanner(System.in);

        String nomeUsuario, senha;

        do {
            System.out.print("Usuário: ");
            nomeUsuario = scanner.nextLine();

            System.out.print("Senha: ");
            senha = scanner.nextLine();

            if (nomeUsuario.equals(senha)) {
                System.out.println("A senha não pode ser igual ao nome de usuário, digite-a novamente!");
            }
        } while (nomeUsuario.equals(senha)); // Enquanto(while) o nome for igual a senha o sistema executára o do.

        System.out.println("Cadastro realizado com sucesso!");

        scanner.close();
    }
}
