package org.smartict.avms.service;


import org.smartict.avms.model.dro.RouteDro;
import org.smartict.avms.model.dto.RouteDto;
import org.smartict.avms.model.entity.Route;
import org.smartict.avms.model.mapper.RouteMapper;
import org.smartict.avms.repository.RouteRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepository RouteRepository;
    private final RouteMapper mapper;


    public RouteServiceImpl(RouteRepository RouteRepository, RouteMapper mapper, RouteMapper mapper1) {
        this.RouteRepository = RouteRepository;
        this.mapper = mapper1;
    }

    public RouteDro saveOrUpdate(RouteDto RouteDto){
        Route Route=mapper.toEntity(RouteDto);
        RouteRepository.saveAndFlush(Route);
        return mapper.toDro(Route);
    }

    @Override
    public RouteDro delete(RouteDto dto) {
        Route Route=mapper.toEntity(dto);
        RouteRepository.delete(Route);
        return mapper.toDro(Route);
    }

    @Override
    public RouteDro get(Long id) {
        Route Route=  RouteRepository.getById(id);
        return mapper.toDro(Route);
    }

    @Override
    public List<RouteDro> getList() {
        List<Route> Routes=  RouteRepository.findAll();
        return mapper.toDroList(Routes);
    }

}