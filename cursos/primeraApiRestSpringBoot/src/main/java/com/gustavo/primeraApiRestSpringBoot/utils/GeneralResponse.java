package com.gustavo.primeraApiRestSpringBoot.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GeneralResponse {
    private String codigo;
    private String mensaje;
    private Object resultado;

    public GeneralResponse() {
    }

    public GeneralResponse(String codigo, String mensaje, Object resultado) {
        super();
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.resultado = resultado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Object getResultado() {
        return resultado;
    }

    public void setResultado(Object resultado) {
        this.resultado = resultado;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String codigo = "200";
        private String mensaje = "Operaci\u00f3n Exitosa.";
        private Object resultado;

        public String getCodigo() {
            return codigo;
        }

        public Builder setCodigo(String codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder setMensaje(String mensaje) {
            this.mensaje = mensaje;
            return this;
        }

        public Builder setResultado(Object resultado) {
            this.resultado = resultado;
            return this;
        }

        public GeneralResponse build() {
            return new GeneralResponse(codigo, mensaje, resultado);
        }
    }

}
