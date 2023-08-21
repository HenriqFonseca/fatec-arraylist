package fatec.arraylist;
/**
 *
 * @author Henrique
 */
public class Cliente {

    String nome;
    String cpf;
    String cnpj;
    String email;
    String responsavel;
    String cidade;
    String estado;
    String endereco;
    String telefone;
    int qtdResiduos;
    double custoMensal;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString() {
        return ("\n Nome:" + this.nome + "\n CPF:" + this.cpf);
    }

}
