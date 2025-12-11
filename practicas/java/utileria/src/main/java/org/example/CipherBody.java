package org.example;

import java.security.SecureRandom;
import java.util.Base64;

// import org.example.cifrados.CifradoAsimetrico;
import org.example.cifrados.CifradoNewAes;

public class CipherBody {
    public static void main(String[] args) {
        System.out.println("Cipher Body!");

        String accesoSimetrico = "XvreVX2wIRMdeRX2ttZxTw==";
        // String codigoHas = "MTHbvASxBLhUDevttqhoeYRT3/UmTYO0j4/IMmi5RUw=";
        String codigoHas = generarIV();
        System.out.println("codigo has " + codigoHas);

        String cadena = "hola";

        try {
            // String textCifrado = CifradoAsimetrico.encrypt(cadena, llavePublica);
            String textCifrado = CifradoNewAes.cifrarAESGCM(cadena, accesoSimetrico, codigoHas);
            System.out.println("Texto Cifrado " + textCifrado);
            String decifrado = CifradoNewAes.decifrarAESGCM(textCifrado, accesoSimetrico, codigoHas);
            System.out.println("texto decifrado " + decifrado);
        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }

    public static String generarIV() {
        byte[] iv = new byte[12];
        new SecureRandom().nextBytes(iv);
        return Base64.getEncoder().encodeToString(iv);
    }
}
