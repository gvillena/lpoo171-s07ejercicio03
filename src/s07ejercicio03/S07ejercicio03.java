/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Escribe un numero");        
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Escribe otro numero");        
        int number2 = Integer.parseInt(reader.nextLine());
        
        if (number1 > number2) {
            String toPrint = "\nEl mayor numero de los numeros ingresados fue: " + number1;
            System.out.println(toPrint);
        } 
        else {
            String toPrint = "\nEl mayor numero de los numeros ingresados fue: " + number2;
            System.out.println(toPrint);
        }
           
        
        
        
    }
    
}
