
package semana2.practico_Bancos;

public class Banco {

    Cliente c1,c2,c3;
    
    public Banco(){
        c1=new Cliente("jhonatan");
        c2=new Cliente("ana");
        c3=new Cliente("leonardo");
    }
    
    public void operaciones (){
        
        c1.depositar(920);
        c2.depositar(50);
        c3.depositar(400);
        c2.retiro(30);
    }
    
    public void suma_depositos(){
        int suma=c1.getMonto()+c2.getMonto()+c3.getMonto();
        
        System.out.println("LA CANTIDAD DE DEPOSITOS TOTALES ES : "+suma);
    }
    
    
}