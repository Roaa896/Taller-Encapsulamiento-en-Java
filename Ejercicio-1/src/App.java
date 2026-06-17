public class App {

    public static void main(String[] args) throws Exception {

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        libro1.setTitulo("El principito");
        libro1.setAutor("Antoine de Saint-Exupéry");
        libro1.setDisponible(true);

        libro2.setTitulo("La Voragine");
        libro2.setAutor("Jose Eustasio Rivera");
        libro2.setDisponible(true);

        System.out.println("INFORMACIÓN DEL LIBRO 1");
        libro1.mostrarInfo();
 
        System.out.println("INFORMACIÓN DEL LIBRO 2");
        libro2.mostrarInfo();
 
 
        System.out.println("Probando el préstamo del libro 1");
        libro1.prestar();
        libro1.prestar();
 
 
        System.out.println("PROBANDO EL PRÉSTAMO DEL LIBRO 1");
        libro1.devolver();

        System.out.println("PROBANDO EL PRÉSTAMO DEL LIBRO 2");
        libro2.prestar();
        libro2.prestar();
 
 
        System.out.println("PROBANDO LA DEVOLUCIÓN DEL LIBRO 2");
        libro2.devolver();
 
 
        System.out.println("INFORMACIÓN FINAL DE LOS DOS LIBROS");
        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }

}