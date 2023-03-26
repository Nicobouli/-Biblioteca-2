
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Prestamo;

public class PrestamoDao {
    
    public List<Prestamo> prestamos = new ArrayList<>();
    
    public void agregarPrestamo (Prestamo prestamo) {
        prestamos.add(prestamo);
    }
    
    public void eliminarPrestamo (Prestamo prestamo) {
        prestamos.remove(prestamo);
    }
    
    public Prestamo buscarPrestamo (int id) {
        for (int i = 0; i < prestamos.size(); i++) {
            Prestamo a = prestamos.get(i);
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }
    
    public void actualizarPrestamo (Prestamo prestamo) { 
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getId() == prestamo.getId()){
                prestamos.get(i).setFolio(prestamo.getFolio());
                prestamos.get(i).setPersona(prestamo.getPersona());
            }
        }
        
    }
    
    public List<Prestamo> MostrarListaDePrestamo() {
		 return prestamos;
    }
    
}
