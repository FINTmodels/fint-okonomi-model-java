// Built from tag feature-fordring

package no.fint.model.administrasjon.okonomi;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Oppdragsgiver implements FintMainObject {
    public enum Relasjonsnavn {
            ORGANISASJONSELEMENT,
            FAKTURAGRUNNLAG,
            VARELINJE
    }

    @NonNull
    private String navn;
    @NonNull
    private Identifikator systemId;
}
