/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author unievgimenez
 */

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Invoice inv = new Invoice(); 
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o valor do identificador: ");
        String id = input.nextLine();
        System.out.println("Insira o valor da descrição: ");
        String desc = input.nextLine();
        System.out.println("Insira o valor do Quantidade: ");
        int quant = input.nextInt();
        System.out.println("Insira o valor do Preço: ");
        double preco = input.nextDouble();
        
        inv.setIdentificador(id);
        inv.setDescricao(desc);
        inv.setQuantidade(quant);
        inv.setPreco(preco);
        
        double fatura = inv.getInvoiceAmount();
        double quant2 = inv.getQuantidade();
        
        System.out.printf("O identificador é %s, \n a descrição é %s,\n a quantidade é %.2f, \n o preço é %.2f, \n a fatura é R$ %.2f", inv.getIdentificador(),inv.getDescricao(), quant2, inv.getPreco(), fatura);
    }
}
    