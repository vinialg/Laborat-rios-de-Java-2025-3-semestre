/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author unievgimenez
 */


public class exercicio3 {
    public static void main(String[] args){
        double soma = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira 1 número por favor:");
        int n = input.nextInt();
        double x = 1;
        for(int i = 0; i < n; i++){
           
            double div = 1/x;
            x = x + 1;
            soma = soma + div;
        }
        System.out.printf("%.2f\n", soma);
        
    }
}
