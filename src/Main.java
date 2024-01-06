import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataItalia = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        //aggiungi un anno
        OffsetDateTime aggiungiAnno = data.plusYears(1);
        String annoItalia = aggiungiAnno.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        //sottrai un mese
        OffsetDateTime sottraiMese = data.minusMonths(1);
        String meseItalia = sottraiMese.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        //aggiungi 7 giorni
        OffsetDateTime aggiungiGiorni = data.minusDays(7);
        String giorniItalia = aggiungiGiorni.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        //Stampa il risultato localizzata per l'Italia - Crea dei test per questo esercizio
        System.out.println("Data Italia: " + dataItalia);
        System.out.println("Aggiunta 1 anno: " + annoItalia);
        System.out.println("Sottratto 1 mese: " + meseItalia);
        System.out.println("Aggiunti 7 giorni: " + giorniItalia);
    }
}