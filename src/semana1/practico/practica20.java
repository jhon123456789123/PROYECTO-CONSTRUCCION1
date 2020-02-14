
package semana1.practico;

public class practica20 {

     
    private double precio = 0;
    private String colorEtiqueta = "";

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColorEtiqueta() {
        return colorEtiqueta;
    }

    public void setColorEtiqueta(String colorEtiqueta) {
        this.colorEtiqueta = colorEtiqueta;
    }
    
    public void hacerDescuento(double descuento){
        precio -= descuento;
    }
    

    
    
    
}
