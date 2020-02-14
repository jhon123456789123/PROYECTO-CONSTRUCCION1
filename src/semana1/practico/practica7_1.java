 /*En una granja se requiere saber alguna información para determinar
        el precio de venta por cada kilo de huevo. 

          Es importante determinar
        el promedio de calidad de las N gallinas que hay en la granja.

        La calidad de cada gallina se obtiene según la fórmula:
        calidad = (peso*altura)/numero de huevos que pone*/
package semana1.practico;

import java.util.Scanner;

public class practica7_1 {
    public static void main(String[] args) {
        
          Scanner dato = new Scanner(System.in);
       
        
        int n = 0;
        System.out.println("Ingrese el numero de gallinas: ");
        n = dato.nextInt();
        
        practica7 gallinas[] = new practica7[n];
        
        for(int i=0;i<n;i++){
            gallinas[i] = new practica7();
        }
        
        System.out.println("Ingrese los datos de cada gallina: ");
        for(int i=0;i<n;i++){
            System.out.println("\nGALLINA: "+i);
            System.out.println("Peso (kg): ");
            double peso = dato.nextDouble();
            gallinas[i].setPeso(peso);
            
            System.out.println("Altura (cm): ");
            double altura = dato.nextDouble();
            gallinas[i].setAltura(altura);
            
            System.out.println("Número de huevos que pone: ");
            int numeroH = dato.nextInt();
            gallinas[i].setNumeroHuevos(numeroH);
        }
        
        //Calcular calidad y precio por kilo de huevo
        for(int i=0;i<n;i++){
            gallinas[i].calcularCalidad();
            if(gallinas[i].getCalidad()>=15){
                gallinas[i].calcularPrecio(1.2);
            }else{
                if(gallinas[i].getCalidad()>8 && gallinas[i].getCalidad()<15){
                    gallinas[i].calcularPrecio(1);
                }else{
                    gallinas[i].calcularPrecio(0.8);
                }
            }
        }
        
        System.out.println("Calidad de las gallinas y precio por kilo de huevo: ");
        for(int i=0;i<n;i++){
            gallinas[i].calcularCalidad();
            System.out.println("\nGALLINA: "+i);
            System.out.println("Calidad: "+gallinas[i].getCalidad());
            System.out.println("Precio por kilo de huevo: "+gallinas[i].getPrecioKiloHuevo());
        }

        
    }
    
}
