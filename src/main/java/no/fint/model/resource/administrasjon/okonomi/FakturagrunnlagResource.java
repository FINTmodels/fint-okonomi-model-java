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
import no.fint.model.resource.administrasjon.okonomi.FakturalinjeResource;
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class FakturagrunnlagResource implements FintMainObject, FintLinks {
    // Attributes
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = FintLinks.super.getNestedResources();
        if (fakturalinjer != null) {
            result.addAll(fakturalinjer);
        }
        return result;
    }
    private Long avgifter;
    @NotEmpty
    private List<@Valid FakturalinjeResource> fakturalinjer;
    private Date leveringsdato;
    private Long netto;
    @NotNull
    private @Valid Identifikator ordrenummer;
    private Long total;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getMottaker() {
        return getLinks().getOrDefault("mottaker", Collections.emptyList()); 
    }
    public void addMottaker(Link link) {
        addLink("mottaker", link);
    }
    @JsonIgnore
    public List<Link> getFaktura() {
        return getLinks().getOrDefault("faktura", Collections.emptyList()); 
    }
    public void addFaktura(Link link) {
        addLink("faktura", link);
    }
    @JsonIgnore
    public List<Link> getOppdragsgiver() {
        return getLinks().getOrDefault("oppdragsgiver", Collections.emptyList()); 
    }
    public void addOppdragsgiver(Link link) {
        addLink("oppdragsgiver", link);
    }
}
