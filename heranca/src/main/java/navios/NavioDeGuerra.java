/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navios;

/**
 *
 * @author unievgimenez
 */
public class NavioDeGuerra extends Navio{
    protected double blindagem;
    protected double ataque;

    public NavioDeGuerra(double blindagem, double ataque, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

    public double getBlindagem() {
        return blindagem;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setBlindagem(double blindagem) {
        this.blindagem = blindagem;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
    
    public void  poderDeFogo(){
        System.out.println("Poder de Fogo = " +ataque);
    }
    
    public void exibirArmas(){
        System.out.println("Navio de Guerra");

        System.out.printf("Número de Tripulantes = %d, nome = %s, Blindagem = %.2f, Ataque = %.2f,  ", numTripulantes,nome, blindagem, ataque);
        poderDeFogo();
  
    }
}
