import java.util.Scanner;

public class Cadastro1 {
    public Morador cadastrar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n  Cadastro de Morador  ");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Celular: ");
        String celular = sc.nextLine();

        System.out.print("Data de Nascimento: ");
        String dataNascimento = sc.nextLine();

        System.out.print("Sexo: ");
        String sexo = sc.nextLine();

        System.out.print("Bloco: ");
        String bloco = sc.nextLine();

        System.out.print("Apartamento: ");
        String apartamento = sc.nextLine();

        System.out.print("Codigo de Acesso: ");
        String codigoAcesso = sc.nextLine();

        return new Morador(nome, cpf, celular, dataNascimento, sexo, bloco, apartamento, codigoAcesso);
    }
}
