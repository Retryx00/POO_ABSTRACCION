public class Motocicleta extends Vehiculo {

    private final boolean repartoRapido;
    public Motocicleta(String marca, String codigo, double velocidadMaxima, boolean  repartoRapido) {
        super(marca, codigo, velocidadMaxima);
        this.repartoRapido = repartoRapido;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Marca " + getMarca() + ".");
        System.out.println("Codigo " + getCodigo() + ".");
        System.out.println("Velocidad Maxima: " + getvelocidadMaxima());
        System.out.println("Reparto rapido: " + repartoRapido);
        System.out.println("Estado: " + (isEstadoOperativo() ? "Encendido" : "Apagado"));
    }

    @Override
    public void encender() {
        setEstadoOperativo(true);
        System.out.println("Motocicleta encender.");
    }

    @Override
    public void apagar() {
        setEstadoOperativo(false);
        System.out.println("Apagando Motocicleta.");
    }
}