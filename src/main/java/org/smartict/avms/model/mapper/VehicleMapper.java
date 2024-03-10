package org.smartict.avms.model.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.smartict.avms.model.dro.VehicleDro;
import org.smartict.avms.model.dto.VehicleDto;
import org.smartict.avms.model.entity.Vehicle;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VehicleMapper {

    Vehicle toEntity(VehicleDto dto);

    List<Vehicle> toEntityList(List<VehicleDto> dtos);

    VehicleDro toDro(Vehicle entity);

    List<VehicleDro> toDroList(List<Vehicle> entitys);

}
