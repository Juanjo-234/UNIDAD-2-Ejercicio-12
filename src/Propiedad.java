class Propiedad {
    String direccion;
    String estadoLegal;
    double tasacion;
    boolean tieneEmbargo;

    public Propiedad(String direccion, String estadoLegal, double tasacion, boolean tieneEmbargo) {
        this.direccion = direccion;
        this.estadoLegal = estadoLegal;
        this.tasacion = tasacion;
        this.tieneEmbargo = tieneEmbargo;
    }

    String getDireccion() {
        return direccion;
    }

    String getEstadoLegal() {
        return estadoLegal;
    }

    double getTasacion() {
        return tasacion;
    }

    public boolean isTieneEmbargo() {
        return tieneEmbargo;
    }

    @Override
    public String toString(){
        return "Direccion de la propiedad: " + direccion + ". Valor de tasacion: " + tasacion + ". Estado legal:" + estadoLegal;
    }
}
