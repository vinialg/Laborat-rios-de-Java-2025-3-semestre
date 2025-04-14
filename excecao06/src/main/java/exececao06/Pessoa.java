/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exececao06;

/**
 *
 * @author unievgimenez
 */
public class Pessoa {
        private String nome;
	private int idade;
	private String sobrenome;
	private String cpf;
	public Pessoa(String nome, String sobrenome, int idade, String cpf) {
		super();
                if(cpf.contains(".") || cpf.contains("-")){
                    throw new Verifica("Digite o CPF novamente");
		} else{
                    this.cpf = cpf;
                }
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
                
	}
	
	public String toString(){
		return "Nome = " + this.nome + "Sobrenome = " + this.sobrenome + " Idade = " + this.idade + " CPF = " + this.cpf;
	}    
}
