package com.school.school.repositories;

import com.school.school.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author WIAM
 **/
public interface SchoolRepository extends JpaRepository<School, Integer> {
}
