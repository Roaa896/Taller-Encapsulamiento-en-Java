public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.disponible = true;
    }

    public void setTitulo(String titulo) {

        if (titulo.equals("")) {
            System.out.println("Error: el titulo no puede estar vacio.");
        } else {
            this.titulo = titulo;
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void mostrarInfo() {

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + disponible);
        System.out.println();

    }

    public void prestar() {

        if (disponible == true) {
            disponible = false;
            System.out.println("El libro fue prestado.");
        } else {
            System.out.println("El libro ya esta prestado.");
        }

    }

    public void devolver() {

        if (disponible == false) {
            disponible = true;
            System.out.println("El libro fue devuelto.");
        } else {
            System.out.println("El libro ya estaba disponible.");
        }

    }

}
