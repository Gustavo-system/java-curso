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
     *
     */

    // atributos de la clase
    private String fabricante;
    private String modelo;
    private String marca;
    private String color;
    private double cilindros;
    private int litros;

    // crear metodos para acceder a los datos -> Getters and Setters
    public String getFabricante(){
        return this.fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getColor(){
        return this.color;
    }

    public double getCilindros(){
        return this.cilindros;
    }

    public int getLitros(){
        return this.litros;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCilindros(double cilindros) {
        this.cilindros = cilindros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
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
    public void descripcion(){
        System.out.println("el auto es un " + this.modelo + " marca "
                            + this.marca + " de color " + this.color + " con "
                            + this.cilindros + " cilindros");
    }

    // no es muy buena practica realizar impresiones en consola como se muestra arriba desde una clase
    // es mejor retornar un valor y aplicarlo en el main
    public String descripcionAutomovil(){
        return "el auto es un " + this.modelo +
                " marca " + this.marca +
                " de color " + this.color +
                " con " + this.cilindros + " cilindros";
    }

    /*
        estandares
        * Los metodos y artibutos siempre deben inciar con minusculas -> loggerCase
        * Las clases inician con mayuscula
        * nombres de metodos se separan por mayuscula -> CamelCase
    */
    public String acelarando(int rpm){
        return "el auto " + this.marca + " esta acelerando a " + rpm + " rpm.";
    }

    // sobrecarga de metodos, se le agrega nueva funcionalidad cunado se realiza la sobrecarga
    public double calcularConsumo(int kilometros, int cantidadGastada){
        return kilometros / (this.litros * (cantidadGastada / 100f));
    }

    public double calcularConsumo(int kilometros, float cantidadGastada){
        return kilometros / (this.litros * cantidadGastada);
    }

}
