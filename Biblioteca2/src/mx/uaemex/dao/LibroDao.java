
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Libro;

public class LibroDao {
    
    public List<Libro> libros = new ArrayList<>();
    
    public void agregarLibro (Libro libro) {
        libros.add(libro);
    }
    
    public void eliminarLibro (Libro libro) {
        libros.remove(libro);
    }
    
    public Libro buscarLibro (int id) {
        for (int i = 0; i < libros.size(); i++) {
            Libro a = libros.get(i);
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }
    
    public void actualizarLibro (Libro libro) { 
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == libro.getId()){
                libros.get(i).setNombre(libro.getNombre());
                libros.get(i).setCategoria(libro.getCategoria());
                libros.get(i).setIsbn(libro.getIsbn());
            }
        }
        
    }
    
    public List<Libro> MostrarListaDeLibro() {
		 return libros;
    }
    
}
