
package semana1.practico;


public class practica14 {
 
    private String nombre="";
    private double notas[] = new double[5];
    private double promedio=0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void promedio(){
        for(int i=0;i<5;i++){
            promedio += notas[i];
        }
        promedio /= 5;
    }

    
    
}
