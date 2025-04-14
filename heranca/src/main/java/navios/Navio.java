/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navios;

/**
 *
 * @author unievgimenez
 */
public class Navio {
    protected int numTripulantes;
    protected String nome;

    public Navio(int numTripulantes, String nome) {
        this.numTripulantes = numTripulantes;
        this.nome = nome;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void exibirInfoGeral(){
        System.out.println("Navio");
        System.out.printf("Número de Tripulantes = %d, nome = %s\n", numTripulantes,nome );
  
    }
}
