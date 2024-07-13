package com.pkg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pkg.model.Division;
import com.pkg.service.DivisionService;

@RestController
@RequestMapping("/api/divisions")
public class DivisionController {
    
    @Autowired
    private DivisionService divisionService;

    @GetMapping
    public List<Division> getAllDivisions() {
        return divisionService.getAllDivisions();
    }

    @GetMapping("/{id}")
    public Division getDivisionById(@PathVariable Long id) {
        return divisionService.getDivisionById(id);
    }

    @PostMapping("/add")
    public Division createDivision(@RequestBody Division division) {
        return divisionService.createDivision(division);
    }


    @PutMapping("/{id}")
    public Division updateDivision(@PathVariable Long id, @RequestBody Division division) {
        return divisionService.updateDivision(id, division);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDivision(@PathVariable Long id) {
        divisionService.deleteDivision(id);
        return ResponseEntity.ok().build();
    }
}
