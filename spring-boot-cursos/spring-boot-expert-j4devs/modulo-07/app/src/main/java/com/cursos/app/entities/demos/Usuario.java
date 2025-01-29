package com.cursos.app.entities.demos;

public class Usuario {
    private Integer edad;
    private String matricula;

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "edad=" + edad +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
