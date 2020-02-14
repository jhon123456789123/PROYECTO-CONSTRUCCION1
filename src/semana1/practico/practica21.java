 /*Un censador desea obtener de todas las personas que alcance a encuestar, que porcentaje tiene estudios:
        - Primaria
        - Secundaria
        - Carrera Técnica
        - Estudios Profesionales
        - Estudios de posgrado

*/
        
package semana1.practico;

import java.util.Scanner;


public class practica21 {
    public static void main(String[] args) {
        
          Scanner dato = new Scanner(System.in);
       
        int n = 0;
        System.out.println("Ingrese el número de personas encuestadas: ");
        n = dato.nextInt();
        
        int datos[] = new int[n];

        System.out.println("Ingrese los datos: ");
        System.out.println("1- Primaria");
        System.out.println("2- Secundaria");
        System.out.println("3- Carrera Técnica");
        System.out.println("4- Estudios Profesionales");
        System.out.println("5- Estudios de Posgrado");
        
        for(int i=0;i<n;i++){
            System.out.println("ENCUESTA "+(i+1));
            System.out.print("Dato: ");
            datos[i] = dato.nextInt();
        }
        
        //Votos
        double opcion1=0;
        double opcion2=0;
        double opcion3=0;
        double opcion4=0;
        double opcion5=0;
        
        for(int i=0;i<n;i++){
            switch(datos[i]){
                case 1:
                    opcion1++;break;
                case 2:
                    opcion2++;break;
                case 3:
                    opcion3++;break;
                case 4:
                    opcion4++;break;
                case 5:
                    opcion5++;break;
            }
        }
        
        double porcentajeOpcion1 = (opcion1/n)*100;
        double porcentajeOpcion2 = (opcion2/n)*100;
        double porcentajeOpcion3 = (opcion3/n)*100;
        double porcentajeOpcion4 = (opcion4/n)*100;
        double porcentajeOpcion5 = (opcion5/n)*100;
        
        
        System.out.println("El "+porcentajeOpcion1+"%: Primaria");
        System.out.println("El "+porcentajeOpcion2+"%: Secundaria");
        System.out.println("El "+porcentajeOpcion3+"%: Carrera Tecnica");
        System.out.println("El "+porcentajeOpcion4+"%: Estudio Profesional");
        System.out.println("El "+porcentajeOpcion5+"%: Estudio de Posgrado");

        
    }
    
}
