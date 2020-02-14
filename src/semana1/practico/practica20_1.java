
  /*Una persona que va de compras a la tienta "Enano S.A.", 

decide llevar un control sobre lo que va comprando, 

para saber la cantidad de dinero que tendrá que pagar al llegar a la caja.

La tienda tiene una promoción del 20% de descuento sobre aquellos artículos cuya etiqueta sea roja.

Determinar la cantidad de dinero que esta persona deberá pagar.

*/
package semana1.practico;

import java.util.Scanner;

public class practica20_1 {
    public static void main(String[] args) {
        
        
          Scanner dato = new Scanner(System.in);
      
        
        int n = 0;
        System.out.println("Ingrese la cantidad de articulos que comprará: ");
        n = dato.nextInt();
        
        practica20 articulos[] = new practica20[n];
        for(int i=0;i<n;i++){
            articulos[i] = new practica20();
        }
        
        System.out.println("Ingrese el precio y el color de la etiqueta de los artículos: ");
        for(int i=0;i<n;i++){
            System.out.println("ARTÍCULO "+(i+1));
            System.out.println("Precio: ");
            double precio = dato.nextDouble();
            System.out.println("Color de la Etiqueta: ");
            String color = dato.next();
            
            articulos[i].setPrecio(precio);
            articulos[i].setColorEtiqueta(color);
        }
        
        for(int i=0;i<n;i++){
            if(articulos[i].getColorEtiqueta().equals("rojo")){
                articulos[i].hacerDescuento(articulos[i].getPrecio()*0.2);
            }
        }
        
        double total = 0;
        System.out.println("PRECIO A PAGAR");
        for(int i=0;i<n;i++){
            System.out.println("Articulo "+(i+1)+" - S/."+articulos[i].getPrecio());
            total += articulos[i].getPrecio();
        }
        System.out.println("\nTOTAL A PAGAR: "+total);

        
    }
    
}
