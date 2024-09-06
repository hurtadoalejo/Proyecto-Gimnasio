import java.time.LocalDate;

public class Miembro{
    private String nombre;
    private String id;
    private int edad;
    private String genero;
    private TipoMembresia tipoMembresia;
    private LocalDate fechaInscripcion;
    private Entrenador entrenadorAsignado;
    
    public Miembro(String nombre, String id, int edad, String genero, TipoMembresia tipoMembresia, Entrenador entrenadorAsignado, int year, int month, int day) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.genero = genero;
        this.tipoMembresia = tipoMembresia;
        this.fechaInscripcion = LocalDate.of(year, month, day);
        this.entrenadorAsignado = entrenadorAsignado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }
    public String getId() {
        return id;
    }
    public int getEdad() {
        return edad;
    }
    public String getGenero() {
        return genero;
    }
    
    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(TipoMembresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Entrenador getEntrenadorAsignado() {
        return entrenadorAsignado;
    }

    public void setEntrenadorAsignado(Entrenador entrenadorAsignado) {
        this.entrenadorAsignado = entrenadorAsignado;
    }

    public String toString() {
        return "Miembro [nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", genero=" + genero + ", tipoMembresia="
                + tipoMembresia + ", fechaInscripcion=" + fechaInscripcion + ", entrenadorAsignado="
                + entrenadorAsignado + "]";
    }
}