package ReferenciaObjetos;

public class ObjetoPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.asignarNuevoNombre("Gustavo");
        System.out.println("nombre persona " + persona.getName());

        persona.asignarNuevoNombre("Chanchito feliz");
        System.out.println("nuevo nombre de la persona " + persona.getName());
    }
}
