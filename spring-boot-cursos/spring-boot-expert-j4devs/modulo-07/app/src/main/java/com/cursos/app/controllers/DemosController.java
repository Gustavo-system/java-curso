package com.cursos.app.controllers;

import com.cursos.app.entities.demos.InfoUsuario;
import com.cursos.app.entities.demos.Usuario;
import com.cursos.app.entities.demos.UsuarioCifrado;
import com.cursos.app.services.DemoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/pruebas-work")
public class DemosController {

    @Autowired
    private DemoServices demoServices;

    @GetMapping("/auto-invoke")
    public ResponseEntity<InfoUsuario> getUserInto() {
        return demoServices.getInfoUser();
    }

    @GetMapping("/auto-invoke-userinfo")
    public ResponseEntity<Usuario> getUsuario()  {
        return demoServices.getUsuario();
    }

    @PostMapping("/decifrar")
    public ResponseEntity<UsuarioCifrado> postUsuarioCifrado(@RequestBody() UsuarioCifrado request) {
        return demoServices.decifrarIntormacion(request, true);
    }
}
