//creo un enumerato per la semplificazzione della gestione nei cambiamenti di stato dei libri
public enum StatoLibro {
    DISPONIBILE("Disponibile"),
    INPRESTITO("In prestito"),
    INRESTAURO("In restauro");

    //creo una variabile stato mirata ad indicare la presenza o meno nella libreia di un libro
    public String stato;

    //creo il costruttore
    StatoLibro(String stato) {
        this.stato = stato;
    }
    public String getStato() {
        return stato;
    }
}
