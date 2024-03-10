package org.smartict.avms.service;


import org.smartict.avms.model.dro.StationDro;
import org.smartict.avms.model.dto.StationDto;

import java.util.List;

public interface StationService {
    StationDro saveOrUpdate(StationDto dto);
    StationDro delete(StationDto dto);
    StationDro get(Long id);
    List<StationDro> getList();
}
