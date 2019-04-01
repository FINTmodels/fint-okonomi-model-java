// Built from tag feature-fordring

package no.fint.model.administrasjon.okonomi;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import java.util.Date;
import no.fint.model.administrasjon.okonomi.Fakturalinje;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Fakturagrunnlag implements FintMainObject {
    public enum Relasjonsnavn {
            MOTTAKER,
            OPPDRAGSGIVER
    }

    private Long avgifter;
    private Date fakturadato;
    @NonNull
    private List<Fakturalinje> fakturalinjer;
    private Identifikator fakturanummer;
    private Date forfallsdato;
    private Date leveringsdato;
    private Long netto;
    @NonNull
    private Identifikator ordrenummer;
    private Long total;
}
