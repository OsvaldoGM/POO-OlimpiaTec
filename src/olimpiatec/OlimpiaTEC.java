/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

/**
 *
 * @author Osvaldo
 */
public class OlimpiaTEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno osvaldo = new Alumno("Osvaldo", "A01411556");
        Alumno jesus = new Alumno("Jesus" , "A0153165");
        Deporte LOL = new Deporte("LOL");        
        LOL.addAlumno(osvaldo);
        LOL.addAlumno(jesus);
        System.out.println(LOL);
        System.out.println(osvaldo);
    }
        
}
