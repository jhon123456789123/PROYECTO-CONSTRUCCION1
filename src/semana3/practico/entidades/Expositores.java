
package semana3.practico.entidades;

public class Expositores extends Persona {

    public Expositores(String codigo, String nombre, String apellido, String correo_electronico) {
        
        super(codigo, nombre, apellido, correo_electronico);
    }
    

            public String getCodigo() {
        return codigo;
    }

    
             public String getnombre() {
        return nombre;
    }
            
             public String getapellido() {
        return apellido;
    }
             
             public String getcorreoelectronico(){
                 return correo_electronico;
                 
             }
             
             
}
