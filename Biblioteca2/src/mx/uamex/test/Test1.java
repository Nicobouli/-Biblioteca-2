package mx.uamex.test;

import java.util.List;
import mx.uaemex.dao.AlumnoDao;
import mx.uaemex.dao.LibroDao;
import mx.uaemex.dao.PrestamoDao;
import mx.uaemex.dao.ProfesorDao;
import mx.uamex.dto.Alumno;
import mx.uamex.dto.Libro;
import mx.uamex.dto.Prestamo;
import mx.uamex.dto.Profesor;

public class Test1 {

    AlumnoDao alumnodao = new AlumnoDao();
    ProfesorDao profesordao = new ProfesorDao();
    PrestamoDao prestamodao = new PrestamoDao();
    LibroDao librodao = new LibroDao();

    public void CrearPrestamo(Prestamo prestamo) {
        prestamodao.agregarPrestamo(prestamo);
    }

    public void CrearLibro(Libro libro) {
        librodao.agregarLibro(libro);
    }

    public void CrearALumno(Alumno alumno) {
        alumnodao.agregarAlumno(alumno);
    }

    public void CrearProfesor(Profesor profesor) {
        profesordao.agregarProfesor(profesor);
    }

    public void ConsultarPrestamo(int id) {
        Prestamo p = prestamodao.buscarPrestamo(id);
        System.out.println("La busqueda desde id es: " + p.toString());
    }

    public void ConsultarTodos() {
        List<Prestamo> prestamos = prestamodao.MostrarListaDePrestamo();
        for (Prestamo p : prestamos) {
            System.out.println(p.toString());
        }

    }

}
