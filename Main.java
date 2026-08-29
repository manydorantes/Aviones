public class Main {
    public static void main(String[] args) {
        Aviones avion1 = new Aviones("737", "Boeing", 189, 839, 5436, 2, false);
        Aviones avion2 = new Aviones("A320", "Airbus", 186, 828, 6100, 2, false);
        Aviones avion3 = new Aviones("747", "Boeing", 416, 907, 13450, 4, false);
        Aviones avion4 = new Aviones("A350", "Airbus", 440, 945, 15000, 2, false);
        Aviones avion5 = new Aviones("777", "Boeing", 396, 905, 13650, 2, false);
        Aviones avion6 = new Aviones("A380", "Airbus", 853, 1020, 15200, 4, false);
        Aviones avion7 = new Aviones("787", "Boeing", 330, 954, 14140, 2, false);
        Aviones avion8 = new Aviones("A330", "Airbus", 300, 871, 11750, 2, false);
        Aviones avion9 = new Aviones("E190", "Embraer", 114, 871, 4537, 2, false);
        Aviones avion10 = new Aviones("CRJ900", "Bombardier", 90, 882, 2956, 2, false);

        // Los 10 objetos se guardan en un arreglo
        Aviones[] aviones = {
                avion1, avion2, avion3, avion4, avion5, avion6, avion7, avion8, avion9, avion10};
        // Crear la tabla
        TablaAviones tabla = new TablaAviones();
        // Mostrar la tabla en la consola
        tabla.mostrarTabla(aviones);
    }
}






