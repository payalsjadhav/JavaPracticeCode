package com.pkg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pkg.model.Division;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Long> {
}
