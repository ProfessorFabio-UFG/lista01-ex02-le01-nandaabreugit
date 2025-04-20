import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("\nMenu de Cadastro de Moradores");
            System.out.println("1-Cadastrar 1 morador");
            System.out.println("2-Cadastrar varios morador");
            System.out.print("Escolha uma opcao (1 ou 2): ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                Cadastro1 cadastro1 = new Cadastro1();
                Morador morador = cadastro1.cadastrar();
                System.out.println("\nMorador Cadastrado");
                morador.mostrarDados();
            } else if (opcao == 2) {
                CadastroVetor cadastroVetor = new CadastroVetor();
                ArrayList<Morador> moradores = cadastroVetor.cadastrarVarios();

                System.out.println("\nLista de Moradores Cadastrados");
                for (Morador m : moradores) {
                    m.mostrarDados();
                }
            } else {
                System.out.println("Opcao invalida!");
            }

            System.out.print("\nDeseja realizar um novo cadastro?(s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Encerrando.");
        sc.close();
    }
}
