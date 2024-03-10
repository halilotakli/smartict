package org.smartict.avms.model.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.smartict.avms.model.dro.DriverDro;
import org.smartict.avms.model.dto.DriverDto;
import org.smartict.avms.model.entity.Driver;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DriverMapper {

    Driver toEntity(DriverDto dto);

    List<Driver> toEntityList(List<DriverDto> dtos);

    DriverDro toDro(Driver entity);

    List<DriverDro> toDroList(List<Driver> entitys);

}
