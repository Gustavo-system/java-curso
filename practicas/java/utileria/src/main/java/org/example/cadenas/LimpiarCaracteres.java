package org.example.cadenas;

import java.text.Normalizer;

public class LimpiarCaracteres {

    public static String limpiarCaracteresEspeciales(String cadena) {
        try {
            if (cadena == null || cadena.isEmpty()) {
                return "";
            } else {
                String cadenaSinAcentos = Normalizer.normalize(cadena, Normalizer.Form.NFD);
                cadenaSinAcentos = cadenaSinAcentos.replaceAll(
                        "[^\\p{ASCII}(N\u0303)(n\u0303)(\u00A1)(\u00BF)(\u00B0)(U\u0308)(u\u0308)]", "");
                cadenaSinAcentos = Normalizer.normalize(cadenaSinAcentos, Normalizer.Form.NFC);
                cadenaSinAcentos = cadenaSinAcentos.replace("ñ", "n");
                cadenaSinAcentos = cadenaSinAcentos.replace("Ñ", "N");
                cadenaSinAcentos = cadenaSinAcentos.replace("¿", "");
                cadenaSinAcentos = cadenaSinAcentos.replace("?", "");
                cadenaSinAcentos = cadenaSinAcentos.replace("¡", "");
                cadenaSinAcentos = cadenaSinAcentos.replace("!", "");
                System.out.println("cadenaSinAcentos " + cadenaSinAcentos);
                return cadenaSinAcentos.replaceAll("[^a-zA-Z0-9]", " ");
            }
        } catch (Exception e) {
            //log.info("No se pudo normalizar cadena: " + e.getMessage());
            return "";
        }
    }

}
