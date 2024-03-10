package org.smartict.avms.service;


import org.smartict.avms.model.dro.VehicleDro;
import org.smartict.avms.model.dto.VehicleDto;

import java.util.List;

public interface VehicleService {
    VehicleDro saveOrUpdate(VehicleDto dto);
    VehicleDro delete(VehicleDto dto);
    VehicleDro get(Long id);
    List<VehicleDro> getList();
}
