package org.smartict.avms.controller;

import org.smartict.avms.model.dro.VehicleDro;
import org.smartict.avms.model.dto.VehicleDto;
import org.smartict.avms.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("vehicle")
public class VehicleController {

    private final VehicleService VehicleService;

    public VehicleController(VehicleService VehicleService) {
        this.VehicleService = VehicleService;
    }

    @GetMapping
    public List<VehicleDro> getList() throws Exception {
        return this.VehicleService.getList();
    }

    @GetMapping("{id}")
    public VehicleDro get(@PathVariable("id") Long id) throws Exception {
        return this.VehicleService.get(id);
    }

    @PostMapping
    @PutMapping
    public VehicleDro postOrPut(@RequestBody VehicleDto dto) throws Exception {
        return this.VehicleService.saveOrUpdate(dto);
    }

    @DeleteMapping
    public VehicleDro delete(@RequestBody VehicleDto dto) throws Exception {
        return this.VehicleService.delete(dto);
    }

}