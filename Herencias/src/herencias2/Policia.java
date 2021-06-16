/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

/**
 *
 * @author 0zzda
 */
public class Policia extends Persona{
    private String rango;
    
    public Policia(String n, String a, int e, String rango){
        super(n, a, e);
        setRango(rango);
    }
    
    @Override
    public void setNombre(String n){
        nombre = n.toUpperCase();    
    }
    
    public void setRango(String rang){
        rango = rang;
    }
    
    public String getRango(){
        return rango;
    }
    
    /* @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getMatricula());
    }
    */
    
    @Override
    public String toString(){
    
        return String.format("%s - %s", super.toString(), getRango());
    }
    
}
