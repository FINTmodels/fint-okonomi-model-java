// Built from tag feature-fordring

package no.fint.model.administrasjon.okonomi;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import no.fint.model.FintMainObject;
import no.fint.model.administrasjon.okonomi.Fakturalinje;
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Fakturagrunnlag implements FintMainObject {
    public enum Relasjonsnavn {
            MOTTAKER,
            FAKTURA,
            OPPDRAGSGIVER
    }

    private Long avgifter;
    @NotEmpty
    private List<@Valid Fakturalinje> fakturalinjer;
    private Date leveringsdato;
    private Long netto;
    @NotNull
    private @Valid Identifikator ordrenummer;
    private Long total;
}
