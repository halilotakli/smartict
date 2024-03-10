package org.smartict.avms.model.dro;

import lombok.Getter;
import lombok.Setter;
import org.smartict.avms.core.model.dro.BaseDro;
import org.smartict.avms.model.entity.Driver;


@Getter
@Setter
public class VehicleDro extends BaseDro {

    private String plate;
    private String model;
    private String brand;
    private int capacity;

    private DriverDro driver;

}
