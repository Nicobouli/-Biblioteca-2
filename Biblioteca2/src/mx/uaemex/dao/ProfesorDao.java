
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Profesor;

public class ProfesorDao {
    
    public List<Profesor> profesores = new ArrayList<>();
    
    public void agregarProfesor (Profesor profesor) {
        profesores.add(profesor);
    }
    
    public void eliminarProfesor (Profesor profesor) {
        profesores.remove(profesor);
    }
    
    public Profesor buscarProfesor(int id) {
        for (int i = 0; i < profesores.size(); i++) {
            Profesor a = profesores.get(i);
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }
    
    public void actualizarProfesor (Profesor profesor) { 
        for (int i = 0; i < profesores.size(); i++) {
            if (profesores.get(i).getId() == profesor.getId()){
                profesores.get(i).setNombre(profesor.getNombre());
                profesores.get(i).setApellidoMaterno(profesor.getApellidoMaterno());
                profesores.get(i).setApellidoPaterno(profesor.getApellidoPaterno());
                profesores.get(i).setGenero(profesor.getGenero());
            }
        }
        
    }
    
    public List<Profesor> MostrarListaDeProfesor() {
		 return profesores;
    }
    
}
