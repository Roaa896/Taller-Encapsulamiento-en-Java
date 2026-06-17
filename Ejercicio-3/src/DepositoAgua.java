public class DepositoAgua {

    private double capacidad;
    private double volumenActual;
    private DepositoAgua depositoDesborde;

    public DepositoAgua() {

        capacidad = 0;
        volumenActual = 0;
        depositoDesborde = null;

    }

    public void setCapacidad(double capacidad) {
        if (capacidad <= 0) {
            System.out.println("Error: la capacidad debe ser mayor que cero.");
        } else {
            this.capacidad = capacidad;
        }
    }

    public double getCapacidad() {
        return capacidad;

    }

    public void setVolumenActual(double volumenActual) {
        this.volumenActual = volumenActual;

    }

    public double getVolumenActual() {
        return volumenActual;

    }

    public void setDepositoDesborde(DepositoAgua depositoDesborde) {
        this.depositoDesborde = depositoDesborde;

    }

    public DepositoAgua getDepositoDesborde() {
        return depositoDesborde;

    }

    public void mostrarEstado() {
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Volumen actual: " + volumenActual);
        System.out.println("Espacio libre: " + (capacidad - volumenActual));
        System.out.println();

    }

    public void agregarAgua(double cantidad) {

        if (volumenActual + cantidad <= capacidad) {
            volumenActual = volumenActual + cantidad;

            System.out.println("Se agregaron " + cantidad + " litros.");

        } else {
            double sobrante;

            sobrante = (volumenActual + cantidad) - capacidad;
            volumenActual = capacidad;

            System.out.println("El deposito se lleno completamente.");
            System.out.println("Sobran " + sobrante + " litros.");

            if (depositoDesborde != null) {
                System.out.println("El agua sobrante se envia al deposito de desborde.");
                depositoDesborde.agregarAgua(sobrante);

            } else {
                System.out.println("No existe deposito de desborde.");

            }

        }

    }

    public void quitarAgua(double cantidad) {
        
        if (cantidad <= volumenActual) {
            volumenActual = volumenActual - cantidad;
            System.out.println("Se quitaron " + cantidad + " litros.");

        } else {
            volumenActual = 0;
            System.out.println("No habia suficiente agua.");
            System.out.println("El deposito quedo vacio.");

        }

    }

}