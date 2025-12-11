// package org.example;

// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;

// import org.example.cifrados.Cifrado;

// public class ReadFile {
//     public static void main(String[] args) {

//         String accesoSimetrico = "HgDQcTi1ZbL0JdLXTwMVdmzgXO8N3bv8zBb4KayuL0g=";

//         String codigoAutentificacionHas = "fnOdmxi0srrbEIV0P73MTNJg3Z0L4V/lpA91fJwh7D0=";

//         try {
//             String base64 = new String(Files.readAllBytes(Paths.get("text.txt")));
//             base64 = base64.replaceAll("\\s+", "");
//             System.out.println("Inicio: " + base64.substring(0, 100) + "...");

//             String documento = Cifrado.decryptAES(accesoSimetrico, codigoAutentificacionHas, base64);

//             System.out.println("Documento " + documento.substring(0, 100) + "...");

//             Path directorioSalida = Paths.get("");
//             Path nuevoArchivo = directorioSalida.resolve("base64.txt");
//             Files.write(nuevoArchivo, documento.getBytes("UTF-8"));

//         } catch (Exception e) {
//             // TODO: handle exception
//             System.out.println("Ocurrio un errror " + e);
//         }

//     }
// }
