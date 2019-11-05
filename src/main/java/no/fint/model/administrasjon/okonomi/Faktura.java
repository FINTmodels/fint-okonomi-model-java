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
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Faktura implements FintMainObject {
    public enum Relasjonsnavn {
            FAKTURAGRUNNLAG
    }

    @NotNull
    private Long belop;
    @NotNull
    private Date fakturadato;
    @NotNull
    private @Valid Identifikator fakturanummer;
    @NotNull
    private Date forfallsdato;
}
