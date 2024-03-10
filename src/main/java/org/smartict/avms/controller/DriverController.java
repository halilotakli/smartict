package org.smartict.avms.controller;

import org.smartict.avms.model.dro.DriverDro;
import org.smartict.avms.model.dto.DriverDto;
import org.smartict.avms.service.DriverService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("driver")
public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping
    public List<DriverDro> getList() throws Exception {
        return this.driverService.getList();
    }

    @GetMapping("{id}")
    public DriverDro get(@PathVariable("id") Long id) throws Exception {
        return this.driverService.get(id);
    }

    @PostMapping
    @PutMapping
    public DriverDro postOrPut(@RequestBody DriverDto dto) throws Exception {
        return this.driverService.saveOrUpdate(dto);
    }

    @DeleteMapping
    public DriverDro delete(@RequestBody DriverDto dto) throws Exception {
        return this.driverService.delete(dto);
    }

}