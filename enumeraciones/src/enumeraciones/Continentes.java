
package enumeraciones;


public enum Continentes {
  
    EUROPA(53,""),
    AMERICA(44,""),
    ASIA(46,""),
    africa(34,""),
    OCEANIA(14,"");
    
    private final int numPaises;
    private final String numPaise;
    Continentes(int numPaises,String habitantes) {
        
        this.numPaises = numPaises;
        this.numPaise = habitantes; 
    }

    public int getNumPaises() {
        return numPaises;
    }

    public String getNumPaise() {
        return numPaise;
    }
    
    
    
    
    
    
}
