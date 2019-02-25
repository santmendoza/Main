package concurso;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
     Concurso s1 = new Concurso("Sesion 1",2);
     Concurso s2 = new Concurso("Sesion 2",3);
     Concurso s3 = new Concurso("Sesion 3",3);
     
     ArrayList<Concurso> listC;
     listC = new ArrayList<>();
     
     ArrayList<String> listE;
     listE = new ArrayList<>();
     
     listC.add(s3);
     listC.add(s2);
     listC.add(s1);
     
     listE.add("equipo 3");
     listE.add("equipo 2");
     listE.add("equipo 1");
     
     for(Concurso c: listC ){
         
         System.out.println("Concurso: "+c.getNombre());
         c.AñadirEquipos(listE);
         
         for(String equ: listE){
          c.regisEnv(equ, 1, "2");
         } 
    }
 
}
}


