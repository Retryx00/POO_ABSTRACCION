public class Main {
    public static void main(String[] args) {

        Camioneta s1 = new Camioneta("Cherlovette", "C210",155.5, 1500);

        s1.encender();
        s1.mostrarInformacion();

        System.out.println("--------------------------------------------");

        Motocicleta s2 = new Motocicleta("Honda", "R24", 215.0, true);
        s2.encender();
        s2.mostrarInformacion();

        System.out.println("--------------------------------------------");

        Bus s3 = new Bus("NN","PL67", 100.50, 55);
        s3.encender();
        s3.mostrarInformacion();
        s3.apagar();




    }
}