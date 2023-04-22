public enum TipoSala {
    SALA3D(1.2),
    SALACOMUM(1.0),
    SALAXD(1.3),
    SALAXD3D(1.4);
    private double multiplicador;
    TipoSala(double multiplicador){
        this.multiplicador=multiplicador;
    }
    public double getMultiplicador() {
        return multiplicador;
    }
}
