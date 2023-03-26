
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Alumno;

public class AlumnoDao {
    
    public List<Alumno> alumnos = new ArrayList<>();
    
    public void agregarAlumno (Alumno alumno) {
        alumnos.add(alumno);
    }
    
    public void eliminarAlumno (Alumno alumno) {
        alumnos.remove(alumno);
    }
    
    public Alumno buscarAlumno (int id) {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a = alumnos.get(i);
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }
    
    public void actualizarAlumno (Alumno alumno) { 
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getId() == alumno.getId()){
                alumnos.get(i).setNombre(alumno.getNombre());
                alumnos.get(i).setApellidoMaterno(alumno.getApellidoMaterno());
                alumnos.get(i).setApellidoPaterno(alumno.getApellidoPaterno());
                alumnos.get(i).setGenero(alumno.getGenero());
            }
        }
        
    }
    
    public List<Alumno> MostrarListaDeAlumnos() {
		 return alumnos;
    }
}
