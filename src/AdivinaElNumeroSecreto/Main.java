/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdivinaElNumeroSecreto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Main {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
Random azar = new Random();

int op, i, num, user;

do 
{
    num = azar.nextInt(100)+1;
    System.out.println
        
        (" ADIVINA EL NUMERO SECRETO DEL 1 AL 1000 ");
    
    for (i = 1; i <=10; i++)
    {System.out.println(" INTENTO NUMERO " + i + " DE 10 INTENTOS ");
    user = leer.nextInt();
    if (user == num) {
        System.out.println("EXCELENTE!! EN HORA BUENA HAZ ADIVINADO EL NUMERO SECRETO "
                + i + " INTENTOS ");
        break;
    }
    else
    {
        
        if (user > num)
            System.out.println
        
        (" EL NUMERO QUE PUSISTE ES MAS ALTO DEL INDICADO ");
        
        else
            System.out.println
        
        (" EL NUMERO QUE PUSISTE ES MAS BAJO QUE EL INDICADO ");
    }
    }
    System.out.println(" 1 > > > QUIERES VOLVER A JUGAR ");
    System.out.println(" 2 > > > YA TE QUIERES SALIR ");
    op = leer.nextInt();

} while (op != 2);
}
}
