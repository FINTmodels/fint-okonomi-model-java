// Built from tag feature-fordring

package no.fint.model.administrasjon.okonomi;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintComplexDatatypeObject;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Fakturalinje implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            VARELINJE
    }

    @NonNull
    private Float antall;
    @NonNull
    private List<String> fritekst;
    @NonNull
    private Long pris;
}
