/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navios;

import java.util.Scanner;

/**
 *
 * @author unievgimenez
 */
public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.println("Digite a quantidade de Tripulantes: ");
            int numTripulantes = input.nextInt();
            System.out.println("Digite o nome do Navio: ");
            String nome = input.next();
            Navio navio = new Navio(numTripulantes, nome);
            navio.exibirInfoGeral();
        }
        
        for(int i = 0; i<5; i++){
            input.nextLine();
            System.out.println("Digite a quantidade de Tripulantes: ");
            int numTripulantes = input.nextInt();
            System.out.println("Digite o nome do Navio: ");
            String nome = input.next();
            System.out.println("Digite a blindagem: ");
            double blindagem = input.nextDouble();
            System.out.println("Digite o ataque: ");
            double ataque = input.nextDouble();
            NavioDeGuerra navioguerra = new NavioDeGuerra(blindagem,ataque, numTripulantes, nome);
            navioguerra.exibirArmas();
            navioguerra.poderDeFogo();
        }
        
        for(int i = 0; i<5; i++){
            input.nextLine();
            System.out.println("Digite a quantidade de Tripulantes: ");
            int numTripulantes = input.nextInt();
            System.out.println("Digite o nome do Navio: ");
            String nome = input.next();    
            System.out.println("Capacidade de Carga: ");
            double capacidade = input.nextDouble();
            System.out.println("carga: ");
            double carga = input.nextDouble();
            NavioMercante naviomercante = new NavioMercante(capacidade, carga, numTripulantes, nome);
            naviomercante.carregamento();
        }
        
        for(int i = 0; i<5; i++){
            input.nextLine();
            System.out.println("Digite a quantidade de Tripulantes: ");
            int numTripulantes = input.nextInt();
            System.out.println("Digite o nome do Navio: ");
            String nome = input.next();
            System.out.println("Digite a blindagem: ");
            double blindagem = input.nextDouble();
            System.out.println("Digite o ataque: ");
            double ataque = input.nextDouble();
            System.out.println("Digite a quantidade de Canhões: ");
            int numCanhoes = input.nextInt();
            input.nextLine();
            Cruzador cruzador = new Cruzador(numCanhoes, blindagem, ataque, numTripulantes, nome);
            cruzador.exibirInfoGeral();
            cruzador.poderDeFogo();
        }
        
        for(int i = 0; i<5; i++){
            System.out.println("Digite a quantidade de Tripulantes: ");
            int numTripulantes = input.nextInt();
            System.out.println("Digite o nome do Navio: ");
            String nome = input.next();
            System.out.println("Digite a blindagem: ");
            double blindagem = input.nextDouble();
            System.out.println("Digite o ataque: ");
            double ataque = input.nextDouble();
            System.out.println("Digite a quantidade de Aviões: ");
            int numAvioes = input.nextInt();
            PortaAvioes avioes = new PortaAvioes(numAvioes, blindagem, ataque, numTripulantes, nome);
            avioes.exibirInfoGeral();
            avioes.poderDeFogo();
        }
    }
}
