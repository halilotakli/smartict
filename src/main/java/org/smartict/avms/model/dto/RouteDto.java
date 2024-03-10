package org.smartict.avms.model.dto;



import lombok.Getter;
import lombok.Setter;
import org.smartict.avms.core.model.dto.BaseDto;
import org.smartict.avms.model.entity.Station;
import org.smartict.avms.model.entity.Vehicle;

import java.util.List;


@Getter
@Setter
public class RouteDto extends BaseDto {

    private String routeName;

    private VehicleDto vehicle;

    private List<StationDto> stationList;

}
