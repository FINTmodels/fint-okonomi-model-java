// Built from tag feature-fordring

package no.fint.model.resource.administrasjon.okonomi;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

import no.fint.model.FintMainObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class FakturaResource implements FintMainObject, FintLinks {
    // Attributes
    @NotNull
    private Long belop;
    @NotNull
    private Date fakturadato;
    @NotNull
    private @Valid Identifikator fakturanummer;
    @NotNull
    private Date forfallsdato;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getFakturagrunnlag() {
        return getLinks().getOrDefault("fakturagrunnlag", Collections.emptyList()); 
    }
    public void addFakturagrunnlag(Link link) {
        addLink("fakturagrunnlag", link);
    }
}
