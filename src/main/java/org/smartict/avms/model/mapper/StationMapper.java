package org.smartict.avms.model.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.smartict.avms.model.dro.StationDro;
import org.smartict.avms.model.dto.StationDto;
import org.smartict.avms.model.entity.Station;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StationMapper {

    Station toEntity(StationDto dto);

    List<Station> toEntityList(List<StationDto> dtos);

    StationDro toDro(Station entity);

    List<StationDro> toDroList(List<Station> entitys);

}
