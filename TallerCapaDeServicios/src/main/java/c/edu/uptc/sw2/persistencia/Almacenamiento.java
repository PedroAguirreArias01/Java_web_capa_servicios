/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.edu.uptc.sw2.persistencia;

import co.edu.uptc.sw2.proyectoAngular.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Almacenamiento {
    
    private static final Almacenamiento INSTANCE = new Almacenamiento();
    private ArrayList<Estudiante> listEstudiantes;

    public Almacenamiento() {
        listEstudiantes = new ArrayList<>();
        listEstudiantes.add(new Estudiante("Pedro", "Aguirre Arias", "20132143", "1007141223", "23/12/1995"));
        listEstudiantes.add(new Estudiante("Daniela", "Torres", "201511109", "1234567987", "20/12/1997"));
        listEstudiantes.add(new Estudiante("Juan", "ddd", "20132143", "1007141223", "23/12/1795"));
    }
    
    
    public static Almacenamiento getInstance(){
        return INSTANCE;
    }

    public ArrayList<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }
}
