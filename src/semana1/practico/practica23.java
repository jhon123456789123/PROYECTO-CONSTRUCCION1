 /*
En un supermercado un :

cajero captura los precios de los artículos que los clientes compran e 

indica a cada cliente cual es el monto de lo que deben pagar.

Al final del día le indica a su supervisor cuanto fue lo que cobro en total a
        todos los clientes que pasaron por su caja.
*/

package semana1.practico;

import java.util.Scanner;

public class practica23 {
    public static void main(String[] args) {
        
          Scanner dato = new Scanner(System.in);
       
        
        int ncl = 0;
        int nc = 0;
        System.out.println("Ingrese el número de clientes: ");
        ncl = dato.nextInt();
        System.out.println("Ingrese el número de cajas: ");
        nc = dato.nextInt();
        
        System.out.println("Ingrese los precios a pagar por los artículos de cada cliente y especifique en que caja está pagando: ");
        double cobrosClientes[] = new double[ncl];
        double cajas[] = new double[nc];
        
        System.out.println("CAJAS:");
        for(int i=0;i<nc;i++){
            System.out.println((i+1)+" - Caja");
        }
        
        for(int i=0;i<ncl;i++){
            System.out.println("CLIENTE "+(i+1));
            System.out.print("Precio: ");
            cobrosClientes[i] = dato.nextDouble();
            System.out.print("Caja: ");
            int indiceCaja = dato.nextInt();
            indiceCaja--;
            cajas[indiceCaja] += cobrosClientes[i];
        }
        
        System.out.println("Estas son las ganancias generada por cada caja: ");
        for(int i=0;i<nc;i++){
            System.out.println("CAJA "+(i+1)+" - Monto"+cajas[i]);
        }
        

        
        
    }
    
}
