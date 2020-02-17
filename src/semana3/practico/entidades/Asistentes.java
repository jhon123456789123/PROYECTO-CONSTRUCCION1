package semana3.practico.entidades;


public class Asistentes extends Persona{

    String telefono;
    String direccion;

    public Asistentes(String telefono, String direccion, String codigo, String nombre, String apellido, String correo_electronico) {
        
        super(codigo, nombre, apellido, correo_electronico);
        
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
 
    
    
    
    
    
    
    
}
