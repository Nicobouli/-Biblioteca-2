
package mx.uaemex.facade;

import mx.uaemex.dao.LibroDao;
import mx.uamex.dto.Libro;

public class LibroFacade {
    
    LibroDao libroDao= new LibroDao();
	
	public void agregarLibro(Libro libro) {
		libroDao.agregarLibro(libro);
	}
	
	public void leerLibro(){
		libroDao.MostrarListaDeLibro();
		
	} 
	
	public void actualizarLibro(Libro libro) {
		libroDao.actualizarLibro(libro);
	}
	
	public void eliminarLibro(Libro libro) {
		libroDao.eliminarLibro(libro);
	}
    
}
