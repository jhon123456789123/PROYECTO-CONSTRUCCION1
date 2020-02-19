
package semana2.practico_Dados;

public class Juego_dados {

    private Dado dado1,dado2,dado3;
    
    
public Juego_dados() {
    
    dado1=new Dado();
    dado2=new Dado();
    dado3=new Dado(); 

}




public void jugar() { 

dado1.tirar_dado(); 
dado1.imprimir();

dado2.tirar_dado();
dado2.imprimir(); 
dado3.tirar_dado(); 
dado3.imprimir(); 

if (dado1.getValor()==dado2.getValor() && dado1.getValor()==dado3.getValor()) {

System.out.println("Ganó"); 
} else { 
    System.out.println("Perdió");
}

}  
    


}
