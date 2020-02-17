
package semana3.practico.entidades;

public class Persona {

     String codigo;
     String nombre;
     String apellido;
    String correo_electronico;

    public Persona(String codigo, String nombre, String apellido, String correo_electronico) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo_electronico = correo_electronico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
        
    }
    
   
    
     
            
            
             
    
    
    
}
