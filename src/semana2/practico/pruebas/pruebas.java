package semana2.practico.pruebas;

import semana2.practico.entidades.Asistentes;
import semana2.practico.entidades.Expositores;
import semana2.practico.util.Evento;

public class pruebas {

    public static void main(String[] args) {
        
         Asistentes asistente = new Asistentes("929306904","jr. los pinos","0020180092","jhonatan","huaman","jhuto1006@gmail.com");
         
         
        Expositores Expositor = new Expositores("15843064","Roden","Barrera","roden.brarera@gmail.com");
        
         Evento evento;
         evento = new Evento ("INTRODUCCION A LA INGENIERIA DE SOFTWARE",3,Expositor,asistente,"4:10","5:00","alta",'P');
         
         System.out.println("Titulo Evento : "+ evento.getTitulo());
         
        System.out.println("Duracion de Evento : "+ evento.getDuracion_evento() + "Horas");
        
         System.out.println("Nombre y Apellido de Expositor : "+Expositor.getnombre()+" "+Expositor.getApellido());
         
         System.out.println("Correo de Expositor : "+ Expositor.getCorreo_electronico());
         
         System.out.println("DATOS DE ASISTENTE AL EVENTO ");
         
         System.out.println("Nombre y Apellido de Asistente : "+asistente.getNombre()+"  "+asistente.getApellido());
         
       
         System.out.println("Hora de inicio del evento : "+ evento.getHora_ingreso());
         System.out.println("Hora de salida del evento : "+ evento.getHora_salida());
         System.out.println("Temporada Alta : "+ evento.getTemporada_evento());
         System.out.println("Ubicacion a elegir : "+evento.getUbicacion_evento());
         
         System.out.println("mostrando los resultados del evento");
        
        evento.costoPorUbicacion();
         
         
         System.out.println("Monto a pagar con IGV : " + evento.generarTotalConIGV());
          System.out.println("Monto por temporada : " + evento.descuentoPorTemporada());
          
          

        
        
    }
}
