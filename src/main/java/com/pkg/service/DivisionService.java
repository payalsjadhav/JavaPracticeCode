package com.pkg.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pkg.exception.ResourceNotFoundException;
import com.pkg.model.Division;
import com.pkg.persistence.DivisionRepository;

@Service
public class DivisionService {
    
    @Autowired
    private DivisionRepository divisionRepository;

    public List<Division> getAllDivisions() {
        return divisionRepository.findAll();
    }

    public Division getDivisionById(Long id) {
        return divisionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Division not found with id: " + id));
    }

    public Division createDivision(Division division) {
        return divisionRepository.save(division);
    }

    public Division updateDivision(Long id, Division division) {
        Division existingDivision = divisionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Division not found with id: " + id));
        existingDivision.setDivisionName(division.getDivisionName());
        return divisionRepository.save(existingDivision);
    }

    public void deleteDivision(Long id) {
        divisionRepository.deleteById(id);
    }
}
