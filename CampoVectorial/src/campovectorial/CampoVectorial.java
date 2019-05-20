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
        
        MapeoVectorial mapeovectorial= new MapeoVectorial();
        Vector vector = mapeovectorial.getVector();
        boolean respuesta = mapeovectorial.isVectorValido(vector);
   }    
}
