public class Camioneta extends Vehiculo {

    private final int capacidadCarga;
    public Camioneta(String marca, String codigo, double velocidadMaxima,  int  capacidadCarga) {
        super(marca, codigo, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Marca " + getMarca()+ ".");
        System.out.println("Codigo "+ getCodigo()+ ".");
        System.out.println("Velocidad Maxima: " +getvelocidadMaxima());
        System.out.println("Capacidad Maxima: " +capacidadCarga);
        System.out.println("Estado: " + (isEstadoOperativo() ? "Encendido" : "Apagado"));
    }

    @Override
    public void encender() {
        setEstadoOperativo(true);
        System.out.println("Encendiendo camioneta");
    }

    @Override
    public void apagar() {
        setEstadoOperativo(false);
        System.out.println("Apagando camioneta");
    }




}