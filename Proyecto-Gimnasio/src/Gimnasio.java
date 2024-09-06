import java.util.LinkedList;
import java.util.List;

public class Gimnasio {
    private String nombre;
    private List<Miembro> listaMiembros;
    private List<Entrenador> listaEntrenadores;

    /**
     * Metodo constructor de la clase Gimnasio
     * @param nombre Nombre del gimnasio a crear
     */
    public Gimnasio(String nombre) {
        this.nombre = nombre;
        listaMiembros = new LinkedList<>();
        listaEntrenadores = new LinkedList<>();
    }

    /**
     * Metodo para modificar el nombre del gimnasio
     * @param nombre Nuevo nombre del gimnasio
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para modificar la lista de miembros del gimnasio
     * @param listaMiembros Nueva lista de miembros del gimnasio
     */
    public void setListaMiembros(List<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }
    /**
     * Metodo para modificar la lista de entrenadores del gimnasio
     * @param listaEntrenadores Nueva lista de entrenadores del gimnasio
     */
    public void setListaEntrenadores(List<Entrenador> listaEntrenadores) {
        this.listaEntrenadores = listaEntrenadores;
    }

    /**
     * Metodo para obtener el nombre del gimnasio
     * @return Nombre del gimnasio
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para obtener la lista de miembros del gimnasio
     * @return Lista de miembros del gimnasio
     */
    public List<Miembro> getListaMiembros() {
        return listaMiembros;
    }
    /**
     * Metodo para obtener la lista de entrenadores del gimnasio
     * @return Lista de entrenadores del gimnasio
     */
    public List<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }

    /**
     * Metodo para agregar un miembro al gimnasio
     * @param miembro Miembro a agregar
     */
    public void agregarMiembro(Miembro miembro){
        if (verificarMiembro(miembro.getId())) {
            listaMiembros.add(miembro);
        }
    }
    /**
     * Metodo para verificar si existe un miembro con el mismo id
     * @param id Id del miembro a verificar
     * @return Decision sobre si se puede agregar el miembro
     */
    public boolean verificarMiembro(String id){
        boolean decision = true;
        for (Miembro prueba : listaMiembros) {
            if (prueba.getId().equals(id)) {
                decision = false;
            }
        }
        return decision;
    }
    /**
     * Metodo para eliminar un miembro del gimnasio
     * @param id Id del miembro a eliminar
     */
    public void eliminarMiembro(String id){
        for (Miembro prueba : listaMiembros) {
            if (prueba.getId().equals(id)) {
                listaMiembros.remove(prueba);
                break;
            }
        }
    }

    /**
     * Metodo para agregar un entrenador al gimnasio
     * @param entrenador Entrenador a agregar
     */
    public void agregarEntrenador(Entrenador entrenador){
        if (verificarEntrenador(entrenador.getTelefono())) {
            listaEntrenadores.add(entrenador);
        }
    }
    /**
     * Metodo para verificar si existe un entrenador con el mismo telefono
     * @param telefono Telefono del miembro a verificar
     * @return Decision sobre si se puede agregar el entrenador
     */
    public boolean verificarEntrenador(String telefono){
        boolean decision = true;
        for (Entrenador prueba : listaEntrenadores) {
            if (prueba.getTelefono().equals(telefono)) {
                decision = false;
            }
        }
        return decision;
    }
    /**
     * Metodo para eliminar un entrenador del gimnasio
     * @param telefono Telefono del entrenador a eliminar
     */
    public void eliminarEntrenador(String telefono){
        for (Entrenador prueba : listaEntrenadores) {
            if (prueba.getTelefono().equals(telefono)) {
                listaEntrenadores.remove(prueba);
                break;
            }
        }
    }

    /**
     * Metodo para obtener la informacion del gimnasio
     * @return Informacion del gimnasio
     */
    public String toString() {
        return "Gimnasio [nombre=" + nombre + ", listaMiembros=" + listaMiembros + ", listaEntrenadores="
                + listaEntrenadores + "]";
    }

    /**
     * Metodo para calcular el promedio de edad de los miembros
     * @return Promedio de edad
     */
    public double calcularPromedio(){
        double promedio = 0;
        int contador = 0;
        for(Miembro prueba : listaMiembros){
            promedio += prueba.getEdad();
            contador ++;
        }
        promedio = promedio / contador;
        return promedio;
    }

    /**
     * Metodo para obtener los miembros menores de 18 años
     * @return Lista de miembros menores de edad
     */
    public List<Miembro> obtenerMenores(){
        List<Miembro> menoresEdad = new LinkedList<>();
        for (Miembro prueba : listaMiembros) {
            if (prueba.getEdad() < 18) {
                menoresEdad.add(prueba);
            }
        }
        return menoresEdad;
    }

    /**
     * Metodo para eliminar miembro que tenga nombre con mas de 2 vocales
     * @param miembro Miembro que se busca eliminar
     */
    public void eliminarNombresVocales(Miembro miembro){
        if (contarVocales(miembro.getNombre()) > 2) {
            listaMiembros.remove(miembro);
        }
    }

    /**
     * Metodo para contar vocales de un nombre
     * @param nombre Nombre para contar sus vocales
     * @return Vocales del nombre
     */
    public int contarVocales(String nombre){
        int vocales = 0;
        for(int a = 0; a < nombre.length(); a++){
            char momentaneo = nombre.charAt(a);
            if (esVocal(momentaneo)) {
                vocales += 1;
            }
        }
        return vocales;
    }

    /**
     * Metodo para saber si un caracter es vocal
     * @param momentaneo Caracter a verificar
     * @return Decision sobre si el caracter es vocal o no
     */
    public boolean esVocal(char momentaneo){
        boolean decision = false;
        if (momentaneo == 'a' || momentaneo == 'e' || momentaneo == 'i' || momentaneo == 'o' || momentaneo == 'u') {
            decision = true;
        }
        return decision;
    }

    /**
     * Metodo para imprimir la lista de miembros a la inversa
     */
    public void imprimirInverso(){
        for(int a = listaMiembros.size()-1; a >= 0; a--){
            Miembro miembro = listaMiembros.get(a);
            System.out.println(miembro.toString());
        }
    }

    /**
     * Metodo para obtener la edad comun de los miembros
     * @return  edad comun de los miembros
     */
    public int obtenerEdadComun(){
        int edadComun = 0;
        int contadorEdadComun = 0;
        for(Miembro prueba : listaMiembros){
            int contador = 0;
            int repetido = prueba.getEdad();
            for(Miembro pruebaDos : listaMiembros){
                if(pruebaDos.getEdad() == repetido){
                    contador++;
                }
            }
            if (contador > contadorEdadComun) {
                edadComun = repetido;
                contadorEdadComun = contador;
            }
        }      
        return edadComun;
    }
}