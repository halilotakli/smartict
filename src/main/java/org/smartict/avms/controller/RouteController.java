package org.smartict.avms.controller;

import org.smartict.avms.model.dro.RouteDro;
import org.smartict.avms.model.dto.RouteDto;
import org.smartict.avms.service.RouteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("route")
public class RouteController {

    private final RouteService RouteService;

    public RouteController(RouteService RouteService) {
        this.RouteService = RouteService;
    }

    @GetMapping
    public List<RouteDro> getList() throws Exception {
        return this.RouteService.getList();
    }

    @GetMapping("{id}")
    public RouteDro get(@PathVariable("id") Long id) throws Exception {
        return this.RouteService.get(id);
    }

    @PostMapping
    @PutMapping
    public RouteDro postOrPut(@RequestBody RouteDto dto) throws Exception {
        return this.RouteService.saveOrUpdate(dto);
    }

    @DeleteMapping
    public RouteDro delete(@RequestBody RouteDto dto) throws Exception {
        return this.RouteService.delete(dto);
    }

}