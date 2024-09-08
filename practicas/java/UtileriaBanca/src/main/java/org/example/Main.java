package org.example;

import org.example.validacionversiones.ValidacionVersiones;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class Main {
    public static void main(String[] args)
            throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException,
            InvalidKeySpecException, BadPaddingException, InvalidKeyException {

        System.out.println("¡Utileria!");

        //String llavePublica = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArNMa/kKy42bptMIhyCpPLqH8mvQVZCHH9IHYtzkUsdciyEH2rP4Qd8ISyHcTuhQ+MdWe1mHSsrr4Wyz0GS46nkbdNmIxx1iLnoFSE+lWwAgHvZ44mwe9a/uVTr+phBd/VXpwY5mORoIRCQBI0uYuznDO+wHTuuUupMJgo/8ujyOPld6KmM5VPV8CnJIiCJFA+v6mzpUZOpLp9cWk8UNya3MWFg5TrC98s4U0rrf3Im5lIk4Wc1Vnc0SlpOdjQ/wy/Vb47OaeOcxfMdZZtf13L16lymi26a/cTR2sqkP4nLvMPhvK8FEOQKDg8TrdkXzfN2/xmOiWDq3v1/KwYtojJwIDAQAB";

        //System.out.println("idPais " + encrypt("1", llavePublica));
        //System.out.println("idCanal " + encrypt("1", llavePublica));
        //System.out.println("idSucursal " + encrypt("100", llavePublica));
        //System.out.println("folio " + encrypt("100045", llavePublica));


        ValidacionVersiones validacionVersiones = new ValidacionVersiones();
        System.out.println("es correcta la version android ? " + validacionVersiones.validarVersionAppMayorIgualGenerica("Android-13-3041", 3040, 304));
        System.out.println("es correcta la version ios ? " + validacionVersiones.validarVersionAppMayorIgualGenerica("IOS-15.8.1-6.9762.0303", 3040, 304));

    }


    public static String encrypt(String cadena, String accesoPublicoKey)
            throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException,
            InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(Base64.getDecoder().decode(accesoPublicoKey.getBytes()));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey pubK = keyFactory.generatePublic(keySpec);
        OAEPParameterSpec oaepParameterSpec = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        cipher.init(1, pubK, oaepParameterSpec);
        return Base64.getEncoder().encodeToString(cipher.doFinal(cadena.getBytes()));
    }


}