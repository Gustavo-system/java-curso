package com.cursos.app.services;

import com.cursos.app.entities.demos.InfoUsuario;
import com.cursos.app.entities.demos.Usuario;
import com.cursos.app.entities.demos.UsuarioCifrado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class DemoServices {

    public ResponseEntity<InfoUsuario> getInfoUser() {
        InfoUsuario infoUsuario = new InfoUsuario();
        ResponseEntity<Usuario> responseAutoInvoke = getUsuario();
        infoUsuario.setNombre("Prueba");
        infoUsuario.setApellido(Objects.requireNonNull(responseAutoInvoke.getBody()).getMatricula());

        UsuarioCifrado usuarioCifrado = new UsuarioCifrado();
        usuarioCifrado.setIdPais("1");
        usuarioCifrado.setIdCliente("123");
        ResponseEntity<UsuarioCifrado> responseUsuarioCifrado = decifrarIntormacion(usuarioCifrado, false);

        infoUsuario.setIdPais(responseUsuarioCifrado.getBody().getIdPais());
        infoUsuario.setIdCliente(responseUsuarioCifrado.getBody().getIdCliente());

        return new ResponseEntity<>(infoUsuario, HttpStatus.OK);
    }

    public ResponseEntity<Usuario> getUsuario() {
        Usuario usuario = new Usuario();
        usuario.setEdad(20);
        usuario.setMatricula("123456789");

        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    public ResponseEntity<UsuarioCifrado> decifrarIntormacion(UsuarioCifrado request, Boolean decifrarCliente) {
        System.out.println("vamos de cifrar");
        decifrarTextos(request, decifrarCliente);
        System.out.println("fin del decifrado");
        return new ResponseEntity<>(request, HttpStatus.OK);
    }

    private void decifrarTextos(UsuarioCifrado usuario, Boolean decifrarInformacion) {
        String idPaisCifrado = usuario.getIdPais();
        String idClienteCifrado = usuario.getIdCliente();

        System.out.println("usuario que se recibio " + usuario);

        if(Boolean.TRUE.equals(decifrarInformacion)) {
            System.out.println("si se requiere decifrar por que la bandera es true");
            usuario.setIdPais(decifrador(idPaisCifrado));
            usuario.setIdCliente(decifrador(idClienteCifrado));
        }

        System.out.println("usuario que se creo " + usuario.toString());
    }

    private String decifrador(String texto) {
        String[] decifrado = texto.split("-");
        return decifrado[0];
    }

}
