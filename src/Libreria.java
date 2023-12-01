import java.util.ArrayList;

public class Libreria implements GestionePrestito {

    //creo un arrayList che fungerà da libreria, facendo da "contenitore" ai libri
    protected ArrayList<Libro> libroArrayList= new ArrayList<>();

    //creo l'oggetto arrayList e lo rendo reperibile nel resto del codice
    public Libreria(){};
    public Libreria(ArrayList<Libro> libroArrayList){
        this.libroArrayList= libroArrayList;
    }
    public ArrayList<Libro> getLibroArrayList() {
        return libroArrayList;
    }

    //creo un metodo che stampa a schermo l'elenco dei libri e delle loro caratteristice
    public void elencoLibri() {
        System.out.println("Elenco dei libri: ");
        for (Libro libro : libroArrayList) {
            System.out.println("* "+ libro.getTitolo() + " -- " + libro.getAutore() + " -- " + libro.getAnnoDiPubblicazione() +" -- "+ libro.getStato());
        }
        System.out.println(" ");
    }

    //implemento l'interfaccia GestionePrestito tramite il comando @Override
    @Override
    public void prestaLibro(Libro libro) {

        /*
        creo un ciclo for each che mi permette di cambiare lo stato del mio
        libro solo se sia disponibile nella libreria
        */
        for( Libro libroVar: libroArrayList){
            if (libroVar.equals(libro)){
               if(libroVar.getStato() == StatoLibro.DISPONIBILE) {
                   libroVar.setStato(StatoLibro.INPRESTITO);
               } else {
                   System.out.println(("il libro "+ libro.getTitolo()+" è "+ libro.getStato()));
               }
            }
        }
    }

    @Override
    public void ritornaLibro(Libro libro) {

        /*
        creo un ciclo for each che mi permette di cambiare lo stato del mio
        libro solo se sia disponibile nella libreria
        */
        for( Libro libroVar: libroArrayList){
            if (libroVar.equals(libro)) {

                /*
                creo un if e un if else in modo da prendere in considerazione i due
                possibili stati in cui può essere un libro da ritornare
                */
                if(libroVar.getStato() == StatoLibro.INPRESTITO) {
                    libroVar.setStato(StatoLibro.DISPONIBILE);
                }else if (libroVar.getStato() == StatoLibro.INRESTAURO){
                    libroVar.setStato(StatoLibro.DISPONIBILE);
                }else {
                    System.out.println("Il libro non appartiene alla nostra libreria, grazie e cordiali saluti.");
                }
            }
        }
    }

    @Override
    public void restauraLibro(Libro libro) {

        /*
        creo un ciclo for each che mi permette di cambiare lo stato del mio
        libro solo se sia disponibile nella libreria
        */
        for( Libro libroVar: libroArrayList){
            if (libroVar.equals(libro)){

                /*
                utilizzo lo stesso principio utilizzato in prestaLibro per
                rendere disponible la possibilita di mandare un libro in restauro
                 */
                if(libroVar.getStato() == StatoLibro.DISPONIBILE) {
                    libroVar.setStato(StatoLibro.INRESTAURO);
                } else {
                    System.out.println(("il libro "+ libro.getTitolo()+" è "+ libro.getStato()));
                }
            }
        }
    }
}
