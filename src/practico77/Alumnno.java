/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico77;
import java.util.*;
/**
 *
 * @author Lorenzo
 */
public class Alumnno {
    private int legajo;
    private String apellido;
    private String nombre;
    HashSet<Materia> materias=new HashSet<Materia>();

    public Alumnno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        materias.add(m);
    }
    
    public int cantidadMaterias(){
        
        return materias.size();
    }
}
