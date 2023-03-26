
package mx.uaemex.facade;

import mx.uaemex.dao.AlumnoDao;
import mx.uamex.dto.Alumno;

public class AlumnoFacade {
    
    AlumnoDao alumnoDao= new AlumnoDao();
	
	public void agregarAlumno(Alumno alumno) {
		alumnoDao.agregarAlumno(alumno);
	}
	
	public void leerAlumno(){
		alumnoDao.MostrarListaDeAlumnos();
		
	} 
	
	public void actualizarAlumno(Alumno alumno) {
		alumnoDao.actualizarAlumno(alumno);
	}
	
	public void eliminarAlumno(Alumno alumno) {
		alumnoDao.eliminarAlumno(alumno);
	}
    
}
