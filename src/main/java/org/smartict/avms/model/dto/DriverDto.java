package org.smartict.avms.model.dto;

import lombok.Getter;
import lombok.Setter;
import org.smartict.avms.core.model.dto.BaseDto;

@Getter
@Setter
public class DriverDto extends BaseDto {

    private String name;
    private String surname;
    private String drivingLicenseType;

}
