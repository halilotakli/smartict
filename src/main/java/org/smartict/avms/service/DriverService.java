package org.smartict.avms.service;


import org.smartict.avms.model.dro.DriverDro;
import org.smartict.avms.model.dto.DriverDto;

import java.util.List;

public interface DriverService  {
    DriverDro saveOrUpdate(DriverDto dto);
    DriverDro delete(DriverDto dto);
    DriverDro get(Long id);
    List<DriverDro> getList();
}
