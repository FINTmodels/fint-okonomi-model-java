// Built from tag feature-fordring

package no.fint.model.administrasjon.okonomi;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import no.fint.model.administrasjon.kompleksedatatyper.Kontostreng;
import no.fint.model.felles.basisklasser.Begrep;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Varelinje extends Begrep implements FintMainObject {
    public enum Relasjonsnavn {
            MVAKODE,
            OPPDRAGSGIVER
    }

    @NonNull
    private String enhet;
    private Kontostreng kontering;
    @NonNull
    private Long pris;
}
