package org.example;

import org.example.cadenas.LimpiarCaracteres;
import org.example.cifrados.rsa.Cifrado;
import org.example.json.UtileriaJson;
import org.example.json.entity.Alumno;

public class Main {

    public static void main(String[] args) {

        System.out.println("¡Utileria!");

        String llavePublica = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArNMa/kKy42bptMIhyCpPLqH8mvQVZCHH9IHYtzkUsdciyEH2rP4Qd8ISyHcTuhQ+MdWe1mHSsrr4Wyz0GS46nkbdNmIxx1iLnoFSE+lWwAgHvZ44mwe9a/uVTr+phBd/VXpwY5mORoIRCQBI0uYuznDO+wHTuuUupMJgo/8ujyOPld6KmM5VPV8CnJIiCJFA+v6mzpUZOpLp9cWk8UNya3MWFg5TrC98s4U0rrf3Im5lIk4Wc1Vnc0SlpOdjQ/wy/Vb47OaeOcxfMdZZtf13L16lymi26a/cTR2sqkP4nLvMPhvK8FEOQKDg8TrdkXzfN2/xmOiWDq3v1/KwYtojJwIDAQAB";

        try {
            System.out.println("idPais " + Cifrado.encrypt("1", llavePublica));
            System.out.println("idCanal " + Cifrado.encrypt("1", llavePublica));
            System.out.println("idSucursal " + Cifrado.encrypt("100", llavePublica));
            System.out.println("folio " + Cifrado.encrypt("100045", llavePublica));
        } catch (Exception e) {
            System.out.println("e = " + e);
        }

        try {
            System.out.println("\n");
            String response = "{\"id\":123,\"name\":\"Juan\",\"lastName\":\"Perez\",\"age\":30,\"matricula\":\"PEPE123\", \"grado\": \"2\"}";
            Alumno responseObjet = UtileriaJson.jsonToObjeto(response, Alumno.class);
            System.out.println("Conversion a objeto = " + responseObjet);

            String alumnoObject = UtileriaJson.objetoToJson(responseObjet);
            System.out.println("Convercion a json = " + alumnoObject);

        } catch (Exception e) {
            System.out.println("e = " + e);
        }


        System.out.println("\n");
        String cadenaLimpia = LimpiarCaracteres.limpiarCaracteresEspeciales("Sin número.");
        System.out.println(cadenaLimpia);


    }
}