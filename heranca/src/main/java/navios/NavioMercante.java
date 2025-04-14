/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navios;

/**
 *
 * @author unievgimenez
 */
public class NavioMercante extends Navio{
    protected double capacidadeCarga;
    protected double carga;

    public NavioMercante(double capacidadeCarga, double carga, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public double getCarga() {
        return carga;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public String getNome() {
        return nome;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void carregamento(){
        System.out.println("NavioMercante");
        System.out.printf("Número de Tripulantes = %d, nome = %s, Capacidade carga = %.2f, Carga = %.2f\n", numTripulantes,nome, capacidadeCarga, carga);
    }
}
