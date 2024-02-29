package ejerciciopractico2;



import java.time.LocalDate;



public class SpotifyCancion {
    private int id;
    private String titulo;
    private String autor;
    private int duracion;
    private LocalDate fechaLanzamiento;
    public SpotifyCancion(int id, String titulo, String autor, int duracion, LocalDate fechaLanzamiento) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int obtenerId() {
        return id;
    }

    public void asignarId(int id) {
        this.id = id;
    }

    public String obtenerTitulo() {
        return titulo;
    }

    public void asignarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String obtenerAutor() {
        return autor;
    }

    public void asignarAutor(String autor) {
        this.autor = autor;
    }

    public int obtenerDuracion() {
        return duracion;
    }

    public void asignarDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate obtenerFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void asignarFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public static void main(String[] args) {
        SpotifyCancion cancion = new SpotifyCancion(1, "TituloCancion", "Artista", 100, LocalDate.of(2023, 5, 15));
        System.out.println("ID: " + cancion.obtenerId());
        System.out.println("Titulo: " + cancion.obtenerTitulo());
        System.out.println("Autor: " + cancion.obtenerAutor());
        System.out.println("Duracion: " + cancion.obtenerDuracion() + " segundos");
        System.out.println("Fecha de Lanzamiento: " + cancion.obtenerFechaLanzamiento());
        cancion.asignarDuracion(200);
        cancion.asignarFechaLanzamiento(LocalDate.now());
        System.out.println("\nInformacion actualizada:");
        System.out.println("Duracion actualizada: " + cancion.obtenerDuracion() + " segundos");
        System.out.println("Fecha de Lanzamiento actualizada: " + cancion.obtenerFechaLanzamiento());
    }
}