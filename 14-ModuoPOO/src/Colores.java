public enum Colores {
    /*
    * Es una coleccion de valores contantes
    */

    ROJO("rojo"),
    AMARILLO("amarillo"),
    BLANCO("blanco"),
    NEGRO("negro"),
    AZUL("azul"),
    GRIS("gris oscuro");

    private final String color;

    Colores(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
