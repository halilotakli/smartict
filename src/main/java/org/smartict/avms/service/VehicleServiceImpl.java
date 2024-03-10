package org.smartict.avms.service;


import org.smartict.avms.model.dro.VehicleDro;
import org.smartict.avms.model.dto.VehicleDto;
import org.smartict.avms.model.entity.Vehicle;
import org.smartict.avms.model.mapper.VehicleMapper;
import org.smartict.avms.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository VehicleRepository;
    private final VehicleMapper mapper;


    public VehicleServiceImpl(VehicleRepository VehicleRepository, VehicleMapper mapper, VehicleMapper mapper1) {
        this.VehicleRepository = VehicleRepository;
        this.mapper = mapper1;
    }

    public VehicleDro saveOrUpdate(VehicleDto VehicleDto){
        Vehicle Vehicle=mapper.toEntity(VehicleDto);
        VehicleRepository.saveAndFlush(Vehicle);
        return mapper.toDro(Vehicle);
    }

    @Override
    public VehicleDro delete(VehicleDto dto) {
        Vehicle Vehicle=mapper.toEntity(dto);
        VehicleRepository.delete(Vehicle);
        return mapper.toDro(Vehicle);
    }

    @Override
    public VehicleDro get(Long id) {
        Vehicle Vehicle=  VehicleRepository.getById(id);
        return mapper.toDro(Vehicle);
    }

    @Override
    public List<VehicleDro> getList() {
        List<Vehicle> Vehicles=  VehicleRepository.findAll();
        return mapper.toDroList(Vehicles);
    }

}