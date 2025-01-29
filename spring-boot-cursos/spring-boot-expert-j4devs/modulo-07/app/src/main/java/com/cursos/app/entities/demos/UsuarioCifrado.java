package com.cursos.app.entities.demos;

public class UsuarioCifrado {
    private String idPais;
    private String idCliente;

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "UsuarioCifrado{" +
                "idPais='" + idPais + '\'' +
                ", idCliente='" + idCliente + '\'' +
                '}';
    }
}
