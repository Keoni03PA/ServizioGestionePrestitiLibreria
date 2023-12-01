public class Sovrannaturale extends Libro{

    //Sfrutto il principio dell'ereditarietà per attrivuire dei field alla mia sottoclasse
    public Sovrannaturale(String titolo, String autore, int annoDiPubblicazione, StatoLibro stato) {
        super(titolo, autore, annoDiPubblicazione,stato);
    }

    //Utilizzo il comando di override per estrapolare i metodi delle classi padre
    @Override
    public double calcPrezzo() {
        return 9.99;
    }

    /*
    implemento le funzioni prestaLibro, ritornaLibro e restauraLibro
    dalla classe libreia attraverso la classe astratta Libro grazie
    alla proprietà dell'ereditarietà
    */
    @Override
    public void prestaLibro(Libro libro) {
        super.prestaLibro(libro);
    }
    @Override
    public void ritornaLibro(Libro libro) {
        super.ritornaLibro(libro);
    }
    @Override
    public void restauraLibro(Libro libro) {
        super.restauraLibro(libro);
    }
}
