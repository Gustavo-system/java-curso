package org.example;

import org.example.cifrados.CifradoAsimetrico;

public class Main {

    public static void main(String[] args) {

        System.out.println("¡Utileria!");

        String llavePublica = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxg7lB9qRxO7zIWChRldppL46JkgFcFZlyU00jzv+TeEzAcNDHSYmfmxoEEog8/dmAEEpeYHMA7BzbR5P8U13ri0seRmGAxOrrClB5qeB1mLZim0DOnvcd8uXfm99s8kuzrxwXiiDa02SZitRa3Va0rdzUY0+Lm0+k/W4ytxgGSMa9LiNQNNxmpe7XecQVyWpGxfZYLeIXmwWY+hm0+SKvDhn6jywraJinle2Z7AHyBYHV5UouqWnW/OqT/vrAqQsQBpKloNP98jHbznXmZ55FjkM0yK/R7o99G+Iwea1efFSU3jNP20rEccJ7AOHKJMgGvq/KDoqOZIMsA0TB1SKmwIDAQAB";

        String llavePrivada = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDGQnlpSY8qTDrAE2PKRSwJZ3aKi/ZzccYTQ3/s718MFm/8e9Zg9oiD2DEgg8yh+Kcf4u4MK9UVnttntxBJo4OdV3cDzzBTuu0BntgaRUhuwD258qJA8qJ9sO6TtiEtjm4bMzfu4zFwDdDD9u4jKCIeBnuXZZWkXUCa9sHvv/i/jxppLySMAOjfHh16BnVEE0Yr3vqer4U6aNGOM6BO/hClxBMG2HvTdDG3j6dcUuiGF3mywkVp1rd8U3aJZn8OD09A0NwgJLY4rK4kt4jt9G5EZ+m1E7c37ADHhEV3VTeqh3yS45dQWl7dup4kguGL36xzGxQfENtAf+aT7ilpWigLAgMBAAECggEALvpHXIxikQo5DZRKm/4h/iR28UNS5W37GktvP4xEwE98v530YUtpc5xBn8u7LFIH/8U81MN6HUJkCMJW6KwHHrw/5jYs5FoxmKWz3R23mQ6SUcJNcghMOm43SebpG6tZKbbMNR2+dCfB5P1Y1hnHY8fzdx9KAwVZrp5zu8SIQ5NRCgn5DNmEEXvrik3/9HAxSBWONLlx1uItXGcn0viabC7p3xJADDP9hVryns2/J8UYG4/xcjTib9zknfuX4SDzXGPPSAiz0TSdfgX+EgRp7LjBGmEN9x924blU9gmkUjBh2l0u1TY3Hrlkrftw2zGBUiwRjFbEgANN/qm6314XQQKBgQDyN5T1TuJh9NZZLi+jA84Ef7YgKfIAhrcnTqJ9GOAyaxKXtHAUREhR0S8WEH3AOTptqWg2lSEgdoleUSYo/5yw563wSW2BwZzzlOq8t9YtUokXgXERHCzibrtpAo5qB4fdmaMxeSNKXJ5Gm5wOK1MPq3Vleuh1cM5lww1Snh+IIQKBgQDRio6C7/3jMyU/BoaumkcbhV9VGhfuTR9N/LGxNquNeKwjvF+MysPbZMuOtk4YGmoUpcNqTiam4rhEH0GTJ84N6jyxc09EhfT+nnKKCg+/YnyWkn00gV8KzwN4ts6DMSO5G2RZVpzWmmQDZ3evP1eJrcJFtKeEtVYssSpFrBr6qwKBgGrzk/iFbnymaYdTV4F5ipx97+Nf4hXNZk4a8LCgLU7V7I3EBMFOLUjDPzFU8tHP8za82OFRFCGLdbiJyHnN9FhA1JMHOS1UWoNLvCK8Yfv9N7+DTnOpp0AMeQAzOsMitCFrV53eyXBqWREAYPX4t2Jx6RJ4JPDGcLyKVfWnEHFBAoGBAL+AiOQj333gRV8HYNl8CBaf2tOVCF/yvfRxSBh0pW6i5Xe3df/fZAZDZUHlXRPsOBzsrd6e0/ZbaBpiEnUhwNC4zYVDpCM05gY52uZLcb7wjHq0IJd20Ny4+yw8rhn6M/K9lQWNAcOj0FnIGvrfweoDEnTQOPUxITOxKrgIJZQHAoGAdMhpIn+UnBpWXgV+EkttXeYo12lhkj49IZPO7Z0JayZGaX3AFjo+ibBuLE3hacjq8T2s1BKLiarmFv8u1dk7zU5kdiPl9QXlIIrS7fjEOB39UcVDrE0BsxesoR7yZJdeU3+vQiLnSaY0no0hzW9EPSWwd6y0waJ2pT1BvtpSCzc=";

        String cadena = "93851";

        String cifrado = "ojg4dSglr7tg8vF1sP3Ea5lnbCjsZHCjVri8eiLR1rExiw7jh1+G3DFPcm0a2Thcx5H8W4xBFqovCQhtM9ImPE57Bz4tE1lXEfU7wfyc027JciO+zfQLDsl92vgW+orw6a4xbnO9DbPcuWtF6qwJe6IvoZ+hqwRvCL/tuesnAsO9qriNKVEo8jHiG4Bbrl0fICgCKqOiTkXS43ChXPo+PGcr4dNEhlrOe0fmS5O1IamqVbBlzgqdtYkHiGWp71t3qgSX9q/ygRo6Pxb0jxRzyZ260m7TSssmq1PMVE3Qg2+e12N53s85mQDLSCSJMGvGlzGmoZSvMXrgC+y6OCz/vQ==";

        try {
            // System.out.println("idPais " + CifradoAsimetrico.encrypt("1", llavePublica));
            // System.out.println("idCanal " + CifradoAsimetrico.encrypt("1", llavePublica));
            // System.out.println("idSucursal " + CifradoAsimetrico.encrypt("100", llavePublica));
            // System.out.println("folio " + CifradoAsimetrico.encrypt("100045", llavePublica));

            String textCifrado = CifradoAsimetrico.encrypt(cadena, llavePublica);

            System.out.println("cadena cifrada " + textCifrado);

            // String decifrado = CifradoAsimetrico.decrypt(cifrado, llavePrivada);

            // System.out.println("decifrado " + decifrado);


        } catch (Exception e) {
            System.out.println("e = " + e);
        }

        // try {
        //     System.out.println("\n");
        //     String response = "{\"id\":123,\"name\":\"Juan\",\"lastName\":\"Perez\",\"age\":30,\"matricula\":\"PEPE123\", \"grado\": \"2\"}";
        //     Alumno responseObjet = UtileriaJson.jsonToObjeto(response, Alumno.class);
        //     System.out.println("Conversion a objeto = " + responseObjet);

        //     String alumnoObject = UtileriaJson.objetoToJson(responseObjet);
        //     System.out.println("Convercion a json = " + alumnoObject);

        // } catch (Exception e) {
        //     System.out.println("e = " + e);
        // }

        // System.out.println("\n");
        // String cadenaLimpia = LimpiarCaracteres.limpiarCaracteresEspeciales("Sin número.");
        // System.out.println(cadenaLimpia);

    }
}