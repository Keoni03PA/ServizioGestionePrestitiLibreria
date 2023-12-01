public class Main {
    public static void main(String[] args) {
        //creo la mia libreria
        Libreria libreria = new Libreria();

        //creo gli oggetti che fungeranno da libro
        Fantasy fantasy1 = new Fantasy("Il guardiano degli innocenti","Andrzej Sapkowski", 1993,StatoLibro.DISPONIBILE);
        Fantascienza fantascienza1= new Fantascienza("Odissea nello spazio","Arthur C. Clarke",2001, StatoLibro.INPRESTITO);
        Sovrannaturale sovrannaturale1= new Sovrannaturale("Antologia diabolica", "Renzo Lavatori",2007, StatoLibro.INRESTAURO);

        //"inserisco" i libri nella libreria
        libreria.getLibroArrayList().add(fantascienza1);
        libreria.getLibroArrayList().add(fantasy1);
        libreria.getLibroArrayList().add(sovrannaturale1);

        //verifico la lista dei libri e il funzionamento di scambio degli stati del libro
        libreria.elencoLibri();

        //ritorno un libro dal restauro e ne verifico il cambio nella disponibilità
        libreria.ritornaLibro(sovrannaturale1);
        libreria.elencoLibri();

        //do in prestito un libro e ne verifico il cambio nella disponibilità
        libreria.prestaLibro(sovrannaturale1);
        libreria.elencoLibri();

        /*
        mando in restauro un libro, ritorno un libro dal
        prestio e ne verifico il cambio nella disponibilità
        */
        libreria.ritornaLibro(fantascienza1);
        libreria.restauraLibro(fantasy1);
        libreria.elencoLibri();
    }
}