/* Un jefe de casilla desea determinar cuantas personas de cada una de las secciones que componen su zona
        asisten el día de las votaciones.
Las secciones son: norte, 

sur y 

centro.

También desea determinar cual es la sección con mayor numero de votantes.*/

package semana1.practico;

import java.util.Scanner;

public class practica22 {
    public static void main(String[] args) {
          Scanner dato = new Scanner(System.in);
        
        
        int n = 0;
        System.out.println("Ingrese el número de personas: ");
        n = dato.nextInt();
        
        int datos[] = new int[n];
        System.out.println("Ingrese las secciones a las que iran cada una de esas personas: ");
        System.out.println("1- Norte");
        System.out.println("2- Sur");
        System.out.println("3- Centro");
        
        for(int i=0;i<n;i++){
            System.out.println("PERSONA "+(i+1));
            System.out.print("Sección: ");
            datos[i] = dato.nextInt();
        }
        
        //Votos
        double opcion1=0;
        double opcion2=0;
        double opcion3=0;
        
        for(int i=0;i<n;i++){
            switch(datos[i]){
                case 1:
                    opcion1++;break;
                case 2:
                    opcion2++;break;
                case 3:
                    opcion3++;break;
            }
        }
        
        System.out.println("El "+opcion1+" personas irán al Norte");
        System.out.println("El "+opcion2+" personas irán al Sur");
        System.out.println("El "+opcion3+" personas irán al Centro");
        
        if(opcion1>opcion2){
            if(opcion1>opcion3){
                System.out.println("HAY MÁS VOTANTES EN LA SECCIÓN NORTE");
            }else{
                System.out.println("HAY MÁS VOTANTES EN LA SECCIÓN CENTRAL");
            }
        }else{
            if(opcion2>opcion3){
                System.out.println("HAY MÁS VOTANTES EN LA SECCIÓN SUR");
            }else{
                System.out.println("HAY MÁS VOTANTES EN LA SECCIÓN CENTRAL");
            }
        }
        

    }
    
}
