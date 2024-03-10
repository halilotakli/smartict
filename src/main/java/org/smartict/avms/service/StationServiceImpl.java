package org.smartict.avms.service;


import org.smartict.avms.model.dro.StationDro;
import org.smartict.avms.model.dto.StationDto;
import org.smartict.avms.model.entity.Station;
import org.smartict.avms.model.mapper.StationMapper;
import org.smartict.avms.repository.StationRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StationServiceImpl implements StationService {

    private final StationRepository StationRepository;
    private final StationMapper mapper;


    public StationServiceImpl(StationRepository StationRepository, StationMapper mapper, StationMapper mapper1) {
        this.StationRepository = StationRepository;
        this.mapper = mapper1;
    }

    public StationDro saveOrUpdate(StationDto StationDto){
        Station Station=mapper.toEntity(StationDto);
        StationRepository.saveAndFlush(Station);
        return mapper.toDro(Station);
    }

    @Override
    public StationDro delete(StationDto dto) {
        Station Station=mapper.toEntity(dto);
        StationRepository.delete(Station);
        return mapper.toDro(Station);
    }

    @Override
    public StationDro get(Long id) {
        Station Station=  StationRepository.getById(id);
        return mapper.toDro(Station);
    }

    @Override
    public List<StationDro> getList() {
        List<Station> Stations=  StationRepository.findAll();
        return mapper.toDroList(Stations);
    }

}