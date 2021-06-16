/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        String nom, apell, rango;
        double matri, sueld;
        int ed;
        System.out.println("Ingrese una opcion de ingreso:\n1.- Estudiante\n"
                + "2.- Docente\n3.-Policia");int op=read.nextInt();
        switch(op){
            case 1:
                System.out.println("Ingrese el nombre del estudiante");
                nom= read.next();
                System.out.println("Ingrese el apellido del estudiante");
                apell=read.next();
                System.out.println("Ingrese la edad del estudiante");
                ed=read.nextInt();
                System.out.println("Ingrese el valor de la matricula");
                matri=read.nextDouble();
                Estudiante e = new Estudiante(nom, apell, ed, matri);
                System.out.println(e);
                break;
            case 2:
                System.out.println("Ingrese el nombre del docente");
                nom= read.next();
                System.out.println("Ingrese el apellido del docente");
                apell=read.next();
                System.out.println("Ingrese la edad del docente");
                ed=read.nextInt();
                System.out.println("Ingrese el sueldo del docente");
                sueld=read.nextDouble();
                Docente d = new Docente(nom, apell, ed, sueld); // falta implementar
                System.out.println(d);
            case 3:
                System.out.println("Ingrese el nombre del policia");
                nom= read.next();
                System.out.println("Ingrese el apellido del policia");
                apell=read.next();
                System.out.println("Ingrese la edad del policia");
                ed=read.nextInt();
                System.out.println("Ingrese el rango del policia");
                rango=read.next();
                Policia p = new Policia(nom, apell, ed, rango);
        }
        
        /*
        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);
        // Un docente hereda de una Persona y adicionalmente tiene 
        // la característia sueldo
        Docente d = new Docente("Luis", "Alvarez", 40, 900); // falta implementar
        System.out.println(d);
        
        // Un policia hereda de una Persona y adicionalmente tiene 
        // la característia rango
        Policia p = new Policia("ALEX", "MENDOZA", 35, "Cabo"); // falta implementar
        System.out.println(p);
        */
    }
    
}
