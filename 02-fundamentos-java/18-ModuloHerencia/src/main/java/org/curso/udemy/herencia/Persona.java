package org.curso.udemy.herencia;

/*
 * las clases que no tienen de forma explicita un extends
 * de forma interna extienden siempre de Object
 *
 * Todas las clases internamente extienden de Object
 */
public class Persona {

    /**
     * Para que los datos puedan ser visibles en las clases hijas se puede realizar de fos formas
     * 1. agregar los metodos getter and setter
     * 2. cambiar el valor private a protected
     * la palabra reservada protected hace que solo las clases hijas puedan acceder a esos atributos de la clase padre
     *
     * sin embargo, se recomienda que sean lo mas privado posible
     */
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("'persona' : { 'nombre' : %s, 'apellido' : %s , 'edad' : %s, 'email' : %s }", nombre, apellido, edad, email);
    }
}
