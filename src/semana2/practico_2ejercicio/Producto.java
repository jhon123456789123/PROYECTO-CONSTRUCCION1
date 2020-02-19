

package semana2.practico_2ejercicio;

public class Producto {

    private int codigo;
    private String descripcion;
    private double precio;
    private String unidad_medida;

    public Producto(int codigo, String descripcion, double precio, String unidad_medida) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidad_medida = unidad_medida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }
    
    
    
    
    
    
}
