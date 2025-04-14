/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unievgimenez
 */
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double cont = 0;
        int cont1 = 0;
        double soma = 0;
        for(int i = 0; i<4; i++){
            double nota = input.nextDouble();
            if(nota >= 6){
                cont1++;
            }
            soma = soma + nota;
            cont++;
        }
        double media = soma/cont;
        System.out.printf("a) alunos aprovados foram %d \n media da turma foi: %.2f ",cont1,media);
    }
}
