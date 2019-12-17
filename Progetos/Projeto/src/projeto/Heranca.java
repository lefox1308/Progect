package projeto;
public class Heranca {
    //primeiros atributos que receberão os dados dos clientes 
    public String nome;
    public String idade;
    public String cpf;

    public Heranca(String nome, String idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    
    //encapisulamento dos atributos a cima.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
//encapsulamento do obigeto remove.
    Object remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
