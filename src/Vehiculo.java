public abstract class Vehiculo {
    private String marca;
    private String codigo;
    private double velocidadMaxima;
    private boolean estadoOperativo;

    public Vehiculo(String marca, String codigo, double velocidadMaxima) {
        this.marca = marca;
        this.codigo = codigo;
        this.velocidadMaxima = velocidadMaxima;
        this.estadoOperativo = false;

    }

    // métodos
    public void encender() {

    }

    public void apagar() {

    }

    public void mostrarInformacion() {

    }

    // setters y getters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getvelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setvelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public boolean isEstadoOperativo() {
        return estadoOperativo;
    }
    public void setEstadoOperativo(boolean estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }
}
