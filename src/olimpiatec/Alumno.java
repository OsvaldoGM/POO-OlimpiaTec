/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

import java.util.ArrayList;

/**
 *
 * @author Osvaldo
 */
public class Alumno {
    private String name;
    private String matricula;
    private ArrayList<Deporte> deporte; 
    
    public Alumno(String name, String matricula){
        this.name = name;
        this.matricula = matricula;
        this.deporte = new ArrayList ();
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public boolean addDeporte(Deporte deporte){
        for(Deporte temp : this.deporte) {
            if(temp.getName().contains(deporte.getName()))
            return false;
            }
            this.deporte.add(deporte);
            return true;
    }
    
    public boolean removeDeporte(Deporte deporte){
        for(Deporte temp : this.deporte) {
            if(temp.getName().contains(deporte.getName()))
                this.deporte.remove(deporte);
            return true;
            }
            return false;
    }
}
