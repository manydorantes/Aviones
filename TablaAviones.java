public class TablaAviones {
    public void mostrarTabla(Aviones[] aviones) {

        System.out.println("=============================================================================");
        System.out.printf("%-10s %-12s %-10s %-12s %-12s %-10s %-10s%n", "MODELO", "FABRICANTE", "CAPACIDAD", "VEL.MAX", "AUTONOMIA", "MOTORES", "EN VUELO");

        System.out.println("==============================================================================");

        for (Aviones avion : aviones) {
            System.out.printf("%-10s %-12s %-10d %-12.1f %12.1f %-10d %-10s%n", avion.modelo, avion.fabricante, avion.capacidad, avion.velocidadMaxima, avion.autonomia, avion.motores, avion.enVuelo);
        }
        System.out.println("==============================================================================");
    }
}


