package matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Agente> pessoa = new ArrayList<>();
        String profissao =  "";
        boolean modo_agente = false;
        int ac1 = 0;
        int ac2 = 0;
        int ac3 = 0;
        while(!profissao.equals("q")){
            System.out.println("Digite a profissão: Empresario, Professor ou Advogado");
            profissao = input.nextLine();
            if(profissao.equals("Empresario")){
                System.out.println("Digite seu nome: ");
                String nome = input.nextLine();
                System.out.println("Digite sua empresa: ");
                String empresa = input.nextLine();
                pessoa.add(new Empresario(empresa, nome, modo_agente, profissao));
                pessoa.get(ac1).apresentacao();
                ac1++;
            } else if(profissao.equals("Professor")){
                System.out.println("Digite seu nome: ");
                String nome = input.nextLine();
                System.out.println("Digite sua escola: ");
                String escola = input.nextLine();
                pessoa.add(new Professor(escola, nome, modo_agente, profissao));
                pessoa.get(ac1).apresentacao();
                ac1++;
            } else if(profissao.equals("Advogado")){
                System.out.println("Digite seu nome: ");
                String nome = input.nextLine();
                System.out.println("Digite NºOAB: ");
                String escola = input.nextLine();
                pessoa.add(new Advogado(escola, nome, modo_agente, profissao));
                pessoa.get(ac1).apresentacao();
                ac1++;
            } else if(!profissao.equals("q")){
                System.out.println("Erro, tente dnv");
            }           
        }
        for(int i = 0; i<pessoa.size(); i++) {
        	int numAlt = (int) (Math.random() * pessoa.size());
        	if(i == numAlt) {
        		pessoa.get(i).modo_agente_on();
        	}
        }
        for(Agente pessoas : pessoa) {
        	pessoas.apresentacao();
        }
    }
}
