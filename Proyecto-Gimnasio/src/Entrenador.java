public class Entrenador {
    private String nombre;
    private String especialidad;
    private String telefono;
    private String correo;

    /**
     * Metodo constructor de la clase Entrenador
     * @param nombre Nombre del entrenador a crear
     * @param especialidad Especialidad del entrenador a crear
     * @param telefono Telefono del entrenador a crear
     * @param correo Correo del entrenador a crear
     */
    public Entrenador(String nombre, String especialidad, String telefono, String correo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.correo = correo;
    }

    /**
     * Metodo para modificar el nombre del entrenador
     * @param nombre Nuevo nombre del entrenador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para modificar la especialidad del entrenador
     * @param especialidad Nueva especialidad del entrenador
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    /**
     * Metodo para modificar el telefono del entrenador
     * @param telefono Nuevo telefono del entrenador
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * Metodo para modificar el correo del entrenador
     * @param correo Nuevo correo del entrenador
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo para obtener el nombre del entrenador
     * @return Nombre del entrenador
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para obtener la especialidad del entrenador
     * @return Especialidad del entrenador
     */
    public String getEspecialidad() {
        return especialidad;
    }
    /**
     * Metodo para obtener el telefono del entrenador
     * @return Telefono del entrenador
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * Metodo para obtener el correo del entrenador
     * @return Correo del entrenador
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo para obtener la informacion del entrenador
     * @return Informacion del entrenador
     */
    public String toString() {
        return "Entrenador [nombre=" + nombre + ", especialidad=" + especialidad + ", telefono=" + telefono
                + ", correo=" + correo + "]";
    }   
}