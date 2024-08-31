package org.example.validacionversiones;

import java.util.Arrays;

public class ValidacionVersiones {

    public boolean validarVersionAppMayorIgualGenerica(String aplicacion, Integer versionAnd, Integer versionIos) {

        //Integer versionAndroid = versionAnd;
        //Integer versionIOS = versionIos;

        String[] versionAplicacion = aplicacion.split("-");
        // IOS-15.8.1-6.9762.1304
        // Android-13-3040

        boolean isAndroid = "Android".equalsIgnoreCase(versionAplicacion[0]);

        System.out.println("es OS android ? " + isAndroid);

        Integer versionProperty = isAndroid ? versionAnd : versionIos;

                String[] versionOS = aplicacion.split(versionAplicacion[0].equalsIgnoreCase("Android") ? "-" : "\\.");
        System.out.println("Version OS " + Arrays.toString(versionOS));
        int versionOsInt = Integer.parseInt(versionOS[versionOS.length - 1]);
        System.out.println(versionOsInt);

        return versionOsInt >= versionProperty;
    }

}
