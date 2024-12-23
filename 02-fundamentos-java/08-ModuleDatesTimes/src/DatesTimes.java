import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatesTimes {
    /*
        Uso de java.util.Date para manipular tiempos
     */
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha completa tipo Date = " + fecha); // imprime toda la fecha del sistema

        // hacer custom el formato de fecha, se puede separar por "-" o "/"
        // "dd/MMMM/yyyy"
        // "dd MMMM, yyyy"
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // si se ponen 4 M se imprime el nombre del mes
        String fechaFormato = dateFormat.format(fecha);
        System.out.println("fechaFormato = " + fechaFormato);
        System.out.println("imprime los milisegundos = " + fecha.getTime());

        System.out.println("\nClase calendar");

        // uso de la clase Calendar de java.util.Calendar es una clase estatica
        Calendar calendario = Calendar.getInstance();

        // forma de generar la fecha de dias pasados o futuros
        calendario.set(2024, Calendar.JULY, 21, 10, 00, 01);

        // otra forma de asiganar los valores para el calendario
        calendario.set(Calendar.YEAR, 2023);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);

        Date fechaCalendario = calendario.getTime(); // obtenemos la fecha que se creo previamente

        System.out.println("calendario sin formato -> " + fechaCalendario);

        SimpleDateFormat formatCalendar = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaCalendarioFormato = formatCalendar.format(fechaCalendario);

        System.out.println("calendario con formato -> " + fechaCalendarioFormato);

        System.out.println("\nConvertir un string a una objeto Date");

        String fechaText = "2025-01-01";

        try {
            // esto es necesario envolverlo en un try/catch
            Date fechaObject = dateFormat.parse(fechaText);
            System.out.println("fechaObject sin formato = " + fechaObject);
            System.out.println("fechaObject con formato = " + dateFormat.format(fechaObject));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nComparar dos fechas");




    }
}
