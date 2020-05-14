/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico77;

/**
 *
 * @author Lorenzo
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Materia m1 = new Materia(100,"Ingles 1",1);
        Materia m2 = new Materia(101,"Matemáticas",1);
        Materia m3 = new Materia(102,"Laboratorio 1",1);
        
        Alumnno a = new Alumnno(1001,"Lopez","Martin");
        Alumnno a2 = new Alumnno(1002,"Martinez","Brenda");
        
        a.agregarMateria(m1);
        a.agregarMateria(m2);
        a.agregarMateria(m3);
        
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m1);
        
        
        System.out.println("Cantidad de materias del alumno "+a.getApellido()+" son: "+ a.cantidadMaterias());
        
        System.out.println("Cantidad de materias del alumno "+a2.getApellido()+" son: "+ a2.cantidadMaterias());
    }
    
}
