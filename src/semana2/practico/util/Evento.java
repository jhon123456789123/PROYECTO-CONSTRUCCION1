
package semana2.practico.util;

import semana2.practico.entidades.Asistentes;
import semana2.practico.entidades.Expositores;


public class Evento {

    String titulo;
    int duracion_evento;
    Expositores expositor;
    String hora_ingreso;
    String hora_salida;
    String temporada_evento;
    double costo_entrada;
    
    Asistentes asistente;
    char ubicacion_evento;
    
    Mis_constantes mis_constantes;
    
 

    public Evento(String titulo, int duracion_evento, Expositores expositor,Asistentes asistente, String  hora_ingreso, String hora_salida, String temporada_evento,  char ubicacion_evento) {
        this.titulo = titulo;
        this.duracion_evento = duracion_evento;
        this.expositor = expositor;
        this.hora_ingreso = hora_ingreso;
        this.hora_salida = hora_salida;
        this.temporada_evento = temporada_evento;
        this.asistente = asistente;
        this.ubicacion_evento = ubicacion_evento;
        this.costo_entrada=0.0;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion_evento() {
        return duracion_evento;
    }

    public Expositores getExpositor() {
        return expositor;
    }

    public String getHora_ingreso() {
        return hora_ingreso;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public String getTemporada_evento() {
        return temporada_evento;
    }

    public double getCosto_entrada() {
        return costo_entrada;
    }

    public Asistentes getAsistente() {
        return asistente;
    }

    public char getUbicacion_evento() {
        return ubicacion_evento;
    }

    public Mis_constantes getMis_constantes() {
        return mis_constantes;
    }

  
    
      
    public void costoPorUbicacion(){
      
        if(this.ubicacion_evento == 'p'){
            this.costo_entrada=mis_constantes.platinum;
        }
        else if (this.ubicacion_evento == 'g'){
           this.costo_entrada=mis_constantes.gold;
        }
        else{
           this.costo_entrada=mis_constantes.vip;
        }

    }
    
    public double generarTotalConIGV(){
        costo_entrada=costo_entrada+(costo_entrada*mis_constantes.igv);
        return costo_entrada;
    }

    public double descuentoPorTemporada(){
        Double descuento = 0.0;
        if(temporada_evento == "alta" ) {
        descuento = costo_entrada * 0.05;
        }
        
        if(temporada_evento == "baja" ) {
        descuento = costo_entrada * 0.10;
        }
        return descuento;
    }

    
    
    
    
    
    
    
}
