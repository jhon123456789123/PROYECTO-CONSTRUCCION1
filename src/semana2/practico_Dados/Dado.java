

package semana2.practico_Dados;

public class Dado {

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
public void tirar_dado() { 
    
    valor=(int)(Math.random()*20); 

}


public void imprimir() {
    
    System.out.println("El valor del dado es:"+valor);

}


    
    
}
