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
import no.fint.model.felles.kompleksedatatyper.Adresse;
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

    private Boolean betalt;
    private @Valid Adresse fakturaadresse;
    @NotNull
    private Long fakturabelop;
    @NotNull
    private Date fakturadato;
    @NotBlank
    private String fakturamottaker;
    @NotNull
    private @Valid Identifikator fakturanummer;
    private Boolean fakturert;
    @NotNull
    private Date forfallsdato;
    private Boolean kreditert;
    private Long restbelop;
}
