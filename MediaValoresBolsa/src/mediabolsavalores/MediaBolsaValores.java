/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediabolsavalores;

import java.util.Scanner;

/**
 *
 * @author aavls
 */
public class MediaBolsaValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Variaveis para calcular os valores da bolsa semanal e mensal
        float vbSemanal =0, vbMensal;
        int diaMes = 0;
        
        //Matriz para armazenar os valores da bolsa por dia
        float[][] vbDiario = new float[4][7]; //4 Linhas e 7 Colunas
        
        //Vetor para armazenar as médias da bolsa por semana
        float vbmSemanal[] = new float[vbDiario.length];
       
        //Condição para armazenar a matriz
        for(int linha = 0; linha <= vbDiario.length -1; linha++) {
            
            vbSemanal = 0;
            
            for(int coluna = 0; coluna<= vbDiario[0].length -1; coluna++){
                
            }       
        }
    }  
}
