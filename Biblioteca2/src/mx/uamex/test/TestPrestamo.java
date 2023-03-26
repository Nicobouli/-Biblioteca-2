
package mx.uamex.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.uamex.dto.Alumno;
import mx.uamex.dto.Libro;
import mx.uamex.dto.Prestamo;


public class TestPrestamo {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.setId(1);
        libro1.setNombre("Hades");
        libro1.setCategoria("Ficcion");
        libro1.setEditorial("Santillan");
        libro1.setIsbn(1355);
        libro1.setStock(35);

        Libro libro2 = new Libro();
        libro2.setId(31);
        libro2.setNombre("El rey leoin");
        libro2.setCategoria("Fantasia");
        libro2.setEditorial("Grijalbo");
        libro2.setIsbn(357);
        libro2.setStock(24);
        
        Libro libro3 = new Libro();
        libro3.setId(12);
        libro3.setNombre("Don Quijote de la mancha");
        libro3.setCategoria("Ficcion");
        libro3.setEditorial("Santillan");
        libro3.setIsbn(37);
        libro3.setStock(26);
        
        Libro libro4 = new Libro();
        libro4.setId(15);
        libro4.setNombre("La era del hielo");
        libro4.setCategoria("Ficcion");
        libro4.setEditorial("Dreamworks");
        libro4.setIsbn(7);
        libro4.setStock(13);
        
        Libro libro5 = new Libro();
        libro5.setId(21);
        libro5.setNombre("La odisea");
        libro5.setCategoria("Epico");
        libro5.setEditorial("PlanetaDeLibros");
        libro5.setIsbn(4537);
        libro5.setStock(5);

        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro2);
        listaLibros.add(libro1);
        
        List<Libro> listaLibros2 = new ArrayList<>();
        listaLibros2.add(libro3);
        
        List<Libro> listaLibros3 = new ArrayList<>();
        listaLibros3.add(libro4);
        listaLibros3.add(libro5);

        Alumno alumno1 = new Alumno();
        alumno1.setId(1);
        alumno1.setNombre("Nicolas Maximiliano");
        alumno1.setApellidoPaterno("Peralta");
        alumno1.setApellidoMaterno("Velazquez");
        alumno1.setNumeroCuenta(2227148);
        
        Alumno alumno2 = new Alumno();
        alumno2.setId(4);
        alumno2.setNombre("Javier");
        alumno2.setApellidoPaterno("Talan");
        alumno2.setApellidoMaterno("Martinez");
        alumno2.setNumeroCuenta(2224275);
        
        Alumno alumno3 = new Alumno();
        alumno3.setId(3);
        alumno3.setNombre("Alex");
        alumno3.setApellidoPaterno("Vargas");
        alumno3.setApellidoMaterno("Marin");
        alumno3.setNumeroCuenta(2047127);

        Prestamo prestamo1 = new Prestamo();
        Date fechaIni = new Date();
        prestamo1.setId(1);
        prestamo1.setFolio(1);
        prestamo1.setFechainicio(fechaIni);
        prestamo1.setLibros(listaLibros);
        prestamo1.setPersona(alumno1);
        prestamo1.setEstatus("Entegados");
        
        Prestamo prestamo2 = new Prestamo();
        Date fechaCom = new Date();
        prestamo2.setId(341);
        prestamo2.setFolio(122);
        prestamo2.setFechainicio(fechaCom);
        prestamo2.setLibros(listaLibros2);
        prestamo2.setPersona(alumno2);
        prestamo2.setEstatus("En progreso");
        
        Prestamo prestamo3 = new Prestamo();
        Date fechaComi = new Date();
        prestamo3.setId(32);
        prestamo3.setFolio(42);
        prestamo3.setFechainicio(fechaComi);
        prestamo3.setLibros(listaLibros3);
        prestamo3.setPersona(alumno3); 
        prestamo3.setEstatus("Sin entregar");

        System.out.println(prestamo1);
        System.out.println(prestamo2);
        System.out.println(prestamo3);
        
        
        

    }
}
