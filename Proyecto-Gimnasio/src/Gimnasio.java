import java.util.LinkedList;
import java.util.Collection;

public class Gimnasio {
    private String nombre;
    private Collection<Miembro> listaMiembros;
    private Collection<Entrenador> listaEntrenadores;

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        listaMiembros = new LinkedList<>();
        listaEntrenadores = new LinkedList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setListaMiembros(Collection<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }
    public void setListaEntrenadores(Collection<Entrenador> listaEntrenadores) {
        this.listaEntrenadores = listaEntrenadores;
    }

    public String getNombre() {
        return nombre;
    }
    public Collection<Miembro> getListaMiembros() {
        return listaMiembros;
    }
    public Collection<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }

    public String toString() {
        return "Gimnasio [nombre=" + nombre + ", listaMiembros=" + listaMiembros + ", listaEntrenadores="
                + listaEntrenadores + "]";
    }

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
}
