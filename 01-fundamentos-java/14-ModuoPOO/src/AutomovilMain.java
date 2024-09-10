public class AutomovilMain {
    // esta seria la clase principal con el metodo main
    // las clases son plantillas o moldes que representan un objeto
    public static void main(String[] args) {

        // se crean instancias de los objetos

        //Automovil automovilJetta = new Automovil();
        // se puede crear un objeto con distintos valores en el contructor gracias a la sobre carga de conctructores
        Automovil automovilJetta = new Automovil("VW", "Jetta", "VW", Colores.BLANCO, 1.6, 20, TiposAutomoviles.SEDAN);
        Automovil automovilVersa = new Automovil("Nissan", "Versa", "Nissan", Colores.ROJO, 1.6, 20, TiposAutomoviles.SEDAN);
        Automovil automovilVersa2 = new Automovil("Nissan", "Versa", "Nissan", Colores.AZUL, 1.6, 20, TiposAutomoviles.HATCHBACK);

        // Se comparan los objetos para saber si son distintos
        System.out.println("Se compara igualdad por espacio de memoria -> " + (automovilVersa == automovilVersa2));
        System.out.println("Se compara igualdad por valores " + automovilVersa.equals(automovilVersa2)); // se sobre escribe el metodo equals

        // se imprime el objeto con la @Override del toString();
        System.out.println("forma implicita -> " + automovilJetta); // forma implicita
        System.out.println("forma explicita -> " + automovilJetta.toString()); // forma explicita

        /*
            Asi se acceden a los atributos si no estan ocultos
            automovilJetta.marca = "VW";
            automovilJetta.modelo = "jetta";
            automovilJetta.color = "rojo";
            automovilJetta.cilindros = 1.6;
            automovilJetta.litros = 20;
            automovilJetta.fabricante = "VW";
         */

        // asi de acceden a los datos si estan ocultos
        automovilJetta.setMarca("VW");
        automovilJetta.setModelo("Jetta");
        automovilJetta.setColor(Colores.ROJO);
        automovilJetta.setCilindros(1.6);
        automovilJetta.setLitros(20);
        automovilJetta.setFabricante("VW");

        automovilJetta.descripcion();
        System.out.println();

        System.out.println("-> " + automovilJetta.descripcionAutomovil());
        System.out.println("-> " + automovilJetta.acelarando(200));
        System.out.println("-> " + automovilJetta.calcularConsumo(100, 40));
        System.out.println("-> " + automovilJetta.calcularConsumo(100, 0.50f));

        // se manda a llamar el artibuto esatico con la clase para que sea mas explicito.
        Automovil.valoracion = 4.5;
        System.out.println("-> El " + automovilJetta.getModelo() + " " + Automovil.valoracion());
        System.out.println("-> El " + automovilJetta.getModelo() + " es de tipo " + automovilJetta.getTipoAutomovil().getTipoAutomovil() + " con un rin de: " + automovilJetta.getTipoAutomovil().getRin());

        // si fuera un static privado tendramos que crearle el metodo getter anf setter, el metodo debe ser estatico
        Automovil.setNumeroPuertas(5);
        System.out.println("-> El " + automovilVersa.getModelo() + " Tiene un total de " + Automovil.getNumeroPuertas() + " puertas.");
        System.out.println("-> El " + automovilVersa.getModelo() + " es de tipo " + automovilVersa.getTipoAutomovil().getTipoAutomovil() + " con un rin de: " + automovilVersa.getTipoAutomovil().getRin());

        // sentencia switch con los enum
        TiposAutomoviles tipo = automovilJetta.getTipoAutomovil();
        switch (tipo) {
            case SEDAN:
                System.out.println("Los Sedan son de los autos mas preferidos por las familias");
                break;
            case CAMIONETA:
                System.out.println("Las Camionetas");
                break;
            case HATCHBACK:
                System.out.println("Los Hatchback");
                break;
        }

    }
}
