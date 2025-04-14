/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Calcular;
import model.Numero;
import view.Calculadora;

/**
 *
 * @author unievgimenez
 */
public class Controller {
    ArrayList<Numero> lista = new ArrayList<>();
    private Calculadora calculadora;
    private String textinho = "";
    private double numero1 = 0;
    private double numero2 = 0;
    private double resultado= 0;
    private Boolean verdadeiro01 = false;
    private Boolean verdadeiro02 = false;
    private Boolean verdadeiro03 = false;
    private Boolean verdadeiro04 = false;
    
    

    public double getNumero01() {
        return numero1;
    }

    public void setNumero01(double numero1) {
        this.numero1 = numero1;
    }
    
    

    public String getTextinho() {
        return textinho;
    }

    public void setTextinho(String textinho) {
        this.textinho = textinho;
    }
    
    
    
    public Controller(Calculadora calculadora){
        this.calculadora = calculadora;
    }
    
    public void numero0(){
        textinho+="0";
  
    }
    
    
    public void numero01(){
        textinho+="1";
  
    }
    
    public void numero02(){
        textinho+="2";
        
        //this.cxtResultado.setText(String.format("%d",resultado));
    }
    
    public void numero03(){
        textinho+="3";
    }
    
    public void numero04(){
        textinho+="4";
        
        //this.cxtResultado.setText(String.format("%d",resultado));
    }
    
    public void numero05(){
        textinho+="5";
        
        //this.cxtResultado.setText(String.format("%d",resultado));
    }
    
    public void numero06(){
        textinho+="6";
        
        //this.cxtResultado.setText(String.format("%d",resultado));
    }
    
    public void numero07(){
        textinho+="7";
        
        //this.cxtResultado.setText(String.format("%d",resultado));
    }
    
    public void numero08(){
        textinho+="8";
        
        //this.cxtResultado.setText(String.format("%d",resultado));
    }
    
    public void numero09(){
        textinho+="9";
        
        //this.cxtResultado.setText(String.format("%d",resultado));
    }
    
    public void mostrarNum(){           
   
        
        calculadora.getjTextField1().setText(textinho.toString());

    }
    
    public void multiplicar(){
        verdadeiro01 = true;
        numero1 = Double.parseDouble(calculadora.getjTextField1().getText());
        //Double.parseDouble(textinho);
        textinho="";
    }
    
    public void clean(){
        textinho="";
        calculadora.getjTextField1().setText(textinho);
    }
    public void adicionar(){
        verdadeiro02 = true;
        numero1 = Double.parseDouble(textinho);
        textinho="";
    }
    public void subtrair(){
        verdadeiro03 = true;
        numero1 = Double.parseDouble(textinho);
        textinho="";
    }
    public void divisao(){
        verdadeiro04 = true;
        numero1 = Double.parseDouble(textinho);
        textinho="";
    }
    
    public void calcular(){
        
        //tem que usar o Clean para funcionar novamente
        numero2 = Double.parseDouble(calculadora.getjTextField1().getText());
        
        if(verdadeiro01 == true){
            resultado = Calcular.multiplicar(numero1,numero2);
            verdadeiro01 = false;
        } else if(verdadeiro02 == true){
            resultado = Calcular.adicionar(numero1,numero2);
            verdadeiro02 = false;
        } else if(verdadeiro03 == true){
            resultado = Calcular.subtrair(numero1,numero2);
            verdadeiro03 = false;
        } else if(verdadeiro04 == true){
            resultado = Calcular.dividir(numero1,numero2);
            verdadeiro04 = false;
        }
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(resultado);
       calculadora.getjTextField1().setText(String.valueOf(resultado));      
       textinho="";
       
    }
       
       
}

    /*
    public void calcVero(){
        for(int x = 0; x<lista.size(); x++){
            if(lista.get(x).getNumero().equals("X")){
                StringBuilder texto = new StringBuilder();
                StringBuilder texto2 = new StringBuilder();

                for (int y = 0; y<x; y++){
                       texto.append(lista.get(x).toString()).append("\n"); 
                }
                
                for (int y = 0; y>x; y++){
                       texto2.append(lista.get(x).toString()).append("\n"); 
                }
                
                String x2 = texto.toString();
                int x22 = Integer.parseInt(x2);
                String x3 = texto2.toString();
                int x33 = Integer.parseInt(x3);
                int resultado = Calcular.multiplicar(x22, x33);
                /*
                String x2 = lista.get(x-1).toString();
                int x22 = Integer.parseInt(x2);
                String x3 = lista.get(x+1).toString();
                int x33 = Integer.parseInt(x3);
                int resultado = x22*x33;*/
               /* calculadora.getjTextField1().setText(Integer.toString(resultado));
                System.out.println(resultado);
            } else{
                continue;
            }*/
        
        /*StringBuilder texto = new StringBuilder();

        for (Numero item : lista) {
            texto.append(item.toString()).append("\n"); // Adiciona cada item com quebra de linha
        }*/
        //calculadora.getjTextField1().setText(texto.toString());
     /*  lista.clear();
    }*/
    
    /*while(true){
        ArrayList<Numero> lista = new ArrayList<>();
        ArrayList<Numero> lista2 = new ArrayList<>();
        lista2.add(new Numero(Calcular.numero01(1)));
        lista2.add(new Numero(Calcular.numero01(2)));
        lista2.add(new Numero(Calcular.numero01(3)));
        lista2.add(new Numero(Calcular.numero01(4)));
        lista2.add(new Numero(Calcular.numero01(5)));
        lista2.add(new Numero(Calcular.numero01(6)));
        lista2.add(new Numero(Calcular.numero01(7)));
        lista2.add(new Numero(Calcular.numero01(8)));
        lista2.add(new Numero(Calcular.numero01(9)));
        lista2.add(new Numero(Calcular.numero01(10)));
        
        calculadora.getjTextArea1().setText(Integer.toString(numero01));
    }*/
    //for(int x = 0; x<=10; x++){
            

