package org.example.json.entity;

public class Alumno extends Persona {
    private String matricula;
    private String grado;

    public Alumno(){}

    public Alumno(String matricula, String grado) {
        this.matricula = matricula;
        this.grado = grado;
    }

    public Alumno(int id, String name, String lastName, int age, String matricula, String grado) {
        super(id, name, lastName, age);
        this.matricula = matricula;
        this.grado = grado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Alumno {" +
                "matricula='" + matricula + '\'' +
                ", grado='" + grado + '\'' +
                "} " + super.toString();
    }
}
