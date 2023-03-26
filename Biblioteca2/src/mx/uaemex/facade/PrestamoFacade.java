
package mx.uaemex.facade;

import mx.uaemex.dao.PrestamoDao;
import mx.uamex.dto.Prestamo;

public class PrestamoFacade {
    
    PrestamoDao prestamoDao= new PrestamoDao();
	
	public void agregarPrestamo(Prestamo prestamo) {
		prestamoDao.agregarPrestamo(prestamo);
	}
	
	public void leerPrestamo(){
		prestamoDao.MostrarListaDePrestamo();
		
	} 
	
	public void actualizarPrestamo(Prestamo prestamo) {
		prestamoDao.actualizarPrestamo(prestamo);
	}
	
	public void eliminarPrestamo(Prestamo prestamo) {
		prestamoDao.eliminarPrestamo(prestamo);
	}
    
}
