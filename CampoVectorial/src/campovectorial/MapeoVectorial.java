package campovectorial;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Desarrollo
 */
public class MapeoVectorial {
    
    public Vector  getVector(){
        Vector vector = new Vector();
        vector.setX(getCoordenada("X"));
        vector.setY(getCoordenada("Y"));        
        return vector;
    }
    
    public boolean isVectorValido(Vector vector){
        boolean respuesta = false;
        System.out.println("Validando : " + vector.toString());
        
        if(vector != null){
            //Validar primer axioma
            if((vector.getX() < 0) || (vector.getY() < 0)){
                respuesta = false;
                System.out.println("No cumple con el 1° axioma");
                return respuesta;
            }
            System.out.println("Cumple con el 1° axioma");
            
            if (vector.getX()+vector.getY() != vector.getY()+vector.getX()){
                respuesta = false;
                System.out.println("No cumple con el 2° axioma");
                return respuesta;
            }
            System.out.println("cumple con el 2° axioma");
            
            if (vector.getX() + vector.getY()+0 != vector.getX() + vector.getY()){
                respuesta = false;
                System.out.println("No cumple con el 3° axioma");
                return respuesta;
            }
            System.out.println("Cumple con el 3° axioma");
            
            if ((vector.getX()+vector.getY())+(-vector.getX()-vector.getY()) != 0) {
                respuesta = false;
                System.out.println("No cumple con el 4° axioma");
                return respuesta;
            }
            System.out.println("Cumple con el 4° axioma");
            
            int escalar = new Random().nextInt(100) + 1;
            if ((vector.getX()*escalar <= 0) || (vector.getY()*escalar <= 0) ) {
                respuesta = false;
                System.out.println("No cumple con el 5° axioma");
                return respuesta;
            }
            System.out.println("Cumple con el 5° axioma");
            
            if ((vector.getX() + vector.getY())*escalar != vector.getX()*escalar + vector.getY()*escalar) {
                respuesta = false;
                System.out.println("No cumple con el 6° axioma");
                return respuesta;
            }
            System.out.println("Cumple con el 6° axioma");
            
            int escalar2 = new Random().nextInt(100) + 1;
            if ((vector.getX()*escalar*escalar2 != vector.getX()*escalar*escalar2) || (vector.getY()*escalar*escalar2 != vector.getY()*escalar*escalar2)) {
                respuesta = false;
                System.out.println("No cumple con el 7° axioma");
                return respuesta;
            }
            System.out.println("Cumple con el 7° axioma");
            
            if ((vector.getX()*escalar)*escalar2 != (vector.getX()*escalar2)*escalar || (vector.getY()*escalar)*escalar2 != (vector.getY()*escalar)*escalar2 ) {
                respuesta = false;
                System.out.println("No cumple con el 8° axioma");
                return respuesta;
            }
            System.out.println("Cumple con el 8° axioma");
            
            if (vector.getX()*1 != vector.getX()*1 || vector.getY()*1 != vector.getY()*1) {
                respuesta = false;
                System.out.println("No cumple con el 9° axioma");
                return respuesta;
            }
            System.out.println("Cumple con el 9° axioma");
            
        }
        
        return respuesta;
    }
    
    private int getCoordenada(String nombreValor){
        int coordenada;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el valor de " + nombreValor);        
        coordenada = scanner.nextInt();        
        return coordenada;
    }
}
