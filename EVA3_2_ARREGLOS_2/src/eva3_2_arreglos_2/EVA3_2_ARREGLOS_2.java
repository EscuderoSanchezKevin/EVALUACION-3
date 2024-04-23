/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_arreglos_2;

/**
 *
 * @author invitado
 */
public class EVA3_2_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //java: 0 primer elemento
        
        //n --> TOTAL DE ELEMENTOS ALMACENADOS
        // int datos[], x, y; --> solo datos es un arreglo
        // int[] datos, x, y; todas las variables son arreglos
        int datos [] = new int[10];
        
        // asignar valores aleatorios entre 0 y 99
        for(int i = 0; i < datos.length; i++){
        datos[i] = (int) (Math.random() * 100);//0 - 99
       }
        //imprimir los elementos de arreglo
        for(int i = 0; i < datos.length; i++){
        System.out.println("[" + datos[i] + "]");
        }
    }
    
}
