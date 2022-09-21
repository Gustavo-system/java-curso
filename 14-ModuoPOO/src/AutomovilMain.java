public class AutomovilMain {
    // esta seria la clase principal con el metodo main
    // las clases son plantillas o moldes que representan un objeto
    public static void main(String[] args) {

        // se crean instancias de los objetos

        //Automovil automovilJetta = new Automovil();
        Automovil automovilJetta = new Automovil("VW", "Jetta", "VW", Colores.BLANCO, 1.6, 20);

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

        Automovil.valoracion = 4.5;
        System.out.println("-> El " + automovilJetta.getModelo()  + " " + Automovil.valoracion());

    }
}
