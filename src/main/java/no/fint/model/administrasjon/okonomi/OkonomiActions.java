// Built from tag feature-fordring

package no.fint.model.administrasjon.okonomi;

import java.util.Arrays;
import java.util.List;

public enum OkonomiActions {
	
	GET_FAKTURAGRUNNLAG,
	GET_ALL_FAKTURAGRUNNLAG,
	UPDATE_FAKTURAGRUNNLAG,
	GET_MVAKODE,
	GET_ALL_MVAKODE,
	UPDATE_MVAKODE,
	GET_OPPDRAGSGIVER,
	GET_ALL_OPPDRAGSGIVER,
	UPDATE_OPPDRAGSGIVER,
	GET_VARELINJE,
	GET_ALL_VARELINJE,
	UPDATE_VARELINJE
	;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(OkonomiActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

