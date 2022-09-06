import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesTimes {
    /*
        Uso de java.util.Date para manipular tiempos
     */
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha completa = " + fecha); // imprime toda la fecha del sistema

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy"); // hacer custom el formato de fecha, se puede separar por  "-" "/"
                                                                                // si se ponen 4 M se imprime el nombre del mes
        String fechaFormato = dateFormat.format(fecha);

        System.out.println("fechaFormato = " + fechaFormato);

        System.out.println("imprime los milisegundos" + fecha.getTime());

    }
}
