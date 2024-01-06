import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    String dataItalia = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

    OffsetDateTime aggiungiAnno = data.plusYears(1);

    String annoItalia = aggiungiAnno.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
    OffsetDateTime sottraiMese = data.minusMonths(1);
    String meseItalia = sottraiMese.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
    OffsetDateTime aggiungiGiorni = data.minusDays(7);
    String giorniItalia = aggiungiGiorni.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));



    @Test
    void operazioniDate() {
        assertEquals("01 marzo 2023", dataItalia);
        assertEquals("01 marzo 2024", annoItalia);
        assertEquals("01 febbraio 2023", meseItalia);
        assertEquals("22 febbraio 2023", giorniItalia);

    }
}