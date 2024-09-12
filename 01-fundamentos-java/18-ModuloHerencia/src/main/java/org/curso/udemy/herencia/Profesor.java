package org.curso.udemy.herencia;

// las clases hijas solo pueden heredar de una clase padre a la vez
public class Profesor extends Persona {

    private String asignatura;
    private double score;
    private boolean doctorado;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isDoctorado() {
        return doctorado;
    }

    public void setDoctorado(boolean doctorado) {
        this.doctorado = doctorado;
    }

    @Override
    public String toString() {
        return String.format(" { 'profesor' : { 'asignatura' : %s, 'score' : %s , 'doctorado' : %s }, %s } ", asignatura, score, doctorado, super.toString());
    }
}
