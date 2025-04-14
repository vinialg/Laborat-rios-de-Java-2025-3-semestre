package exercicioarray;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoa = new ArrayList<>();
        String ent = "";
        String nome = "";
        String telefone;
        int id = 0;
        while(!ent.equals("q")){
            System.out.println("Entre com uma das seguintes opções:");
            System.out.println("n [nova entrada]");
            System.out.println("d [apagar registro do usuário]");
            System.out.println("p [mostrar agenda]");
            System.out.println("q [sai do programa]");
            ent = sc.nextLine();
            if(ent.equals("n")){
                System.out.println("Entre com o nome:");
                nome = sc.nextLine();
                
                System.out.println("Entre com o telefone:");
                telefone = sc.nextLine();
                pessoa.add(new Pessoa(nome, telefone, id));
                id++;
            }
            else if(ent.equals("d")){
                System.out.println("Entre com o nome:");
                nome = sc.nextLine();
                
                System.out.println("Entre com o telefone:");
                //telefone = sc.nextLine();
                for(int i = 0; i < pessoa.size(); i++ ){
                    if(pessoa.get(i).getNome().equals(nome)){
                        pessoa.remove(i);
                    }
                }
           
            }else if(ent.equals("p")){
                for(Pessoa cc: pessoa){
                    System.out.println("Id:" + cc.getId());
                    System.out.println("Nome: " + cc.getNome());
                    System.out.println("Telefone: " + cc.getTelefone());
                }
            }
            else if(ent.equals("q")){
                break;
            }
        }
    }

}
