package org.smartict.avms.service;


import org.smartict.avms.model.dro.RouteDro;
import org.smartict.avms.model.dto.RouteDto;

import java.util.List;

public interface RouteService {
    RouteDro saveOrUpdate(RouteDto dto);
    RouteDro delete(RouteDto dto);
    RouteDro get(Long id);
    List<RouteDro> getList();
}
