package campovectorial;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
