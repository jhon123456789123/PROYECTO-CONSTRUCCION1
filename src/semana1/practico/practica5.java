/*Encontrar el mayor valor de un conjunto de N números dados*/
package semana1.practico;
/*Encontrar el mayor valor de un conjunto de N números dados*/
import java.util.Scanner;


public class practica5 {
    public static void main(String[] args) {
         Scanner dato = new Scanner(System.in);
        
        
        int n = 0;
        System.out.println("Ingrese el valor de N: ");
        n = dato.nextInt();
        
        int nums[] = new int[n];
        
        System.out.println("Ingrese los "+n+" datos: ");
        for(int i=0;i<n;i++){
            nums[i] = dato.nextInt();
        }
        
        int numM = nums[0];
        for(int i=0;i<n;i++){
            if(numM < nums[i]){
                numM = nums[i];
            }
        }
        
        System.out.println("El mayor valor encontrado es: "+numM);

    }
}