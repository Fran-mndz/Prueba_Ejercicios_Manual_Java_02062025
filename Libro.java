import java.util.Objects;

public class Libro {
    private final int id;
    private final String titulo;
    private final String edicion;
    private final String autor;

    public Libro(int id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    // Getters para acceder a los atributos
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getAutor() {
        return autor;
    }

    // Sobrescribir toString() para una representación legible del objeto
    @Override
    public String toString() {
        return "Libro [ID=" + id + ", Titulo='" + titulo + "', Edicion='" + edicion + "', Autor='" + autor + "']";
    }

    // Sobrescribir equals() para definir cuándo dos objetos Libro son "iguales"
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        // Dos libros son iguales si tienen el mismo ID y Título
        return id == libro.id &&
               Objects.equals(titulo, libro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo);
    }
}