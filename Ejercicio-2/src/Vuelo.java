public class Vuelo {

    private String numero;
    private String origen;
    private String destino;
    private int ocupacion;
    private int capacidadMaxima;

    public Vuelo() {

        numero = "";
        origen = "";
        destino = "";
        ocupacion = 0;
        capacidadMaxima = 0;

    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setOcupacion(int ocupacion) {

        if (ocupacion < 0 || ocupacion > capacidadMaxima) {
            System.out.println("Error: ocupacion invalida.");
        } else {
            this.ocupacion = ocupacion;
        }

    }

    public int getOcupacion() {
        return ocupacion;
    }

    public void mostrarInfo() {

        System.out.println("Numero de vuelo: " + numero);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Pasajeros a bordo: " + ocupacion);
        System.out.println("Capacidad maxima: " + capacidadMaxima);
        System.out.println();

    }

    public void embarcar(int pasajeros) {

        if (ocupacion + pasajeros <= capacidadMaxima) {

            ocupacion = ocupacion + pasajeros;
            System.out.println(pasajeros + " pasajeros embarcaron.");

        } else {

            System.out.println("No hay suficiente espacio para embarcar "
                    + pasajeros + " pasajeros.");

        }

    }

    public void desembarcar(int pasajeros) {

        if (ocupacion - pasajeros >= 0) {

            ocupacion = ocupacion - pasajeros;
            System.out.println(pasajeros + " pasajeros desembarcaron.");

        } else {

            System.out.println("No se pueden desembarcar tantos pasajeros.");

        }

    }

}
