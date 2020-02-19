

package semana2.practico_CLUB_SOCIO;


public class Club {

    Socio s1,s2,s3;
    
    public Club(){
        s1=new Socio("jhonatan",25);
        s2=new Socio("ana",21);
        s3=new Socio("leonardo",16);
        
    }
    
    public void trabajador_mas_antiguo(){
        if (s1.getAntiguedad()>s2.getAntiguedad() && s1.getAntiguedad()>s3.getAntiguedad()){
            
            System.out.println("el mas antiguo es : "+s1.toString());
        }else if (s2.getAntiguedad()>s1.getAntiguedad()&& s2.getAntiguedad()>s3.getAntiguedad()){
            System.out.println("el mas antiguo es: "+s2.toString());
        }else{
            System.out.println("el mas antiguo es: "+s3.toString());
        }
        
    }
    
}
