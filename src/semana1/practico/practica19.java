/*En una cámara de diputados se levanta una encuesta con todos los integrantes con el fin de: 

determinar que porcentaje de los N diputados está a favor del tratado de :

libre comercio, 

que porcentaje está en contra y 

que porcentaje se abstiene a opinar

*/

package semana1.practico;

import java.util.Scanner;

public class practica19 {
    public static void main(String[] args) {
        
          Scanner dato = new Scanner(System.in);
        
        
        int n = 0;
        System.out.println("Ingrese el número de diputados: ");
        n = dato.nextInt();
        
        System.out.println("Ingrese los votos: ");
        System.out.println("1 - A favor");
        System.out.println("2 - En contra");
        System.out.println("3 - Abstener opinión");
        
        int votos[] = new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("DIPUTADO "+i);
            
            System.out.print("Voto: ");
            votos[i] = dato.nextInt();
        }
        
        //Votos
        double voto1=0;
        double voto2=0;
        double voto3=0;
        
        for(int i=0;i<n;i++){
            switch(votos[i]){
                case 1:
                    voto1++;break;
                case 2:
                    voto2++;break;
                case 3:
                    voto3++;break;
            }
        }
        
        double porcentajeVoto1 = (voto1/n)*100;
        double porcentajeVoto2 = (voto2/n)*100;
        double porcentajeVoto3 = (voto3/n)*100;
        
        System.out.println("El "+porcentajeVoto1+"% votó a favor.");
        System.out.println("El "+porcentajeVoto2+"% votó en contra.");
        System.out.println("El "+porcentajeVoto3+"% no dió su opinión.");

        
        
        
    }
    
}
