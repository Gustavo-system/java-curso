package org.example.cifrados;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CifradoNewAes {

    public static String cifrarAESGCM(String cadena, String llave, String ivHex) throws Exception {
        try {
            // System.out.println("CIFRADO AES GCM");

            // System.out.println("LLAVE HEX: " + llaveHex);
            // System.out.println("IV HEX: " + ivHex.length() + " " + ivHex);

            // byte[] keyBytes = hexToBytes(llaveHex);
            // byte[] ivBytes = hexToBytes(ivHex);
            // SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
            // GCMParameterSpec gcmSpec = new GCMParameterSpec(128, ivBytes);
            // Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            // cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmSpec);
            // byte[] cipherBytes = cipher.doFinal(cadena.getBytes(StandardCharsets.UTF_8));
            // return Base64.getEncoder().encodeToString(cipherBytes);

            System.out.println("CIFRADO AES GCM");

            byte[] keyBytes = Base64.getDecoder().decode(llave);
            byte[] ivBytes = Base64.getDecoder().decode(ivHex);

            SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
            GCMParameterSpec gcmSpec = new GCMParameterSpec(128, ivBytes);

            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmSpec);

            byte[] cipherBytes = cipher.doFinal(cadena.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(cipherBytes);

        } catch (Exception e) {
            System.out.println("error al cifrar" + e);
            return "";
        }
    }

    public static String decifrarAESGCM(String cifradoBase64, String llaveBase64, String ivBase64) {
        try {
            System.out.println("DECIFRAR AES GCM");

            byte[] keyBytes = Base64.getDecoder().decode(llaveBase64);
            byte[] ivBytes = Base64.getDecoder().decode(ivBase64);
            byte[] cipherBytes = Base64.getDecoder().decode(cifradoBase64);

            SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
            GCMParameterSpec gcmSpec = new GCMParameterSpec(128, ivBytes);

            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmSpec);

            byte[] plainBytes = cipher.doFinal(cipherBytes);
            return new String(plainBytes, StandardCharsets.UTF_8);

        } catch (Exception e) {
            System.out.println("error al decifrar: " + e);
            return "";
        }
    }

}
