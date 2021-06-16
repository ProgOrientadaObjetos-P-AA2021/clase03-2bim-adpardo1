package Reportes;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author David Pardo
 */
public class ReportePolicia extends Reporte{
    double promedioPolicias;
    ArrayList<Policia> listaPolicias;
    
    public ReportePolicia(String c, ArrayList<Policia> lista){
        super(c);
        listaPolicias = lista;
    }
    
    public void setListaP(ArrayList<Policia> list){
         listaPolicias=list;
    }
    public ArrayList<Policia> getListaP(){
        return listaPolicias;
    }
    public void setPromedioP(){
       double sum=0;
       for (int i=0; i < listaPolicias.size() ;i++){
           sum = sum + getListaP().get(i).getEdad();
       }
       promedioPolicias=sum/listaPolicias.size();
    }
    public double getPromedioP(){
        return promedioPolicias;
    }
    @Override
    public String toString(){
        String c= String.format("Reporte %s:\n",super.toString());
        for(int i=0; i< listaPolicias.size(); i++){
            c=String.format("%s%s", c, getListaP().get(i).toString());
        }
        c= String.format("%s\nEl promedio de edades es: %s", c,getPromedioP());
        return c;
    }
}
