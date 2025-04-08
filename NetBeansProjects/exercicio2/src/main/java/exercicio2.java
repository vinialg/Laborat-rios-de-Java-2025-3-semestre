/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unievgimenez
 */
public class exercicio2 {
    public static void main(String[] args){
        int seq1 = 1;

        while (seq1 <= 100){
            if(seq1 <52){
                System.out.printf("%d\n", seq1);
                seq1 = seq1 + 1;
            
            }
            if(seq1 == 51){
                seq1 = seq1 + 1;
                System.out.printf("%d\n", seq1);
            }
            if(seq1 > 51 && seq1 <=100){
                    //System.out.printf("d", seq1);
                seq1 = seq1 + 2;
                System.out.printf("%d\n", seq1);
                if (seq1 == 100){
                    break;
                }
            }
        }
}
}
