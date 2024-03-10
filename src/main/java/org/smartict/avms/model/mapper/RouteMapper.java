package org.smartict.avms.model.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.smartict.avms.model.dro.RouteDro;
import org.smartict.avms.model.dto.RouteDto;
import org.smartict.avms.model.entity.Route;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface RouteMapper {

    Route toEntity(RouteDto dto);

    List<Route> toEntityList(List<RouteDto> dtos);

    RouteDro toDro(Route entity);

    List<RouteDro> toDroList(List<Route> entitys);

}
