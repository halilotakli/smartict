package org.smartict.avms.model.dto;

import lombok.Getter;
import lombok.Setter;
import org.smartict.avms.core.model.dto.BaseDto;
import org.smartict.avms.model.entity.Driver;


@Getter
@Setter
public class VehicleDto extends BaseDto {

    private String plate;
    private String model;
    private String brand;
    private int capacity;

    private DriverDto driver;

}
