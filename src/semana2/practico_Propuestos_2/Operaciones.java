
package semana2.practico_Propuestos_2;

public class Operaciones {

    private int valor1;
    private int valor2;
      int suma=0;
      int resta=0;
      int multiplicacion=1;
      int division=1;
      
    public Operaciones() {
       valor1=0;
       valor2=0;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    
    
    public int sumar(int v1,int v2 ){
        
       return suma =v1+v2;
        
    }
            
           public int  resta(int v1,int v2) {
               
               return resta=v1-v2;
           }
            
           public int  multiplicacion(int v1, int v2){
              
               return multiplicacion=v1*v2;
           
           }
           public int  division(int v1,int v2){
               
               return division=v1/v2;
           }

   
           
           
}






