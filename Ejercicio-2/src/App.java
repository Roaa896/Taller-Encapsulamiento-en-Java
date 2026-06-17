public class App {

    public static void main(String[] args) throws Exception {

        Vuelo vuelo1 = new Vuelo();
        Vuelo vuelo2 = new Vuelo();

        vuelo1.setNumero("MJ909");
        vuelo1.setOrigen("Bogota");
        vuelo1.setDestino("Suiza");
        vuelo1.setCapacidadMaxima(180);
        vuelo1.setOcupacion(120);

        vuelo2.setNumero("GR811");
        vuelo2.setOrigen("Bogota");
        vuelo2.setDestino("Finlandia");
        vuelo2.setCapacidadMaxima(150);
        vuelo2.setOcupacion(80);

        System.out.println("DATOS DEL VUELO 1");
        vuelo1.mostrarInfo();

        System.out.println("DATOS DEL VUELO 2");
        vuelo2.mostrarInfo();

        System.out.println("EMBARCANDO PASAJEROS EN EL VUELO 1");
        vuelo1.embarcar(40);
        vuelo1.embarcar(30);

        System.out.println("DESEMBARCANDO PASAJEROS EN EL VUELO 1");
        vuelo1.desembarcar(50);
        vuelo1.desembarcar(200);

        System.out.println("EMBARCANDO PASAJEROS EN EL VUELO 2");
        vuelo2.embarcar(80);
        vuelo2.embarcar(10);

        System.out.println("DESEMBARCANDO PASAJEROS EN EL VUELO 2");
        vuelo2.desembarcar(56);
        vuelo2.desembarcar(198);

        System.out.println("INFORMACION FINAL DE LOS VUELOS");
        vuelo1.mostrarInfo();
        vuelo2.mostrarInfo();

    }

}
