// Built from tag feature-fordring

package no.fint.model.administrasjon.okonomi;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.constraints.*;
import no.fint.model.FintComplexDatatypeObject;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Fakturalinje implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            VARELINJE
    }

    @NotNull
    private Float antall;
    private List<String> fritekst;
    @NotNull
    private Long pris;
}
