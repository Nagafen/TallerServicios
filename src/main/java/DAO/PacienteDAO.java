/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.Paciente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Cristian
 */
public class PacienteDAO {
    private static final Map<String, Paciente> paMap = new HashMap<String, Paciente>();
 
    static {
        initEmps();
    }
 
    private static void initEmps() {
        Paciente pa1 = new Paciente("Jensen, Patrick R", "Avenue 7, Handler 45", "1985 10 25", "54 548 696", "private");
        Paciente pa2 = new Paciente("Cristian", "Av 45", "1998 04 19", "54 854 214", "private");

        paMap.put(pa1.getNombre(), pa1);
        paMap.put(pa2.getNombre(), pa2);
    }
 
    public static Paciente getPaciente(String paName) {
        return paMap.get(paName);
    }
 
    public static Paciente addPaciente(Paciente pa) {
        paMap.put(pa.getNombre(), pa);
        return pa;
    }
 
    public static List<Paciente> getAllPacientes() {
        Collection<Paciente> c = paMap.values();
        List<Paciente> list = new ArrayList<Paciente>();
        list.addAll(c);
        return list;
    }
     
    List<Paciente> list;
}
