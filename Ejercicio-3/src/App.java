public class App {

    public static void main(String[] args) throws Exception {

        DepositoAgua deposito1 = new DepositoAgua();
        DepositoAgua deposito2 = new DepositoAgua();

        deposito1.setCapacidad(100);
        deposito2.setCapacidad(50);

        deposito1.setDepositoDesborde(deposito2);

        System.out.println("ESTADO INICIAL DEL DEPOSITO 1");
        deposito1.mostrarEstado();

        System.out.println("ESTADO INICIAL DEL DEPOSITO 2");
        deposito2.mostrarEstado();

        System.out.println("AGREGANDO 80 LITROS AL DEPOSITO 1 SIN DESBORDAR");
        deposito1.agregarAgua(80);

        System.out.println("AGREGANDO 40 LITROS AL DEPOSITO 1 HASTA DESBORDARLO");
        deposito1.agregarAgua(40);

        System.out.println("ESTADO FINAL DEL DEPOSITO 1");
        deposito1.mostrarEstado();

        System.out.println("ESTADO FINAL DEL DEPOSITO 2");
        deposito2.mostrarEstado();

        System.out.println("QUITANDO 30 LITROS DEL DEPOSITO 2");
        deposito2.quitarAgua(30);

    }

}