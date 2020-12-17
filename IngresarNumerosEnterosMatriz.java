
package ingresarnumerosenterosmatriz;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class IngresarNumerosEnterosMatriz {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         int matriz1[][], nfilas, ncol;
         
         nfilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        ncol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        
        matriz1 = new int[nfilas][ncol];
       
        System.out.println("digite una matriz 1");
        
        
         for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.println("matriz [" + i + "][" + j + "]:");
                matriz1[i][j] = entrada.nextInt();
            }
        }
      
         for(int i=0;i<nfilas;i++){
     
            for(int j=0;j<ncol;j++){
                System.out.print( matriz1[i][j]+" ");
            }
            System.out.println();
        }
         
         
         
    }
    
}
