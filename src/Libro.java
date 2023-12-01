/*
utilizzo la classe astratta libro per attribuire field comuni
alle mie sottoclassi
*/
abstract class Libro extends Libreria{

    //attribuisco field generici alla classe astratta libro
    private final String titolo;
    private final String autore;
    private final int annoDiPubblicazione;

    /*
    implemento l'enumerato StatoLibro per definire la presenza
    o meno nella libreria del libro che prendiamo in considerazione
    */
    public StatoLibro stato;

    //imposto il costruttore
    public Libro(String titolo, String autore, int annoDiPubblicazione, StatoLibro stato) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.stato= stato;
    }

    /*
    imposto i getter di tutti field e il setter dello stato
    (non imposto setter per nessun altro field dato
    che i valori e le informazioni che potrebbero contenere
    sono delle costanti che non variano nel tempo)
    */
    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public StatoLibro getStato() {
        return stato;
    }
    public void setStato(StatoLibro stato) {
        this.stato = stato;
    }

    /*
    creo un metodo astratto calcPrezzo per attribuire un prezzo
    a tutte le sottoclassi
     */
    public abstract double calcPrezzo();
}
