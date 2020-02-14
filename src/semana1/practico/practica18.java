 /*
En un centro de verificación de autos se desea saber el 

promedio de puntos contaminantes de los primeros25 autos que lleguen.

Asimismo se desea saber los puntos contaminantes del auto que menos contaminó 

                                                     y del que más contaminó
*/

package semana1.practico;

import java.util.Scanner;

public class practica18 {
    public static void main(String[] args) {
     
         Scanner dato = new Scanner(System.in);
       
        
        int na = 5;//Número de autos
        System.out.println("Ingrese los puntos contaminantes de los 5 autos: ");
        
        int puntos[] = new int[na];
        
        for(int i=0;i<na;i++){
            System.out.println("AUTO "+i);
            System.out.print("Puntos: ");
            puntos[i] = dato.nextInt();
        }
        
        int mayor = puntos[0];
        int indiceMayor = 0;
        int menor = puntos[0];
        int indiceMenor = 0;
        
        for(int i=1;i<na;i++){
            if(mayor<puntos[i]){
                mayor = puntos[i];
                indiceMayor = i;
            }
            if(menor>puntos[i]){
                menor = puntos[i];
                indiceMenor = i;
            }
        }
        
        System.out.println("El Auto "+indiceMayor+" es el que más contamina con "+mayor+" puntos.");
        System.out.println("El Auto "+indiceMenor+" es el que menor contamina con "+menor+" puntos.");

        
        
    }
    
}
