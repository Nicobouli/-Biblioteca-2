package mx.uaemex.servicio;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.*;

public interface Servicio {

    public List<Alumno> agregarAlumno(Alumno alumno);
    public List<Alumno> eliminarAlumno(Alumno alumno);
    public List<Alumno> buscarAlumno(Alumno alumno);
    public List<Alumno> actualizarAlumno(Alumno alumno);
    public ArrayList<Alumno> imprimirAlumno(Alumno alumno);
    
    public List<Profesor> agregarProfesor(Profesor profesor);
    public List<Profesor> eliminarProfesor(Profesor profesor);
    public List<Profesor> buscarProfesor(Profesor profesor);
    public List<Profesor> actualizarProfesor(Profesor profesor);
    public ArrayList<Profesor> imprimirProfesor(Profesor profesor);
    
    public List<Libro> agregarLibro(Libro libro);
    public List<Libro> eliminarLibro(Libro libro);
    public List<Libro> buscarLibro(Libro libro);
    public List<Libro> actualizarLbro(Libro libro);
    public ArrayList<Libro> imprimirPrestamo(Libro libro);
    
    public List<Prestamo> agregarPrestamo(Prestamo prestamo);
    public List<Prestamo> eliminarPrestamo(Prestamo prestamo);
    public List<Prestamo> buscarPrestamo(Prestamo prestamo);
    public List<Prestamo> actualizarPrestamo(Prestamo prestamo);
    public ArrayList<Prestamo> imprimirPrestamo(Prestamo prestamo);
}
