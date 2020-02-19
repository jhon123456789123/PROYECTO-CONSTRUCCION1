
package semana2.practico_Bancos;

public class Cliente {
    
private String nombre;
private int monto;

    public Cliente(String nombre) {
        this.nombre=nombre;
        monto=0;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", monto=" + monto + '}';
    }
    
public void depositar(int m){
    monto=monto+m;
}

    public void retiro(int m){
        monto=monto-m;
    }
    
    
    
}
