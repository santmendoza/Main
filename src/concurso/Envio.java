package concurso;

public class Envio {
 //PROPIEDADES
    private final String nombEquipo;
    private final int numbProblema;
    private final String respuesta;

    //CONSTRUCTROR
    public Envio(String NombEquipo, int n, String Respuesta) {
        this.nombEquipo = NombEquipo;
        this.numbProblema = n;
        this.respuesta = Respuesta;
    }
    
    //GET
    public String getNombEquipo() {
        return nombEquipo;
    }

    public int getNumbProblema() {
        return numbProblema;
    }

    public String getRespuesta() {
        return respuesta;
    }
    
    
        
        
        
        
                
    }
    
