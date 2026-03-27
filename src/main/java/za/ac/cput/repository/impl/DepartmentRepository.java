package za.ac.cput.repository.impl;

import za.ac.cput.domain.Department;
import za.ac.cput.repository.Repository;
import java.util.Set;

/**
 * DepartmentRepository.java - Repository interface for Department entity
 * Author: Likhona Noroyita(230154239)
 * Date: 25 March 2026
 */




public interface DepartmentRepository extends Repository<Department, String> {
    Set<Department> getAll();
}
