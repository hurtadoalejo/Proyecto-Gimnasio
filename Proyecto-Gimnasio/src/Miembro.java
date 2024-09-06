import java.time.LocalDate;

public class Miembro{
    private String nombre;
    private String id;
    private int edad;
    private String genero;
    private TipoMembresia tipoMembresia;
    private LocalDate fechaInscripcion;
    private Entrenador entrenadorAsignado;
    
    /**
     * Metodo constructor de la clase Miembro
     * @param nombre Nombre del miembro a crear
     * @param id Id del miembro a crear
     * @param edad Edad del miembro a crear
     * @param genero Genero del miembro a crear
     * @param tipoMembresia Tipo de membresia del miembro a crear
     * @param entrenadorAsignado Entrenador asignado del miembro a crear
     * @param year Numero año de la fecha de inscripcion del miembro a crear
     * @param month Numero mes de la fehca de inscripcion del miembro a crear
     * @param day Numero dia de la fehca de inscripcion del miembro a crear
     */
    public Miembro(String nombre, String id, int edad, String genero, TipoMembresia tipoMembresia, Entrenador entrenadorAsignado, int year, int month, int day) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.genero = genero;
        this.tipoMembresia = tipoMembresia;
        this.fechaInscripcion = LocalDate.of(year, month, day);
        this.entrenadorAsignado = entrenadorAsignado;
    }

    /**
     * Metodo para modificar el nombre del miembro
     * @param nombre Nuevo nombre del miembro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para modificar el id del miembro
     * @param id Nuevo id del miembro
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Metodo para modificar la edad del miembro
     * @param edad Nueva edad del miembro
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Metodo para modificar el genero del miembro
     * @param genero Nuevo genero del miembro
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * Metodo para modificar el tipo de membresia del miembro
     * @param tipoMembresia Nuevo tipo de membresia del miembro
     */
    public void setTipoMembresia(TipoMembresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }
    /**
     * Metodo para modificar la fecha de inscripcion del miembro
     * @param fechaInscripcion Nueva fecha de inscripcion del miembro
     */
    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
    /**
     * Metodo para modificar el entrenador asignado del miembro
     * @param entrenadorAsignado Nuevo entrenador asignado del miembro
     */
    public void setEntrenadorAsignado(Entrenador entrenadorAsignado) {
        this.entrenadorAsignado = entrenadorAsignado;
    }

    /**
     * Metodo para obtener el nombre del miembro
     * @return Nombre del miembro
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para obtener el id del miembro
     * @return Id del miembro
     */
    public String getId() {
        return id;
    }
    /**
     * Metodo para obtener la edad del miembro
     * @return Edad del miembro
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Metodo para obtener el genero del miembro
     * @return Genero del miembro
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Metodo para obtener el tipo de membresia del miembro
     * @return Tipo de membresia del miembro
     */
    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }
    /**
     * Metodo para obtener la fecha de inscripcion del miembro
     * @return Fecha de inscripcion del miembro
     */
    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }
    /**
     * Metodo para obtener el entrenador asignado del miembro
     * @return Entrenador asignado del miembro
     */
    public Entrenador getEntrenadorAsignado() {
        return entrenadorAsignado;
    }

    /**
     * Metodo para obtener la informacion del miembro
     * @return Informacion del miembro
     */
    public String toString() {
        return "Miembro [nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", genero=" + genero + ", tipoMembresia="
                + tipoMembresia + ", fechaInscripcion=" + fechaInscripcion + ", entrenadorAsignado="
                + entrenadorAsignado + "]";
    }
}