package projeto;
public class Cliente extends Heranca {
//polimorfissmos dos obigetos get e size.
    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Cliente get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String endereco;
    private String numero;
//metodo construtor onde as informações do cliente serão adicionadas ao cadastro.
    public Cliente(String nome, String idade, String cpf, String numero, String endereco) {
        super(nome, idade, cpf);
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.numero = numero;
        this.endereco = endereco;
    }
//encapisulanebto dos atributos.
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }   
    
}
