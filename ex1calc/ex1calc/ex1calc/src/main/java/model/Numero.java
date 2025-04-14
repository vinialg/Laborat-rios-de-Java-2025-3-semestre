/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author unievgimenez
 */
public class Numero {
    private String numero;

    public Numero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
    
    public String toString() {
        return numero; // Retorna o valor armazenado em vez do endereço de memória
    }

    public Object trim() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
