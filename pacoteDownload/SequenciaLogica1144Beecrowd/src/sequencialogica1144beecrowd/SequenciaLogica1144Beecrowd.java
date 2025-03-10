/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequencialogica1144beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class SequenciaLogica1144Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();
        int quad = 1;
        int cubo = 1;
        
        for (int i = 1; i <= N; i++){
            quad = i * i;
            cubo = i * i * i;
            int cc;
            for (cc = 1; cc < i; cc++){
            
            }
            System.out.println(i + " " + quad + " " + cubo);
            System.out.println(cc + " " + (quad + 1) + " " + (cubo + 1));
        }

    }
    
}


