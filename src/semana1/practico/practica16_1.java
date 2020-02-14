  /* En un supermercado una ama de casa pone en su carrito los artículos que va tomando de los estantes.

La señora quiere asegurarse de que el cajero le cobre bien lo que ella ha comprado,

por lo que cada vez que toma un articulo
        
anota su precio 

junto con la cantidad de artículos iguales que ha tomado

y determina cuanto dinero gastara en ese articulo; 

a esto le suma lo que ira gastando en los demás artículos,

hasta que decide que ya tomo todo lo que necesitaba. 


Ayúdale a esta señora a obtener el total de sus compras.*/
        
package semana1.practico;

import java.util.Scanner;

public class practica16_1 {
    public static void main(String[] args) {
        
         Scanner dato = new Scanner(System.in);
      
        int na = 0;
        System.out.println("Ingrese el número de artículos");
        na = dato.nextInt();
        
        practica16 articulos[] = new practica16[na];
        
        
        System.out.println("Ingrese el precio y la cantidad de articulos que llevará: ");
        for(int i=0;i<na;i++){
            articulos[i] = new practica16();
            
            System.out.println("ARTICULO "+(i+1));
            
            System.out.println("Precio: ");
            double precio = dato.nextDouble();
            
            System.out.println("Cantidad: ");
            int cantidad = dato.nextInt();
            
            articulos[i].setPrecio(precio);
            articulos[i].setCantidad(cantidad);
        }
        
        double totalPagar = 0;
        for(int i=0;i<na;i++){
            totalPagar += articulos[i].getCantidad()*articulos[i].getPrecio();
        }
        
        System.out.println("El precio total a pagar es: s/."+totalPagar);

        
    }
    
}
