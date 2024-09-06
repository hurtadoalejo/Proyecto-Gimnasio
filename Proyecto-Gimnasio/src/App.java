public class App {
    public static void main(String[] args) throws Exception {
        Entrenador entrenadorUno = new Entrenador("Hugo", "Estiramientos", "311234", "hugo@gmail.com");
        Miembro miembroUno = new Miembro("Alejandro", "1", 20, "Masculino", TipoMembresia.ANUAL, entrenadorUno, 2024, 5, 23);
        Miembro miembroDos = new Miembro("Veronica", "2", 19, "Femenino", TipoMembresia.TRIMESTRAL, entrenadorUno, 2024, 5, 23);
        Gimnasio gimnasio = new Gimnasio("Doritos Locos");
        gimnasio.agregarMiembro(miembroUno);
        gimnasio.agregarMiembro(miembroDos);
        gimnasio.agregarEntrenador(entrenadorUno);
        gimnasio.eliminarNombresVocales(miembroUno);
        gimnasio.eliminarNombresVocales(miembroDos);
        System.out.println(gimnasio.toString());
    }
}