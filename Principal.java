package construtores;



	/*
	 *
	 * @author unievgimenez
	 **/
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        Data d1 = new Data();
        int esc_dia;
        int esc_diaj;
        int esc_mes;
        int esc_ano;
        String esc_mes_ext;
        
        d1.getDia();
        d1.getMes();
        d1.getAno();
        
        System.out.println("Como vc quer informar a data?");
        int escolha = input.nextInt();
        if(escolha == 1){
            esc_dia = input.nextInt();
            esc_mes = input.nextInt();
            esc_ano = input.nextInt();
            d1.setDia(esc_dia);
            d1.setMes(esc_mes);
            d1.setAno(esc_ano);
            int escolha2 = input.nextInt();
            if(escolha2 == 1){
                d1.exibicaoGreg1();
                d1.dataAbrevia(esc_mes, esc_ano, esc_dia);
            } else if(escolha2 == 2){
                d1.exibicaoGreg2();
                /*System.out.println(d1.mesParanum(esc_mes_ext, esc_dia, esc_ano));*/
            } else if(escolha2 == 3){
                d1.exibicaoGreg3();
                /*System.out.println(d1.diaJuliano(esc_dia));*/
            } else{
                System.out.println("Tente novamente.");
            }
        } else if(escolha == 2){
            esc_mes_ext = input.nextLine();
            esc_dia = input.nextInt();
            esc_ano = input.nextInt();
            d1.setMes_ext(esc_mes_ext);
            d1.setDia(esc_dia);
            d1.setAno(esc_ano);
            int escolha2 = input.nextInt();
            if(escolha2 == 1){
                d1.exibicaoGreg1();
                d1.dataAbrevia(esc_mes, esc_ano, esc_dia);
            } else if(escolha2 == 2){
                d1.exibicaoGreg2();
                /*System.out.println(d1.mesParanum(esc_mes_ext, esc_dia, esc_ano));*/
            } else if(escolha2 == 3){
                d1.exibicaoGreg3();
                /*System.out.println(d1.diaJuliano(esc_dia));*/
            } else{
                System.out.println("Tente novamente.");
            }
            
        } else if(escolha == 3){
            esc_diaj = input.nextInt();
            esc_ano = input.nextInt();
            int escolha2 = input.nextInt();
            if(escolha2 == 1){
                d1.exibicaoGreg1();
                d1.dataAbrevia(esc_mes, esc_ano, esc_dia);
            } else if(escolha2 == 2){
                d1.exibicaoGreg2();
                /*System.out.println(d1.mesParanum(esc_mes_ext, esc_dia, esc_ano));*/
            } else if(escolha2 == 3){
                d1.exibicaoGreg3();
                /*System.out.println(d1.diaJuliano(esc_dia));*/
            } else{
                System.out.println("Tente novamente.");
            }
        } else{
            System.out.println("Tente novamente.");
        }
        
        System.out.println("Como vc quer exibir a data?");
        
        int escolha2 = input.nextInt();
        if(escolha2 == 1){
            d1.exibicaoGreg1();
            d1.dataAbrevia(esc_mes, esc_ano, esc_dia);
        } else if(escolha2 == 2){
            d1.exibicaoGreg2();
            /*System.out.println(d1.mesParanum(esc_mes_ext, esc_dia, esc_ano));*/
        } else if(escolha2 == 3){
            d1.exibicaoGreg3();
            /*System.out.println(d1.diaJuliano(esc_dia));*/
        } else{
            System.out.println("Tente novamente.");
        }
       
    }

}
