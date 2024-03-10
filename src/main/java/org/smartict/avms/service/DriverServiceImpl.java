package org.smartict.avms.service;


import org.smartict.avms.model.dro.DriverDro;
import org.smartict.avms.model.dto.DriverDto;
import org.smartict.avms.model.entity.Driver;
import org.smartict.avms.model.mapper.DriverMapper;
import org.smartict.avms.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DriverServiceImpl implements DriverService {

    private final DriverRepository driverRepository;
    private final DriverMapper mapper;


    public DriverServiceImpl(DriverRepository driverRepository, DriverMapper mapper, DriverMapper mapper1) {
        this.driverRepository = driverRepository;
        this.mapper = mapper1;
    }

    public DriverDro saveOrUpdate(DriverDto driverDto){
        Driver driver=mapper.toEntity(driverDto);
        driverRepository.saveAndFlush(driver);
        return mapper.toDro(driver);
    }

    @Override
    public DriverDro delete(DriverDto dto) {
        Driver driver=mapper.toEntity(dto);
        driverRepository.delete(driver);
        return mapper.toDro(driver);
    }

    @Override
    public DriverDro get(Long id) {
        Driver driver=  driverRepository.getById(id);
        return mapper.toDro(driver);
    }

    @Override
    public List<DriverDro> getList() {
        List<Driver> drivers=  driverRepository.findAll();
        return mapper.toDroList(drivers);
    }

}