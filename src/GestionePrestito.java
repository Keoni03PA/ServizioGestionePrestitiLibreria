//creo un interfaccia per la gestione del sistema dei prestiti e del ritorno dei libri
public interface GestionePrestito {
     void prestaLibro(Libro libro);
     void ritornaLibro(Libro libro);
     void restauraLibro(Libro libro);

}
