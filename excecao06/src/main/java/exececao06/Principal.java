/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exececao06;

import java.util.Scanner;

/**
 *
 * @author unievgimenez
 */
public class Principal {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome =  input.nextLine();
		System.out.println("Digite seu sobrenome: ");
		String sobrenome =  input.nextLine();
		System.out.println("Digite sua idade: ");
		int idade =  input.nextInt();
		input.nextLine();
		while(true){
			try{
                            String cpf;
                            System.out.println("Digite seu CPF: ");
                            cpf =  input.nextLine();
                            Pessoa pessoa = new Pessoa(nome,sobrenome,idade,cpf);
                            System.out.println(pessoa.toString());
                            break;
			}
			catch(Verifica e){
                            System.out.println(e.getMessage());
			}
		}
	}

}
