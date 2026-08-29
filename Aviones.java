public class Aviones {
    // debe de tener 6 atributos como modelo,fabricante,capacidad,velocidadMaxima,autonomia y numero de motores
    String modelo;
    String fabricante;
    int capacidad;
    double velocidadMaxima;
    double autonomia;
    int motores;
    boolean enVuelo;

    // Constructor 1:
    public Aviones(String modelo, String fabricante, int capacidad, double velocidadMaxima, double autonomia, int motores, boolean enVuelo) {

        this.modelo = modelo;
        this.fabricante = fabricante;
        this.capacidad = capacidad;
        this.velocidadMaxima = velocidadMaxima;
        this.autonomia = autonomia;
        this.motores = motores;
   }
    // Accion 1: debe decir si despego
    public void despegar() {
        enVuelo = true;
        System.out.println(modelo + "esta despegando.");
    }
    // Accion 2: debe decir si aterrizo
    public void aterrizar() {
        enVuelo = false;
        System.out.println(modelo + "esta aterrizando.");
    }
    // Accion 3: debe decir si esta volando
    public void volar() {
        enVuelo = true;
        System.out.println(modelo + "esta volando.");
    }
    // Accion 4: debe mostrar el modelo
    public void mostrarModelo() {
        System.out.println("Modelo: " + modelo);
    }
    // Accion 5: mostrar la informacion de los aviones
    public void mostrarInformacion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Capacidad:" + capacidad);
        System.out.println("Velocidad maxima: " +velocidadMaxima + " km/h");
        System.out.print("Autonomia: " + autonomia + " km ");
        System.out.println("Motores: " + motores);
        System.out.println("En vuelo: " + enVuelo);
    }
}





