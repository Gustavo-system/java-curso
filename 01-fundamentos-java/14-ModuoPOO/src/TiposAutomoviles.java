public enum TiposAutomoviles {
    SEDAN("Sedan", "Mediano", 17),
    CAMIONETA("Camioneta", "Grande", 18),
    HATCHBACK("pequeño", "Pequeño", 15);

    private final String tipoAutomovil;
    private final String sizeCar;
    private final int rin;

    TiposAutomoviles(String tipoAutomovil, String sizeCar, int rin){
        this.tipoAutomovil = tipoAutomovil;
        this.sizeCar = sizeCar;
        this.rin = rin;
    }

    public String getTipoAutomovil(){
        return this.tipoAutomovil;
    }

    public String getSizeCar(){
        return this.sizeCar;
    }

    public int getRin(){
        return this.rin;
    }
}
