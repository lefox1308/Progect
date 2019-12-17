package projeto;

import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        //bibliotecas inportadas para funcionamento dos metodos.
        Scanner s1 = new Scanner(System.in);
        //criação do obigeto referido a classe pessoa.
        Pessoa p1 = new Pessoa();
        int op = 0;
        
        do{
            //MENU  
            System.out.println("- - - - - -Opções- - - - - -");
            System.out.println("| 1 -> Cadastrar           |");
            System.out.println("| 2 -> Fazer Pedido        |");
            System.out.println("| 3 -> Buscar Cliente      |");
            System.out.println("| 4 -> Editar Cadastro   |");
            System.out.println("| 5 -> Remover Cadastro     |");
            System.out.println("| 6 -> Sair                |");
            System.out.println("- - - - - - - - - - - - - -");
            op = s1.nextInt();
            
            switch (op){
                
                case 1:
                    //poliforfismo de sobrecarga metodo pedindo os dados.
                    p1.MensagemFinal("f");
                    //metodo de cadastro.
                    p1.cadstrar();
                    
                    
                break;    
                
                case 2:
                    //metodo para pegar o pedido.
                    p1.fazePedido();
                    
                break;    
                    
                case 3:
                    //metodo de buscar o cliente.
                    p1.buscar();
                    
                break;    
                
                case 4:    
                   //metodo para editar um usuario.
                    p1.editarCad();
                    
                break;    
                    
                case 5:
                    //metodo para excluir um cadastro do cliente.
                    p1.remover();
                    
                break;  
                case 6:
                    //metodo para a mensagem final ao fechar o programa sair do polimorfismo de sobrecarga.
                    p1.MensagemFinal(5);
            }
            
        }while(op < 6);
    }
    
}
