package Reportes;

import herencias2.*;
import java.util.ArrayList;

/**
 *
 * @author 0zzda
 */
public class Main {

    public static void main(String[] args) {

        Estudiante est1 = new Estudiante("René", "Elizalde", 33, 100.2);
        Docente doc1 = new Docente("José", "Hincapié", 40, 1000);
        Policia pol1 = new Policia("María", "MENDOZA", 35, "Cabo");
        Estudiante est2 = new Estudiante("Patricia", "Velez", 31, 100.2);
        Docente doc2 = new Docente("Luis", "Alvarez", 38, 1000);
        Policia pol2 = new Policia("ALEX", "Medina", 33, "Cabo");
        Estudiante est3 = new Estudiante("Juan", "Ramirez", 23, 103.2);
        Docente doc3 = new Docente("Perdo", "Pedril", 45, 1500);
        Policia pol3 = new Policia("Marco", "Heraldo", 32, "Sargento");

        ArrayList listaDocentes = new ArrayList<>();
        listaDocentes.add(doc1);
        listaDocentes.add(doc2);
        listaDocentes.add(doc3);

        ArrayList listaEstudiante = new ArrayList<>();
        listaEstudiante.add(est1);
        listaEstudiante.add(est2);
        listaEstudiante.add(est3);

        ArrayList listaPolicia = new ArrayList<>();
        listaPolicia.add(pol1);
        listaPolicia.add(pol2);
        listaPolicia.add(est3);

        ReporteDocente rd = new ReporteDocente("0001Doc", listaDocentes);
        rd.setPromedioSueldos();
        ReporteEstudiante re = new ReporteEstudiante("0001Est", listaEstudiante);
        re.setPromedio();
        ReportePolicia rp = new ReportePolicia("0001Pol", listaPolicia);
        rp.setPromedioP();
        System.out.println(rd);
        System.out.println(re);
        System.out.println(rp);

    }
}
