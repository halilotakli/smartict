package org.smartict.avms.model.dto;


import lombok.Getter;
import lombok.Setter;
import org.smartict.avms.core.model.dto.BaseDto;

@Getter
@Setter
public class StationDto extends BaseDto {

    private double latitude;
    private double longitude;
    private String name;

}
