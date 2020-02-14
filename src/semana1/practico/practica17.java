 /*Un entrenador le ha propuesto a un atleta recorrer una ruta de 5 km. durante 10 días,

para determinar si es apto para la prueba de 5 km. o debe buscar otra especialidad. 

Para considerarlo apto debe cumplir por lo menos una de las siguientes condiciones:

        1- Que en ninguna de las pruebas haga un tiempo mayor a 16 min.
        2- Que al menos en una de las pruebas realice un tiempo mayor a 16 min.
        3- Que su promedio de tiempos sea menor o igual a 15 min.

*/


package semana1.practico;

import java.util.Scanner;


public class practica17 {
    public static void main(String[] args) {
        
         Scanner dato = new Scanner(System.in);
       
        
        int t = 10;
        int tiempos[] = new int[t];//Tiempos por 10 días
        System.out.println("Ingrese los tiempos en minutos: ");
        for(int i=0;i<t;i++){
            System.out.println("DÍA "+(i+1));
            System.out.print("Tiempo: ");
            tiempos[i] = dato.nextInt();
        }
        
        boolean confirmar1=true;
        int confirmar2=0;
        int confirmar3=0;
        
        for(int i=0;i<t;i++){
            if(tiempos[i]>16){//numero de oruebas mayor a 16
                confirmar1 = false;
                confirmar2++;//aumenta el contador 
            }
            confirmar3+=tiempos[i];
        }
        confirmar3 /= t;
        
        if(confirmar1==true || confirmar2<=1 || confirmar3<=15){
            System.out.println("ES UN ATLETA APTO");
        }else{
            System.out.println("NO ES UN ATLETA APTO");
        }

        
    }
}
