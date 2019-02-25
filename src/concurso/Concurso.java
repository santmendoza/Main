package concurso;

import java.util.ArrayList;

public class Concurso {
   
    //PROPIEDADES
   private String nombre;
   private final int[]  numProblemas;
    
    
   private ArrayList<String> lista = new ArrayList<>();
   private  ArrayList<Envio> envios;

   // CONSTRUCTORES
    public Concurso(String Nombre, int n) {
        
        this.envios = new ArrayList<>();
        this.nombre = Nombre;
        this.numProblemas = new int[n];
        
    }

    public Concurso(String Nombre) {
        
        this.envios = new ArrayList<>();
        this.nombre = Nombre;
        this.numProblemas = new int[5];
        
        for(int i=0; i<5; i++){
            this.numProblemas[i]=i;
        }
    }
    
   //GET AND SET
     public String getNombre() {
        return nombre;
    }
     public int[] getNumProblemas() {
        return numProblemas;
    }
     public ArrayList<String> getLista() {
        return lista;
    }
     public ArrayList<Envio> getEnvios() {
        return envios;
    }
    
    //METODOS
      //METODOS DE COMPROBACION
      public boolean comprobarN(int i) {
        return i <= this.numProblemas.length;
    }
      public boolean comprobarEquip(String e) {
        for (String l :this.lista ) {
                if (l.equals(e)) {
                    return true;
                }    
            }
        System.out.println("el nombre esta repetido");
        return true;
    }
      public boolean comprobarRes(String r) {
        return r != null && r.length() != 0;
    }
       
      //METODOS FUNCIONALES
      public void AñadirEquipo(String Nombre) {
        boolean sw=false;
        
        if (lista.isEmpty()) {
            lista.add(Nombre);
            System.out.println("El equipo "+this.lista.get(0)+" ha sido agregado");
        } else {
            for (String l :this.lista ) {
                if (l.equals(Nombre)) {
                    sw=true;
                }  
            }
            if (!sw) {
                lista.add(Nombre);
                System.out.println("El equipo "+Nombre+" ha sido agregado");
            } else {
                System.out.println("Nombre ya existe");
            }
  
        }
       
     }
      public void AñadirEquipos(ArrayList<String> equipos) {
        
        if (this.lista.isEmpty()) {
            
            this.lista= equipos;
            equipos.forEach((l) -> {
                System.out.println("Se han agregado el equipo "+l);
            });
            
        } else {
            for (String equi :equipos ) {
                this.AñadirEquipo(equi);
            }
                     
        }
}
      public boolean ElimEquipo(String Nombre){
        for (String l :this.lista ) {
                if (l.equals(Nombre)) {
                    this.lista.remove(l);
                    System.out.println("Ha sido eliminado "+l);
                    return true;
                }  
            }
        return false;  
   }
      public Envio regisEnv(String equ, int p, String res){
       
       if(this.comprobarEquip(equ)){
           if(this.comprobarN(p)){
               if( this.comprobarRes(res)){
                   Envio e = new Envio(equ, p, res);
                   this.envios.add(e);
                   System.out.println("Se registro en envio del equipo "+ e.getNombEquipo());
                   System.out.println("De la pregunta N. "+e.getNumbProblema()+" con respuesta: "+e.getRespuesta() );
                   return e;
               }
               return null;
           }
           return null;
       }
        return null;
   }
   
}
    
    

