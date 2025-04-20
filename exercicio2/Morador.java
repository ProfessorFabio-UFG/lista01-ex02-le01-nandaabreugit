public class Morador {
     private String nome;
     private String cpf;
     private String celular;
     private String dataNascimento;
     private char sexo;
     private String bloco;
     private String apartamento;
     private String codigoAcesso;
     
     public Morador(String nome, String cpf, String celular, String dataNascimento, char sexo, String bloco, String apartamento, String codigoAcesso) {
         this.nome = nome;
         this.cpf = cpf;
         this.celular = celular;
         this.dataNascimento = dataNascimento;
         this.sexo = sexo;
         this.bloco = bloco;
         this.apartamento = apartamento;
         this.codigoAcesso = codigoAcesso;
     }
     
     public String toString() {
         return "Nome: " + nome + "CPF: " + cpf+ "Celular: " + celular + "Data de Nascimento: " + dataNascimento + "Sexo: " + sexo+ "Bloco: " + bloco + "Apartamento: " + apartamento+ "Codigo de Acesso: " + codigoAcesso;
     }
 }
