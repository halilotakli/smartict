package org.smartict.avms.controller;

import org.smartict.avms.model.dro.StationDro;
import org.smartict.avms.model.dto.StationDto;
import org.smartict.avms.service.StationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("station")
public class StationController {

    private final StationService StationService;

    public StationController(StationService StationService) {
        this.StationService = StationService;
    }

    @GetMapping
    public List<StationDro> getList() throws Exception {
        return this.StationService.getList();
    }

    @GetMapping("{id}")
    public StationDro get(@PathVariable("id") Long id) throws Exception {
        return this.StationService.get(id);
    }

    @PostMapping
    @PutMapping
    public StationDro postOrPut(@RequestBody StationDto dto) throws Exception {
        return this.StationService.saveOrUpdate(dto);
    }

    @DeleteMapping
    public StationDro delete(@RequestBody StationDto dto) throws Exception {
        return this.StationService.delete(dto);
    }

}