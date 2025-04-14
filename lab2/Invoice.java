/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author unievgimenez
 */
public class Invoice {
    private String identificador;
    private String descricao;
    private int quantidade;
    private double  preco;
    
    public String getIdentificador(){
        return identificador;
    }
    
    public String getDescricao(){
        return descricao;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public double getPreco(){
        return preco;
    }
    
    public void setIdentificador(String identificador){
        this.identificador = identificador;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setQuantidade(int quantidade){
        if(quantidade > 0){
            this.quantidade = quantidade;
        } else{
            quantidade = 0;
            this.quantidade = quantidade;
        }

    }
    public void setPreco(double preco){
        if(preco < 0){
            preco = 0;
            this.preco = preco;
        } else{
            this.preco = preco;
        }
    }
    
    public double getInvoiceAmount(){
        return preco * quantidade;
    }
    
}
