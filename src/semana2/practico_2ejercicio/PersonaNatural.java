
package semana2.practico_2ejercicio;

public class PersonaNatural extends Cliente{

     
    private String DNI;
    private String nombre;
    private String apellido_Paterno;
    private String apellido_Materno;

    public PersonaNatural(String DNI, String nombre, String apellido_Paterno, String apellido_Materno, String telefono, String correo, String direccion) {
        super(telefono, correo, direccion);
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido_Paterno = apellido_Paterno;
        this.apellido_Materno = apellido_Materno;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_Paterno() {
        return apellido_Paterno;
    }

    public void setApellido_Paterno(String apellido_Paterno) {
        this.apellido_Paterno = apellido_Paterno;
    }

    public String getApellido_Materno() {
        return apellido_Materno;
    }

    public void setApellido_Materno(String apellido_Materno) {
        this.apellido_Materno = apellido_Materno;
    }

 
   
    
}
