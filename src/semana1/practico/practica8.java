 /* Leer los 250,000 votos otorgados a los 3 candidatos a gobernador
        e imprimir el numero del candidato ganador y su
        cantidad de votos.*/
        
        /*Contaré con 25 votos, y los candidatos son 1, 2 y 3*/
package semana1.practico;

import java.util.Scanner;


public class practica8 {
    public static void main(String[] args) {
          Scanner dato = new Scanner(System.in);
       
        System.out.println("Ingrese los votos: ");
        
        int votos[] = new int[25];
        for(int i=0;i<25;i++){
            votos[i] = dato.nextInt();
        }
        
        int candidato1=0;
        int candidato2=0;
        int candidato3=0;
        int votosNulos=0;
        
        for(int i=0;i<25;i++){
            switch(votos[i]){
                case 1:
                    candidato1++;break;
                case 2:
                    candidato2++;break;
                case 3:
                    candidato3++;break;
                default:
                    votosNulos++;
            }
        }
        
        System.out.println("CANDIDATO 1: "+candidato1+" votos");
        System.out.println("CANDIDATO 2: "+candidato2+" votos");
        System.out.println("CANDIDATO 3: "+candidato3+" votos");
        System.out.println("VOTOS NULOS: "+votosNulos);
        
        if(candidato1 > candidato2){
            if(candidato1 > candidato3){//gana candidato1
                System.out.println("GANA EL CANDIDATO 1");
            }else{//gana candidato3
                System.out.println("GANA EL CANDIDATO 3");
            }
        }else{
            if(candidato2 > candidato3){//gana candidato2
                System.out.println("GANA EL CANDIDATO 2");
            }else{//gana candidato3
                System.out.println("GANA EL CANDIDATO 3");
            }
        }

    }
}
