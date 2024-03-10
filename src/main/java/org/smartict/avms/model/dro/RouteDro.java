package org.smartict.avms.model.dro;


import lombok.Getter;
import lombok.Setter;
import org.smartict.avms.core.model.dro.BaseDro;
import org.smartict.avms.model.entity.Station;
import org.smartict.avms.model.entity.Vehicle;

import java.util.List;


@Getter
@Setter
public class RouteDro  extends BaseDro {

    private String routeName;

    private VehicleDro vehicle;

    private List<StationDro> stationList;

}
