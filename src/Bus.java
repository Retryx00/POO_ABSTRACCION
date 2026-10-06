public class Bus extends Vehiculo {

    private final int cantidadPasajeros;
    public Bus(String marca, String Codigo, double velocidadMaxima, int cantidadPasajeros) {
        super(marca, Codigo, velocidadMaxima);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Marca " + getMarca() + ".");
        System.out.println("Codigo " + getCodigo() + ".");
        System.out.println("Velocidad Maxima: " + getvelocidadMaxima());
        System.out.println("Cantidad Maximo de pasajeros: " + cantidadPasajeros);
        System.out.println("Estado: " + (isEstadoOperativo() ? "Encendido" : "Apagado"));
    }

    @Override
    public void encender() {
        setEstadoOperativo(true);
        System.out.println("Bus encender.");
    }

    @Override
    public void apagar() {
        setEstadoOperativo(false);
        System.out.println("Apagando Bus");
    }

}
