
package enumeraciones;



public class Enumeraciones {

    
    
    
    
    public static void main(String[] args) {
       //en paquetes diferentes porq es publico y estatico 
     System.out.println("primer dia de la semana " + Dias.Jueves);
     diaSemana(Dias.Jueves);
      System.out.println("pais " + Continentes.AMERICA.getNumPaises());
    
    }
  
    public static void diaSemana(Dias dias){
        
        switch(dias) {
            case Lunes :
                 System.out.println("primer dia de la semana " + Dias.Jueves);
                break;
            
            default:
            
            throw new AssertionError();
        }
                 
                
        
        
        
        
    }
    
    
    
}
