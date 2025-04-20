import java.util.ArrayList;
 import java.util.Scanner;
 
 public class CadastroVetor {
     public ArrayList<Morador> cadastrarVarios() {
         Scanner sc = new Scanner(System.in);
         ArrayList<Morador> moradores = new ArrayList<>();
         String continuar;
 
         do {
             Cadastro1 cadastro1 = new Cadastro1();
             Morador morador = cadastroSimples.cadastrar();
             moradores.add(morador);
 
             System.out.print("Deseja cadastrar outro morador?(s/n): ");
             continuar = sc.nextLine();
         } while (continuar.equalsIgnoreCase("s"));
 
         return moradores;
     }
 }
