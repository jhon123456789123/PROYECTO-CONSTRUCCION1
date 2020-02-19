
package semana2.practrico_Propuestos1;


public class Empleado {

    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    public void calcular_si_paga_impuesto(double s){
        if(s>3000){
            System.out.println("USTED DEBE PAGAR IMPUESTO");
        }else{
            System.out.println("NO PAGARA IMPUESTOS");
        }
    }
    
}
