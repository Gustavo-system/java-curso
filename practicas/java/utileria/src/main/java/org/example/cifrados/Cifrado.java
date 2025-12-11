// package org.example.cifrados;

// import java.io.UnsupportedEncodingException;
// import java.nio.charset.StandardCharsets;
// import java.security.InvalidAlgorithmParameterException;
// import java.security.NoSuchAlgorithmException;
// import java.security.SecureRandom;
// import java.util.Arrays;
// import java.util.Base64;

// import javax.crypto.BadPaddingException;
// import javax.crypto.Cipher;
// import javax.crypto.IllegalBlockSizeException;
// import javax.crypto.Mac;
// import javax.crypto.NoSuchPaddingException;
// import javax.crypto.SecretKey;
// import javax.crypto.spec.IvParameterSpec;
// import javax.crypto.spec.SecretKeySpec;
// import javax.xml.bind.DatatypeConverter;

// public class Cifrado {

//     private static final String ALGORITHM_AES = "AES/CBC/PKCS5Padding";
//     private static final String AES_KEY = "AES";
//     private static final String ALGORITHM_HMAC = "HmacSHA256";

//     public static String encryptAes(String text) {
//         String resp = null;
//         try {
//             SecretKey aesKey = new SecretKeySpec("jZgE=zDpj2Q6bVxwXZNdUWnu1uB@YI5J".getBytes(), "AES");
//             IvParameterSpec iv2 = new IvParameterSpec("X]dp@%Ho0@yWpiO4".getBytes(StandardCharsets.UTF_8));
//             byte[] plainBytes = text.getBytes(StandardCharsets.UTF_8);
//             Cipher cipher = Cipher.getInstance(ALGORITHM_AES);
//             cipher.init(1, aesKey, iv2);
//             byte[] encrypted = cipher.doFinal(plainBytes);
//             resp = byteToBase64(encrypted);
//             return resp;
//         } catch (Exception e) {
//             return "El valor ingresado no se pudo descifrar " + e;
//         }
//     }

//     public static String decryptAES(String aesKeyBase64, String hmacKeyBase64, String encryptedValue) {
//         try {

//             SecretKeySpec aesKey = new SecretKeySpec(
//                     Base64.getDecoder().decode(aesKeyBase64.getBytes(StandardCharsets.UTF_8.name())),
//                     AES_KEY); // AES

//             SecretKeySpec hmacKey = new SecretKeySpec(
//                     Base64.getDecoder().decode(hmacKeyBase64.getBytes(StandardCharsets.UTF_8.name())),
//                     ALGORITHM_HMAC);

//             int macLength = obtenerHMACLength(hmacKey);

//             byte[] ivCipherTextHmac = Base64.getDecoder()
//                     .decode(encryptedValue.getBytes(StandardCharsets.UTF_8.name()));
//             int cipherTextLength = ivCipherTextHmac.length - macLength;

//             byte[] iv = Arrays.copyOf(ivCipherTextHmac, 16);
//             byte[] cipherText = Arrays.copyOfRange(ivCipherTextHmac, 16, cipherTextLength);
//             byte[] ivCipherText = concatenateBytes(iv, cipherText);
//             byte[] receivedHMAC = Arrays.copyOfRange(ivCipherTextHmac, cipherTextLength, ivCipherTextHmac.length);
//             byte[] calculatedHMAC = generarHMAC(hmacKey, ivCipherText);

//             if (Arrays.equals(receivedHMAC, calculatedHMAC)) {
//                 Cipher cipher = Cipher.getInstance(ALGORITHM_AES); // AES/CBC/PKCS5Padding
//                 cipher.init(Cipher.DECRYPT_MODE, aesKey, new IvParameterSpec(iv));
//                 byte[] plainText = cipher.doFinal(cipherText);
//                 return new String(plainText, StandardCharsets.UTF_8.name()); // StandardCharsets.UTF_8
//             } else {
//                 return "El valor ingresado no se pudo descifrar.";
//             }

//         } catch (Exception e) {
//             return "El valor ingresado no se pudo descifrar";
//         }
//     }

//     public static int obtenerHMACLength(SecretKey key) {

//         try {
//             Mac hmac = Mac.getInstance(ALGORITHM_HMAC);
//             hmac.init(key);
//             return hmac.getMacLength();
//         } catch (Exception e) {
//             return -1;
//         }
//     }

//     public static byte[] concatenateBytes(byte[] first, byte[] second) {
//         byte[] concatBytes = new byte[first.length + second.length];
//         System.arraycopy(first, 0, concatBytes, 0, first.length);
//         System.arraycopy(second, 0, concatBytes, first.length, second.length);
//         return concatBytes;
//     }

//     public static byte[] generarHMAC(SecretKey key, byte[] hmacInput) {

//         try {
//             Mac hmac = Mac.getInstance(ALGORITHM_HMAC);
//             hmac.init(key);
//             return hmac.doFinal(hmacInput);
//         } catch (Exception e) {
//             return "generarHMAC - error en este metodo.".getBytes();
//         }

//     }

//     public static byte[] generarInitializationVector() {
//         byte[] iv = new byte[16];
//         SecureRandom secureRandom = new SecureRandom();
//         secureRandom.nextBytes(iv);
//         return iv;
//     }

//     private static String byteToBase64(byte[] array) {
//         return DatatypeConverter.printBase64Binary(array);
//     }

// }
