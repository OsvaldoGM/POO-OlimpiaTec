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
public class Deporte {
    private String name;
    private ArrayList<Alumno> alumnos;
    
    public Deporte(String name){
        this.name = name;
        this.alumnos = new ArrayList();
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean addAlumno(Alumno alumno){
        for(Alumno temp : this.alumnos){
            if(temp.getName().contains(alumno.getName()))
                return false;
        }
        this.alumnos.add(alumno);
        return true;
    }
    
    public boolean removeAlumno(Alumno alumno){
        for(Alumno temp : this.alumnos){
            if(temp.getName().contains(alumno.getName()))
            this.alumnos.remove(alumno);
            return true;                
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "Sport = "+this.name+" , students = " +this.alumnos;
    } 
}
