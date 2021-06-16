package Reportes;

/**
 *
 * @author David Pardo
 */
public class Reporte {
    protected String codigo;
    
    public Reporte (String cod){
       setCodigo(cod);
    }
    public void setCodigo(String cod){
        codigo=cod;
    }
    public String getCodigo(){
        return codigo;
    }

    @Override
    public String toString(){
        return String.format("El codigo es: %s", getCodigo());
    }
}
