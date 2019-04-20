/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campovectorial;

import java.util.Scanner;

/**
 *
 * @author oziel
 */
public class CampoVectorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int x;
        int y;
        String o;
        
        System.out.println("El vector pertenece a Num.Reales o Imaginarios");
        Scanner sc2 = new Scanner(System.in);
        o= sc2.nextLine();
        System.out.println("Escribe el valor de x");
        Scanner sc =new Scanner(System.in);
        x= sc.nextInt();
        
        System.out.println("Escribe el valor de y");
        Scanner sc1 =new Scanner(System.in);
        y= sc.nextInt();
        
        System.out.println("Cumple con el 1° axioma");
        
        if (x+y == y+x)
        System.out.println("cumple con el 2° axioma");
        else 
            System.out.println("No cumple con la ley asociativa de la suma");
        
        if (x+y+0==x+y)
            System.out.println("cumple con el 3° axioma");
        else
            System.out.println("No exixte identico aditivo");
        
        if(x + y + (-x -y )==0) 
            System.out.println("se cumple el 4° axioma");
        else
            System.out.println("No existe inverso aditivo");
            
   }
    
}
