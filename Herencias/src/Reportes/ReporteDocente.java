package Reportes;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author David Pardo
 */
public class ReporteDocente extends Reporte{
    double promedioSueldoDocentes;
    ArrayList<Docente> listaDocentes;
    
    public ReporteDocente(String a, ArrayList<Docente> lista){
        super(a);
        listaDocentes = lista;
    }
    
    public double getPromedioSueldos(){
        return promedioSueldoDocentes;
    }
    public void setPromedioSueldos(){
       double sum=0;
       for(int i=0; i< listaDocentes.size();i++){
           sum = sum + getLista().get(i).getSueldo();
       }
       promedioSueldoDocentes=sum/listaDocentes.size();
    }
    
    public ArrayList<Docente> getLista(){
        return listaDocentes;
    }
    
    public void setLista(ArrayList<Docente> list){
         listaDocentes=list;
    }
    
    
    @Override
    public String toString(){
        String c= String.format("Reporte %s:\n",super.toString());
        for(int i=0; i< listaDocentes.size(); i++){
            c=String.format("%s%s", c, getLista().get(i).toString());
        }
        c= String.format("%s\nEl promedio de sueldos es: %s", c,getPromedioSueldos());
        return c;
    }
}
