import java.awt.*;

public class Automovil {
    // las clases solo pueden ser public o default
    // si es publica se puede usar en donde sea
    // si es default solo se puede usar en el paquete donde se encuentre

    /*
     * Modificadores de acceso
     *
     * public
     * private
     * protected
     * default
     */

    // atributos de la clase
    private String fabricante;
    private String modelo;
    private String marca;
    private Colores color;
    private double cilindros;
    private int litros;
    private TiposAutomoviles tipoAutomovil;

    // tiene un modificador de acceso default es buena practica ponerle uno
    static double valoracion = 5.0;

    // si se tiene una variable estatica y privada se deben crear los metodos de acceso y estos deben ser estaticos
    private static int numeroPuertas = 4;

    // atributos final - constantes
    // siempre se debe inicializar con un valor y por lo regular siempre son static
    private static final int NUMERO_NEUMATICOS = 4;

    // constructores y sobre carga de contructores
    public Automovil() {
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String marca, Colores color) {
        this(fabricante, modelo);
        this.marca = marca;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String marca, Colores color, double cilindros, int litros, TiposAutomoviles tipoAutomovil) {
        this(fabricante, modelo, marca, color);
        this.cilindros = cilindros;
        this.litros = litros;
        this.tipoAutomovil = tipoAutomovil;
    }

    // crear metodos para acceder a los datos -> Getters and Setters
    public String getFabricante() {
        return this.fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public Colores getColor() {
        return this.color;
    }

    public double getCilindros() {
        return this.cilindros;
    }

    public int getLitros() {
        return this.litros;
    }

    public TiposAutomoviles getTipoAutomovil() {
        return this.tipoAutomovil;
    }

    public static int getNumeroPuertas() {
        return Automovil.numeroPuertas;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public void setCilindros(double cilindros) {
        this.cilindros = cilindros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public void setTipoAutomovil(TiposAutomoviles tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    // es un metodo estatico para ponerle un nuevo valor a la variable estatica.
    public static void setNumeroPuertas(int numeroPuertas) {
        Automovil.numeroPuertas = numeroPuertas;
    }

    /*
     * Sintaxis de los metodos
     *
     * modificador_acceso valor_retorno nombre ( tipo_parametro parametro ){
     *     logica de la funcion
     *     retorno
     * }
     *
     */

    // con this se hace referencia a los atributos de la misma clase
    public void descripcion() {
        System.out.println("el auto es un " + this.modelo + " marca "
                + this.marca + " de color " + this.color.getColor() + " con "
                + this.cilindros + " cilindros");
    }

    // no es muy buena practica realizar impresiones en consola como se muestra arriba desde una clase
    // es mejor retornar un valor y aplicarlo en el main
    public String descripcionAutomovil() {
        return "el auto es un " + this.modelo +
                " marca " + this.marca +
                " de color " + this.color.getColor() +
                " con " + this.cilindros + " cilindros con " +
                Automovil.NUMERO_NEUMATICOS + " neumaticos";
    }

    /*
        estandares
        * Los metodos y artibutos siempre deben inciar con minusculas -> loggerCase
        * Las clases inician con mayuscula
        * nombres de metodos se separan por mayuscula -> CamelCase
    */
    public String acelarando(int rpm) {
        return "el auto " + this.marca + " esta acelerando a " + rpm + " rpm.";
    }

    // sobrecarga de metodos, se le agrega nueva funcionalidad cunado se realiza la sobrecarga
    public double calcularConsumo(int kilometros, int cantidadGastada) {
        return kilometros / (this.litros * (cantidadGastada / 100f));
    }

    public double calcularConsumo(int kilometros, float cantidadGastada) {
        return kilometros / (this.litros * cantidadGastada);
    }

    // metodos estaticos
    // se acceden sin necesidad de intanciar un objeto, solo colocantod el nombre de la clase . metodo
    // el metodo estatico no puede ser privado
    // los estativos solo pueden usar estaticos, no se puede usar this o acceder de forma normal a un no estatico aunque este en la misma clase
    // si de alguna forma se cambia el valor del metodo estativo o valor estatico se cambia en todos los objetos
    static String valoracion() {
        return "tiene una valoracion de " + Automovil.valoracion + " estrellas en seguridad ";
    }

    // se agrega la palabra de @Override, se pude poner o no no afecta solo es para documentar
    @Override
    public boolean equals(Object obj) {
        Automovil automovil = (Automovil) obj;
        // validamos que solo se compare con valores de la clase
        if (!(obj instanceof Automovil)) {
            return false;
        }
        // validamos los datos que vienen en el objeto -> NullPointerException
        return (this.fabricante.equals(automovil.getFabricante()) && this.modelo.equals(automovil.getModelo()));
    }

    // sobre escribir el metodo toString()
    @Override
    public String toString() {
        return "Sobre carga de toString del automovil " + this.getModelo();
    }

}
