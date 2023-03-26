
package mx.uaemex.facade;

import mx.uaemex.dao.ProfesorDao;
import mx.uamex.dto.Profesor;

public class ProfesorFacade {
    
    ProfesorDao profesorDao= new ProfesorDao();
	
	public void agregarProfesor(Profesor profesor) {
		profesorDao.agregarProfesor(profesor);
	}
	
	public void leerProfesor(){
		profesorDao.MostrarListaDeProfesor();
		
	} 
	
	public void actualizarProfesor(Profesor profesor) {
		profesorDao.actualizarProfesor(profesor);
	}
	
	public void eliminarProfesor(Profesor profesor) {
		profesorDao.eliminarProfesor(profesor);
	}
    
}
