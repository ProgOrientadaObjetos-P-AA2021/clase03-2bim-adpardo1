package Reportes;

import herencias2.Estudiante;
import java.util.ArrayList;
/**
 *
 * @author 0zzda
 */
public class ReporteEstudiante extends Reporte{
    double promedioEstudiantes;
    ArrayList<Estudiante> listasEstudiantes;
    
    public ReporteEstudiante(String c, ArrayList<Estudiante> lista){
        super(c);
        listasEstudiantes = lista;
    }
    
    
    public void setLista(ArrayList<Estudiante> list){
         listasEstudiantes=list;
    }
    public ArrayList<Estudiante> getLista(){
        return listasEstudiantes;
    }
    
    public void setPromedio(){
       double sum=0;
       for(int i=0; i< listasEstudiantes.size();i++){
           sum = sum + getLista().get(i).getMatricula();
       }
       promedioEstudiantes=sum/listasEstudiantes.size();    
    }
    public double getPromedio(){
        return promedioEstudiantes;
    }
    @Override
    public String toString(){
        String c= String.format("Reporte %s:\n",super.getCodigo());
        for(int i=0; i< listasEstudiantes.size(); i++){
            c=String.format("%s%s", c, getLista().get(i).toString());
        }
        c= String.format("%s\nEl promedio de matriculas es: %s", c,getPromedio());
        return c;
    }
}
