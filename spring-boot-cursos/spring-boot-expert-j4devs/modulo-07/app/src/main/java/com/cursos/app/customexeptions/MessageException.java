package com.cursos.app.customexeptions;

import org.springframework.http.HttpStatus;

import java.util.List;

public class MessageException extends RuntimeException {
    private static final long serialVersionUID = 7585550831554109157L;
    private Integer codeError;
    private String customMessage;
    private HttpStatus httpStatus;
    private List<String> detalles;

    public MessageException(Integer code) {
        this.codeError = code;
    }

    public MessageException(Integer code, HttpStatus httpStatus) {
        this.codeError = code;
        this.httpStatus = httpStatus;
    }

    public MessageException(Integer code, HttpStatus httpStatus, List<String> detalles) {
        this.codeError = code;
        this.httpStatus = httpStatus;
        this.detalles = detalles;
    }

    public MessageException(Integer code, String mensajeExtra) {
        this.codeError = code;
        this.customMessage = mensajeExtra;
    }

    public MessageException(Integer code, String mensajeExtra, HttpStatus httpStatus) {
        this.codeError = code;
        this.customMessage = mensajeExtra;
        this.httpStatus = httpStatus;
    }

    public MessageException(Integer code, Throwable cause) {
        super(cause);
        this.codeError = code;
    }

    public MessageException(Integer code, String mensajeExtra, Throwable cause) {
        super(cause);
        this.codeError = code;
        this.customMessage = mensajeExtra;
    }

    public Integer getCodeError() {
        return codeError;
    }

    public void setCodeError(Integer codeError) {
        this.codeError = codeError;
    }

    public String getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public List<String> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<String> detalles) {
        this.detalles = detalles;
    }
}
