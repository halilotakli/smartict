package org.smartict.avms.model.dro;

import lombok.Getter;
import lombok.Setter;
import org.smartict.avms.core.model.dro.BaseDro;

@Getter
@Setter
public class DriverDro extends BaseDro {

    private String name;
    private String surname;
    private String drivingLicenseType;

}
