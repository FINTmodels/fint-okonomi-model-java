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

import no.fint.model.FintComplexDatatypeObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class FakturalinjeResource implements FintComplexDatatypeObject, FintLinks {
    // Attributes
    @NotNull
    private Float antall;
    private List<String> fritekst;
    @NotNull
    private Long pris;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getVarelinje() {
        return getLinks().getOrDefault("varelinje", Collections.emptyList()); 
    }
    public void addVarelinje(Link link) {
        addLink("varelinje", link);
    }
}
