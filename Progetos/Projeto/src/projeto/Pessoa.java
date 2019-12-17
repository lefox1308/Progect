package projeto;
// bibliotecas inportadas para funcionamento dos obigetos array e scanner.
import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa implements Interface {
    //nome do obigeto e metodo para criar o array;
    ArrayList<Cliente> pedido = new ArrayList(); 
    //nome do obigeto e metodo para criar o scanner.
    Scanner s1 = new Scanner(System.in); 
    //atributos da classe.
    private int salgados, PratoDia, bebidas, qtdS, qtdB, qtdP;
    private Iterable<Cliente> clientes;
    
    @Override
    public void cadstrar() {
        //Parte do cadastro do cliente
                    System.out.println("Nome do Cliente: ");
                    String nome = s1.nextLine();
                    System.out.println("Idade do Cliente: ");
                    String idade = s1.nextLine();
                    System.out.println("Número de cpf: ");
                    String cpf = s1.nextLine();
                    System.out.println("Telefone para contato: ");
                    String numero = s1.nextLine();
                    System.out.println("Endereço para entrega: ");
                    String endereco = s1.nextLine();
                    
                    pedido.add(new Cliente(nome, idade, cpf, numero, endereco));
    }

    @Override
    public void fazePedido() {
            //Parte onde faz o pedido
            int valor;
            int conta = 0, op, conta1 = 0, conta2 = 0, conta3 = 0;

            do{
                System.out.println("preparando cardapio...");
                System.out.println("Cardapio pronto:");
                System.out.println("- - - - -Menu- - - - -");
                System.out.println("1 -> Salgados");
                System.out.println("2 -> Pratos do dia");
                System.out.println("3 -> Bebidas");
                System.out.println("- - - - - - - - - - - -");
                System.out.println("4 -> Checar valor");
                System.out.println("5 -> Sair do Menu");
                System.out.println("- - - - - - - - - - - -");
                
                op = s1.nextInt();
                
                switch (op) {
                    case 1:
                        System.out.println("- - - - - -Salgados- - - - - -");
                        System.out.println("1 - Hambúrguer  -  R$: 5,00");
                        System.out.println("2 - Coxinha  -  R$: 3,00");
                        System.out.println("3 - Pastel  -  R$: 3,00");
                        System.out.println("4 - Sair do Menu");
                        System.out.println("- - - - - - - - - - - - - - - -");
                        
                        salgados = s1.nextInt();
                        
                        if(salgados == 1){
                            System.out.println("Hambúrguer");
                            conta = conta + 5;
                            System.out.println(conta);
                        }
                        if(salgados == 2){
                            System.out.println("Coxinha");
                            conta = conta + 3;
                            System.out.println(conta);
                        }
                        if(salgados == 3){
                            System.out.println("Pastel");
                            conta = conta + 3;
                            System.out.println(conta);                           
                        }
                        System.out.println("Quantidades do produto");
                        qtdS = s1.nextInt();
                        conta1 = conta * qtdS;
                    break;    
                     
                    case 2:
                        System.out.println("- - - - - -Pratos do dia- - - - - -");
                        System.out.println("1 - Feijoada  -  R$: 20,00");
                        System.out.println("2 - Pizza de calabresa  -  R$: 20,00");
                        System.out.println("3 - Bifé a milanesa  -  R$: 15,00");
                        System.out.println("- - - - - - - - - - - - - - - - - -");
                        
                        PratoDia = s1.nextInt();
                        
                        if(PratoDia == 1){
                            System.out.println("Feijoada");
                            conta = conta + 20;
                            System.out.println(conta);
                        }
                        if(PratoDia == 2){
                            System.out.println("Pizza de calabresa");
                            conta = conta + 20;
                            System.out.println(conta);
                        }
                        if(PratoDia == 3){
                            System.out.println("Bife à milanesa");
                            conta = conta + 15;
                            System.out.println(conta);                           
                        }
                        System.out.println("Quantidades do produto");
                        qtdP = s1.nextInt();
                        conta2 = conta * qtdP;
                    break;
                      
                    case 3:
                         System.out.println("- - - - - - -Bebidas- - - - - - -");
                        System.out.println("1 - Coca-Cola Litro  -  R$: 8,00");
                        System.out.println("2 - Guaraná Litro  -  R$: 8,00");
                        System.out.println("3 - Cerveja Litro  -  R$: 10,00");
                        System.out.println("4 - Água 500ml  -  R$: 2,00");
                        System.out.println("- - - - - - - - - - - - - - - - - -");
                        bebidas = s1.nextInt();
                        
                        if(bebidas == 1){
                            System.out.println("Coca-Cola");
                            conta = conta + 8;
                            System.out.println(conta);
                        }
                        if(bebidas == 2){
                            System.out.println("Guaraná");
                            conta = conta + 8;
                            System.out.println(conta);
                        }
                        if(bebidas == 3){
                            System.out.println("Cerveja");
                            conta = conta + 10;
                            System.out.println(conta);                           
                        }
                        if(bebidas == 4){
                            System.out.println("Água");
                            conta = conta + 2;
                            System.out.println(conta);                           
                        }
                        System.out.println("Quantidades do produto");
                        qtdB = s1.nextInt();
                        conta2 = conta * qtdB;
                    break;
                        
                    case 4:
                        if(salgados == 1){
                            System.out.println("Hambúrguer -> R$: 5,00");
                            System.out.println("Quantidade" + qtdS);
                        } else if(salgados == 2){
                            System.out.println("Coxinha -> R$: 3,00");
                            System.out.println("Quantidade" + qtdS);
                        } else if(salgados == 3){
                            System.out.println("Pastel -> R$: 3,00");
                            System.out.println("Quantidade" + qtdS);
                        }
                        if(PratoDia == 1){
                            System.out.println("Feijoada -> R$: 20,00");
                            System.out.println("Quantidade" + qtdP);
                        } else if(PratoDia == 2){
                            System.out.println("Pizza de calabresa -> R$: 20,00");
                            System.out.println("Quantidade" + qtdP);
                        } else if(PratoDia == 3){
                            System.out.println("Bife à milanesa -> R$: 15,00");
                            System.out.println("Quantidade" + qtdP);
                        }
                        if(bebidas == 1){
                            System.out.println("Coca-Cola -> R$: 8,00");
                            System.out.println(qtdB);
                        } else if(bebidas == 2){
                            System.out.println("Guaraná -> R$: 8,00");
                            System.out.println("Quantidade" + qtdB);
                        } else if(bebidas == 3){
                            System.out.println("Cerveja -> R$: 10,00");
                            System.out.println("Quantidade" + qtdB);
                        } else if(bebidas == 4){
                            System.out.println("Água -> R$: 2,00");
                            System.out.println("Quantidade" + qtdB);
                        }
                        valor = conta1 + conta2 + conta3;
                        System.out.println("R$: " + valor);
                    break;    
                }
            }while(op < 5);
    }

    @Override
    //interior do metodo para buscar os dados dos clientes.
    public void buscar() {
        int senha;
        System.out.println("Entrada apenas para funcionários");
        System.out.println("Case seja o seu caso");
        System.out.print("Digite a senha de acesso: ");
        senha = s1.nextInt();
        if(senha == 280110){
        int i = 0; 
        for(i = 0; i <pedido.size(); i++){
            System.out.println(i + " :Indice do elemento");
            System.out.println("Nome: " + pedido.get(i).getNome());
            System.out.println("Idade: " + pedido.get(i).getIdade());
            System.out.println("cpf: " + pedido.get(i).getCpf());
            System.out.println("Número: " + pedido.get(i).getNumero());
            System.out.println("Endereço: " + pedido.get(i).getEndereco());
        }
        } else {
            System.out.println("Você não é funcionário");
        }
    }

    @Override
    //interior do metodo de remover o cadastro dos clientes.
    public void remover() {
        System.out.println("Contato que será removido: ");
        String rem = s1.next();
                    
        for (int i = 0; i <pedido.size(); i++) {
        Heranca idContato =  pedido.get(i);
            if (idContato.getNome().equalsIgnoreCase(rem)) {
            pedido.remove(i);
            }
        }    
            System.out.println("removido");           
    }
        //interior do metodo criado para a sobrecarga,para enviar as mensagems finais.
     public void MensagemFinal(int z){
        System.out.println("Obrigado pela preferencia ^w^");
        System.out.println("VOLTE SEMPRE ^W^");
    }
     //interior do metodos  para inprimir a mensagem de entrega de dados.
     public void MensagemFinal(String x){
         System.out.println("insira seus dados:");
     }
     //ajuste para o funcionamento do metodo mensagemFinal.
    @Override
    public void MensagemFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    //interior do metodo de editar o cadastro dos clientes.
    public void editarCad() {
        System.out.println("Digite o cpf do cliente:");
        String cpf = s1.nextLine();
        
        for (Cliente c: this.pedido) {
            if (c.getCpf().equals(cpf)) {
                System.out.println("Novo Nome:");
                c.setNome(s1.nextLine());
                System.out.println("Nova idade:");
                c.setIdade(s1.nextLine());
                System.out.println("Novo cpf:");
                c.setCpf(s1.nextLine());
                System.out.println("Novo telefone:");
                c.setNumero(s1.nextLine());
                System.out.println("Novo endereço:");
                c.setEndereco(s1.nextLine());
                return;
            }
            System.out.println("Contato não encontrado");
        }
    }

    
    }


  

