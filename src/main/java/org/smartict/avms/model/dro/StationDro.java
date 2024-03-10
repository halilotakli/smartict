package org.smartict.avms.model.dro;


import lombok.Getter;
import lombok.Setter;
import org.smartict.avms.core.model.dro.BaseDro;

@Getter
@Setter
public class StationDro  extends BaseDro {

    private double latitude;
    private double longitude;
    private String name;

}
