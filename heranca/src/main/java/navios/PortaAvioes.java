/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navios;

/**
 *
 * @author unievgimenez
 */
public class PortaAvioes extends NavioDeGuerra{
    protected int numAvioes;

    public PortaAvioes(int numAvioes, double blindagem, double ataque, int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numAvioes = numAvioes;
    }

    public int getNumAvioes() {
        return numAvioes;
    }

    public void setNumAvioes(int numAvioes) {
        this.numAvioes = numAvioes;
    }
    
    public void poderDeFogo(){
        System.out.println("Porta Aviões");
        System.out.println("Poder de Fogo = " + (ataque * Math.pow(numAvioes, 2 )));
    }
}
